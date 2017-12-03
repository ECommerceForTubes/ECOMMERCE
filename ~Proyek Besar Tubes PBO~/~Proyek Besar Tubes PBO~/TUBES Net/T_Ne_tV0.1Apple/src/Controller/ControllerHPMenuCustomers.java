/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.HPMenuCustomers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 *
 * @author Dimas
 */
public class ControllerHPMenuCustomers implements ActionListener{
    HPMenuCustomers hpMenuCustomers;

    public ControllerHPMenuCustomers(String user) {
        hpMenuCustomers= new HPMenuCustomers ();
        hpMenuCustomers.setVisible(true);
        hpMenuCustomers.setLocationRelativeTo(null);
        hpMenuCustomers.addlistener(this);
        hpMenuCustomers.getjTextAreaName(user);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object a = e.getSource();
        
    }
}
