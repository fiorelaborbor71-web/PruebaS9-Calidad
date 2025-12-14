git clone https://github.com/fiorelaborbor71-web/PruebaS9-Calidad.git
cd PruebaS9-Calidad

  package GUI;

import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane; 
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel; 


public class DocentesFrame extends javax.swing.JFrame {

    /**
     * Creates new form ClientesFrame
     */
    public DocentesFrame(String action) {
        initComponents();
        cargarDatos();
        initActions(action);
        jTable1.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (e.getValueIsAdjusting()) {
                    return;
                }
                cargarDatosEnFormulario();
            }
        });
    }
    private void initActions(String action) {
    btnInsertar.setVisible(false);
    btnActualizar.setVisible(false);
    btnEliminar.setVisible(false);
    switch (action) {
        case "INSERTAR":
            btnInsertar.setVisible(true);
            jTable1.setVisible(false); 
            break;
        case "ACTUALIZAR":
            btnActualizar.setVisible(true);
            break;
        case "ELIMINAR":
            btnEliminar.setVisible(true);
            break;
        default:
            break;
    }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNui = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtFnac = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        btnInsertar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtSalario = new javax.swing.JTextField();
        txtEcivil = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GESTION DE DOCENTES");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("NUI:");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Apellido:");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Nombre:");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("F. Nacimiento:");

        btnInsertar.setText("INSERTAR");
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });

        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "NUI", "Nombre", "Apellido", "F. Nacimiento", "Salario", "Estado Civil"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btnEliminar.setBackground(new java.awt.Color(255, 0, 0));
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnRegresar.setBackground(new java.awt.Color(255, 255, 51));
        btnRegresar.setText("REGRESAR");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        jLabel7.setText("Salario:");

        jLabel8.setText("Estado Civil:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 845, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(btnInsertar)
                .addGap(42, 42, 42)
                .addComponent(btnActualizar)
                .addGap(96, 96, 96)
                .addComponent(btnEliminar)
                .addGap(138, 138, 138)
                .addComponent(btnRegresar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtFnac, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                    .addComponent(txtApellido, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                    .addComponent(txtNui, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                    .addComponent(txtSalario)
                    .addComponent(txtEcivil))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNui, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtFnac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtEcivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(94, 94, 94)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInsertar)
                    .addComponent(btnActualizar)
                    .addComponent(btnEliminar)
                    .addComponent(btnRegresar))
                .addContainerGap(172, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        String nui=txtNui.getText();
        String nombre=txtNombre.getText();
        String apellido=txtApellido.getText();
        String fnacimiento=txtFnac.getText();
        SimpleDateFormat dateFormat=new SimpleDateFormat ("yyyy-MM-dd");
        Date utilDate=null;
        String salario=txtSalario.getText();
        String ecivil=txtEcivil.getText();
        if (nui.isEmpty() || nombre.isEmpty() || apellido.isEmpty() || fnacimiento.isEmpty() || salario.isEmpty() || ecivil.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios.", "Error de Validación", JOptionPane.ERROR_MESSAGE);
        return;
        }
        try {
            utilDate=dateFormat.parse(fnacimiento);
        } catch (ParseException e){
            System.err.println("Error de fecha "+e);
            return;
        }
        java.sql.Date sqlDate=new java.sql.Date(utilDate.getTime());
        try{
        Docentes docentes=new Docentes(Integer.parseInt(nui),nombre,apellido,sqlDate,Float.parseFloat(salario),ecivil);
        DocentesCRUD docentesCRUD=new DocentesCRUD();
        docentesCRUD.insertarDocentes(docentes);
        }catch(NumberFormatException e){
            System.err.println("Solo ingrese numeros en el NUI ");
        }
        Object[] fila = new Object[]{nui, nombre, apellido, fnacimiento};
        
        modelo.addRow(fila);
        cargarDatos();
        // para que se limpien los datos
        
        txtNui.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtFnac.setText("");
        txtSalario.setText ("");
        txtEcivil.setText("");
        
        txtNui.requestFocus();
        //NumberFormatException
  
    }                                           

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        String nui=txtNui.getText();
        String nombre=txtNombre.getText();
        String apellido=txtApellido.getText();
        String fnacimiento=txtFnac.getText();
        SimpleDateFormat dateFormat=new SimpleDateFormat ("yyyy-MM-dd");
        Date utilDate=null;
        String salario=txtSalario.getText();
        String ecivil=txtEcivil.getText();
        try {
            utilDate=dateFormat.parse(fnacimiento);
        } catch (ParseException e){
            System.err.println("Error de fecha "+e);
            return;
        }
        java.sql.Date sqlDate=new java.sql.Date(utilDate.getTime());
        Docentes docentes=new Docentes(Integer.parseInt(nui),nombre,apellido,sqlDate,Float.parseFloat(salario),ecivil);
        DocentesCRUD docentesCRUD=new DocentesCRUD();
        if(docentesCRUD.actualizarDocentes(docentes)){
            jTable1.removeAll();
            cargarDatos();
            txtNui.setText("");
            txtNombre.setText("");
            txtApellido.setText("");
            txtFnac.setText("");
            txtSalario.setText("");
                txtEcivil.setText("");
            txtNui.requestFocus();
        }else{
            System.err.println("Error al Actualizar ");
        }
    }                                             

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        String nui=txtNui.getText();
        if(!nui.isEmpty()){
            DocentesCRUD docentesCRUD=new DocentesCRUD();
            if(docentesCRUD.eliminarDocentes(Integer.parseInt(nui))){
                jTable1.removeAll();
                cargarDatos();
                txtNui.setText("");
                txtNombre.setText("");
                txtApellido.setText("");
                txtFnac.setText("");
                txtSalario.setText("");
                txtEcivil.setText("");
                txtNui.requestFocus();   
        }else{
            System.err.println("Error al Eliminar ");
            }
        }else{
            System.err.println("Seleccione un NUI ");
                }
        
    }                                           

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:                                          
    this.dispose(); 
     Bienvenida menu= new Bienvenida();
     menu.setVisible(true);
    }                                           

    private void cargarDatosEnFormulario() {
    int filaSeleccionada = jTable1.getSelectedRow();

    if (filaSeleccionada != -1) {

        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();

        Object nui = modelo.getValueAt(filaSeleccionada, 0);
        Object nombre = modelo.getValueAt(filaSeleccionada, 1);
        Object apellido = modelo.getValueAt(filaSeleccionada, 2);
        Object fnac = modelo.getValueAt(filaSeleccionada, 3);
        Object salario = modelo.getValueAt(filaSeleccionada, 4);
        Object ecivil = modelo.getValueAt(filaSeleccionada, 5);

        txtNui.setText(nui.toString());
        txtNombre.setText(nombre.toString());
        txtApellido.setText(apellido.toString());
        txtFnac.setText(fnac.toString());
        txtSalario.setText(salario.toString());
        txtEcivil.setText(ecivil.toString());
        
    } else {
    }
}
    
    private void cargarDatos(){
        
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setRowCount(0);
    DocentesCRUD docentesCRUD=new DocentesCRUD();
    List<Docentes>docente=docentesCRUD.obtenerDocentes();
    for(Docentes docentes:docente){
        String fechaNacimientoStr = docentes.getEva_fnac_doc().toString();
        Object[] fila = new Object[]{
            docentes.getEva_id_doc(), 
            docentes.getEva_nom_doc(), 
            docentes.getEva_ape_doc(),
            docentes.getEva_salario_doc(),
            docentes.getE_Civil(),
            fechaNacimientoStr
        };
        
        modelo.addRow(fila);
    }

    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DocentesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DocentesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DocentesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DocentesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bienvenida().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtEcivil;
    private javax.swing.JTextField txtFnac;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNui;
    private javax.swing.JTextField txtSalario;
    // End of variables declaration                   
}
