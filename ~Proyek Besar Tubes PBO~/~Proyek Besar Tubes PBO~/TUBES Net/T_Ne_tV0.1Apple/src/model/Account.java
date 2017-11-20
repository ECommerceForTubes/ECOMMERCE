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
public abstract class Account {

//>>----------------------------------------    
    private  String name;
    private  String password;
    private  String address;
    private  String id_card;
    private  String e_mail;

    public Account(String name, String password, String address, String id_card, String e_mail) {
        this.name = name;
        this.password = password;
        this.address = address;
        this.id_card = id_card;
        this.e_mail = e_mail;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setId_card(String id_card) {
        this.id_card = id_card;
    }

    public String getId_card() {
        return id_card;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    public String getE_mail() {
        return e_mail;
    }
    
//>>----------------------------------------    
}
