/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

/**
 *
 * @author vicen
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mniAgregarCliente = new javax.swing.JMenuItem();
        mniListarCliente = new javax.swing.JMenuItem();
        mniEliminar = new javax.swing.JMenuItem();
        mniModificar = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        mniAgregarVehiculo = new javax.swing.JMenuItem();
        mniEliminarVehiculo = new javax.swing.JMenuItem();
        mniModificarVehiculo = new javax.swing.JMenuItem();
        mniListarVehiculo = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Gestion Cliente");

        mniAgregarCliente.setText("Agregar");
        mniAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniAgregarClienteActionPerformed(evt);
            }
        });
        jMenu1.add(mniAgregarCliente);

        mniListarCliente.setText("Listar");
        mniListarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniListarClienteActionPerformed(evt);
            }
        });
        jMenu1.add(mniListarCliente);

        mniEliminar.setText("Eliminar");
        mniEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniEliminarActionPerformed(evt);
            }
        });
        jMenu1.add(mniEliminar);

        mniModificar.setText("Modificar");
        mniModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniModificarActionPerformed(evt);
            }
        });
        jMenu1.add(mniModificar);

        jMenuBar1.add(jMenu1);

        jMenu5.setText("Gestion Vehiculo");

        mniAgregarVehiculo.setText("Agregar");
        mniAgregarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniAgregarVehiculoActionPerformed(evt);
            }
        });
        jMenu5.add(mniAgregarVehiculo);

        mniEliminarVehiculo.setText("Eliminar");
        mniEliminarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniEliminarVehiculoActionPerformed(evt);
            }
        });
        jMenu5.add(mniEliminarVehiculo);

        mniModificarVehiculo.setText("Modificar");
        mniModificarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniModificarVehiculoActionPerformed(evt);
            }
        });
        jMenu5.add(mniModificarVehiculo);

        mniListarVehiculo.setText("Listar");
        mniListarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniListarVehiculoActionPerformed(evt);
            }
        });
        jMenu5.add(mniListarVehiculo);

        jMenuBar1.add(jMenu5);

        jMenu6.setText("Gestion Transaccion");
        jMenuBar1.add(jMenu6);

        jMenu2.setText("Salir");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 477, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 383, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAgregarClienteActionPerformed
        AgregarCliente ac = new AgregarCliente();
        ac.setVisible(true);
    }//GEN-LAST:event_mniAgregarClienteActionPerformed

    private void mniListarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniListarClienteActionPerformed
        ListarClientes lc = new ListarClientes();
        lc.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mniListarClienteActionPerformed

    private void mniEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniEliminarActionPerformed
        EliminarCliente ec = new EliminarCliente();
        ec.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mniEliminarActionPerformed

    private void mniModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniModificarActionPerformed
        ModificarCliente mc = new ModificarCliente();
        mc.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mniModificarActionPerformed

    private void mniListarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniListarVehiculoActionPerformed
        ListarVehiculo lv = new ListarVehiculo();
        lv.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mniListarVehiculoActionPerformed

    private void mniAgregarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAgregarVehiculoActionPerformed
        AgregarVehiculo av = new AgregarVehiculo();
        av.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mniAgregarVehiculoActionPerformed

    private void mniEliminarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniEliminarVehiculoActionPerformed
        EliminarVehiculo ev = new EliminarVehiculo();
        ev.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mniEliminarVehiculoActionPerformed

    private void mniModificarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniModificarVehiculoActionPerformed
        ModificarVehiculo mv = new ModificarVehiculo();
        mv.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mniModificarVehiculoActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem mniAgregarCliente;
    private javax.swing.JMenuItem mniAgregarVehiculo;
    private javax.swing.JMenuItem mniEliminar;
    private javax.swing.JMenuItem mniEliminarVehiculo;
    private javax.swing.JMenuItem mniListarCliente;
    private javax.swing.JMenuItem mniListarVehiculo;
    private javax.swing.JMenuItem mniModificar;
    private javax.swing.JMenuItem mniModificarVehiculo;
    // End of variables declaration//GEN-END:variables
}
