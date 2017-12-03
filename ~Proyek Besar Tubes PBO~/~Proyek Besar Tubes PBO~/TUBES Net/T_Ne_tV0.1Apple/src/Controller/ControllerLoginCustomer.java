/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.LoginCustomer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author X105
 */
public class ControllerLoginCustomer implements ActionListener{
    LoginCustomer loginCustomer;
    Aplikasi model;

    public ControllerLoginCustomer() {
        loginCustomer = new LoginCustomer();
        model = new Aplikasi();
        loginCustomer.setVisible(true);
        loginCustomer.setLocationRelativeTo(null);
        loginCustomer.addlistener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object a = e.getSource();
        if (a == loginCustomer.getjButtonLogin()) {
            String user = loginCustomer.getIn_username().getText();
            String pass = loginCustomer.getjPasswordField1().getText();
            //System.out.println(user + pass);
            
            try {
                if (model.cekLogin(user, pass,"customer")!=null) {
                    
                } else {
                    JOptionPane.showConfirmDialog(loginCustomer, "Anda belum terdaftar", "Login Gagal", JOptionPane.WARNING_MESSAGE);
                }

            } catch (Exception ee) {
                 ee.printStackTrace();//penting
               JOptionPane.showConfirmDialog(loginCustomer, ""+ee.getMessage(), ""+ee.getMessage(), JOptionPane.WARNING_MESSAGE);
            }
        }
    }
    
    
}
