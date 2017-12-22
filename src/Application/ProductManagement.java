/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Application;

import java.util.Date;



/**
 *
 * @author Hamdi
 */
public class ProductManagement implements MakeReport{
    private String nameOfProduct;
    private double quantityOfProduct;
    private String date;

    

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public void setNameOfProduct(String nameOfProduct) {
        this.nameOfProduct = nameOfProduct;
    }

    public double getQuantityOfProduct() {
        return quantityOfProduct;
    }

    public void setQuantityOfProduct(double quantityOfProduct) {
        this.quantityOfProduct = quantityOfProduct;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    public void getAllProductData(){
        
    }

    @Override
    public void makeReport() {

    }
}
