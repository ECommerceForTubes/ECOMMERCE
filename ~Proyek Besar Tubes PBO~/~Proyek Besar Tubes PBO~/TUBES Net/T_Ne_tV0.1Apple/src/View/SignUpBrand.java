/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.event.ActionListener;

/**
 *
 * @author User
 */
public class SignUpBrand extends javax.swing.JFrame {

    /**
     * Creates new form Register
     */
    public SignUpBrand() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jSlider1 = new javax.swing.JSlider();
        jPanelRight = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        RegName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        PasswordInter = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        RegPassword = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        RegAddress = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabelemail = new javax.swing.JLabel();
        RegEmail = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        RegIdentnumber = new javax.swing.JTextField();
        SignUp = new javax.swing.JButton();
        email = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelRight.setBackground(new java.awt.Color(135, 191, 255));
        jPanelRight.setPreferredSize(new java.awt.Dimension(800, 510));
        jPanelRight.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DolPick.com");
        jPanelRight.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Sign Up Seller");
        jPanelRight.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, -1, -1));

        RegName.setBackground(new java.awt.Color(135, 191, 255));
        RegName.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        RegName.setForeground(new java.awt.Color(255, 255, 255));
        RegName.setBorder(null);
        RegName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        RegName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegNameActionPerformed(evt);
            }
        });
        jPanelRight.add(RegName, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 162, 300, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Name :");
        jLabel3.setToolTipText("");
        jPanelRight.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanelRight.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 300, 5));

        PasswordInter.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        PasswordInter.setForeground(new java.awt.Color(255, 255, 255));
        PasswordInter.setText("Password :");
        jPanelRight.add(PasswordInter, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, -1, -1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanelRight.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 300, 5));

        RegPassword.setBackground(new java.awt.Color(135, 191, 255));
        RegPassword.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        RegPassword.setForeground(new java.awt.Color(255, 255, 255));
        RegPassword.setBorder(null);
        jPanelRight.add(RegPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 300, -1));

        jLabel5.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Address :");
        jPanelRight.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, -1, -1));

        RegAddress.setBackground(new java.awt.Color(135, 191, 255));
        RegAddress.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        RegAddress.setForeground(new java.awt.Color(255, 255, 255));
        RegAddress.setBorder(null);
        RegAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegAddressActionPerformed(evt);
            }
        });
        jPanelRight.add(RegAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 300, -1));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanelRight.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 300, 5));

        jLabel6.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Id Brand :");
        jPanelRight.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, -1, -1));

        jLabelemail.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabelemail.setForeground(new java.awt.Color(255, 255, 255));
        jLabelemail.setText("Email :");
        jPanelRight.add(jLabelemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, -1, -1));

        RegEmail.setBackground(new java.awt.Color(135, 191, 255));
        RegEmail.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        RegEmail.setForeground(new java.awt.Color(255, 255, 255));
        RegEmail.setBorder(null);
        RegEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegEmailActionPerformed(evt);
            }
        });
        jPanelRight.add(RegEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, 300, -1));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanelRight.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 460, 300, 5));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanelRight.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 300, 5));

        jCheckBox1.setBackground(new java.awt.Color(135, 191, 255));
        jCheckBox1.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("I accept the terms in the license agreement");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanelRight.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 500, -1, -1));

        RegIdentnumber.setBackground(new java.awt.Color(135, 191, 255));
        RegIdentnumber.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        RegIdentnumber.setForeground(new java.awt.Color(255, 255, 255));
        RegIdentnumber.setBorder(null);
        RegIdentnumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegIdentnumberActionPerformed(evt);
            }
        });
        jPanelRight.add(RegIdentnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, 300, -1));

        SignUp.setBackground(new java.awt.Color(173, 215, 246));
        SignUp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SignUp.setForeground(new java.awt.Color(255, 255, 255));
        SignUp.setText("Sign Up");
        SignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUpActionPerformed(evt);
            }
        });
        jPanelRight.add(SignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 560, 100, 40));

        getContentPane().add(jPanelRight, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 510, 730));

        email.setBackground(new java.awt.Color(173, 215, 246));
        email.setToolTipText("");
        email.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/price-tag.png"))); // NOI18N
        email.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 130, 200));

        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RegNameActionPerformed

    private void RegAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RegAddressActionPerformed

    private void RegEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RegEmailActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void RegIdentnumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegIdentnumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RegIdentnumberActionPerformed

    private void SignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SignUpActionPerformed

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
//            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            @Override
//            public void run() {
//                new Register().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PasswordInter;
    private javax.swing.JTextField RegAddress;
    private javax.swing.JTextField RegEmail;
    private javax.swing.JTextField RegIdentnumber;
    private javax.swing.JTextField RegName;
    private javax.swing.JPasswordField RegPassword;
    private javax.swing.JButton SignUp;
    private javax.swing.JPanel email;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelemail;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanelRight;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSlider1;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the RegAddress
     */
    public javax.swing.JTextField getRegAddress() {
        return RegAddress;
    }

    /**
     * @return the RegEmail
     */
    public javax.swing.JTextField getRegEmail() {
        return RegEmail;
    }

    /**
     * @return the RegIdentnumber
     */
    public javax.swing.JTextField getRegIdentnumber() {
        return RegIdentnumber;
    }

    /**
     * @return the RegName
     */
    public javax.swing.JTextField getRegName() {
        return RegName;
    }

    /**
     * @return the RegPassword
     */
    public javax.swing.JPasswordField getRegPassword() {
        return RegPassword;
    }

    /**
     * @return the SignUp
     */
    public javax.swing.JButton getSignUp() {
        return SignUp;
    }
    
    public void addlistener(ActionListener a){
        SignUp.addActionListener(a);
    }
    


}
