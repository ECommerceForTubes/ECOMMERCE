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

    public void saveitem(Item s, int idseller) {
        try {
            String query1 = "insert into item(idseller ,nama ,category ,stock, price) values"
                    + "('" + idseller + "', "
                    + "'" + s.getCode_item() + "', "
                    + "'" + s.getCategory() + "', "
                    + "'" + s.getStock() + "', "
                    + "'" + s.getPrice() + "')";
            statement.execute(query1);
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Data masih kosong atau Email sudah ada", "Terjadi kesalahan saat insert data", JOptionPane.WARNING_MESSAGE);
        }
    }

    public void saveservice(int idowner, Services s) {
        try {
            String query1 = "insert into service(idowner, nama, Type_service, Price) values"
                    + "('" + idowner + "', "
                    + "'" + s.getService_code() + "', "
                    + "'" + s.getType_service() + "', "
                    + "'" + s.getDescription() + "', "
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
    
    
    
        public String getSingUp (String email, String password, String status) {
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

    public void Deleteuser(String email, String status) {
        try {
            String query1 = "Delete from "+ status +" where email='" + email + "'";
            statement.execute(query1);
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Data Terhapus", "Data Terhapus", JOptionPane.WARNING_MESSAGE);
        }
    }

    public ArrayList<Customer> loadCust(){
        try {
            ArrayList<Customer> daftarCust = new ArrayList();
            String query = "select * from Customer";
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()){
//                Customer a = new Customer(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(5));
//                daftarCust.add(a);
            }return daftarCust;
        } catch (Exception e) {
            throw new IllegalArgumentException("terjadi kesalahan saat load admin");
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
}
