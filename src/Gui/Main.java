package Gui;

import javax.swing.JOptionPane;
import Clases.clColumnas;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import nl.knaw.dans.common.dbflib.Table;

public class Main extends javax.swing.JFrame {
    String cVFIL_TABL[][]={};
    String cVCOL_TABL[]={"Nombre Campo","Tipo Dato","Extension"};
    public DefaultTableModel oVMOD_TABL = new DefaultTableModel(cVFIL_TABL,cVCOL_TABL);
    File oVFIL_EXCE;
    
    clColumnas oVOBJ_COLUM;
    ArrayList<clColumnas> lVLIS_CAMP = new ArrayList<clColumnas>();
    public Main(){
        initComponents();
        this.setLocationRelativeTo(null);
        tblCampos.setModel(oVMOD_TABL);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenu1 = new java.awt.PopupMenu();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnRegistrar = new javax.swing.JButton();
        txtNomcolum = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTamanio = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCampos = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        cmbTipodato = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        lblFile = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        lblNotificacion = new javax.swing.JLabel();
        btnLeer = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtEstado = new javax.swing.JTextArea();

        popupMenu1.setLabel("popupMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Convertir Archivo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Preparar DBF", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        btnRegistrar.setText("Registrar Campo");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        txtNomcolum.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Nombre Columna");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Tipo Dato");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Tamaño del Campo");

        txtTamanio.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtTamanio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTamanioKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTamanioKeyReleased(evt);
            }
        });

        tblCampos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblCampos);

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        cmbTipodato.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Caracter", "Numerico" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 98, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(264, 264, 264))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomcolum, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(80, 80, 80)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cmbTipodato, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTamanio, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRegistrar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtNomcolum, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTamanio, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(cmbTipodato))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Leer Excel", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        lblFile.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lblFile.setText("Seleccionar Archivo ....");

        btnBuscar.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        btnBuscar.setText("Buscar ...");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel5.setText("Informe");

        lblNotificacion.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lblNotificacion.setText("En espera ...");

        btnLeer.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnLeer.setText("Leer Datos");
        btnLeer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeerActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel4.setText("Nombre del Archivo");

        txtEstado.setColumns(20);
        txtEstado.setRows(5);
        jScrollPane2.setViewportView(txtEstado);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFile, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNombre)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                .addGap(158, 158, 158))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(lblNotificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(btnLeer, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4))
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFile, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLeer, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNotificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        try {
            if (txtNomcolum.getText().equals("") || txtTamanio.getText().equals("")){
                JOptionPane.showMessageDialog(rootPane, "Por favor llene todos los campos.", "Informacion", JOptionPane.WARNING_MESSAGE);
            }else{
                oVOBJ_COLUM = new clColumnas();
                oVOBJ_COLUM.setcVATR_CAMP(txtNomcolum.getText());
                oVOBJ_COLUM.setcVTIP_CAMP(String.valueOf(cmbTipodato.getSelectedItem()));
                oVOBJ_COLUM.setcVEXT_CAMP(txtTamanio.getText());
                                               
                lVLIS_CAMP.add(oVOBJ_COLUM);
                oVMOD_TABL.addRow(oVOBJ_COLUM.arrayToVector());
                txtNomcolum.setText("");
                txtTamanio.setText("");
            }
            
        } catch (Exception e) {
            System.out.println("Error en registrar boton: "+e.getMessage());
            JOptionPane.showMessageDialog(rootPane, "Se a encontrado un error intentelo mas tarde.", "Error!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        JFileChooser oVFIL_CHOO = new JFileChooser();
        FileNameExtensionFilter oVFIL_FILE = new FileNameExtensionFilter("xls","xlsx");
        oVFIL_CHOO.setFileFilter(oVFIL_FILE);
        
        int nVRET_CHOO = oVFIL_CHOO.showOpenDialog(this);
        if (nVRET_CHOO == JFileChooser.APPROVE_OPTION) {
            oVFIL_EXCE = oVFIL_CHOO.getSelectedFile();
            lblFile.setText(oVFIL_EXCE.getName());
        }else{
            JOptionPane.showMessageDialog(rootPane, "No selecciono ningun archivo.", "Informacion", HEIGHT);
        }
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnLeerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeerActionPerformed
        oVOBJ_COLUM = new clColumnas();
        String cVMEN_RESP = "";
        if (lVLIS_CAMP.size() > 0){
            if (!txtNombre.getText().equals("")){
                
                lblNotificacion.setText("Leyendo archivo de excel.");
                String[] cVCAD_VALO = oVOBJ_COLUM.leerXLSX(oVFIL_EXCE.getAbsolutePath(),lVLIS_CAMP.size());
                if (cVCAD_VALO != null){
                    txtEstado.setText(cVCAD_VALO[1]);
                
                    lblNotificacion.setText("Registrando datos en el archivo DBF.");
                    String cVRES_ESCR = oVOBJ_COLUM.crearArchivo(lVLIS_CAMP, txtNombre.getText(), cVCAD_VALO[0], cVMEN_RESP);

                    if (!cVRES_ESCR.equalsIgnoreCase("error")){
                        txtEstado.setText(cVRES_ESCR);
                        JOptionPane.showMessageDialog(rootPane, "Se realizo el proceso correctamente", "Informacion", JOptionPane.INFORMATION_MESSAGE);
                    }else{
                        txtEstado.setText(cVRES_ESCR);
                        JOptionPane.showMessageDialog(rootPane, "Ah ocurrido un error creando el archivo DBF, intentalo mas tarde.", "Error.", JOptionPane.ERROR_MESSAGE);
                    }
                    lblNotificacion.setText("Termine la lectura");
                }else{
                    txtEstado.setText("Error");
                    JOptionPane.showMessageDialog(rootPane, "Ah ocurrido un error creando el archivo DBF, intentalo mas tarde.", "Error.", JOptionPane.ERROR_MESSAGE);
                }
            }else{
                JOptionPane.showMessageDialog(rootPane, "Por favor digite el nombre que va a tener el archivo DBF.", "Avertencia", JOptionPane.WARNING_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(rootPane, "Por favor registre las columnas del archivo DBF.", "Advertencia!", JOptionPane.WARNING_MESSAGE);
        }
        
        if (oVOBJ_COLUM.extensionFile(oVFIL_EXCE).equalsIgnoreCase("xls")){
            oVOBJ_COLUM.leerXLS(oVFIL_EXCE.getAbsolutePath());
        }else{
            oVOBJ_COLUM.leerXLSX(oVFIL_EXCE.getAbsolutePath(),lVLIS_CAMP.size());
        }
    }//GEN-LAST:event_btnLeerActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int nVFIL_TABL = tblCampos.getSelectedRow();
        DefaultTableModel modeloTabla = (DefaultTableModel) tblCampos.getModel();
        if (nVFIL_TABL > -1){
            String cVNOM_CAMP = (String) tblCampos.getValueAt(nVFIL_TABL, 0);
            int nVCON_DAT = 0;
            for(clColumnas item: lVLIS_CAMP){
                if (item.getcVATR_CAMP().equalsIgnoreCase(cVNOM_CAMP)){
                    lVLIS_CAMP.remove(nVCON_DAT);
                    modeloTabla.removeRow(nVCON_DAT);
                }
                nVCON_DAT++;
            }
        }else{
            JOptionPane.showMessageDialog(rootPane, "Por favor seleccione un atributo para eliminar", "Informacion", JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtTamanioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTamanioKeyPressed

    }//GEN-LAST:event_txtTamanioKeyPressed

    private void txtTamanioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTamanioKeyReleased
        String cVVAL_CAMP = txtTamanio.getText();
        if (!cVVAL_CAMP.equals("")){
            if (this.isNumeric(cVVAL_CAMP)){
                if (cmbTipodato.getSelectedItem().equals("Caracter") && Integer.parseInt(cVVAL_CAMP) > 250){
                    JOptionPane.showMessageDialog(rootPane, "El numero maximo de caracteres permitido es 250.", "Advertencia", JOptionPane.WARNING_MESSAGE);
                    txtTamanio.setText("250");
                }else if(cmbTipodato.getSelectedItem().equals("Numerico") && Integer.parseInt(cVVAL_CAMP) > 18){
                    JOptionPane.showMessageDialog(rootPane, "El numero maximo de longitud para numeros es de 18.", "Advertencia", JOptionPane.WARNING_MESSAGE);
                    txtTamanio.setText("18");                    
                }
            }else{
                txtTamanio.setText("");
            }
        }

    }//GEN-LAST:event_txtTamanioKeyReleased

    public Boolean isNumeric(String cVCAD_VALO){
        Boolean bVVAL_LOGI = false;
        char[] aVVAL_CADE = cVCAD_VALO.toCharArray();
        
        for (int i = 0; i < aVVAL_CADE.length; i++){
            char caracter = aVVAL_CADE[i];
            if (Character.isDigit(caracter)){
                bVVAL_LOGI = true;
            }else{
                bVVAL_LOGI = false;
            }   
        }
        return bVVAL_LOGI;
    }
   
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLeer;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cmbTipodato;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblFile;
    private javax.swing.JLabel lblNotificacion;
    private java.awt.PopupMenu popupMenu1;
    private javax.swing.JTable tblCampos;
    private javax.swing.JTextArea txtEstado;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNomcolum;
    private javax.swing.JTextField txtTamanio;
    // End of variables declaration//GEN-END:variables
}
