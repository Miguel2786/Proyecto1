/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventanas;

import ExamenesTest.Preguntas;
import javax.swing.ButtonGroup;
import static ExamenesTest.Preguntas.*;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;

/**
 *
 * @author campo
 */
public class ExamenTest extends javax.swing.JFrame {

    /**
     * Creates new form ExamenTest
     */
    public ExamenTest() {
        initComponents();
        setLocation(350, 250);
        laPregunta.setText(Preguntas.p1);
        eleccionA.setText(Preguntas.p1r1);
        eleccionB.setText(Preguntas.p1r2);
        eleccionC.setText(Preguntas.p1r3);
        eleccionD.setText(Preguntas.p1r4);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        panelPrincipal = new javax.swing.JPanel();
        tituloPregunta = new javax.swing.JLabel();
        laPregunta = new javax.swing.JLabel();
        eleccionA = new javax.swing.JRadioButton();
        eleccionB = new javax.swing.JRadioButton();
        eleccionC = new javax.swing.JRadioButton();
        eleccionD = new javax.swing.JRadioButton();
        numPregunta = new javax.swing.JLabel();
        botonTerminar = new javax.swing.JButton();
        botonSiguiente = new javax.swing.JButton();
        botonAnterior = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1050, 650));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelPrincipal.setBackground(new java.awt.Color(102, 102, 102));
        panelPrincipal.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Examen tipo Test", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 15), new java.awt.Color(255, 255, 255))); // NOI18N
        panelPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        panelPrincipal.setPreferredSize(new java.awt.Dimension(1000, 650));
        panelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloPregunta.setForeground(new java.awt.Color(255, 255, 255));
        tituloPregunta.setText("Pregunta: ");
        panelPrincipal.add(tituloPregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 70, 29));

        laPregunta.setForeground(new java.awt.Color(255, 255, 255));
        panelPrincipal.add(laPregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 650, 130));

        buttonGroup1.add(eleccionA);
        eleccionA.setForeground(new java.awt.Color(255, 255, 255));
        eleccionA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eleccionAActionPerformed(evt);
            }
        });
        panelPrincipal.add(eleccionA, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        buttonGroup1.add(eleccionB);
        eleccionB.setForeground(new java.awt.Color(255, 255, 255));
        panelPrincipal.add(eleccionB, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        buttonGroup1.add(eleccionC);
        eleccionC.setForeground(new java.awt.Color(255, 255, 255));
        panelPrincipal.add(eleccionC, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));

        buttonGroup1.add(eleccionD);
        eleccionD.setForeground(new java.awt.Color(255, 255, 255));
        panelPrincipal.add(eleccionD, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, -1));
        panelPrincipal.add(numPregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 30, 30));

        jPanel1.add(panelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 1000, 540));

        botonTerminar.setBackground(new java.awt.Color(0, 0, 0));
        botonTerminar.setForeground(new java.awt.Color(255, 255, 255));
        botonTerminar.setText("Terminar");
        botonTerminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTerminarActionPerformed(evt);
            }
        });
        jPanel1.add(botonTerminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 560, -1, -1));

        botonSiguiente.setBackground(new java.awt.Color(0, 0, 0));
        botonSiguiente.setForeground(new java.awt.Color(255, 255, 255));
        botonSiguiente.setText("Siguiente");
        jPanel1.add(botonSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 560, -1, -1));

        botonAnterior.setBackground(new java.awt.Color(0, 0, 0));
        botonAnterior.setForeground(new java.awt.Color(255, 255, 255));
        botonAnterior.setText("Anterior");
        jPanel1.add(botonAnterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 560, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1073, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 669, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void eleccionAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eleccionAActionPerformed
        
        // TODO add your handling code here:
    }//GEN-LAST:event_eleccionAActionPerformed

    private void botonTerminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTerminarActionPerformed
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_botonTerminarActionPerformed

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
            java.util.logging.Logger.getLogger(ExamenTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExamenTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExamenTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExamenTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
      
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExamenTest().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAnterior;
    private javax.swing.JButton botonSiguiente;
    private javax.swing.JButton botonTerminar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton eleccionA;
    private javax.swing.JRadioButton eleccionB;
    private javax.swing.JRadioButton eleccionC;
    private javax.swing.JRadioButton eleccionD;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel laPregunta;
    private javax.swing.JLabel numPregunta;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JLabel tituloPregunta;
    // End of variables declaration//GEN-END:variables
}
