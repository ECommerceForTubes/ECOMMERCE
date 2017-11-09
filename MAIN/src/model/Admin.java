/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Dimas
 */
public class Admin extends User{
    
    private String id_admin;
    private Penjual penjual;
    private Pembeli pembeli;
    List<Penjual> Lpenjual = new LinkedList<>();
    List<Pembeli> Lpembeli = new LinkedList<>();
    
    public Admin(String name, String password, String eMail, String alamat, String NIK) {
        super(name, password, eMail, alamat, NIK);
        this.id_admin = "admin_"+NIK;
    }

    public void setId_admin(String id_admin) {
        this.id_admin = id_admin;
    }

    public String getId_admin() {
        return id_admin;
    }

    public List<Pembeli> getLpembeli() {
        return Lpembeli;
    }

    public void setLpembeli(List<Pembeli> Lpembeli) {
        this.Lpembeli = Lpembeli;
    }
    
    
    
    
    
}
