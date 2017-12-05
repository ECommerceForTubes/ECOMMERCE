/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.DeleteService;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.Seller;
/**
 *
 * @author X105
 */
public class ControllerDeleteService implements ActionListener {
    
    DeleteService dlt;
    Aplikasi modl;
    String user;
    public ControllerDeleteService(String user){
        dlt = new DeleteService();
        modl = new Aplikasi();
        dlt.setVisible(true);
        this.user=user;
        dlt.setLocationRelativeTo(null);
        dlt.addlistener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            Object a = e.getSource();
            if (a == dlt.getDeleteService()){
                String item = dlt.getDelNamaService().getText();
                modl.DeleteService(item, user);
                new ControllerDeleteService(user);
                dlt.setVisible(false);
            }
        }catch(Error x){
            throw x;
        }
    }
}
