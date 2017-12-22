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
public class IncomeManagement implements MakeReport{
    private double incomeMoney;
    private String fromWhom;

   

    public double getIncomeMoney() {
        return incomeMoney;
    }

    public void setIncomeMoney(double incomeMoney) {
        this.incomeMoney = incomeMoney;
    }
    
    public String getFromWhom() {
        return fromWhom;
    }

    public void setFromWhom(String fromWhom) {
        this.fromWhom = fromWhom;
    }

    @Override
    public void makeReport() {

    }

       
    
}
