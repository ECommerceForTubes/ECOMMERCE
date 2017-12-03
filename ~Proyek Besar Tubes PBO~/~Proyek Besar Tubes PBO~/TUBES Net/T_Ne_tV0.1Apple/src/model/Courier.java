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
public class Courier {
//>>----------------------------
        
    private String name;
    private String id_courier;
    private double tarif;

    public Courier(String name, String id_courier, int tarif) {
        this.name = name;
        this.id_courier = id_courier;
        this.tarif = tarif;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

    public void setId_courier(String id_courier) {
        this.id_courier = id_courier;
    }

    public String getId_courier() {
        return id_courier;
    }

    public void setTarif(int tarif) {
        this.tarif = tarif;
    }

    public double getTarif() {
        return tarif;
    }
 
//>>---------------------------------   
}
