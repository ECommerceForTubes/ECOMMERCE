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
public class Penjual extends User{
    
    private String id_penjual;
    
    public Penjual(String name, String password, String eMail, String alamat, String NIK) {
        super(name, password, eMail, alamat, NIK);
        this.id_penjual = "jual_"+NIK;
    }

    public void setId_penjual(String id_penjual) {
        this.id_penjual = id_penjual;
    }

    public String getId_penjual() {
        return id_penjual;
    }
    
    
    
    
}
