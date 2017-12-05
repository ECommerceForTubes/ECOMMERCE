/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.AddService;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Dimas
 */
public class ControllerAddService implements ActionListener{
    AddService addService;
    Aplikasi model;
    String user;
//    HPMenuCustomers hpMenuCustomers; view selanjutnya
    
    public ControllerAddService(String user) {
        addService= new AddService();
        model = new Aplikasi();
        addService.setVisible(true);
        addService.setLocationRelativeTo(null);
        addService.addlistener(this);
        this.user = user;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object a = e.getSource();
        if (a == addService.getAdd()) {
            String nama = addService.getRegName1().getText();
            Double harga =  Double.parseDouble(addService.getRegHarga().getText());
            String tipe = addService.getTipe().getSelectedItem().toString();
//            System.out.println(harga+" "+tipe);
            model.tambahService(nama, tipe, harga, user);
        }
    }    
}
