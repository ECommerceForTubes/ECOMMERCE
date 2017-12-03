/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.LoginCustomer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author X105
 */
public class ControllerLoginCustomer implements ActionListener{
    LoginCustomer loginCustomer;

    public ControllerLoginCustomer() {
        loginCustomer = new LoginCustomer();
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
            System.out.println(user + pass);
        }
    }
    
    
}
