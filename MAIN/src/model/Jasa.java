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
public class Jasa {
    
    private String  nama;
    private String  jenis_jasa;
    private int     harga;

    public Jasa(String nama, String jenis_jasa, int harga) {
        this.nama = nama;
        this.jenis_jasa = jenis_jasa;
        this.harga = harga;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setJenis_jasa(String jenis_jasa) {
        this.jenis_jasa = jenis_jasa;
    }

    public String getJenis_jasa() {
        return jenis_jasa;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getHarga() {
        return harga;
    }
    
}
