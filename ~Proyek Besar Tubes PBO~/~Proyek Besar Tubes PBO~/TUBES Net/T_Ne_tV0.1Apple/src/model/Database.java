/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.*;
import java.util.*;
import javax.swing.*;
/**
 *
 * @author X105
 */
public class Database {
    private String server = "jdbc:mysql://localhost/ecommerce";
    private String dbuser = "root";
    private String dbpasswd = "";
    private Statement statement = null;
    private Connection connection = null;
    private ResultSet rs = null;
    
    public Database() { 
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        connect();
    }

    public void connect() { 
        try {
            connection = DriverManager.getConnection(server, dbuser, dbpasswd);
            statement = connection.createStatement();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e.getMessage(), "Terjadi kesalahan saat konek", JOptionPane.WARNING_MESSAGE);
        }
    }

    public void saveCust(Customer c) {
        try {
            String query1 = "INSERT INTO `customer`(`idcustomer`, `name`, `password`, `address`, `email`) VALUES"
                    + "('" + "idc_"+c.getE_mail() + "', "
                    + "'" + c.getName() + "', "
                    + "'" + c.getPassword() + "', "
                    + "'" + c.getAddress() + "', "
                    + "'" + c.getE_mail() + "')";
            
            statement.execute(query1);
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Data masih kosong atau Email sudah ada", "Terjadi kesalahan saat insert data", JOptionPane.WARNING_MESSAGE);
        }
    }

    public void saveSell(Seller s) {
        try {
            String query1 = "INSERT INTO `seller`(`idseller`, `name`, `password`, `address`, `email`)  values"
                    + "('" +"ids_"+s.getE_mail()+ "', "
                    + "'" + s.getName() + "', "
                    + "'" + s.getPassword() + "', "
                    + "'" + s.getAddress() + "', "
                    + "'" + s.getE_mail() + "')";
            statement.execute(query1);
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Data masih kosong atau Email sudah ada", "Terjadi kesalahan saat insert data", JOptionPane.WARNING_MESSAGE);
        }
    }

    public void savebrand(Brand s) {
        try {
            String query1 = "INSERT INTO `brand`(`idbrand`, `nama`, `email`, `password`, `address`) VALUES"
                    + "('" +"idb_"+s.getE_mail()+ "', "
                    + "'" + s.getName() + "', "
                    + "'" + s.getE_mail()+ "', "
                    + "'" + s.getPassword()+ "', "
                    + "'" + s.getAddress()+ "')";
            statement.execute(query1);
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Data masih kosong atau email sudah ada", "Terjadi kesalahan saat insert data", JOptionPane.WARNING_MESSAGE);
        }
    }

    public void saveitem(Item s, String idseller) {
        try {
            String query1 = "insert into item(idseller ,nama ,category , price) values"
                    + "('" + idseller + "', "
                    + "'" + s.getCode_item() + "', "
                    + "'" + s.getCategory() + "', "
                    + "'" + s.getPrice() + "')";
            statement.execute(query1);
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Data masih kosong atau Email sudah ada", "Terjadi kesalahan saat insert data", JOptionPane.WARNING_MESSAGE);
        }
    }

    public void saveservice(Services s,String idseller) {
        try {
            String query1 = "INSERT INTO `service`(`idowner`, `nama`, `type_service`, `price`) VALUES"
                    + "('" + idseller+ "', "
                    + "'" + s.getnama() + "', "
                    + "'" + s.getType_service() + "', "
                    + "'" + s.getPrice() +  "')";
            statement.execute(query1);
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Data masih kosong atau Email sudah ada", "Terjadi kesalahan saat insert data", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public void savecourier(Courier s) {
        try {
            String query1 = "insert into courier(idcourier, courier_name, price) values"
                    + "('" + s.getId_courier() + "', "
                    + "'" + s.getId_courier() + "', "
                    + "'" + s.getName() +  "')";
            statement.execute(query1);
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Data masih kosong atau Email sudah ada", "Terjadi kesalahan saat insert data", JOptionPane.WARNING_MESSAGE);
        }
    }

    public void savetiket(Tickets s, String idbrand) {
        try {
            String query1 = "INSERT INTO `ticket`(`idbrand`, `type_ticket`, `price`) VALUES "
                    + "('" +idbrand+ "', "
                    + "'" + s.getTickets_type() + "', "
                    + "'" + s.getPrice()+ "')";
            statement.execute(query1);
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Data masih kosong atau email sudah ada", "Terjadi kesalahan saat insert data", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public String getlogin(String email, String password, String status) {
        String st = null;
        try {
            String query = "select * from "+status+" where email= '" + email + "' and password='" + password + "'";
            ResultSet rs = statement.executeQuery(query);
            if (rs.next()) {
                st = rs.getString(1);
            }
            return st;
        } catch (Exception e) {
           JOptionPane.showConfirmDialog(null, "eror get status", "Eror get status", JOptionPane.WARNING_MESSAGE);

        }
        return st;
    }
    
     public Seller getSeller(String id){
         Seller sel=null;
         try {
            String query = "select * from seller where idseller= '" + id + "'";
            ResultSet rs = statement.executeQuery(query);
            if (rs.next()) {
                sel = new Seller(rs.getString(2),rs.getString(3), rs.getString(4),rs.getString(5));
            }
            return sel;
        } catch (Exception e) {
           JOptionPane.showConfirmDialog(null, "eror get status", "Eror get status", JOptionPane.WARNING_MESSAGE);

        }
        return sel;
     }
     
     public Brand getBrand(String id){
         Brand sel=null;
         try {
            String query = "select * from brand where idbrand= '" + id + "'";
            ResultSet rs = statement.executeQuery(query);
            if (rs.next()) {
                sel = new Brand(rs.getString(2),rs.getString(3), rs.getString(4),rs.getString(5));
            }
            return sel;
        } catch (Exception e) {
           JOptionPane.showConfirmDialog(null, "eror get status", "Eror get status", JOptionPane.WARNING_MESSAGE);

        }
        return sel;
     }
     
    
    public Item getItem(String nama) {
        Item st = null ;
        try {
            String query = "select * from item where nama='"+ nama + "'";
            ResultSet rs = statement.executeQuery(query);
            if (rs.next()) {
                st = new Item(rs.getString(2),rs.getString(3), rs.getDouble(4));
            }
            return st;
        } catch (Exception e) {
           JOptionPane.showConfirmDialog(null, "eror get status", "Eror get status", JOptionPane.WARNING_MESSAGE);

        }
        return st;
    }
    
    public void savespayment(int idtransaction, Payment s) {
        try {
            String query1 = "insert into payment(idtransaction, idpayment, Type_payment, total_payment, status) values"
                    + "('" + idtransaction + "', "
                    + "'" + s.getId_payment() + "', "
                    + "'" + s.getType_payment() + "', "
                    + "'" + s.getTotal_payment() + "', "
                    + "'" + s.getStatus() +  "')";
            statement.execute(query1);
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Data masih kosong atau Email sudah ada", "Terjadi kesalahan saat insert data", JOptionPane.WARNING_MESSAGE);
        }
    }

    public String cekPemilik(String pemilik, String Item){
        String st = null;
        try {
            String query = "select * from item where idseller='"+ pemilik + "' AND nama='"+Item+"'";
            ResultSet rs = statement.executeQuery(query);
            if (rs.next()) {
                st = rs.getString(1);                
            }
            return st;
        } catch (Exception e) {
           JOptionPane.showConfirmDialog(null, "error get status", "Error get status", JOptionPane.WARNING_MESSAGE);

        }
        return st;
    }
    
    public String cekBrand(String pemilik, String type){
        String st = null;
        try {
            String query = "select * from ticket where idbrand='"+ pemilik + "' AND type_ticket='"+type+"'";
            ResultSet rs = statement.executeQuery(query);
            if (rs.next()) {
                st = rs.getString(1);                
            }
            return st;
        } catch (Exception e) {
           JOptionPane.showConfirmDialog(null, "error get status", "Error get status", JOptionPane.WARNING_MESSAGE);

        }
        return st;
    }
    
    public String cekowner(String pemilik, String Item){
        String st = null;
        try {
            String query = "select * from service where idowner='"+ pemilik + "' AND nama='"+Item+"'";
            ResultSet rs = statement.executeQuery(query);
            if (rs.next()) {
                st = rs.getString(1);                
            }
            return st;
        } catch (Exception e) {
           JOptionPane.showConfirmDialog(null, "error get status", "Error get status", JOptionPane.WARNING_MESSAGE);

        }
        return st;
    }
    
    public void DeleteItem(String nama){
        try {
            String query1 = "Delete from item where nama='" + nama + "'";
            statement.execute(query1);
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Data Tidak Ada", "Data Terhapus", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public void DeleteService(String nama){
        try {
            String query1 = "Delete from service where nama='" + nama + "'";
            statement.execute(query1);
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Data Tidak Ada", "Data Terhapus", JOptionPane.WARNING_MESSAGE);
        }
    }
  
    public void Deleteuser(String id, String status) {
        try {
            String query1 = "Delete from "+ status +" where id"+status+"='" + id + "'";
            statement.execute(query1);
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Data Tidak Ada", "Data Terhapus", JOptionPane.WARNING_MESSAGE);
        }
    }

    public ArrayList<Customer> loadCust(){
        try {
            ArrayList<Customer> daftarCust = new ArrayList();
            String query = "select * from Customer";
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()){
                Customer a = new Customer(rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
                daftarCust.add(a);
            }return daftarCust;
        } catch (Exception e) {
            throw new IllegalArgumentException("terjadi kesalahan saat load Customer");
        }
    }
    

    
    public ArrayList<Seller> loadSell(){
        try {
            ArrayList<Seller> daftarSeller = new ArrayList();
            String query = "select * from Seller";
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()){
                Seller a = new Seller(rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
                daftarSeller.add(a);
            }return daftarSeller;
        } catch (Exception e) {
            throw new IllegalArgumentException("terjadi kesalahan saat load Customer");
        }
    }
    
    public ArrayList<Brand> loadBrand(){
        try {
            ArrayList<Brand> daftarBrand = new ArrayList();
            String query = "select * from brand";
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()){
                Brand a = new Brand(rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
                daftarBrand.add(a);
            }return daftarBrand;
        } catch (Exception e) {
            throw new IllegalArgumentException("terjadi kesalahan saat load Customer");
        }
    }
    
    public ArrayList<Item> loadItemSel(String idseller){
        try {
            ArrayList<Item> dftitem = new ArrayList();
            String query = "select * from item where idseller='"+idseller+"'";
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()){
                Item a = new Item(rs.getString(2), rs.getString(3), rs.getDouble(4));
                dftitem.add(a);
            }return dftitem;
        } catch (Exception e) {
            throw new IllegalArgumentException("terjadi kesalahan saat load Customer");
        }
    }
    
    public ArrayList<Tickets> loadTicketBrn(String idbrand){
        try {
            ArrayList<Tickets> dft = new ArrayList();
            String query = "select * from ticket where idbrand='"+idbrand+"'";
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()){
                Tickets a = new Tickets(rs.getString(2), rs.getDouble(3));
                dft.add(a);
            }return dft;
        } catch (Exception e) {
            throw new IllegalArgumentException("terjadi kesalahan saat load Customer");
        }
    }
    
    public ArrayList<Services> loadSrv(String idowner){
        try {
            ArrayList<Services> dft = new ArrayList();
            String query = "select * from service where idbrand='"+idowner+"'";
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()){
                Services a = new Services(rs.getString(1),rs.getString(2),rs.getString(3), rs.getDouble(4));
                dft.add(a);
            }return dft;
        } catch (Exception e) {
            throw new IllegalArgumentException("terjadi kesalahan saat load Customer");
        }
    }
    
    public ResultSet getData(String str) { 
        try{
            rs = statement.executeQuery(str);
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        return rs;
    }
    
    public void query(String str) { 
        try{
            statement.executeUpdate(str);
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public void ClearALL(){
        try {
            String query1 = "TRUNCATE TABLE  customer";
            statement.execute(query1);
            query1 = "TRUNCATE TABLE  seller";
            statement.execute(query1);
            query1 = "TRUNCATE TABLE  brand";
            statement.execute(query1);
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Data Tidak Ada", "Data Terhapus", JOptionPane.WARNING_MESSAGE);
        }
    }
}
