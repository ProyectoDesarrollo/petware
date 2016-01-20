/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    
    private String db = "DAM01";
    private String usr = "user_dam01";
    private String pass = "123456";
    private String url = "jdbc:mysql://90.74.183.48:3306/" + db;
    private Connection conn = null;
    
    public Database () {
    
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(this.url, this.usr, this.pass);
            
        } catch (SQLException | ClassNotFoundException e) {
            
            System.err.println(e.getMessage());
            
        }
    
    }
    
    public Connection getConnection () {
        
        return this.conn;
        
    }
    
}  

