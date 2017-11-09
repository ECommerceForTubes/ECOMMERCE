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
public class Tiket {
    private String  jenis;
    private int     harga;
    private String  jadwal;

    public Tiket(String jenis, int harga, String jadwal) {
        this.jenis  = jenis;
        this.harga  = harga;
        this.jadwal = jadwal;
    }

    public void setJenis(String jenis) {
        this.jenis  = jenis;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJadwal(String jadwal) {
        this.jadwal = jadwal;
    }

    public String getJadwal() {
        return jadwal;
    }

    public void setHarga(int harga) {
        this.harga  = harga;
    }

    public int getHarga() {
        return harga;
    }
    
    
}
