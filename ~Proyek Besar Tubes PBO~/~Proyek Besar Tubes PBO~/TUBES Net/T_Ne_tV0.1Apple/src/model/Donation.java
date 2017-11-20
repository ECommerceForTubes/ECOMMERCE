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
public class Donation {
//>>----------------------------------------
    private String name;
    private String type_donation;
    private String discription;
    private String date;
    private int count_donation;
    
    public Donation(String name, String type_donation, String discription, String date, int count_donation) {
        this.name = name;
        this.type_donation = type_donation;
        this.discription = discription;
        this.date = date;
        this.count_donation = count_donation;
    }  

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setType_donation(String type_donation) {
        this.type_donation = type_donation;
    }

    public String getType_donation() {
        return type_donation;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setCount_donation(int count_donation) {
        this.count_donation = count_donation;
    }

    public int getCount_donation() {
        return count_donation;
    }
    
 //>>----------------------------------------   
}
