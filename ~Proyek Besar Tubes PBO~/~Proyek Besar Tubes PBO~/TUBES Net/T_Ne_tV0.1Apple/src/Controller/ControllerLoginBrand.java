/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.LoginBrand;
import View.LoginCustomer;
import View.HPMenuBrand;
import View.ListProduct;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Dimas
 */
public class ControllerLoginBrand implements ActionListener {
    LoginBrand loginBrand;
    HPMenuBrand hp;
    Aplikasi model;
    ListProduct view;
    

    public ControllerLoginBrand() {
        loginBrand = new LoginBrand();
        model = new Aplikasi();
        loginBrand.setVisible(true);
        loginBrand.setLocationRelativeTo(null);
        loginBrand.addlistener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object a = e.getSource();
        if (a == loginBrand.getjButtonLoginB()) {
            String user = loginBrand.getIn_username().getText();
            String pass = loginBrand.getjPasswordField1().getText();
            System.out.println(user + pass);

            try {
                if (model.cekLogin(user, pass,"brand")!=null) {
                    hp = new HPMenuBrand();
                    hp.getjTextAreaName(user);
                    hp.setVisible(true);
                    hp.setLocationRelativeTo(null);
                    loginBrand.setVisible(false);
                    
                    //hpMenuCustomers.addlistener(this);
                    
                }else if (model.cekLogin(user, pass,"admin")!=null){
                    System.out.println("SUKSES ADMIN BRO");//<<<<<DIGANTI HOMEPAGE
                }else {
                    JOptionPane.showConfirmDialog(loginBrand, "Anda belum terdaftar", "Login Gagal", JOptionPane.WARNING_MESSAGE);
                }

            } catch (Exception ee) {
                 ee.printStackTrace();//penting
               JOptionPane.showConfirmDialog(loginBrand, ""+ee.getMessage(), ""+ee.getMessage(), JOptionPane.WARNING_MESSAGE);
            }
        }
    }
}
