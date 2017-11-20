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
public class Services {
//>>--------------------------
    private String service_code;
    private String description;
    private String type_service;
    private double price;

    public Services(String service_code, String description, String type_service, double price) {
        this.service_code = service_code;
        this.description = description;
        this.type_service = type_service;
        this.price = price;
    }

    public void setService_code(String service_code) {
        this.service_code = service_code;
    }

    public String getService_code() {
        return service_code;
    }

    public void setType_service(String type_service) {
        this.type_service = type_service;
    }

    public String getType_service() {
        return type_service;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
    
    
//>>-------------------------------------    
}
