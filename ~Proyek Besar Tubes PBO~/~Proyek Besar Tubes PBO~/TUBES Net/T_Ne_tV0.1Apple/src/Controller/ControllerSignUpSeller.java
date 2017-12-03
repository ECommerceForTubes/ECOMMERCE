/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.SignUpSeller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Dimas
 */
public class ControllerSignUpSeller implements ActionListener{
    SignUpSeller signUpSeller;
    
    public ControllerSignUpSeller() {
        signUpSeller= new SignUpSeller();
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
            String idnum = signUpSeller.getRegIdentnumber().getText();
            System.out.println(user + pass);
        }
    }
    
}
