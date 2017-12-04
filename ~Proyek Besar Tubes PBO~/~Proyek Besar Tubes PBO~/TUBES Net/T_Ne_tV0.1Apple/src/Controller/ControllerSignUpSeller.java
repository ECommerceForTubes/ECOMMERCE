/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.Beranda;
import View.HPMenuSeller;
import View.SignUpSeller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Dimas
 */
public class ControllerSignUpSeller implements ActionListener{
    SignUpSeller signUpSeller;
    Aplikasi model;
    HPMenuSeller hp;
    
    public ControllerSignUpSeller() {
        signUpSeller= new SignUpSeller();
        model = new Aplikasi();
        signUpSeller.setVisible(true);
        signUpSeller.setLocationRelativeTo(null);
        signUpSeller.addlistener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object a = e.getSource();
        if (a == signUpSeller.getSignUp()) {
            String user = signUpSeller.getRegName().getText();
            String pass = signUpSeller.getRegPassword().getText();
            String email = signUpSeller.getRegEmail().getText();
            String addrs = signUpSeller.getRegAddress().getText();
//            System.out.println(user + pass);

            try {
                if (model.cekLogin(email, pass,"seller")==null) {
                    model = new Aplikasi();
                    model.tambahSeller(user, pass, addrs, email);
                    hp = new HPMenuSeller();
                    hp.getjTextAreaNamef(user);
                    hp.setVisible(true);
                    hp.setLocationRelativeTo(null);
                    signUpSeller.setVisible(false);
                }else {
                    JOptionPane.showConfirmDialog(signUpSeller, "Anda sudah terdaftar", "Login Gagal", JOptionPane.WARNING_MESSAGE);
                    Beranda beranda = new Beranda();
                    beranda.setVisible(true);
                    beranda.setLocationRelativeTo(null);
                    signUpSeller.setVisible(false);
                }

            } catch (Exception ee) {
                 ee.printStackTrace();//penting
               JOptionPane.showConfirmDialog(signUpSeller, ""+ee.getMessage(), ""+ee.getMessage(), JOptionPane.WARNING_MESSAGE);
            }
        }
    }
    
}
