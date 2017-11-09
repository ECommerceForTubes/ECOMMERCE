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
public class Barang {
    
    private String  kode_barang;
    private String  kategori;
    private int     harga;
    private String  diskripsi;

    public Barang(String kode_barang, String kategori, int harga, String diskripsi) {
        this.kode_barang    = kode_barang;
        this.kategori       = kategori;
        this.harga          = harga;
        this.diskripsi      = diskripsi;
    }

    public void setKode_barang(String kode_barang) {
        this.kode_barang = kode_barang;
    }

    public String getKode_barang() {
        return kode_barang;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getKategori() {
        return kategori;
    }

    public void setDiskripsi(String diskripsi) {
        this.diskripsi = diskripsi;
    }

    public String getDiskripsi() {
        return diskripsi;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getHarga() {
        return harga;
    }
    
    
}
