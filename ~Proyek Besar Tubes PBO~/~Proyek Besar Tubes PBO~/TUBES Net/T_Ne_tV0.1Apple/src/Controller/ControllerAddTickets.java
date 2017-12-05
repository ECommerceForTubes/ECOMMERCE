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
    String user;
    
//    HPMenuCustomers hpMenuCustomers; view selanjutnya
    
    public ControllerAddTickets(String user) {
        addTiket= new AddTickets();
        model = new Aplikasi();
        addTiket.setVisible(true);
        addTiket.setLocationRelativeTo(null);
        addTiket.addlistener(this);
        this.user = user;
    }
    
        @Override
    public void actionPerformed(ActionEvent e) {
        Object a = e.getSource();
        if (a == addTiket.getAdd()) {
            double harga = Double.parseDouble(addTiket.getHarga().getText());
            String tipe = addTiket.getjComboBoxtipe().getSelectedItem().toString();
            model.tambahticket(tipe, harga, user);
            addTiket.setVisible(false);
            new ControllerListproduct(user);
            
            
            //System.out.println(harga+" "+tipe);
//            new ControllerListproduct(user);
            

            
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
