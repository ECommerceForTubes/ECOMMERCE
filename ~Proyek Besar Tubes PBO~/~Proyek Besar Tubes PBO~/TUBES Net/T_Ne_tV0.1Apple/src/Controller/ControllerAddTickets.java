/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.AddTickets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Dimas
 */
public class ControllerAddTickets implements ActionListener{
    AddTickets addTiket;
    Aplikasi model;
//    HPMenuCustomers hpMenuCustomers; view selanjutnya
    
    public ControllerAddTickets() {
        addTiket= new AddTickets();
        model = new Aplikasi();
        addTiket.setVisible(true);
        
        addTiket.setLocationRelativeTo(null);
        addTiket.addlistener(this);
    }
    
        @Override
    public void actionPerformed(ActionEvent e) {
        Object a = e.getSource();
        if (a == addTiket.getAdd()) {
            String harga = addTiket.getHarga().getText();
            String tipe = addTiket.getjComboBoxtipe().getSelectedItem().toString();
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
