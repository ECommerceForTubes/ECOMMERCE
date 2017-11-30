/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author wieisek
 */
public class LoginCustomer {
 
    private ArrayList<Customer> daftarCustomer = new ArrayList();
    private Database db = new Database();
    public LoginCustomer() {
        db.connect();
        daftarCustomer = db.loadCust();
    }
    
    public ArrayList<Customer> getDaftarCust(){
        return daftarCustomer;
    }
    
}
