/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.HPMenuSeller;
import View.LoginSeller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
/**
 *
 * @author Dimas
 */
public class ControllerLoginSeller implements ActionListener {
    LoginSeller loginSeller;
    HPMenuSeller hp;
    Aplikasi model;
    
    public ControllerLoginSeller() {
        loginSeller = new LoginSeller();
        model = new Aplikasi();
        loginSeller.setVisible(true);
        loginSeller.setLocationRelativeTo(null);
        loginSeller.addlistener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object a = e.getSource();
        if (a == loginSeller.getjButtonLogins()) {
            String user = loginSeller.getIn_username().getText();
            String pass = loginSeller.getjPasswordField1().getText();
            System.out.println(user + pass);

            try{
                if (model.cekLogin(user, pass, "seller")!=null){
                    hp = new HPMenuSeller();
                    hp.setVisible(true);
                    hp.setLocationRelativeTo(null);
                }else if(model.cekLogin(user, pass, "admin")!=null){
                    System.out.println("SUKSES ADMIN BROO");//<<<<<DIGANTI HOMEPAGE
                }else{
                    JOptionPane.showConfirmDialog(loginSeller, "Anda belum terdaftar", "Login Gagal", JOptionPane.WARNING_MESSAGE);
                }
            }catch (Exception ee) {
                 ee.printStackTrace();//penting
               JOptionPane.showConfirmDialog(loginSeller, ""+ee.getMessage(), ""+ee.getMessage(), JOptionPane.WARNING_MESSAGE);
            }
        }
    }
    
}
