
package Paneles.LoginRegistro;

import Listeners.LoginVentanas;

public class ventanaLogin extends javax.swing.JDialog implements LoginVentanas{
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ventanaLogin.class.getName());
    Login login;
    Registro registro;
    LoginVentanas listener;
    
    public ventanaLogin(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        iniciarPaneles();
    }

    private void iniciarPaneles(){
        login = new Login(this);
        registro = new Registro(this);
        Paneles.add("Login",login);
        Paneles.add("Registro",registro);
    }
    
    @Override
    public void cambiarVentanas(String nombre){
       if ("Login".equalsIgnoreCase(nombre)) {
            // Buscamos el índice del panel por su título y lo seleccionamos.
            for (int i = 0; i < Paneles.getTabCount(); i++) {
                if (Paneles.getTitleAt(i).equalsIgnoreCase("Login")) {
                    Paneles.setSelectedIndex(i);
                    break;
                }
            }
        }else if ("Registro".equalsIgnoreCase(nombre)) {
            // Buscamos el índice del panel por su título y lo seleccionamos.
            for (int i = 0; i < Paneles.getTabCount(); i++) {
                if (Paneles.getTitleAt(i).equalsIgnoreCase("Registro")) {
                    Paneles.setSelectedIndex(i);
                    break;
                }
            }
        }
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Paneles = new javax.swing.JTabbedPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(Paneles, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 900, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                ventanaLogin dialog = new ventanaLogin(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane Paneles;
    // End of variables declaration//GEN-END:variables
}
