/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.*;

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

    public ArrayList<Customer> loadCust(){
        try {
            ArrayList<Customer> daftarCust = new ArrayList();
            String query = "select * from Customer";
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()){
                Customer a = new Customer(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
                daftarCust.add(a);
            }
        }catch (Exception e){
            throw new IllegalArgumentException("Terjadi kesalahan saat login");
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
