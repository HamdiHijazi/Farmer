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
public class Builder {
    private double price;
    private String typeOfExpenses;
    private String name;
    private int hoursWork;
    private String traderName;
    private double productPrice;
    private String nameOfProduct;
    private double quantityOfProduct;
    private Date date;
    private double incomeMoney;
    private String fromWhom;
    
    

    public Builder setPrice(double price) {
        this.price = price;
        return this;
    }

    public Builder setTypeOfExpenses(String typeOfExpenses) {
        this.typeOfExpenses = typeOfExpenses;
        return this;
    }

    public Builder setName(String name) {
        this.name = name;
        return this;
    }

    public Builder setHoursWork(int hoursWork) {
        this.hoursWork = hoursWork;
        return this;
    }

    public Builder setTraderName(String traderName) {
        this.traderName = traderName;
        return this;
    }

    public Builder setProductPrice(double productPrice) {
        this.productPrice = productPrice;
        return this;
    }

    public Builder setNameOfProduct(String nameOfProduct) {
        this.nameOfProduct = nameOfProduct;
        return this;
    }

    public Builder setQuantityOfProduct(double quantityOfProduct) {
        this.quantityOfProduct = quantityOfProduct;
        return this;
    }

    public Builder setDate(Date date) {
        this.date = date;
        return this;
    }

    public Builder setIncomeMoney(double incomeMoney) {
        this.incomeMoney = incomeMoney;
        return this;
    }
    
    public Builder setIncomeMoney(String fromWhom) {
        this.fromWhom = fromWhom;
        return this;
    }
    
    public Expenses getExpenses(){
        return new Expenses();
    }
    
    public LabourForce getLabourForce(){
        return new LabourForce();
    }
    
    public SalesAdministration getSalesAdministration(){
        return new SalesAdministration();
    }
    
    public ProductManagement getProductManagement(){
        return new ProductManagement();
    }
    
    public IncomeManagement getIncomeManagement(){
        return new IncomeManagement();
    }
    

    
}
