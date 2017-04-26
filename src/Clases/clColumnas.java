
package Clases;

import java.io.File;
import java.io.FileInputStream;
import java.text.Normalizer;
import java.util.Vector;
import java.util.*;
import java.util.regex.Pattern;
import nl.knaw.dans.common.dbflib.*;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class clColumnas {
    private String cVATR_CAMP;
    private String cVTIP_CAMP;
    private String cVEXT_CAMP;
    private String cVDEF_CAMP;
  
    public clColumnas(String cVATR_CAMP, String cVTIP_CAMP, String cVEXT_CAMP, String cVDEF_CAMP) {
        this.cVATR_CAMP = cVATR_CAMP;
        this.cVTIP_CAMP = cVTIP_CAMP;
        this.cVEXT_CAMP = cVEXT_CAMP;
        this.cVDEF_CAMP = cVDEF_CAMP;
    }

    public clColumnas() {
    
    }
    
    public String getcVATR_CAMP() {
        return cVATR_CAMP;
    }

    public void setcVATR_CAMP(String cVATR_CAMP) {
        this.cVATR_CAMP = cVATR_CAMP;
    }

    public String getcVTIP_CAMP() {
        return cVTIP_CAMP;
    }

    public void setcVTIP_CAMP(String cVTIP_CAMP) {
        this.cVTIP_CAMP = cVTIP_CAMP;
    }

    public String getcVEXT_CAMP() {
        return cVEXT_CAMP;
    }

    public void setcVEXT_CAMP(String cVEXT_CAMP) {
        this.cVEXT_CAMP = cVEXT_CAMP;
    }

    public String getcVDEF_CAMP() {
        return cVDEF_CAMP;
    }

    public void setcVDEF_CAMP(String cVDEF_CAMP) {
        this.cVDEF_CAMP = cVDEF_CAMP;
    }
    
    public Vector arrayToVector(){
        Vector vVLIS_DATO = new Vector();
        vVLIS_DATO.add(this.cVATR_CAMP);
        vVLIS_DATO.add(this.cVTIP_CAMP);
        vVLIS_DATO.add(this.cVEXT_CAMP);
        vVLIS_DATO.add(this.cVDEF_CAMP);
        
        return vVLIS_DATO;
    }
    
    public String crearArchivo(ArrayList<clColumnas> lVLIST_COLUM, String cVNOM_DBF, String aVVAL_EXCE, String cVMEN_RESP){
        try {
            int nVTOT_EXCE = 1;
            String cVVAL_REGI = "";
            String cVSTR_ORIG = "áàäéèëíìïóòöúùuñÁÀÄÉÈËÍÌÏÓÒÖÚÙÜÑçÇ";
            String cVSTR_ASCI = "aaaeeeiiiooouuunAAAEEEIIIOOOUUUNcC";
            String cVSTR_OUTP = ""; 
            Database database = new Database(new File("DBF"),Version.DBASE_3);
            List<Field> fields = new ArrayList<Field>();
            for (clColumnas item : lVLIST_COLUM) {
                if (item.getcVTIP_CAMP().equals("Caracter")){
                    fields.add(new Field(item.getcVATR_CAMP(), Type.CHARACTER, Integer.parseInt(item.getcVEXT_CAMP())));
                }else{
                    fields.add(new Field(item.getcVATR_CAMP(), Type.NUMBER, Integer.parseInt(item.getcVEXT_CAMP())));
                }
            }
            
            Table table = database.addTable(cVNOM_DBF+".dbf", fields);
            table.open(IfNonExistent.CREATE);
            final Map<String, Value> map = new HashMap<String, Value>();
            
            String[] aVBAN_ARRA = aVVAL_EXCE.split("©");
            String[] aVARR_NOMP = this.devolverArrayNombre(lVLIST_COLUM);
            
            for (int i = 0; i < aVBAN_ARRA.length; i++){
                String[] aVVAL_FILA = aVBAN_ARRA[i].split("«");
                if (aVVAL_FILA.length > aVARR_NOMP.length){
                    cVMEN_RESP += "\n \nLa fila numero "+nVTOT_EXCE+" Contiene mas elementos que el numero de columnas. \n \n"; 
                }
                
                for (int x = 0; x < aVARR_NOMP.length; x++){
                    cVSTR_OUTP = aVVAL_FILA[x];
                    for (int y = 0; y < cVSTR_ORIG.length(); y++) {
                        cVSTR_OUTP = cVSTR_OUTP.replace(cVSTR_ORIG.charAt(y), cVSTR_ASCI.charAt(y));
                    }

                    for (clColumnas item: lVLIST_COLUM){
                        if (item.getcVATR_CAMP().equals(aVARR_NOMP[x])){
                            if (cVSTR_OUTP.length() > Integer.parseInt(item.getcVEXT_CAMP())){
                                cVSTR_OUTP = cVSTR_OUTP.substring(0, Integer.parseInt(item.getcVEXT_CAMP()) - 1);
                                cVMEN_RESP += "El registro que pertenece a la columna: "+aVARR_NOMP[x]+", de la fila: "+nVTOT_EXCE+", a excedido el numero de caracteres permitido \n";
                            }
                        }
                    }
                    map.put(aVARR_NOMP[x], new StringValue(cVSTR_OUTP));                
                }
                Record record = new Record(map);
                table.addRecord(record);
                nVTOT_EXCE ++;
            }
            table.close();
            return cVMEN_RESP;
        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }
    }
    
    public Boolean leerXLS(String cVPATH_EXCE){
        try {
            FileInputStream oVFIL_EXCE = new FileInputStream(new File(cVPATH_EXCE));
            HSSFWorkbook oVOBJ_WOOR = new HSSFWorkbook(oVFIL_EXCE);
            HSSFSheet oVOBJ_SHEE = oVOBJ_WOOR.getSheetAt(0);
            
            Iterator<Row> oVROW_ITER = oVOBJ_SHEE.iterator();
            Row oVOBJ_ROW;
            
            while (oVROW_ITER.hasNext()) {               
                oVOBJ_ROW = oVROW_ITER.next();
                Iterator<Cell> oVCEL_ITER = oVOBJ_ROW.cellIterator();
                Cell oVOBJ_CELL;
                
                while (oVCEL_ITER.hasNext()){
                    oVOBJ_CELL = oVCEL_ITER.next();
                    switch (oVOBJ_CELL.getCellType()){
                        case Cell.CELL_TYPE_NUMERIC:
                            System.out.println(oVOBJ_CELL.getNumericCellValue());
                            break;
                        case Cell.CELL_TYPE_STRING:
                            System.out.println(oVOBJ_CELL.getStringCellValue());
                            break;
                        case Cell.CELL_TYPE_BOOLEAN:
                            System.out.println(oVOBJ_CELL.getBooleanCellValue());
                            break;
                    }
                }
            }
            oVOBJ_WOOR.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public String[] leerXLSX(String cVPATH_EXCE, int nVNUM_COLUM){
        try {
            int nVNUM_DATO = 0; 
            int nVBAN_DATO = 0;
            String cVCAD_VALO = "";
            String aVARR_VALO = "";
            ArrayList<Object> lista = new ArrayList<Object>();
            FileInputStream oVFIL_EXCE = new FileInputStream(new File(cVPATH_EXCE));

            Workbook oVOBJ_WOOR = new XSSFWorkbook(oVFIL_EXCE);
            Sheet oVOBJ_SHEE = oVOBJ_WOOR.getSheetAt(0);
            Iterator<Row> oVROW_ITER = oVOBJ_SHEE.iterator();
            
            Row oVOBJ_ROW;
            while (oVROW_ITER.hasNext()){
                nVNUM_DATO++;
                oVOBJ_ROW = oVROW_ITER.next();
                Iterator<Cell> oVCELL_ITER = oVOBJ_ROW.cellIterator();
                
                Cell oVOBJ_CELL;
                System.out.println("El numero de elementos es: "+nVNUM_COLUM);
                for (int i = 0; i < nVNUM_COLUM; i++) {
                    nVBAN_DATO++;
                    //System.out.println(nVBAN_DATO);
                    if (oVCELL_ITER.hasNext()){
                        oVOBJ_CELL = oVCELL_ITER.next();
                        switch (oVOBJ_CELL.getCellType()){
                            case Cell.CELL_TYPE_NUMERIC:
                                cVCAD_VALO += oVOBJ_CELL.getNumericCellValue() + "«";
                                break;
                            case Cell.CELL_TYPE_STRING:
                                cVCAD_VALO += oVOBJ_CELL.getStringCellValue() + "«";
                                break;
                            case Cell.CELL_TYPE_BOOLEAN:
                                cVCAD_VALO += oVOBJ_CELL.getBooleanCellValue() + "«";
                                break;
                            default:
                                cVCAD_VALO += " ";
                                break;

                        }
                    }else{
                        cVCAD_VALO += " ";
                    }
                }
                aVARR_VALO += cVCAD_VALO + "©";
                cVCAD_VALO = "";
            }
            oVOBJ_WOOR.close();
            String[] aVARR_RETU = {aVARR_VALO,"El archivo de excel se leyó correctamente. \n El numero de filas es: "+nVNUM_DATO+" el numero de datos es: "+nVBAN_DATO};
            return aVARR_RETU;
        } catch (Exception e) {
            return null;
        }            
    }
    
    public String extensionFile(File oVOBJ_FILE){ 
        String name = oVOBJ_FILE.getName();
        return name.substring(name.lastIndexOf(".") + 1);
    }
    
    public String[] devolverArrayNombre(ArrayList<clColumnas> lVLIS_OBJE){
        String[] aVLIS_CAMP;
        String cVCAD_NOMB = "";
        for (clColumnas item: lVLIS_OBJE){
            cVCAD_NOMB += item.getcVATR_CAMP() + ",";
        }
        aVLIS_CAMP = cVCAD_NOMB.split(",");
        return aVLIS_CAMP;
    }

}
