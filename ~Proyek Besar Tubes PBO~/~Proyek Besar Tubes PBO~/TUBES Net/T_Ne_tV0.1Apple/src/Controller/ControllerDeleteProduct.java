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
/**
 *
 * @author X105
 */
public class ControllerDeleteProduct implements ActionListener {
    
    DeleteProduct dlt;
    Aplikasi model;
    String user = null;
    public ControllerDeleteProduct(String user){
        dlt = new DeleteProduct();
        model = new Aplikasi();
        dlt.setVisible(true);
        this.user=user;//<<<<BEGINI
        dlt.setLocationRelativeTo(null);
        dlt.addlistener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object a = e.getSource();
        if (a == dlt.getDeleteItem()){
            String item = dlt.getDelNamaItem().getText();
            model.DeleteItem(item, user);
            new ControllerDeleteProduct(user);
            dlt.setVisible(false);
        }
    }
}
