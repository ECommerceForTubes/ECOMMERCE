/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.AddItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Dimas
 */
public class ControllerAddItem implements ActionListener{
    AddItem addItem;
    Aplikasi model;
    String user;
//    HPMenuCustomers hpMenuCustomers; view selanjutnya
    
    public ControllerAddItem(String user) {
        addItem= new AddItem();
        model = new Aplikasi();
        addItem.setVisible(true);
        addItem.setLocationRelativeTo(null);
        addItem.addlistener(this);
        this.user = user;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object a = e.getSource();
        if (a == addItem.getAdd()) {
            String nama = addItem.getRegName1().getText();
            Double harga =  Double.parseDouble(addItem.getHarga().getText());
            String tipe = addItem.getjComboBoxtipe().getSelectedItem().toString();
            //System.out.println(harga+" "+tipe);
            model.tambahitem(nama, tipe, harga, user);
            addItem.setVisible(false);
            new ControllerListproduct(user);
            
            
            
        }
    }    
}
