/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.HPadmin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 *
 * @author Dimas
 */
public class ControllerHPMenuAdmin implements ActionListener{
    HPadmin hpMenuAdmin;
    Aplikasi modl;
    
    public ControllerHPMenuAdmin(String user) {
        hpMenuAdmin= new HPadmin ();
        hpMenuAdmin.setVisible(true);
        modl = new Aplikasi();
        hpMenuAdmin.setLocationRelativeTo(null);
        hpMenuAdmin.addlistener(this);

    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            Object a = e.getSource();
            if (a == hpMenuAdmin.getjButtonClear()){
                modl.Clear();
            }
        }catch(Error x){
            throw x;
        }
    }
}
