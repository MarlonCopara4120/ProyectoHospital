package Registros;

import Metodos_SQL.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Frm_registro_historial_clinico_eliminar extends javax.swing.JFrame {

    ConexionBD cc = new ConexionBD();
    Connection con = cc.conectar();

    public Frm_registro_historial_clinico_eliminar() {
        initComponents();
        this.setLocationRelativeTo(null);
        mostrarDatos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTablaHistorialClinico = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnEliminar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MenuRegistrar = new javax.swing.JMenuItem();
        MenuModificar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registro Historial Clínico");

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Buscar: ");

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        tblTablaHistorialClinico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblTablaHistorialClinico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTablaHistorialClinicoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblTablaHistorialClinico);

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(182, 30, 30));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(186, 186, 186))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(587, 587, 587))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtBuscar))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(261, 261, 261)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnRegresar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jMenu1.setText("Menu");

        MenuRegistrar.setText("Registrar");
        MenuRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuRegistrarActionPerformed(evt);
            }
        });
        jMenu1.add(MenuRegistrar);

        MenuModificar.setText("Modificar");
        MenuModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuModificarActionPerformed(evt);
            }
        });
        jMenu1.add(MenuModificar);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuRegistrarActionPerformed
        Frm_registro_historial_clinico ventanaHistorial = new Frm_registro_historial_clinico();
        ventanaHistorial.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_MenuRegistrarActionPerformed

    private void MenuModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuModificarActionPerformed
        Frm_registro_historial_clinico_modificar ventana = new Frm_registro_historial_clinico_modificar();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MenuModificarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        Frm_registro_historial_clinico ventana = new Frm_registro_historial_clinico();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminarRegistros();
        mostrarDatos();

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tblTablaHistorialClinicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTablaHistorialClinicoMouseClicked


    }//GEN-LAST:event_tblTablaHistorialClinicoMouseClicked

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        filtrarDatos(txtBuscar.getText());
    }//GEN-LAST:event_txtBuscarKeyReleased
    public void mostrarDatos() {

        String[] titulos = {"Cédula", "Nombre", "Apellido", "Peso", "Estatura", "Alergias", "TipoSangre", "PresiónArterial", "Enfermedades", "EnfermedadesHereditarias", "Medicación", "RitmoCardíaco"};
        String[] registros = new String[12];

        DefaultTableModel modelo = new DefaultTableModel(null, titulos);

        String SQL = "select * from registro_paciente";

        try {

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);

            while (rs.next()) {
                registros[0] = rs.getString("Cédula");
                registros[1] = rs.getString("Nombre");
                registros[2] = rs.getString("Apellido");
                registros[3] = rs.getString("Peso");
                registros[4] = rs.getString("Estatura");
                registros[5] = rs.getString("Alergias");
                registros[6] = rs.getString("TipoSangre");
                registros[7] = rs.getString("PresiónArterial");
                registros[8] = rs.getString("Enfermedades");
                registros[9] = rs.getString("EnfermedadesHereditarias");
                registros[10] = rs.getString("Medicación");
                registros[11] = rs.getString("RitmoCardíaco");

                modelo.addRow(registros);

            }
            tblTablaHistorialClinico.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al Mostrar Datos" + e);
        }

    }

    public void filtrarDatos(String valor) {

        String[] titulos = {"Cédula", "Nombre", "Apellido", "Peso", "Estatura", "Alergias", "TipoSangre", "PresiónArterial", "Enfermedades", "EnfermedadesHereditarias", "Medicación", "RitmoCardíaco"};
        String[] registros = new String[12];

        DefaultTableModel modelo = new DefaultTableModel(null, titulos);

        String SQL = "select * from registro_paciente  where Cédula like '%" + valor + "%'";

        try {

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);

            while (rs.next()) {
                registros[0] = rs.getString("Cédula");
                registros[1] = rs.getString("Nombre");
                registros[2] = rs.getString("Apellido");
                registros[3] = rs.getString("Peso");
                registros[4] = rs.getString("Estatura");
                registros[5] = rs.getString("Alergias");
                registros[6] = rs.getString("TipoSangre");
                registros[7] = rs.getString("PresiónArterial");
                registros[8] = rs.getString("Enfermedades");
                registros[9] = rs.getString("EnfermedadesHereditarias");
                registros[10] = rs.getString("Medicación");
                registros[11] = rs.getString("RitmoCardíaco");

                modelo.addRow(registros);

            }
            tblTablaHistorialClinico.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al Mostrar Datos" + e);
        }

    }

    public void eliminarRegistros() {
        int filaSeleccionada = tblTablaHistorialClinico.getSelectedRow();

        try {
            String SQL = "delete from registro_paciente where Cédula=" + tblTablaHistorialClinico.getValueAt(filaSeleccionada, 0);

            Statement st = con.createStatement();
            int n = st.executeUpdate(SQL);

            if (n >= 0) {
                JOptionPane.showMessageDialog(null, "Registro Eliminado");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se ha seleccionado el historial clínico" );
        }
    }

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Frm_registro_historial_clinico_eliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_registro_historial_clinico_eliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_registro_historial_clinico_eliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_registro_historial_clinico_eliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_registro_historial_clinico_eliminar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuModificar;
    private javax.swing.JMenuItem MenuRegistrar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTablaHistorialClinico;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
