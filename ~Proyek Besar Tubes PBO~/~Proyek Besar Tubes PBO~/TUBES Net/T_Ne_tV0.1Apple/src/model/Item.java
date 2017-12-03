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
public class Item {
//>>--------------------------
    private String item_code;
    private String category;
    private double price;    
    private int    stock;

    public Item(String item_code, String description, String category, double price, int stock) {
        this.item_code   = item_code;
        this.category    = category;
        this.price       = price;
        this.stock       = stock;
    }
    

    public void setCode_item(String item_code) {
        this.item_code = item_code;
    }

    public String getCode_item() {
        return item_code;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
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
    
//>>-----------------------------        
}
