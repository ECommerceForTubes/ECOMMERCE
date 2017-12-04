/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.Beranda;
import View.HPMenuCustomers;
import View.SignUpCustomer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Dimas
 */
public class ControllerSignUpCustomers implements ActionListener{
    SignUpCustomer signUpCustomer;
    Aplikasi model;
    HPMenuCustomers hpMenuCustomers;
    
    public ControllerSignUpCustomers() {
        signUpCustomer = new SignUpCustomer();
        model = new Aplikasi();
        signUpCustomer.setVisible(true);
        signUpCustomer.setLocationRelativeTo(null);
        signUpCustomer.addlistener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object a = e.getSource();
        if (a == signUpCustomer.getSignUp()) {
            String user = signUpCustomer.getRegName().getText();
            String pass = signUpCustomer.getRegPassword().getText();
            String email = signUpCustomer.getRegemail().getText();
            String addrs = signUpCustomer.getRegAddress().getText();
//            System.out.println(user + pass);
            
            try {
                if (model.cekLogin(email, pass,"customer")==null) {
                    model = new Aplikasi();
                    model.tambahcust(user, pass, addrs, email);
                    new ControllerHPMenuCustomers(email);
                    signUpCustomer.setVisible(false);
//                    hp = new HPMenuSeller();
//                    hp.setVisible(true);
//                    hp.setLocationRelativeTo(null);
//                    new ControllerHPMenuCustomers(user);
//                    signUpCustomer.setVisible(false);
                    
                
                }else {
                    JOptionPane.showConfirmDialog(signUpCustomer, "Anda sudah terdaftar", "Login Gagal", JOptionPane.WARNING_MESSAGE);
                    Beranda beranda = new Beranda();
                    beranda.setVisible(true);
                    beranda.setLocationRelativeTo(null);
                    signUpCustomer.setVisible(false);
                }

            } catch (Exception ee) {
                ee.printStackTrace();//penting
                JOptionPane.showConfirmDialog(signUpCustomer, ""+ee.getMessage(), ""+ee.getMessage(), JOptionPane.WARNING_MESSAGE);
            }
        }
    }
}
