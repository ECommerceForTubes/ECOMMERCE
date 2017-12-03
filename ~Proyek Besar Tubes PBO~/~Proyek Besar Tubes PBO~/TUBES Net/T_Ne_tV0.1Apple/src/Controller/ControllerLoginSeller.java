/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import View.LoginSeller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Dimas
 */
public class ControllerLoginSeller implements ActionListener {
    LoginSeller loginSeller;
    
    public ControllerLoginSeller() {
        loginSeller = new LoginSeller();
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
        }
    }
    
}
