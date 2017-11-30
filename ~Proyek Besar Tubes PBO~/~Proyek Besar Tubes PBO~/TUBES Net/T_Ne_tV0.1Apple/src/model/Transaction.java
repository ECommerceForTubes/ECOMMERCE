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
public class Transaction {
    private String code_transaction;
    private Payment payment;
    private List<Item> items= new ArrayList<>();
    private List<Services> services= new ArrayList<>();

    public Transaction(String code_transaction, Payment payment) {
        this.code_transaction = code_transaction;
        this.payment = payment;
    }

    public String getCode_transaction() {
        return code_transaction;
    }

    public void setCode_transaction(String code_transaction) {
        this.code_transaction = code_transaction;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
    
    public void addItem(String item_code, String description, String category, double price, int stock){
        Item item = new Item(item_code, description, category, price, stock);
        items.add(item);
    }
    public void addService(String service_code, String description, String type_service, double price){
        Services service = new Services(service_code, description, type_service, price);
        services.add(service);
    }
    
}
