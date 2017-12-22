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
public class LabourForce implements MakeReport{
    private String name;
    private int hoursWork;

   

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHoursWork() {
        return hoursWork;
    }

    public void setHoursWork(int hoursWork) {
        this.hoursWork = hoursWork;
    }
    
    public void getAllLaborersData(){
        
    }

    @Override
    public void makeReport() {

    }
    
}
