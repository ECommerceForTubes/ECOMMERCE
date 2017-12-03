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
    private  String e_mail;
    
    public Account(String name, String password, String address, String e_mail) {
        this.name = name;
        this.password = password;
        this.address = address;
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

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    public String getE_mail() {
        return e_mail;
    }
    
//>>----------------------------------------    
}
