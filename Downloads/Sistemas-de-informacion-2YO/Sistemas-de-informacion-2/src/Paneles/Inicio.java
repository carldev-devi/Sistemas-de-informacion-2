
package Paneles;

import Listeners.LoginVentanas;

/**
 *
 * @author carlo
 */
public class Inicio extends javax.swing.JPanel{

    LoginVentanas lis;
    public Inicio(LoginVentanas lis) {
        initComponents();
        this.lis=lis;
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 830, 30));

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setText("Ver Resultados");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(684, 10, 120, 30));

        jLabel2.setText("Examenes>>");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, -1, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        lis.cambiarVentanas("Resultados");
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
