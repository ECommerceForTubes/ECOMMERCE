/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.DeleteProduct;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.Seller;
/**
 *
 * @author X105
 */
public class ControllerDeleteProduct implements ActionListener {
    
    DeleteProduct dlt;
    Aplikasi modl;
    String user;
    public ControllerDeleteProduct(String user){
        dlt = new DeleteProduct();
        modl = new Aplikasi();
        dlt.setVisible(true);
        this.user=user;//<<<<BEGINI
        dlt.setLocationRelativeTo(null);
        dlt.addlistener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            Object a = e.getSource();
//            user= modl.sesSeller;
            if (a == dlt.getDeleteItem()){
                String item = dlt.getDelNamaItem().getText();
//                String ids="ids_"+user.getE_mail();
                System.out.println(user);
                modl.DeleteItem(item, user);
                new ControllerDeleteProduct(user);
                dlt.setVisible(false);
            }
        }catch(Error x){
            throw x;
        }
    }
}
