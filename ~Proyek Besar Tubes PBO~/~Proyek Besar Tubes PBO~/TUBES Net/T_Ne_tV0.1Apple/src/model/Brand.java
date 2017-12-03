/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dimas
 */
public class Brand extends Account{
//>>-----------------------------
    private String id_brand;
    private List<Tickets> tickets= new ArrayList<>();

    public Brand(String name, String password, String address, String e_mail) {
        super(name, password, address, e_mail);
    }

    public void setId_brand(String id_brand) {
        this.id_brand = id_brand;
    }

    public String getId_brand() {
        return id_brand;
    }
    
    public void addTickets(String tickets_code, String tickets_type, String schedule, double price, int stock){
        Tickets ticket = new Tickets(tickets_code, tickets_type, schedule, price, stock);
        tickets.add(ticket);
    }
    
}
