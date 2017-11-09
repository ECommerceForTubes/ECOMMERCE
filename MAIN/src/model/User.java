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
public abstract class User {
    
    private String name;
    private String password;
    private String eMail;
    private String alamat;
    private String NIK;

    public User(String name, String password, String eMail, String alamat, String NIK) {
        this.name = name;
        this.password = password;
        this.eMail = eMail;
        this.alamat = alamat;
        this.NIK = NIK;
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

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String geteMail() {
        return eMail;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setNIK(String NIK) {
        this.NIK = NIK;
    }

    public String getNIK() {
        return NIK;
    }
    
    
    
}
