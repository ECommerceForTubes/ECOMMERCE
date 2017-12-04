/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Dimas
 */
public class Tickets {
//>>--------------------------
    private String tickets_type;
    private double price;    

    public Tickets(String tickets_type, double price) {
        this.tickets_type = tickets_type;
        this.price        = price;
    }

    public void setTickets_type(String tickets_type) {
        this.tickets_type = tickets_type;
    }

    public String getTickets_type() {
        return tickets_type;
    }


    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
//>>----------------------------------       
}
