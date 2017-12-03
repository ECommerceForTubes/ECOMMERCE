/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.LoginBrand;
import View.LoginCustomer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Dimas
 */
public class ControllerLoginBrand implements ActionListener {
    LoginBrand loginBrand;

    public ControllerLoginBrand() {
        loginBrand = new LoginBrand();
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
        }
    }
}
