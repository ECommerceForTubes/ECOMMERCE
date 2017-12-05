/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the eitor.
 */
package Controller;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import model.*;
/**
 *
 * @author Dimass
 */
public class Aplikasi {
    Database db;
    Seller sesSeller;
    Customer sesCust;
    ArrayList<Customer> tabCus = new ArrayList();
    ArrayList<Seller> tabSell = new ArrayList<>();

    public Aplikasi(){
        db = new Database();
        db.connect();
        
    }
    
    public void setSesionSeller(Seller ses){
        this.sesSeller = ses;
    }
    public Seller getSessionS(){
        return sesSeller;
    }
    
    public void tambahcust(String nama, String pass, String addrs, String email){
        Customer c = new Customer(nama,  pass,  addrs,  email);
        db.saveCust(c);
    }

    public void tambahSeller(String nama, String pass, String addrs, String email){
        Seller c = new Seller(nama, pass, addrs, email);
        db.saveSell(c);
    }
    
    public void tambahBrand(String nama, String pass, String addrs, String email){
        Brand b = new Brand(nama, pass, addrs, email);
        db.savebrand(b);
    }

    public String cekLogin(String username, String password, String Status) {
        String id=db.getlogin(username, password, Status);
        if (id!=null) {
            Seller sl=db.getSeller(id);
            setSesionSeller(sl);
        }
        return id;
    }
    
    public void tambahService(String nama, String type, double harga, String ids){
        Services services  = new Services(nama,type,harga);
        db.saveservice(services,ids);
    }
    public void tambahitem(String nama, String type, double harga, String idi){
        Item i = new Item(nama,type,harga);
        db.saveitem(i, idi);
    }
    
    public void tambahticket(String type, double harga, String idbrand){
        Tickets t = new Tickets(type,harga);
        db.savetiket(t, idbrand);
    }
    
    public void DeleteUser(String id){
        if(id.charAt(3)=='c'){
            db.Deleteuser(id, "customer");
        }else if(id.charAt(3)=='s'){
            db.Deleteuser(id, "seller");
        }else if(id.charAt(3)=='b'){
            db.Deleteuser(id, "brand");
        }
    }
    
    public void DeleteItem(String namaItem, String idSeller){
        if (db.cekPemilik(idSeller, namaItem)!=null) {
            db.DeleteItem(namaItem);
        }else{
            System.out.println("not match");
        }
        
    }
    
    public void DeleteService(String namaItem, String idowner){
        if (db.cekowner(idowner, namaItem)!=null) {
            db.DeleteService(namaItem);
        }else{
            System.out.println("not match");
        }
        
    }
    
    public void DeleteTicket(String type, String idowner){
        if (db.cekBrand(idowner, type)!=null) {
            db.DeleteService(type);
        }else{
            System.out.println("not match");
        }
        
    }
//   	public void deleteSeller()   

}
