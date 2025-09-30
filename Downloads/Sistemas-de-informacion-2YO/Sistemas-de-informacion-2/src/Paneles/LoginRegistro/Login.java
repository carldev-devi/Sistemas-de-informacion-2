
package Paneles.LoginRegistro;

import Listeners.LoginVentanas;


public class Login extends javax.swing.JPanel {

    private LoginVentanas listener;
    public Login(LoginVentanas listener) {
        initComponents();
        this.listener = listener;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        areaCorreo = new javax.swing.JTextField();
        areaContrasena = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ValidacionText = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Eras Bold ITC", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Bienvenido ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, 190, 60));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Dubai Light", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Contrasena:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 100, 30));

        jButton3.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jButton3.setText("Ingresar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, 180, 60));

        areaCorreo.setBackground(new java.awt.Color(255, 255, 255));
        areaCorreo.setText("Ingresa tu correo institucional");
        areaCorreo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                areaCorreoMousePressed(evt);
            }
        });
        jPanel1.add(areaCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 124, 310, 40));

        areaContrasena.setBackground(new java.awt.Color(255, 255, 255));
        areaContrasena.setText("Ingresa tu contrasena");
        areaContrasena.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                areaContrasenaMousePressed(evt);
            }
        });
        areaContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areaContrasenaActionPerformed(evt);
            }
        });
        jPanel1.add(areaContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 214, 310, 40));

        jLabel6.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Iniciar Sesion");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 150, 40));

        jLabel7.setFont(new java.awt.Font("Dubai Light", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Correo:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 110, 30));

        ValidacionText.setForeground(new java.awt.Color(255, 0, 0));
        ValidacionText.setText("correo y/o contrasena incorrectos. Intente nuevamente :(");
        jPanel1.add(ValidacionText, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 300, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 410, 540));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Engravers MT", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("al incio de sesion UMSS");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, 320, 70));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icon-UMSS.png"))); // NOI18N
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, 340, 340));

        jButton2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 102, 255));
        jButton2.setText("Primera vez? Registrate");
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 500, 350, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fondoGradiente.jpg"))); // NOI18N
        jLabel1.setText("fondo");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 600));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        listener.cambiarVentanas("Registro");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void areaContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areaContrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_areaContrasenaActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void areaCorreoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_areaCorreoMousePressed
        areaCorreo.setText("");
    }//GEN-LAST:event_areaCorreoMousePressed

    private void areaContrasenaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_areaContrasenaMousePressed
        areaContrasena.setText("");
    }//GEN-LAST:event_areaContrasenaMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ValidacionText;
    private javax.swing.JTextField areaContrasena;
    private javax.swing.JTextField areaCorreo;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
