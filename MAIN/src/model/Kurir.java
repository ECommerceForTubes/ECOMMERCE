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
public class Kurir {
    
    private String name;
    private String id_kurir;
    private Integer tarif;

    public Kurir(String name, String id_kurir, Integer tarif) {
        this.name = name;
        this.id_kurir = id_kurir;
        this.tarif = tarif;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public void setId_kurir(String id_kurir) {
        this.id_kurir = id_kurir;
    }

    public String getId_kurir() {
        return id_kurir;
    }

    public void setTarif(Integer tarif) {
        this.tarif = tarif;
    }

    public Integer getTarif() {
        return tarif;
    }
    
}
