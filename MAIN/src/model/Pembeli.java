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
public class Pembeli extends User{
    
    private String id_pembeli;

    public Pembeli(String name, String password, String eMail, String alamat, String NIK) {
        super(name, password, eMail, alamat, NIK);
        this.id_pembeli = "beli_"+NIK;
    }

    public void setId_pembeli(String id_pembeli) {
        this.id_pembeli = id_pembeli;
    }

    public String getId_pembeli() {
        return id_pembeli;
    }
    
    
    
    
    
    
}
