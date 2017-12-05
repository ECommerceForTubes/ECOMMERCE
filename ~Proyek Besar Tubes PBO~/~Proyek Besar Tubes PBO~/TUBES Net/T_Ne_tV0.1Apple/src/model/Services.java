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
public class Services {
//>>--------------------------
    private String idowner;
    private String nama;
    private String type_service;
    private double price;

    public Services(String idowner, String nama, String type_service, double price) {
        this.idowner = idowner;
        this.nama = nama;
        this.type_service = type_service;
        this.price = price;
    }
    public Services(String nama, String type_service, double price) {
        this.nama = nama;
        this.type_service = type_service;
        this.price = price;
    }

    public void setidowner(String idowner) {
        this.idowner = idowner;
    }

    public String getidowner() {
        return idowner;
    }

    public void setType_service(String type_service) {
        this.type_service = type_service;
    }

    public String getType_service() {
        return type_service;
    }

    public void setnama(String nama) {
        this.nama = nama;
    }

    public String getnama() {
        return nama;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
    
    
//>>-------------------------------------    
}
