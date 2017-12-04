/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.Beranda;
import View.HPMenuBrand;
import View.SignUpBrand;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Dimas
 */
public class ControllerSignUpBrand implements ActionListener{
    SignUpBrand signUpBrand;
    Aplikasi model;
    HPMenuBrand hp;
    
    public ControllerSignUpBrand() {
        signUpBrand= new SignUpBrand();
        model = new Aplikasi();
        signUpBrand.setVisible(true);
        signUpBrand.setLocationRelativeTo(null);
        signUpBrand.addlistener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object a = e.getSource();
        if (a == signUpBrand.getSignUp()) {
            String user = signUpBrand.getRegName().getText();
            String pass = signUpBrand.getRegPassword().getText();
            String email = signUpBrand.getRegEmail().getText();
            String addrs = signUpBrand.getRegAddress().getText();
//            System.out.println(user + pass);
            
            try {
                if (model.cekLogin(email, pass,"brand")==null) {
                    model = new Aplikasi();
                    model.tambahBrand(user, pass, addrs, email);
                    hp = new HPMenuBrand();
                    hp.getjTextAreaName(email);
                    hp.setVisible(true);
                    hp.setLocationRelativeTo(null);
                    signUpBrand.setVisible(false);
                }else {
                    JOptionPane.showConfirmDialog(signUpBrand, "Anda sudah terdaftar", "Login Gagal", JOptionPane.WARNING_MESSAGE);
                    Beranda beranda = new Beranda();
                    beranda.setVisible(true);
                    beranda.setLocationRelativeTo(null);
                    signUpBrand.setVisible(false);
                }

            } catch (Exception ee) {
                 ee.printStackTrace();//penting
               JOptionPane.showConfirmDialog(signUpBrand, ""+ee.getMessage(), ""+ee.getMessage(), JOptionPane.WARNING_MESSAGE);
            }
        }
    }
    
}
