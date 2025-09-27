package Main;

import java.awt.Color;
import java.sql.SQLException;
import ComponentesDAO.DeporteDAO;
import Paneles.Inicio;
import javax.swing.JPanel;
public class VentanaPrincipal extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName());
    Inicio inicio;
    DeporteDAO dao;
    public VentanaPrincipal() {
        initComponents();
        inicializarPaneles();
        
    }

    private void inicializarPaneles(){
        this.inicio=new Inicio();
        Paneles.add(inicio); 
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        opciones = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Paneles = new javax.swing.JTabbedPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        opciones.setBackground(new java.awt.Color(102, 255, 255));
        opciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setText("opcion1");
        opciones.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 150, 60));

        jButton3.setText("opcion3");
        opciones.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 150, 60));

        jButton4.setText("opcion2");
        opciones.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 150, 60));

        jButton1.setText("jButton1");
        opciones.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, -1));

        jLabel1.setText("gg");
        opciones.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, -1, -1));

        getContentPane().add(opciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 630));
        getContentPane().add(Paneles, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 670, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new VentanaPrincipal().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane Paneles;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel opciones;
    // End of variables declaration//GEN-END:variables
}
