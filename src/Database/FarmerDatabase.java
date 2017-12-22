/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import Application.Expenses;
import Application.IncomeManagement;
import Application.LabourForce;
import Application.MakeReport;
import Application.ProductManagement;
import Application.SalesAdministration;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Hamdi
 */
public class FarmerDatabase {
    private Statement aStatement;
    
    
    
    
    public void addExpenses(Expenses aExpenses){
        DBConnection connect =DBConnection.getDBConnection();
        try{
            DBFacade db = new DBFacade();
            db.init();
            String strSQL = "INSERT INTO expenses VALUES ('"+
                    aExpenses.getPrice()+"','"+
                    aExpenses.getTypeOfExpenses()+ ")";
             
         aStatement.executeUpdate(strSQL);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void addLabourForce(LabourForce aLabourFource){
        DBConnection connect =DBConnection.getDBConnection();
    
        try{
            DBFacade db = new DBFacade();
            db.init();
            String strSQL = "INSERT INTO expenses VALUES ('"+
                    aLabourFource.getName()+"','"+
                    aLabourFource.getHoursWork()+ ")";
             
         aStatement.executeUpdate(strSQL);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void addSalesAdministration(SalesAdministration aSalesAdministration){
        DBConnection connect =DBConnection.getDBConnection();
    
        try{
            DBFacade db = new DBFacade();
            db.init();
            String strSQL = "INSERT INTO expenses VALUES ('"+
                    aSalesAdministration.getTraderName()+"','"+
                    aSalesAdministration.getProductPrice()+ ")";
             
         aStatement.executeUpdate(strSQL);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void addProductManagement(ProductManagement aProductManagement){
        DBConnection connect =DBConnection.getDBConnection();
    
        try{
            DBFacade db = new DBFacade();
            db.init();
            String strSQL = "INSERT INTO expenses VALUES ('"+
                    aProductManagement.getNameOfProduct()+"','"+
                    aProductManagement.getQuantityOfProduct()+"','"+
                    aProductManagement.getDate()+ ")";
             
         aStatement.executeUpdate(strSQL);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void addIncomeManagement(IncomeManagement aIncomeManagement){
        DBConnection connect =DBConnection.getDBConnection();
    
        try{
            DBFacade db = new DBFacade();
            db.init();
            String strSQL = "INSERT INTO expenses VALUES ('"+
                    aIncomeManagement.getIncomeMoney()+"','"+
                    aIncomeManagement.getFromWhom()+ ")";
             
         aStatement.executeUpdate(strSQL);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    /*
    public void makeReport(MakeReport aMakeReport) throws ClassNotFoundException, SQLException{
        DBFacade db = new DBFacade();
        db.init();
        Sring strSQL = "SELECT * FROM FARMER"
    }
*/
}
 
    