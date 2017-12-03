/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.SignUpCustomer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Dimas
 */
public class ControllerSignUpCustomers implements ActionListener{
    SignUpCustomer signUpCustomer;
    public ControllerSignUpCustomers() {
        signUpCustomer = new SignUpCustomer();
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
            System.out.println(user + pass);
        }
    }
}
