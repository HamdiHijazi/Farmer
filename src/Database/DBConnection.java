/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Hamdi
 */
public class DBConnection {
    private static DBConnection instance;
    private Connection aConnection;
    private Statement aStatement;
    DBConnection(){}
    public static DBConnection getDBConnection(){
        if(instance == null)
            instance = new DBConnection();
        return instance;
    }
    
    public Statement getStatement() throws Exception, SQLException{
        Class.forName("com.mysql.jdbc.Driver");        
        return aStatement;
    }
    
    public void createConnection() throws SQLException{
        aConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/farmer","root","");
    }
    
    public void createStatement() throws SQLException{
        aStatement = (Statement) aConnection.createStatement();
    }
    
}