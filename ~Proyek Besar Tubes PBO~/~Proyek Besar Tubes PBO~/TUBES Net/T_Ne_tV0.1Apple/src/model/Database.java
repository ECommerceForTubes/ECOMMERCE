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
            throw new IllegalArgumentException("terjadi kesalahan saat koneksi");
        }
    }

    public void saveCust(Customer c) {
        try {
            String query1 = "insert into customer(id_customer,name,password,address,idcard, email) values"
                    + "('" + null + "', "
                    + "'" + c.getName() + "', "
                    + "'" + c.getPassword() + "', "
                    + "'" + c.getAddress() + "', "
                    + "'" + c.getId_card() + "', "
                    + "'" + c.getE_mail() + "')";
            statement.execute(query1);
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Data masih kosong atau Email sudah ada", "Terjadi kesalahan saat insert data", JOptionPane.WARNING_MESSAGE);
        }
    }

    public void saveSell(Seller s) {
        try {
            String query1 = "insert into Seller(id_customer,name,password,address,idcard, email) values"
                    + "('" + null + "', "
                    + "'" + s.getName() + "', "
                    + "'" + s.getPassword() + "', "
                    + "'" + s.getAddress() + "', "
                    + "'" + s.getId_card() + "', "
                    + "'" + s.getE_mail() + "')";
            statement.execute(query1);
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Data masih kosong atau Email sudah ada", "Terjadi kesalahan saat insert data", JOptionPane.WARNING_MESSAGE);
        }
    }

    public String getloginCust(String email, String password) {
        String status = null;
        try {
            String query = "select * from Customer where username= '" + email + "' and password='" + password + "'";
            ResultSet rs = statement.executeQuery(query);
            //String status = null;
            if (rs.next()) {
                status = "Sukses";
            }
            return status;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "eror get status", "Eror get status", JOptionPane.WARNING_MESSAGE);
        }
        return status;
    }

    public ArrayList<Customer> loadCust(){
        try {
            ArrayList<Customer> daftarCust = new ArrayList();
            String query = "select * from Customer";
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()){
                Customer a = new Customer(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(5));
                daftarCust.add(a);
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
    
    public void query(String str) { //string disini merupakan query
        try{
            statement.executeUpdate(str);
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
