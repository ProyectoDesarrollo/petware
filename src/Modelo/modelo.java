/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import vista.Principal;

/**
 *
 * @author Alejandro
 */
public class modelo extends Database{
    
    Principal vista;  
    public modelo() {}
    
    public DefaultTableModel getTablaCliente(){
        
      DefaultTableModel tablemodel = new DefaultTableModel();
      int registros = 0; // Indica la cantidad de filas de la tabla.
      String[] columNames = {"DNI", "Nombre", "Apellidos"}; // Indica el nombre de las columnas de la tabla.
      //obtenemos la cantidad de registros existentes en la tabla y se almacena en la variable "registros"
      //para formar la matriz de datos
      try{
         PreparedStatement pstm = this.getConexion().prepareStatement( "SELECT count(*) as Total FROM Cliente");
         ResultSet res = pstm.executeQuery();
         res.next();
         registros = res.getInt("total");
         res.close();
        }catch(SQLException e){
           System.err.println( e.getMessage() );
        }
      //se crea una matriz con tantas filas y columnas que necesite
        Object[][] data = new String[registros][3];
        try{
          //realizamos la consulta sql y llenamos los datos en la matriz "Object[][] data"
         PreparedStatement pstm = this.getConexion().prepareStatement("SELECT DNI, Nombre, Apellidos FROM Cliente");
         ResultSet res = pstm.executeQuery();
         int i=0;
         while(res.next()){
                data[i][0] = res.getString("DNI");
                data[i][1] = res.getString("Nombre");
                data[i][2] = res.getString("Apellidos");
            i++;
         }
         res.close();
         //se añade la matriz de datos en el DefaultTableModel
         tablemodel.setDataVector(data, columNames );
         }catch(SQLException e){
            System.err.println( e.getMessage() );
        }
        return tablemodel;
    }

    public DefaultTableModel getTablaPacientes(){
        
      DefaultTableModel tablemodel = new DefaultTableModel();
      int registros = 0; // Indica la cantidad de filas de la tabla.
      String[] columNames = {"Codigo", "Nombre", "Raza"}; // Indica el nombre de las columnas de la tabla.
      //obtenemos la cantidad de registros existentes en la tabla y se almacena en la variable "registros"
      //para formar la matriz de datos
      try{
         PreparedStatement pstm = this.getConexion().prepareStatement( "SELECT count(*) as Total FROM Pacientes");
         ResultSet res = pstm.executeQuery();
         res.next();
         registros = res.getInt("total");
         res.close();
        }catch(SQLException e){
           System.err.println( e.getMessage() );
        }
      //se crea una matriz con tantas filas y columnas que necesite
        Object[][] data = new String[registros][6];
        try{
          //realizamos la consulta sql y llenamos los datos en la matriz "Object[][] data"
         PreparedStatement pstm = this.getConexion().prepareStatement("SELECT Codigo, Nombre, Raza FROM Pacientes");
         ResultSet res = pstm.executeQuery();
         int i=0;
         while(res.next()){
                data[i][0] = res.getString("Codigo");
                data[i][1] = res.getString("Nombre");
                data[i][2] = res.getString("Raza");
            i++;
         }
         res.close();
         //se añade la matriz de datos en el DefaultTableModel
         tablemodel.setDataVector(data, columNames );
         }catch(SQLException e){
            System.err.println( e.getMessage() );
        }
        return tablemodel;
    }

    public DefaultTableModel getTablaProveedores(){
        
      DefaultTableModel tablemodel = new DefaultTableModel();
      int registros = 0; // Indica la cantidad de filas de la tabla.
      String[] columNames = {"NIF", "Nombre", "Apellidos"}; // Indica el nombre de las columnas de la tabla.
      //obtenemos la cantidad de registros existentes en la tabla y se almacena en la variable "registros"
      //para formar la matriz de datos
      try{
         PreparedStatement pstm = this.getConexion().prepareStatement( "SELECT count(*) as Total FROM Proveedores");
         ResultSet res = pstm.executeQuery();
         res.next();
         registros = res.getInt("total");
         res.close();
        }catch(SQLException e){
           System.err.println( e.getMessage() );
        }
      //se crea una matriz con tantas filas y columnas que necesite
        Object[][] data = new String[registros][6];
        try{
          //realizamos la consulta sql y llenamos los datos en la matriz "Object[][] data"
         PreparedStatement pstm = this.getConexion().prepareStatement("SELECT NIF, Nombre, Apellidos FROM Cliente");
         ResultSet res = pstm.executeQuery();
         int i=0;
         while(res.next()){
                data[i][0] = res.getString("NIF");
                data[i][1] = res.getString("Nombre");
                data[i][2] = res.getString("Apellidos");
            i++;
         }
         res.close();
         //se añade la matriz de datos en el DefaultTableModel
         tablemodel.setDataVector(data, columNames );
         }catch(SQLException e){
            System.err.println( e.getMessage() );
        }
        return tablemodel;
    }

    public DefaultTableModel getTablaProductos(){
        
      DefaultTableModel tablemodel = new DefaultTableModel();
      int registros = 0; // Indica la cantidad de filas de la tabla.
      String[] columNames = {"ID", "Nombre", "Stock", "Precio"}; // Indica el nombre de las columnas de la tabla.
      //obtenemos la cantidad de registros existentes en la tabla y se almacena en la variable "registros"
      //para formar la matriz de datos
      try{
         PreparedStatement pstm = this.getConexion().prepareStatement( "SELECT count(*) as Total FROM Productos");
         ResultSet res = pstm.executeQuery();
         res.next();
         registros = res.getInt("total");
         res.close();
        }catch(SQLException e){
           System.err.println( e.getMessage() );
        }
      //se crea una matriz con tantas filas y columnas que necesite
        Object[][] data = new String[registros][4];
        try{
          //realizamos la consulta sql y llenamos los datos en la matriz "Object[][] data"
        PreparedStatement pstm = this.getConexion().prepareStatement("SELECT ID, Nombre, Stock, Precio FROM Cliente");
        ResultSet res = pstm.executeQuery();
        int i=0;
        while(res.next()){
                data[i][0] = res.getString("ID");
                data[i][1] = res.getString("Nombre");
                data[i][2] = res.getString("Stock");
                data[i][3] = res.getString("Precio");
                
            i++;
        }
        res.close();
         //se añade la matriz de datos en el DefaultTableModel
        tablemodel.setDataVector(data, columNames );
        }catch(SQLException e){
           System.err.println( e.getMessage() );
        }
        return tablemodel;
    }
    
    public DefaultTableModel getTablaTrabajadores(){
        
      DefaultTableModel tablemodel = new DefaultTableModel();
      int registros = 0; // Indica la cantidad de filas de la tabla.
      String[] columNames = {"DNI", "Nombre", "Apellidos"}; // Indica el nombre de las columnas de la tabla.
      //obtenemos la cantidad de registros existentes en la tabla y se almacena en la variable "registros"
      //para formar la matriz de datos
      try{
         PreparedStatement pstm = this.getConexion().prepareStatement( "SELECT count(*) as Total FROM Trabajadores");
         ResultSet res = pstm.executeQuery();
         res.next();
         registros = res.getInt("total");
         res.close();
        }catch(SQLException e){
           System.err.println( e.getMessage() );
        }
      //se crea una matriz con tantas filas y columnas que necesite
        Object[][] data = new String[registros][6];
        try{
          //realizamos la consulta sql y llenamos los datos en la matriz "Object[][] data"
         PreparedStatement pstm = this.getConexion().prepareStatement("SELECT DNI, Nombre, Apellidos FROM Trabajadores");
         ResultSet res = pstm.executeQuery();
         int i=0;
         while(res.next()){
                data[i][0] = res.getString("DNI");
                data[i][1] = res.getString("Nombre");
                data[i][2] = res.getString("Apellidos");
            i++;
         }
         res.close();
         //se añade la matriz de datos en el DefaultTableModel
         tablemodel.setDataVector(data, columNames );
         }catch(SQLException e){
            System.err.println( e.getMessage() );
        }
        return tablemodel;
    }
}
