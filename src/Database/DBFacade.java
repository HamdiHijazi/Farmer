/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.SQLException;

/**
 *
 * @author Hamdi
 */
public class DBFacade {
    private DBConnection db;
    
    public DBFacade() throws ClassNotFoundException{
        db = new DBConnection();
    }
    
    public void init() throws SQLException{
        db.createConnection();
        db.createStatement();
    }
    
}
