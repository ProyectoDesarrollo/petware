/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sun.util.calendar.LocalGregorianCalendar.Date;
import vista.Principal;
import vista.clienteFrame;

/**
 *
 * @author Alejandro
 */
public class modelo2 extends Database{
    
    Principal vista;
    clienteFrame vistaCliente = new clienteFrame();
    
    public modelo2() {}
    
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
      String[] columNames = {"ID", "Nombre", "Stock", "Precio" ,"Tipo" ,"Descripcion"}; // Indica el nombre de las columnas de la tabla.
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
        Object[][] data = new String[registros][6];
        try{
          //realizamos la consulta sql y llenamos los datos en la matriz "Object[][] data"
        PreparedStatement pstm = this.getConnection().prepareStatement("SELECT idProducto, Nombre, Stock, Precio , Tipo , Descripcion FROM Productos");
        ResultSet res = pstm.executeQuery();
        int i=0;
        while(res.next()){
                data[i][0] = res.getString("idProducto");
                data[i][1] = res.getString("Nombre");
                data[i][2] = res.getString("Stock");
                data[i][3] = res.getString("Precio");
                data[i][4] = res.getString("Tipo");
                data[i][5] = res.getString("Descripcion");
              
                
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
    
    //------------------------------Metodo Agregar----------------------------------
    public boolean InsertarCliente (String DNI, String Nombre, String Apellidos, String Direccion, int Telefono, int Movil, String Email, String Provincia, String Nacimiento, int CodigoPostal, String Nota) {
            //Consulta para insertar 
        
        String q=" INSERT INTO Cliente ( DNI, Nombre ,Apellidos ,Direccion, Telefono,  Movil, Email, Provincia, Nacimiento, CodigoPostal, Nota )"
                    + "VALUES ( '" + DNI + "','" + Nombre + "', '" + Apellidos + "', '" + Direccion + "','" + Telefono + "','" + Movil + "','" + Email + "','" + Provincia + "','" + Nacimiento + "','" + CodigoPostal + "','" + Nota + "') ";
            //se ejecuta la consulta
        try {
            PreparedStatement pstm = this.getConnection().prepareStatement(q);
            pstm.execute();
            pstm.close();
            return true;
        }catch(SQLException e){
            System.err.println( e.getMessage() );
        }
            return false;      
    }
    
    public boolean InsertarTrabajador (String DNI, String Nombre, String Apellidos, String Direccion, int Telefono, int Movil, String Email, String Provincia, String Nacimiento, int CodigoPostal, Double Salario, String Desde, String Nota) {
            //Consulta para insertar 
        
        String q=" INSERT INTO Trabajadores ( DNI, Nombre, Apellidos, Direccion, Telefono, Movil, Email, Provincia, Nacimiento, CodigoPostal, Salario, Desde, Nota )"
                    + "VALUES ( '" + DNI + "','" + Nombre + "', '" + Apellidos + "', '" + Direccion + "','" + Telefono + "','" + Movil + "','" + Email + "','" + Provincia + "','" + Nacimiento + "','" + CodigoPostal + "','" + Salario + "','" + Desde + "','" + Nota + "') ";
            //se ejecuta la consulta
        try {
            PreparedStatement pstm = this.getConnection().prepareStatement(q);
            pstm.execute();
            pstm.close();
            return true;
        }catch(SQLException e){
            System.err.println( e.getMessage() );
        }
            return false;      
    }
    
    public boolean InsertarProveedor (String Nombre, String Apellidos, String Direccion, int Telefono, int Movil, String Email) {
            //Consulta para insertar 
        
        String q=" INSERT INTO Proveedores ( Nombre ,Apellidos ,Direccion, Telefono,  Movil, Email )"
                    + "VALUES ( '" + Nombre + "', '" + Apellidos + "', '" + Direccion + "','" + Telefono + "','" + Movil + "','" + Email + "') ";
            //se ejecuta la consulta
        try {
            PreparedStatement pstm = this.getConnection().prepareStatement(q);
            pstm.execute();
            pstm.close();
            return true;
        }catch(SQLException e){
            System.err.println( e.getMessage() );
        }
            return false;      
    }
    public boolean InsertarUsuario (String Nombre, String Contraseña, int Tipo) {
            //Consulta para insertar 
        
        String q=" INSERT INTO Usuario ( Nombre , Contrasenia ,Tipo )"
                    + "VALUES ( '" + Nombre + "', '" + Contraseña +  "','" + Tipo + "') ";
            //se ejecuta la consulta
        try {
            PreparedStatement pstm = this.getConnection().prepareStatement(q);
            pstm.execute();
            pstm.close();
            return true;
        }catch(SQLException e){
            System.err.println( e.getMessage() );
        }
            return false;      
    }
    
    public boolean InsertarPacientes (String Especie, String Nombre, String Raza, String Sexo, int Edad, int Peso, int Codigo, String Nacimiento, String Fecha, String Desde, String DNICliente, String Caracter,String Ejercicio, String Alimentacion, String Color, String Piel, String Pelo, String Cabeza, String Cuello, String Oidos, String Labios, String Dientes, String Lengua, String Boca, String Masticadores, String Torax, String AparatoLocomotor, String Conciencia, String AbdomenForma, String  AbdomenPalpacion, String AbdomenProfunda, String AbdomenAuscultacion, String IntestinoPercusion, String IntestinoAuscultacion, String IntestinoOndulacion, String Extremidades, String SistemaNervioso, String Genitales, String Recto, String Ano, String Orina, String Heces, String Enfermedades, String CirugiasPrevias, Boolean Esterilizacion, String Vacunacion, String Desparasitacion, String Leishmaniosis, String Habitat, String Entorno, String Viajes, String Notas) {
            //Consulta para insertar 
        
        String q=" INSERT INTO Pacientes ( Especie, Nombre, Raza, Sexo, Edad, Peso, Codigo, Nacimiento, Fecha, Desde, DNICliente, Caracter,Ejercicio, Alimentacion, Color, Piel, Pelo, Cabeza, Cuello, Oidos, Labios, Dientes, Lengua, Boca, Masticadores, Torax, AparatoLocomotor, Conciencia, AbdomenForma, AbdomenPalpacion, AbdomenProfunda, AbdomenAuscultacion, IntestinoPercusion, IntestinoAuscultacion, IntestinoOndulacion, Extremidades, SistemaNervioso, Genitales, Recto, Ano, Orina, Heces, Notas, Enfermedades, CirugiasPrevias, Esterilizacion, Vacunacion, Desparasitacion, Leishmaniosis, Habitat, Entorno, Viajes, Nota )"
                    + "VALUES ( '" + Especie + "','" + Nombre + "','" + Raza + "','" + Sexo + "','" + Edad + "','" + Peso + "','" + Codigo + "','" + Nacimiento + "','" + Fecha + "','" + Desde + "','" + DNICliente + "','" + Caracter + "','" + Ejercicio + "','" + Alimentacion + "','" + Color + "','" + Piel + "','" + Pelo + "','" + Cabeza + "','" + Cuello + "','" + Oidos + "','" + Labios + "','" + Dientes + "','" + Lengua + "','" + Boca + "','" + Masticadores + "','" + Torax + "','" + AparatoLocomotor + "','" + Conciencia + "','" + AbdomenForma + "','" +AbdomenPalpacion + "','" + AbdomenProfunda + "','" + AbdomenAuscultacion + "','" + IntestinoPercusion + "','" + IntestinoAuscultacion + "','" + IntestinoOndulacion + "','" + Extremidades + "','" + SistemaNervioso + "','" + Genitales + "','" + Ano + "','" + Orina + "','" + Heces + "','" + Enfermedades + "','" + CirugiasPrevias + "','" + Esterilizacion + "','" + Desparasitacion + "','" + Leishmaniosis + "','" + Habitat + "','" + Entorno + "','" + Viajes + "','" + Notas + "') ";
            //se ejecuta la consulta
        try {
            PreparedStatement pstm = this.getConnection().prepareStatement(q);
            pstm.execute();
            pstm.close();
            return true;
        }catch(SQLException e){
            System.err.println( e.getMessage() );
        }
            return false;      
    }
    //----------------------------Metodos Modificar---------------------------------------
    
    public void modificarCliente(String DNI, String Nombre, String Apellidos, String Direccion, int Telefono, int Movil, String Email, String Provincia, String Nacimiento, int CodigoPostal, String Nota) {

        String q = "Update Cliente set Nombre='" + Nombre + "', Apellidos='" + Apellidos + "', Direccion='" + Direccion + "', Telefono='" + Telefono + "', Movil='" + Movil + "', Email='" + Email + "', Provincia='" + Provincia + "',Nacimiento='" + Nacimiento + "',CodigoPostal='" + CodigoPostal + "',Nota='" + Nota + "' where DNI='" + DNI + "';";

        try {

            //Se mete en la base de datos
            PreparedStatement pstm1 = this.getConnection().prepareStatement(q);
            pstm1.execute();
            pstm1.close();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "No se ha podido conectar con la base de datos.");
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "No se ha encontrado la matricula en la base de datos");
        }
    }
    
    public void modificarPaciente(String Especie, String Nombre, String Raza, String Sexo, int Edad, int Peso, int Codigo, String Nacimiento, String Fecha, String Desde, String DNICliente, String Caracter,String Ejercicio, String Alimentacion, String Color, String Piel, String Pelo, String Cabeza, String Cuello, String Oidos, String Labios, String Dientes, String Lengua, String Boca, String Masticadores, String Torax, String AparatoLocomotor, String Conciencia, String AbdomenForma, String  AbdomenPalpacion, String AbdomenProfunda, String AbdomenAuscultacion, String IntestinoPercusion, String IntestinoAuscultacion, String IntestinoOndulacion, String Extremidades, String SistemaNervioso, String Genitales, String Recto, String Ano, String Orina, String Heces, String Enfermedades, String CirugiasPrevias, Boolean Esterilizacion, String Vacunacion, String Desparasitacion, String Leishmaniosis, String Habitat, String Entorno, String Viajes, String Notas) {

        String q = "Update Pacientes set Especie='" + Especie + "', Nombre='" + Nombre + "', Raza='" + Raza + "', Sexo='" + Sexo + "', Edad='" + Edad + "', Peso='" + Peso + "', Codigo='" + Codigo + "',Nacimiento='" + Nacimiento + "',Fecha='" + Fecha + "',Desde='" + Desde + "',DNICliente='" + DNICliente + "',Caracter='" + Caracter + "',Ejercicio='" + Ejercicio + "',Alimentacion='" + Alimentacion + "',Color='" + Color + "',Piel='" + Piel + "',Pelo='" + Pelo + "',Cabeza='" + Cabeza + "',Cuello='" + Cuello + "',Oidos='" + Oidos + "',Labios='" + Labios + "',Dientes='" + Dientes + "',Lengua='" + Lengua + "',Boca='" + Boca + "',Masticadores='" + Masticadores + "',Torax='" + Torax + "',AparatoLocomotor='" + AparatoLocomotor + "',Conciencia='" + Conciencia + "',AbdomenForma='" + AbdomenForma + "',AbdomenPalpacion='" + AbdomenPalpacion + "',AbdomenProfunda='" + AbdomenProfunda + "',IntestinoPercusion='" + IntestinoPercusion + "',IntestinoAuscultacion='" + IntestinoAuscultacion + "',IntestinoOndulacion='" + IntestinoOndulacion + "',Extremidades='" + Extremidades + "',SistemaNervioso='" + SistemaNervioso + "',Genitales='" +Genitales + "',Recto='" + Recto + "',Ano='" + Ano + "',Orina='" + Orina + "',Heces='" + Heces + "',Enfermedades='" + Enfermedades + "',CirugiasPrevias='" + CirugiasPrevias + "',Esterilizacion='" + Esterilizacion + "',Vacunacion='" + Vacunacion + "',Desparasitacion='" + Desparasitacion + "',Leishmaniosis='" + Leishmaniosis + "',Habitat='" + Habitat + "',Entorno='" + Entorno + "',Viajes='" + Viajes + "',Notas='" + Notas + "' where Codigo='" + Codigo + "';";

        try {

            //Se mete en la base de datos
            PreparedStatement pstm1 = this.getConnection().prepareStatement(q);
            pstm1.execute();
            pstm1.close();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "No se ha podido conectar con la base de datos.");
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "No se ha encontrado la matricula en la base de datos");
        }
    }
    
    public void modificarTrabajadores(String DNI, String Nombre, String Apellidos, String Direccion, int Telefono, int Movil, String Email, String Provincia, String Nacimiento, int CodigoPostal, Double Salario, String Desde, String Nota) {

        String q = "Update Trabajadores set Nombre='" + Nombre + "', Apellidos='" + Apellidos + "', Direccion='" + Direccion + "', Telefono='" + Telefono + "', Movil='" + Movil + "', Email='" + Email + "', Provincia='" + Provincia + "',Nacimiento='" + Nacimiento + "',CodigoPostal='" + CodigoPostal + "',Salario='" + Salario + "',Desde='" + Desde + "',Nota='" + Nota + "' where DNI='" + DNI + "';";

        try {

            //Se mete en la base de datos
            PreparedStatement pstm1 = this.getConnection().prepareStatement(q);
            pstm1.execute();
            pstm1.close();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "No se ha podido conectar con la base de datos.");
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "No se ha encontrado la matricula en la base de datos");
        }
    }
    
    public void modificarProveedor(String NIF, String nombre, String apellidos, int telefono, int Movil, String email, int idProductos) {

        String q = "Update Proveedores set Nombre='" + nombre + "', Apellidos='" + apellidos + "', Telefono='" + telefono + "', Movil='" + Movil + "', Email='" + email + "', idProductos='" + idProductos + "' where NIF='" + NIF + "';";

        try {

            //Se mete en la base de datos
            PreparedStatement pstm1 = this.getConnection().prepareStatement(q);
            pstm1.execute();
            pstm1.close();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "No se ha podido conectar con la base de datos.");
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "No se ha encontrado la matricula en la base de datos");
        }
    }
    
    //----------------------------- Metodos Eliminar--------------------------------------
    public boolean EliminarClientes(String dni) {
        boolean res = false;
        //se arma la consulta
        String q = " DELETE FROM Cliente WHERE  DNI='" + dni + "' ";
        //se ejecuta la consulta
        try {
            PreparedStatement pstm = this.getConnection().prepareStatement(q);
            pstm.execute();
            pstm.close();
            res = true;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return res;
    }
    
    public boolean EliminarPacientes(String codigo) {
        boolean res = false;
        //se arma la consulta
        String q = " DELETE FROM Pacientes WHERE  Codigo='" + codigo + "' ";
        //se ejecuta la consulta
        try {
            PreparedStatement pstm = this.getConnection().prepareStatement(q);
            pstm.execute();
            pstm.close();
            res = true;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return res;
    }
    
    public boolean EliminarTrabajador(String dni) {
        boolean res = false;
        //se arma la consulta
        String q = " DELETE FROM Trabajadores WHERE  DNI='" + dni + "' ";
        //se ejecuta la consulta
        try {
            PreparedStatement pstm = this.getConnection().prepareStatement(q);
            pstm.execute();
            pstm.close();
            res = true;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return res;
    }
    
    public boolean EliminarProveedores(String nif) {
        boolean res = false;
        //se arma la consulta
        String q = " DELETE FROM Proveedores WHERE  NIF='" + nif + "' ";
        //se ejecuta la consulta
        try {
            PreparedStatement pstm = this.getConnection().prepareStatement(q);
            pstm.execute();
            pstm.close();
            res = true;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return res;
    }
    
    public boolean EliminarProductos(String idProducto) {
        boolean res = false;
        //se arma la consulta
        String q = " DELETE FROM Productos WHERE  idProducto='" + idProducto + "' ";
        //se ejecuta la consulta
        try {
            PreparedStatement pstm = this.getConnection().prepareStatement(q);
            pstm.execute();
            pstm.close();
            res = true;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return res;
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
    
    public String[] RellenarCliente(String DNI){     
        String[] Relleno= new String[11];
      try{
         
         PreparedStatement pstm = this.getConnection().prepareStatement("SELECT DNI, Nombre, Apellidos, Direccion, Telefono, Movil, Email, Provincia, Nacimiento, CodigoPostal, Nota FROM Cliente WHERE DNI like '%"+DNI+"%'");
         ResultSet res = pstm.executeQuery();
         
         while(res.next()){ 
            Relleno[0]= res.getString("DNI");
            Relleno[1] = res.getString("Nombre");
            Relleno[2]= res.getString("Apellidos");
            Relleno[3]= res.getString("Direccion");
            Relleno[4]= res.getString("Telefono");
            Relleno[5]= res.getString("Movil");
            Relleno[6] = res.getString("Email");
            Relleno[7]= res.getString("Provincia");
            Relleno[8]= res.getString("Nacimiento");
            Relleno[9]= res.getString("CodigoPostal");
            Relleno[10]= res.getString("Nota");
            
          
         }           
         res.close();
         }catch(SQLException e){
            System.err.println( e.getMessage() );
        }
        return Relleno; 
    }
    
    public String[] RellenarProveedor(String nif){     
        String[] Relleno= new String[8];
      try{
         
         PreparedStatement pstm = this.getConnection().prepareStatement("SELECT NIF, Nombre, Apellidos, Direccion, Telefono, Movil, Email, idProductos FROM Proveedores WHERE NIF like '%"+nif+"%'");
         ResultSet res = pstm.executeQuery();
         
         while(res.next()){ 
            Relleno[0]= res.getString("NIF");
            Relleno[1] = res.getString("Nombre");
            Relleno[2]= res.getString("Apellidos");
            Relleno[3]= res.getString("Direccion");
            Relleno[4]= res.getString("Telefono");
            Relleno[5]= res.getString("Movil");
            Relleno[6]= res.getString("Email");
            Relleno[7]= res.getString("idProductos");
          
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
         
         PreparedStatement pstm = this.getConnection().prepareStatement("SELECT Especie, Nombre, Raza, Sexo, Edad, Peso, Codigo, Nacimiento, Fecha, Desde, DNICliente, Caracter,Ejercicio, Alimentacion, Color, Piel, Pelo, Cabeza, Cuello, Oidos, Labios, Dientes, Lengua, Boca, Masticadores, Torax, AparatoLocomotor, Conciencia, AbdomenForma, AbdomenPalpacion, AbdomenProfunda, AbdomenAuscultacion, IntestinoPercusion, IntestinoAuscultacion, IntestinoOndulacion, Extremidades, SistemaNervioso, Genitales, Recto, Ano, Orina, Heces, Notas, Enfermedades, CirugiasPrevias, Esterilizacion, Vacunacion, Desparasitacion, Leishmaniosis, Habitat, Entorno, Viajes, Nota WHERE Codigo like '%"+codigo+"%'");
         ResultSet res = pstm.executeQuery();
         
         while(res.next()){ 
            Relleno[0]= res.getString("DNI");
            Relleno[1] = res.getString("Nombre");
            Relleno[2]= res.getString("Apellidos");
            Relleno[3]= res.getString("Direccion");
            Relleno[4]= res.getString("Telefono");
            Relleno[5]= res.getString("DNI");
            Relleno[6] = res.getString("Nombre");
            Relleno[7]= res.getString("Apellidos");
            Relleno[8]= res.getString("Direccion");
            Relleno[9]= res.getString("Telefono");
            Relleno[10]= res.getString("DNI");
            Relleno[11] = res.getString("Nombre");
            Relleno[12]= res.getString("Apellidos");
            Relleno[13]= res.getString("Direccion");
            Relleno[14]= res.getString("Telefono");
            Relleno[15]= res.getString("DNI");
            Relleno[16] = res.getString("Nombre");
            Relleno[17]= res.getString("Apellidos");
            Relleno[18]= res.getString("Direccion");
            Relleno[19]= res.getString("Telefono");
            Relleno[20]= res.getString("DNI");
            Relleno[21] = res.getString("Nombre");
            Relleno[22]= res.getString("Apellidos");
            Relleno[23]= res.getString("Direccion");
            Relleno[24]= res.getString("Telefono");
            Relleno[25]= res.getString("DNI");
            Relleno[26] = res.getString("Nombre");
            Relleno[27]= res.getString("Apellidos");
            Relleno[28]= res.getString("Direccion");
            Relleno[29]= res.getString("Telefono");
            Relleno[30]= res.getString("DNI");
            Relleno[31] = res.getString("Nombre");
            Relleno[32]= res.getString("Apellidos");
            Relleno[33]= res.getString("Direccion");
            Relleno[34]= res.getString("Telefono");
            Relleno[35]= res.getString("DNI");
            Relleno[36] = res.getString("Nombre");
            Relleno[37]= res.getString("Apellidos");
            Relleno[38]= res.getString("Direccion");
            Relleno[39]= res.getString("Telefono");
            Relleno[40]= res.getString("DNI");
            Relleno[41] = res.getString("Nombre");
            Relleno[42]= res.getString("Apellidos");
            Relleno[43]= res.getString("Direccion");
            Relleno[44]= res.getString("Telefono");
            Relleno[45]= res.getString("DNI");
            Relleno[46] = res.getString("Nombre");
            Relleno[47]= res.getString("Apellidos");
            Relleno[48]= res.getString("Direccion");
            Relleno[49]= res.getString("Telefono");
            Relleno[50]= res.getString("Telefono");
          
         }           
         res.close();
         }catch(SQLException e){
            System.err.println( e.getMessage() );
        }
        return Relleno; 
    }
    
    public String[] RellenarProducto(String idProducto){     
        String[] Relleno= new String[5];
      try{
         
         PreparedStatement pstm = this.getConnection().prepareStatement("SELECT idProducto, Nombre, Stock, Precio, Tipo FROM Productos WHERE idProducto like '%"+idProducto+"%'");
         ResultSet res = pstm.executeQuery();
         
         while(res.next()){ 
            Relleno[0]= res.getString("idProducto");
            Relleno[1]= res.getString("Nombre");
            Relleno[2]= res.getString("Stock");
            Relleno[3]= res.getString("Precio");
            Relleno[4]= res.getString("Tipo");
         }           
         res.close();
         }catch(SQLException e){
            System.err.println( e.getMessage() );
        }
        return Relleno; 
    }
    
    public String[] RellenarTrabajadores(String dni){     
        String[] Relleno= new String[13];
      try{
         
         PreparedStatement pstm = this.getConnection().prepareStatement("SELECT DNI, Nombre, Apellidos, Direccion, Telefono, Movil, Email, Provincia, Nacimiento, CodigoPostal, Salario, Desde, Nota FROM Trabajadores WHERE DNI like '%"+dni+"%'");
         ResultSet res = pstm.executeQuery();
         
         while(res.next()){ 
            Relleno[0]= res.getString("DNI");
            Relleno[1] = res.getString("Nombre");
            Relleno[2]= res.getString("Apellidos");
            Relleno[3]= res.getString("Direccion");
            Relleno[4]= res.getString("Telefono");
            Relleno[5]= res.getString("Movil");
            Relleno[6]= res.getString("Email");
            Relleno[7] = res.getString("Provincia");
            Relleno[8]= res.getString("Nacimiento");
            Relleno[9] = res.getString("CodigoPostal");
            Relleno[10] = res.getString("Salario");
            Relleno[11]= res.getString("Desde");
            Relleno[12]= res.getString("Nota");
            
          
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
         
         PreparedStatement pstm = this.getConnection().prepareStatement("SELECT idVacuna, Nombre, CodigoP, Numero, UltimaV, Fecha WHERE DNI like '%"+dni+"%'");
         ResultSet res = pstm.executeQuery();
         
         while(res.next()){ 
            Relleno[0]= res.getString("idVacuna");
            Relleno[1] = res.getString("Nombre");
            Relleno[2]= res.getString("CodigoP");
            Relleno[3]= res.getString("Numero");
            Relleno[4]= res.getString("UltimaV");
            Relleno[5]= res.getString("Fecha");
          
         }           
         res.close();
         }catch(SQLException e){
            System.err.println( e.getMessage() );
        }
        return Relleno; 
    }
    
    
    //---------------------- OTROS --------------------------------------
    public boolean compararUsuario(String usuario,String contrasenia){
        boolean confir = false;
        String[] Relleno= new String[2];

         try{
         
         PreparedStatement pstm = this.getConnection().prepareStatement("SELECT Nombre , Contrasenia FROM Usuario WHERE Nombre like '%"+usuario+"%'");
         ResultSet res = pstm.executeQuery();
         
         while(res.next()){ 
            Relleno[0]= res.getString("Nombre");
            Relleno[1] = res.getString("Contrasenia");
          
         }           
         res.close();
         if(Relleno[0].equals(usuario) && Relleno[1].equals(contrasenia)){
             confir = true;
         }
         }catch(SQLException e){
            System.err.println( e.getMessage() );
        }
    
       
        return confir;
        
    }
     public boolean compararUsuarioTipo(String usuario){
        boolean confir = false;
        String[] Relleno= new String[1];

         try{
         
         PreparedStatement pstm = this.getConnection().prepareStatement("SELECT Tipo FROM Usuario WHERE Nombre like '%"+usuario+"%'");
         ResultSet res = pstm.executeQuery();
         
         while(res.next()){ 
            Relleno[0]= res.getString("Tipo");
      
         }           
         res.close();
         if(Integer.valueOf(Relleno[0]).equals(0) ){
             confir = true;
         }
         }catch(SQLException e){
            System.err.println( e.getMessage() );
        }
    
       
        return confir;
        
    }
 
}
