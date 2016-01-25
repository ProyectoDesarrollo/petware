/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import vista.Principal;
import vista.clienteFrame;

/**
 *
 * @author Alejandro
 */
public class modelo extends Database{
    
    Principal vista;
    clienteFrame vistaCliente = new clienteFrame();
    
    public modelo() {}
    
    //---------------------------------------Creacion de Tablas-------------------------------------
    public DefaultTableModel getTablaCliente(){
        
      DefaultTableModel tablemodel = new DefaultTableModel();
      int registros = 0; // Indica la cantidad de filas de la tabla.
      String[] columNames = {"DNI", "Nombre", "Apellidos"}; // Indica el nombre de las columnas de la tabla.
      //obtenemos la cantidad de registros existentes en la tabla y se almacena en la variable "registros"
      //para formar la matriz de datos
      try{
         PreparedStatement pstm = this.getConnection().prepareStatement( "SELECT count(*) as Total FROM Cliente");
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
         PreparedStatement pstm = this.getConnection().prepareStatement("SELECT DNI, Nombre, Apellidos FROM Cliente");
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
         PreparedStatement pstm = this.getConnection().prepareStatement( "SELECT count(*) as Total FROM Pacientes");
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
         PreparedStatement pstm = this.getConnection().prepareStatement("SELECT Codigo, Nombre, Raza FROM Pacientes");
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
         PreparedStatement pstm = this.getConnection().prepareStatement( "SELECT count(*) as Total FROM Proveedores");
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
         PreparedStatement pstm = this.getConnection().prepareStatement("SELECT NIF, Nombre, Apellidos FROM Cliente");
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
         PreparedStatement pstm = this.getConnection().prepareStatement( "SELECT count(*) as Total FROM Productos");
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
        PreparedStatement pstm = this.getConnection().prepareStatement("SELECT ID, Nombre, Stock, Precio FROM Productos");
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
         PreparedStatement pstm = this.getConnection().prepareStatement( "SELECT count(*) as Total FROM Trabajadores");
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
         PreparedStatement pstm = this.getConnection().prepareStatement("SELECT DNI, Nombre, Apellidos FROM Trabajadores");
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
    //------------------------------Metodos Buscar-----------------------------------------
    public DefaultTableModel buscarCliente(String buscar){
        DefaultTableModel tablemodel = new DefaultTableModel();
        int productos=0;
        String[] columNames = {"DNI", "Nombre", "Apellidos"};
        
        try{ 
            
            PreparedStatement pstm = this.getConnection().prepareStatement( "SELECT count(*) as total FROM Cliente where (Nombre like '%"+buscar+"%') || (DNI like '%"+buscar+"%') || (Apellidos like '%"+buscar+"%')");
            ResultSet res = pstm.executeQuery();
            res.next();
            productos=res.getInt("total");
            res.close();
            
            
        }catch(SQLException e){            
            System.err.println( e.getMessage() );
        }
        
        //se crea una matriz con tantas filas y columnas que necesite(de clase object para que no haya problemas)
        Object[][] data = new String[productos][3];
        
        try{
            //realizamos la consulta sql 
            PreparedStatement pstm = this.getConnection().prepareStatement("SELECT * FROM Cliente where (Nombre like '%"+buscar+"%' ) ||( DNI like '%"+buscar+"%')|| (Apellidos like '%"+buscar+"%')" );
            ResultSet res = pstm.executeQuery();
            int i=0;
            
            while(res.next()){ //y llenamos los datos en la matriz
                data[i][0] = res.getString( "Dni" );
                data[i][1] = res.getString( "Nombre" );
                data[i][2] = res.getString( "Apellidos" );
                i++;
            }
            
            res.close();
            //se añade la matriz de datos en el DefaultTableModel
            tablemodel.setDataVector(data, columNames );            
            
        }catch(SQLException e){
                
            System.err.println( e.getMessage() );
            JOptionPane.showMessageDialog(null, "No se ha podido conectar con la base de datos.");
        }catch(Exception e){
            
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error.");
        }
        return tablemodel;
    }
    
    public DefaultTableModel buscarPacientes( String buscar){
        
      DefaultTableModel tablemodel = new DefaultTableModel();
      int registros = 0; // Indica la cantidad de filas de la tabla.
      String[] columNames = {"Codigo", "Nombre", "Raza"}; // Indica el nombre de las columnas de la tabla.
      //obtenemos la cantidad de registros existentes en la tabla y se almacena en la variable "registros"
      //para formar la matriz de datos
      try{
         PreparedStatement pstm = this.getConnection().prepareStatement( "SELECT count(*) as Total FROM Pacientes where (Codigo like '%"+buscar+"%' ) ||( Nombre like '%"+buscar+"%')|| (Raza like '%"+buscar+"%')");
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
         PreparedStatement pstm = this.getConnection().prepareStatement("SELECT Codigo, Nombre, Raza FROM Pacientes where (Codigo like '%"+buscar+"%' ) ||( Nombre like '%"+buscar+"%')|| (Raza like '%"+buscar+"%')");
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
    
    public DefaultTableModel buscarProveedores( String buscar){
        
      DefaultTableModel tablemodel = new DefaultTableModel();
      int registros = 0; // Indica la cantidad de filas de la tabla.
      String[] columNames = {"NIF", "Nombre", "Apellidos"}; // Indica el nombre de las columnas de la tabla.
      //obtenemos la cantidad de registros existentes en la tabla y se almacena en la variable "registros"
      //para formar la matriz de datos
      try{
         PreparedStatement pstm = this.getConnection().prepareStatement( "SELECT count(*) as Total FROM Proveedores where (Codigo like '%"+buscar+"%' ) ||( Nombre like '%"+buscar+"%')|| (Raza like '%"+buscar+"%')");
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
         PreparedStatement pstm = this.getConnection().prepareStatement("SELECT NIF, Nombre, Apellidos FROM Cliente where (Codigo like '%"+buscar+"%' ) ||( Nombre like '%"+buscar+"%')|| (Raza like '%"+buscar+"%')");
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
    
    public DefaultTableModel buscarProductos(String buscar){
        
      DefaultTableModel tablemodel = new DefaultTableModel();
      int registros = 0; // Indica la cantidad de filas de la tabla.
      String[] columNames = {"ID", "Nombre", "Stock", "Precio"}; // Indica el nombre de las columnas de la tabla.
      //obtenemos la cantidad de registros existentes en la tabla y se almacena en la variable "registros"
      //para formar la matriz de datos
      try{
         PreparedStatement pstm = this.getConnection().prepareStatement( "SELECT count(*) as Total FROM Productos where (Nombre like '%"+buscar+"%' ");
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
        PreparedStatement pstm = this.getConnection().prepareStatement("SELECT ID, Nombre, Stock, Precio FROM Cliente where ( Nombre like '%"+buscar+"%')");
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
    
    public DefaultTableModel buscarTrabajadores(String buscar){
        
      DefaultTableModel tablemodel = new DefaultTableModel();
      int registros = 0; // Indica la cantidad de filas de la tabla.
      String[] columNames = {"DNI", "Nombre", "Apellidos"}; // Indica el nombre de las columnas de la tabla.
      //obtenemos la cantidad de registros existentes en la tabla y se almacena en la variable "registros"
      //para formar la matriz de datos
      try{
         PreparedStatement pstm = this.getConnection().prepareStatement( "SELECT count(*) as Total FROM Trabajadores where (DNI like '%"+buscar+"%' ) ||( Nombre like '%"+buscar+"%')|| (Apellidos like '%"+buscar+"%')");
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
         PreparedStatement pstm = this.getConnection().prepareStatement("SELECT DNI, Nombre, Apellidos FROM Trabajadores where (DNI like '%"+buscar+"%' ) ||( Nombre like '%"+buscar+"%')|| (Apellidos like '%"+buscar+"%')");
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
    
    //--------------------------------- Meotdos Rellenar-----------------------------
    
    public String[] RellenarCliente(String dni){     
        String[] Relleno= new String[5];
      try{
         
         PreparedStatement pstm = this.getConnection().prepareStatement("SELECT DNI, Nombre, Apellidos, Direccion, Telefono FROM Clientes WHERE DNI like '%"+dni+"%'");
         ResultSet res = pstm.executeQuery();
         
         while(res.next()){ 
            Relleno[0]= res.getString("DNI");
            Relleno[1] = res.getString("Nombre");
            Relleno[2]= res.getString("Apellidos");
            Relleno[3]= res.getString("Direccion");
            Relleno[4]= res.getString("Telefono");
          
         }           
         res.close();
         }catch(SQLException e){
            System.err.println( e.getMessage() );
        }
        return Relleno; 
    }
    
    public String[] RellenarProveedor(String nif){     
        String[] Relleno= new String[5];
      try{
         
         PreparedStatement pstm = this.getConnection().prepareStatement("SELECT NIF, Nombre, Apellidos, Direccion, Telefono FROM Proveedores WHERE NIF like '%"+nif+"%'");
         ResultSet res = pstm.executeQuery();
         
         while(res.next()){ 
            Relleno[0]= res.getString("NIF");
            Relleno[1] = res.getString("Nombre");
            Relleno[2]= res.getString("Apellidos");
            Relleno[3]= res.getString("Direccion");
            Relleno[4]= res.getString("Telefono");
          
         }           
         res.close();
         }catch(SQLException e){
            System.err.println( e.getMessage() );
        }
        return Relleno; 
    }
    
    public String[] RellenarPaciente(String codigo){     
        String[] Relleno= new String[5];
      try{
         
         PreparedStatement pstm = this.getConnection().prepareStatement("SELECT DNI, Nombre, Apellidos, Direccion, Telefono FROM Pacientes WHERE Codigo like '%"+codigo+"%'");
         ResultSet res = pstm.executeQuery();
         
         while(res.next()){ 
            Relleno[0]= res.getString("DNI");
            Relleno[1] = res.getString("Nombre");
            Relleno[2]= res.getString("Apellidos");
            Relleno[3]= res.getString("Direccion");
            Relleno[4]= res.getString("Telefono");
          
         }           
         res.close();
         }catch(SQLException e){
            System.err.println( e.getMessage() );
        }
        return Relleno; 
    }
    
    public String[] RellenarProducto(String id){     
        String[] Relleno= new String[5];
      try{
         
         PreparedStatement pstm = this.getConnection().prepareStatement("SELECT DNI, Nombre, Apellidos, Direccion, Telefono FROM Productos WHERE ID like '%"+id+"%'");
         ResultSet res = pstm.executeQuery();
         
         while(res.next()){ 
            Relleno[0]= res.getString("DNI");
            Relleno[1] = res.getString("Nombre");
            Relleno[2]= res.getString("Apellidos");
            Relleno[3]= res.getString("Direccion");
            Relleno[4]= res.getString("Telefono");
          
         }           
         res.close();
         }catch(SQLException e){
            System.err.println( e.getMessage() );
        }
        return Relleno; 
    }
    
    public String[] RellenarTrabajadores(String dni){     
        String[] Relleno= new String[5];
      try{
         
         PreparedStatement pstm = this.getConnection().prepareStatement("SELECT DNI, Nombre, Apellidos, Direccion, Telefono FROM Trabajadores WHERE DNI like '%"+dni+"%'");
         ResultSet res = pstm.executeQuery();
         
         while(res.next()){ 
            Relleno[0]= res.getString("DNI");
            Relleno[1] = res.getString("Nombre");
            Relleno[2]= res.getString("Apellidos");
            Relleno[3]= res.getString("Direccion");
            Relleno[4]= res.getString("Telefono");
          
         }           
         res.close();
         }catch(SQLException e){
            System.err.println( e.getMessage() );
        }
        return Relleno; 
    }
    
    public String[] RellenarVacunas(String dni){     
        String[] Relleno= new String[5];
      try{
         
         PreparedStatement pstm = this.getConnection().prepareStatement("SELECT DNI, Nombre, Apellidos, Direccion, Telefono FROM Clientes WHERE DNI like '%"+dni+"%'");
         ResultSet res = pstm.executeQuery();
         
         while(res.next()){ 
            Relleno[0]= res.getString("DNI");
            Relleno[1] = res.getString("Nombre");
            Relleno[2]= res.getString("Apellidos");
            Relleno[3]= res.getString("Direccion");
            Relleno[4]= res.getString("Telefono");
          
         }           
         res.close();
         }catch(SQLException e){
            System.err.println( e.getMessage() );
        }
        return Relleno; 
    }
}