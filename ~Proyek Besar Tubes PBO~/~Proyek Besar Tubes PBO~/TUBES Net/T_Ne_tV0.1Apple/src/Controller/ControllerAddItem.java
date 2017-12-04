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
//    HPMenuCustomers hpMenuCustomers; view selanjutnya
    
    public ControllerAddItem() {
        addItem= new AddItem();
        model = new Aplikasi();
        addItem.setVisible(true);
        
        addItem.setLocationRelativeTo(null);
        addItem.addlistener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object a = e.getSource();
        if (a == addItem.getAdd()) {
            String nama = addItem.getRegName1().getText();
            String harga = addItem.getHarga().getText();
            String tipe = addItem.getjComboBoxtipe().getSelectedItem().toString();
            System.out.println(harga+" "+tipe);

            
//            try {
//                if (model.cekLogin(email, pass,"customer")==null) {
//                    model = new Aplikasi();
//                    model.tambahcust(user, pass, addrs, email);
//                    new ControllerHPMenuCustomers(email);
//                    signUpCustomer.setVisible(false);
//
//                
//                }else {
//                    JOptionPane.showConfirmDialog(signUpCustomer, "Anda sudah terdaftar", "Login Gagal", JOptionPane.WARNING_MESSAGE);
//                    Beranda beranda = new Beranda();
//                    beranda.setVisible(true);
//                    beranda.setLocationRelativeTo(null);
//                    signUpCustomer.setVisible(false);
//                }
//
//            } catch (Exception ee) {
//                 ee.printStackTrace();//penting
//               JOptionPane.showConfirmDialog(signUpCustomer, ""+ee.getMessage(), ""+ee.getMessage(), JOptionPane.WARNING_MESSAGE);
//            }
        }
    }    
}
