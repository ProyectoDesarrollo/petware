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
    
    private String db = "user_dam01_DAM01";
    private String usr = "user_dam01";
    private String pass = "123456";
    private String url = "jdbc:mysql://90.74.183.48:3306" + db;
    private Connection conn = null;
    
    public Database () {
        
        this.url = "jdbc:mysql://90.74.183.48:3306:3306/"+this.db;
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(this.url, this.usr, this.pass);
            System.out.println("Conexion realizada con exito.");
        }catch(SQLException e){
            System.out.println("Conexion NO realizada con exito por error de SQL.");
            System.err.println( e.getMessage() );
        }catch(ClassNotFoundException e){
            System.out.println("Conexion NO realizada con exito por error de Class.");
            System.err.println( e.getMessage() );
        }   
    }
    
    public Connection getConnection () {
        
        return this.conn;
        
    }
    
}  

