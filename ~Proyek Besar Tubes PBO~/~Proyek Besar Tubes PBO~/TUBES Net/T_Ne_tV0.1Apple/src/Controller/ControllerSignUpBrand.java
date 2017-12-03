/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.SignUpBrand;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Dimas
 */
public class ControllerSignUpBrand implements ActionListener{
    SignUpBrand signUpBrand;
    
    public ControllerSignUpBrand() {
        signUpBrand= new SignUpBrand();
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
            String idnum = signUpBrand.getRegIdentnumber().getText();
            System.out.println(user + pass);
        }
    }
    
}
