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
public class Payment {
//>>----------------------------------------
    private String id_payment;
    private String type_payment;
    private int total_payment;
    private String status;

    public Payment(String id_payment, String type_payment, int total_payment, String status) {
        this.id_payment = id_payment;
        this.type_payment = type_payment;
        this.total_payment = total_payment;
        this.status = status;
    }

    public void setId_payment(String id_payment) {
        this.id_payment = id_payment;
    }

    public String getId_payment() {
        return id_payment;
    }

    public void setType_payment(String type_payment) {
        this.type_payment = type_payment;
    }

    public String getType_payment() {
        return type_payment;
    }

    public void setTotal_payment(int total_payment) {
        this.total_payment = total_payment;
    }

    public int getTotal_payment() {
        return total_payment;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
       
//>>----------------------------------------
}
