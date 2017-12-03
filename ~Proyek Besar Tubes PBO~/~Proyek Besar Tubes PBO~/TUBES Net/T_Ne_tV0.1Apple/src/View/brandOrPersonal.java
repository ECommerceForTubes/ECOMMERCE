/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ControllerLoginSeller;
import Controller.ControllerLoginBrand;

/**
 *
 * @author Dimas
 */
public class brandOrPersonal extends javax.swing.JFrame {

    /**
     * Creates new form brandOrPersonal
     */
    public brandOrPersonal() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelIconPersonal = new javax.swing.JLabel();
        jLabelIconBrand = new javax.swing.JLabel();
        jLabelPersonal = new javax.swing.JLabel();
        jLabelPersonal1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(173, 215, 246));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Ubuntu Medium", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Who Are You");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, -1, -1));

        jLabelIconPersonal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/man.png"))); // NOI18N
        jLabelIconPersonal.setText("jLabel2");
        jLabelIconPersonal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelIconPersonal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelIconPersonalMouseClicked(evt);
            }
        });
        jPanel1.add(jLabelIconPersonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 120, -1));

        jLabelIconBrand.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/price-tag.png"))); // NOI18N
        jLabelIconBrand.setText("jLabel3");
        jLabelIconBrand.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelIconBrand.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelIconBrandMouseClicked(evt);
            }
        });
        jPanel1.add(jLabelIconBrand, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, 120, -1));

        jLabelPersonal.setFont(new java.awt.Font("Ubuntu", 0, 36)); // NOI18N
        jLabelPersonal.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPersonal.setText("Brand");
        jLabelPersonal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelPersonal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelPersonalMouseClicked(evt);
            }
        });
        jPanel1.add(jLabelPersonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 350, -1, -1));

        jLabelPersonal1.setFont(new java.awt.Font("Ubuntu", 0, 36)); // NOI18N
        jLabelPersonal1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPersonal1.setText("Personal");
        jLabelPersonal1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelPersonal1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelPersonal1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabelPersonal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 180, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/pexels-photo-2190234.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 500));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelIconPersonalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelIconPersonalMouseClicked
        // TODO add your handling code here:
        new ControllerLoginSeller();
        this.dispose();
    }//GEN-LAST:event_jLabelIconPersonalMouseClicked

    private void jLabelPersonal1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPersonal1MouseClicked
        // TODO add your handling code here:
        new ControllerLoginSeller();
        this.dispose();
    }//GEN-LAST:event_jLabelPersonal1MouseClicked

    private void jLabelIconBrandMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelIconBrandMouseClicked
        // TODO add your handling code here:
        new ControllerLoginBrand();
        this.dispose();
    }//GEN-LAST:event_jLabelIconBrandMouseClicked

    private void jLabelPersonalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPersonalMouseClicked
        // TODO add your handling code here:
        new ControllerLoginBrand();
        this.dispose();
    }//GEN-LAST:event_jLabelPersonalMouseClicked

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(brandOrPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(brandOrPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(brandOrPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(brandOrPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new brandOrPersonal().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelIconBrand;
    private javax.swing.JLabel jLabelIconPersonal;
    private javax.swing.JLabel jLabelPersonal;
    private javax.swing.JLabel jLabelPersonal1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}