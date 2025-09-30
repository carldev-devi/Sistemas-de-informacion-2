package Main;

import java.awt.Color;
import Listeners.LoginVentanas;
import Paneles.Estudiante;
import Paneles.Informacion;
import Paneles.Inicio;
import Paneles.LoginRegistro.ventanaLogin;
import Paneles.Resultados;

public class VentanaPrincipal extends javax.swing.JFrame implements LoginVentanas{
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName());
    Inicio inicio;
    Estudiante estudiante;
    Resultados resultados;
    Informacion informacion;
    ventanaLogin login;
    
    public VentanaPrincipal() {
        initComponents();
        inicializarPaneles();
        login = new ventanaLogin(this,true);
        
    }

    private void inicializarPaneles(){
        this.inicio=new Inicio(this);
        this.estudiante=new Estudiante();
        this.resultados=new Resultados();
        this.informacion=new Informacion();
        Paneles.add("Inicio",inicio);
        Paneles.add("Estudiante",estudiante);
        Paneles.add("Resultados",resultados);
        Paneles.add("Informacion",informacion);

    }
    @Override
    public void cambiarVentanas(String nom){
        if ("Inicio".equalsIgnoreCase(nom)) {
            for (int i = 0; i < Paneles.getTabCount(); i++) {
                if (Paneles.getTitleAt(i).equalsIgnoreCase("Inicio")) {
                    Paneles.setSelectedIndex(i);
                    break;
                }
            }
        }else if ("Estudiante".equalsIgnoreCase(nom)) {
            for (int i = 0; i < Paneles.getTabCount(); i++) {
                if (Paneles.getTitleAt(i).equalsIgnoreCase("Estudiante")) {
                    Paneles.setSelectedIndex(i);
                    break;
                }
            }
        }else if ("Resultados".equalsIgnoreCase(nom)) {
            for (int i = 0; i < Paneles.getTabCount(); i++) {
                if (Paneles.getTitleAt(i).equalsIgnoreCase("Resultados")) {
                    Paneles.setSelectedIndex(i);
                    break;
                }
            }
        }else if ("Informacion".equalsIgnoreCase(nom)) {
            for (int i = 0; i < Paneles.getTabCount(); i++) {
                if (Paneles.getTitleAt(i).equalsIgnoreCase("Informacion")) {
                    Paneles.setSelectedIndex(i);
                    break;
                }
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        opciones = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        Paneles = new javax.swing.JTabbedPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        opciones.setBackground(new java.awt.Color(102, 255, 255));
        opciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton2.setText("Home");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        opciones.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 200, 60));

        jButton4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton4.setText("Informacion");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        opciones.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 200, 60));

        jButton6.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jButton6.setText("Ingresar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        opciones.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 570, 170, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icon-UMSS(small).png"))); // NOI18N
        opciones.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, 100));

        jButton3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton3.setText("Estudiante");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        opciones.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 200, 60));

        getContentPane().add(opciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 630));
        getContentPane().add(Paneles, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, -30, 820, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        cambiarVentanas("Inicio");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        login.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        cambiarVentanas("Informacion");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        cambiarVentanas("Estudiante");
    }//GEN-LAST:event_jButton3ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new VentanaPrincipal().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane Paneles;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel opciones;
    // End of variables declaration//GEN-END:variables
}
