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
public class Seller extends Account{
//>>-----------------------------
    
    private String id_seller;
    private List<Services> services = new ArrayList<>();
    private List<Item> items= new ArrayList<>();
    private List<Donation> donations= new ArrayList<>();

    public Seller(String name, String password, String address, String id_card, String e_mail, String id_seller) {
        super(name, password, address, id_card, e_mail);
        this.id_seller = id_seller;
    }

    public String getId_seller() {
        return id_seller;
    }

    public void setId_seller(String id_seller) {
        this.id_seller = id_seller;
    }
    
    public void addItem(String item_code, String description, String category, double price, int stock){
        Item item = new Item(item_code, description, category, price, stock);
        items.add(item);
    }
    
    public void addService(String service_code, String description, String type_service, double price){
        Services service = new Services(service_code, description, type_service, price);
        services.add(service);
    }
    
    public void addDonation(String name, String type_donation, String discription, String date, int count_donation){
       Donation donation = new Donation(name, type_donation, discription, date, count_donation);
       donations.add(donation);
    }
    
//>>-----------------------------    
}
