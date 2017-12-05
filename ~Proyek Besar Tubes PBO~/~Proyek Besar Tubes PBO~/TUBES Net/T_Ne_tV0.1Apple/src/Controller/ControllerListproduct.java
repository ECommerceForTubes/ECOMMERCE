/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.ListProduct;
import java.util.ArrayList;
import model.Database;
import model.Item;

/**
 *
 * @author Dimas
 */
public class ControllerListproduct {
    ListProduct listProduct;
    Aplikasi model;
    Database db;

    public ControllerListproduct(String idseller) {
        db = new Database();
        db.connect();
        listProduct= new ListProduct();
        model = new Aplikasi();
        for(int i=0;i<db.loadItemSel("ids_"+idseller).size();i++){
            System.out.println(db.loadItemSel("ids_"+idseller).get(i).getPrice());
        }

        listProduct.setData(db.loadItemSel("ids_"+idseller));
        listProduct.getTProduct();
        listProduct.setVisible(true);
        listProduct.setLocationRelativeTo(null);
        //addTiket.addlistener(this);
//        for(int i=0;i<db.loadItemSel("ids_"+idseller).size();i++){
//            System.out.println(db.loadItemSel("ids_"+idseller).get(i).getPrice());
//        }
        
    }
    
}
