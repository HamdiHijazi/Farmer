/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Application;

/**
 *
 * @author Hamdi
 */
public class Expenses implements MakeReport{
    private double price;
    private String typeOfExpenses;

    

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTypeOfExpenses() {
        return typeOfExpenses;
    }

    public void setTypeOfExpenses(String typeOfExpenses) {
        this.typeOfExpenses = typeOfExpenses;
    }

    @Override
    public void makeReport() {
        
    }

       
}
