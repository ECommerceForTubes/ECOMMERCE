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
    private String tickets_code;
    private String tickets_type;
    private String schedule;
    private double price;    
    private int    stock;    

    public Tickets(String tickets_code, String tickets_type, String schedule, double price, int stock) {
        this.tickets_code = tickets_code;
        this.tickets_type = tickets_type;
        this.schedule     = schedule;
        this.price        = price;
        this.stock        = stock;
    }

    public void setTickets_code(String tickets_code) {
        this.tickets_code = tickets_code;
    }

    public String getTickets_code() {
        return tickets_code;
    }

    public void setTickets_type(String tickets_type) {
        this.tickets_type = tickets_type;
    }

    public String getTickets_type() {
        return tickets_type;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }
    
//>>----------------------------------       
}
