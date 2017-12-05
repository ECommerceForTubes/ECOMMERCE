package Driver;

import Controller.ControllerLoginCustomer;
import View.Beranda;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dimas
 */
public class Driver {
    public static void main(String[] args) {
        //new ControllerLoginCustomer();
//        new Controller.ControllerDeleteProduct("ids_rff321");
        Beranda beranda = new Beranda();
        beranda.setVisible(true);
        beranda.setLocationRelativeTo(null);
       
    }
}