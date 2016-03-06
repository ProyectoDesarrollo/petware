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
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sun.util.calendar.LocalGregorianCalendar.Date;
import vista.Principal;
import vista.clienteFrame;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;

/**
 *
 * @author Alejandro
 */
public class modelo extends Database {

    Principal vista;
    clienteFrame vistaCliente = new clienteFrame();

    public modelo() {
    }

    //---------------------------------------Creacion de Tablas-------------------------------------
    public DefaultTableModel getTablaCliente() {

        DefaultTableModel tablemodel = new DefaultTableModel();
        int registros = 0; // Indica la cantidad de filas de la tabla.
        String[] columNames = {"DNI", "Nombre", "Apellidos"}; // Indica el nombre de las columnas de la tabla.
        //obtenemos la cantidad de registros existentes en la tabla y se almacena en la variable "registros"
        //para formar la matriz de datos
        try {
            PreparedStatement pstm = this.getConnection().prepareStatement("SELECT count(*) as Total FROM Cliente");
            ResultSet res = pstm.executeQuery();
            res.next();
            registros = res.getInt("total");
            res.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        //se crea una matriz con tantas filas y columnas que necesite
        Object[][] data = new String[registros][3];
        try {
            //realizamos la consulta sql y llenamos los datos en la matriz "Object[][] data"
            PreparedStatement pstm = this.getConnection().prepareStatement("SELECT DNI, Nombre, Apellidos FROM Cliente");
            ResultSet res = pstm.executeQuery();
            int i = 0;
            while (res.next()) {
                data[i][0] = res.getString("DNI");
                data[i][1] = res.getString("Nombre");
                data[i][2] = res.getString("Apellidos");
                i++;
            }
            res.close();
            //se añade la matriz de datos en el DefaultTableModel
            tablemodel.setDataVector(data, columNames);
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return tablemodel;
    }

    public DefaultTableModel getTablaPacientes() {

        DefaultTableModel tablemodel = new DefaultTableModel();
        int registros = 0; // Indica la cantidad de filas de la tabla.
        String[] columNames = {"Codigo", "Nombre", "Raza"}; // Indica el nombre de las columnas de la tabla.
        //obtenemos la cantidad de registros existentes en la tabla y se almacena en la variable "registros"
        //para formar la matriz de datos
        try {
            PreparedStatement pstm = this.getConnection().prepareStatement("SELECT count(*) as Total FROM Pacientes");
            ResultSet res = pstm.executeQuery();
            res.next();
            registros = res.getInt("total");
            res.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        //se crea una matriz con tantas filas y columnas que necesite
        Object[][] data = new String[registros][3];
        try {
            //realizamos la consulta sql y llenamos los datos en la matriz "Object[][] data"
            PreparedStatement pstm = this.getConnection().prepareStatement("SELECT Codigo, Nombre, Raza FROM Pacientes");
            ResultSet res = pstm.executeQuery();
            int i = 0;
            while (res.next()) {
                data[i][0] = res.getString("Codigo");
                data[i][1] = res.getString("Nombre");
                data[i][2] = res.getString("Raza");
                i++;
            }
            res.close();
            //se añade la matriz de datos en el DefaultTableModel
            tablemodel.setDataVector(data, columNames);
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return tablemodel;
    }

    public DefaultTableModel getTablaProveedores() {

        DefaultTableModel tablemodel = new DefaultTableModel();
        int registros = 0; // Indica la cantidad de filas de la tabla.
        String[] columNames = {"NIF", "Nombre", "Apellidos"}; // Indica el nombre de las columnas de la tabla.
        //obtenemos la cantidad de registros existentes en la tabla y se almacena en la variable "registros"
        //para formar la matriz de datos
        try {
            PreparedStatement pstm = this.getConnection().prepareStatement("SELECT count(*) as Total FROM Proveedores");
            ResultSet res = pstm.executeQuery();
            res.next();
            registros = res.getInt("total");
            res.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        //se crea una matriz con tantas filas y columnas que necesite
        Object[][] data = new String[registros][3];
        try {
            //realizamos la consulta sql y llenamos los datos en la matriz "Object[][] data"
            PreparedStatement pstm = this.getConnection().prepareStatement("SELECT NIF, Nombre, Apellidos FROM Cliente");
            ResultSet res = pstm.executeQuery();
            int i = 0;
            while (res.next()) {
                data[i][0] = res.getString("NIF");
                data[i][1] = res.getString("Nombre");
                data[i][2] = res.getString("Apellidos");
                i++;
            }
            res.close();
            //se añade la matriz de datos en el DefaultTableModel
            tablemodel.setDataVector(data, columNames);
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return tablemodel;
    }

    public DefaultTableModel getTablaProductos() {

        DefaultTableModel tablemodel = new DefaultTableModel();
        int registros = 0; // Indica la cantidad de filas de la tabla.
        String[] columNames = {"ID", "Nombre", "Stock", "Precio", "Tipo", "Descripcion"}; // Indica el nombre de las columnas de la tabla.
        //obtenemos la cantidad de registros existentes en la tabla y se almacena en la variable "registros"
        //para formar la matriz de datos
        try {
            PreparedStatement pstm = this.getConnection().prepareStatement("SELECT count(*) as Total FROM Productos");
            ResultSet res = pstm.executeQuery();
            res.next();
            registros = res.getInt("total");
            res.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        //se crea una matriz con tantas filas y columnas que necesite
        Object[][] data = new String[registros][6];
        try {
            //realizamos la consulta sql y llenamos los datos en la matriz "Object[][] data"
            PreparedStatement pstm = this.getConnection().prepareStatement("SELECT idProducto, Nombre, Stock, Precio , Tipo , Descripcion FROM Productos");
            ResultSet res = pstm.executeQuery();
            int i = 0;
            while (res.next()) {
                data[i][0] = res.getString("idProducto");
                data[i][1] = res.getString("Nombre");
                data[i][2] = res.getString("Stock");
                data[i][3] = res.getString("Precio");
                data[i][4] = res.getString("Tipo");
                data[i][5] = res.getString("Descripcion");

                
            }
            res.close();
            //se añade la matriz de datos en el DefaultTableModel
            tablemodel.setDataVector(data, columNames);
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return tablemodel;
    }

    public DefaultTableModel getTablaTrabajadores() {

        DefaultTableModel tablemodel = new DefaultTableModel();
        int registros = 0; // Indica la cantidad de filas de la tabla.
        String[] columNames = {"DNI", "Nombre", "Apellidos"}; // Indica el nombre de las columnas de la tabla.
        //obtenemos la cantidad de registros existentes en la tabla y se almacena en la variable "registros"
        //para formar la matriz de datos
        try {
            PreparedStatement pstm = this.getConnection().prepareStatement("SELECT count(*) as Total FROM Trabajadores");
            ResultSet res = pstm.executeQuery();
            res.next();
            registros = res.getInt("total");
            res.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        //se crea una matriz con tantas filas y columnas que necesite
        Object[][] data = new String[registros][3];
        try {
            //realizamos la consulta sql y llenamos los datos en la matriz "Object[][] data"
            PreparedStatement pstm = this.getConnection().prepareStatement("SELECT DNI, Nombre, Apellidos FROM Trabajadores");
            ResultSet res = pstm.executeQuery();
            int i = 0;
            while (res.next()) {
                data[i][0] = res.getString("DNI");
                data[i][1] = res.getString("Nombre");
                data[i][2] = res.getString("Apellidos");
                i++;
            }
            res.close();
            //se añade la matriz de datos en el DefaultTableModel
            tablemodel.setDataVector(data, columNames);
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return tablemodel;

    }

    //------------------------------Metodo Agregar----------------------------------
    public boolean InsertarCliente(String DNI, String Nombre, String Apellidos, String Direccion, int Telefono, int Movil, String Email, String Nacimiento, int CodigoPostal, String Provincia, String Fecha) {
        //Consulta para insertar 

        String q = " INSERT INTO Cliente ( DNI, Nombre ,Apellidos ,Direccion, Telefono,  Movil, Email, Provincia, Nacimiento, Tipo, Desde, CodigoPostal )"
                + "VALUES ( '" + DNI + "','" + Nombre + "', '" + Apellidos + "', '" + Direccion + "','" + Telefono + "','" + Movil + "','" + Email + "','" + Provincia + "','" + Nacimiento + "','" + Fecha + "','" + CodigoPostal + "') ";
        //se ejecuta la consulta
        try {
            PreparedStatement pstm = this.getConnection().prepareStatement(q);
            pstm.execute();
            pstm.close();
            return true;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return false;
    }

    public boolean InsertarProveedor(String Nombre, String Apellidos, String Direccion, int Telefono, int Movil, String Email) {
        //Consulta para insertar 

        String q = " INSERT INTO Proveedores ( Nombre ,Apellidos ,Direccion, Telefono,  Movil, Email )"
                + "VALUES ( '" + Nombre + "', '" + Apellidos + "', '" + Direccion + "','" + Telefono + "','" + Movil + "','" + Email + "') ";
        //se ejecuta la consulta
        try {
            PreparedStatement pstm = this.getConnection().prepareStatement(q);
            pstm.execute();
            pstm.close();
            return true;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return false;
    }

    public boolean InsertarUsuario(String Nombre, String Contraseña, int Tipo) {
        //Consulta para insertar 

        String q = " INSERT INTO Usuario ( Nombre , Contrasenia ,Tipo )"
                + "VALUES ( '" + Nombre + "', '" + Contraseña + "','" + Tipo + "') ";
        //se ejecuta la consulta
        try {
            PreparedStatement pstm = this.getConnection().prepareStatement(q);
            pstm.execute();
            pstm.close();
            return true;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return false;
    }

    public boolean InsertarPacientes(String Especie, String Nombre, String Raza, String Sexo, int Edad, int Peso, int Codigo, Date Nacimiento, Date Fecha, Date Hasta, String DNICliente, String Caracter, String Ejercicio, String Alimentacion, String Color, String Piel, String Pelo, String Cabeza, String Cuello, String Oidos, String Labios, String Dientes, String Lengua, String Boca, String Masticadores, String Torax, String AparatoLocomotor, String Conciencia, String AbdomenForma, String AbdomenPalpacion, String AbdomenProfunda, String AbdomenAuscultacion, String IntestinoPercusion, String IntestinoAuscultacion, String IntestinoOndulacion, String Extremidades, String SistemaNervioso, String Genitales, String Recto, String Ano, String Orina, String Heces, String Notas, String Enfermedades, String CirugiasPrevias, Boolean Esterilizacion, String Vacunacion, String Desparasitacion, String Leishmaniosis, String Habitat, String Entorno, String Viajes) {
        //Consulta para insertar 

        String q = " INSERT INTO Proveedores ( Nombre ,Apellidos ,Direccion, Telefono,  Movil, Email )"
                + "VALUES ( '" + Especie + "','" + Nombre + "','" + Raza + "','" + Sexo + "','" + Edad + "','" + Peso + "','" + Codigo + "','" + Nacimiento + "','" + Fecha + "','" + Hasta + "','" + DNICliente + "','" + Caracter + "','" + Ejercicio + "','" + Alimentacion + "','" + Color + "','" + Piel + "','" + Pelo + "','" + Cabeza + "','" + Cuello + "','" + Oidos + "','" + Labios + "','" + Dientes + "','" + Lengua + "','" + Boca + "','" + Masticadores + "','" + Torax + "','" + AparatoLocomotor + "','" + Conciencia + "','" + AbdomenForma + "','" + AbdomenPalpacion + "','" + AbdomenProfunda + "','" + AbdomenAuscultacion + "','" + IntestinoPercusion + "','" + IntestinoAuscultacion + "','" + IntestinoOndulacion + "','" + Extremidades + "','" + SistemaNervioso + "','" + Genitales + "','" + Ano + "','" + Orina + "','" + Heces + "','" + Notas + "','" + Enfermedades + "','" + CirugiasPrevias + "','" + Esterilizacion + "','" + Desparasitacion + "','" + Leishmaniosis + "','" + Habitat + "','" + Entorno + "','" + Viajes + "') ";
        //se ejecuta la consulta
        try {
            PreparedStatement pstm = this.getConnection().prepareStatement(q);
            pstm.execute();
            pstm.close();
            return true;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return false;
    }

    //----------------------------Metodos Modificar---------------------------------------
    public void modificarCliente(String DNI, String nombre, String apellidos, String Direccion, int telefono, int Movil, String email, String provincia, Date Nacimiento, String Tipo, Date Desde, int CodigoPostal) {

        String q = "Update Proveedores set Nombre='" + nombre + "', Apellidos='" + apellidos + "', Direccion='" + Direccion + "', Telefono='" + telefono + "', Movil='" + Movil + "', Email='" + email + "', Provincia='" + provincia + "',Nacimiento='" + Nacimiento + "',Tipo='" + Tipo + "', Desde='" + Desde + "', CodigoPostal='" + CodigoPostal + "' where DNI='" + DNI + "';";

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
    public DefaultTableModel buscarCliente(String buscar) {
        DefaultTableModel tablemodel = new DefaultTableModel();
        int productos = 0;
        String[] columNames = {"DNI", "Nombre", "Apellidos"};

        try {

            PreparedStatement pstm = this.getConnection().prepareStatement("SELECT count(*) as total FROM Cliente where (Nombre like '%" + buscar + "%') || (DNI like '%" + buscar + "%') || (Apellidos like '%" + buscar + "%')");
            ResultSet res = pstm.executeQuery();
            res.next();
            productos = res.getInt("total");
            res.close();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }

        //se crea una matriz con tantas filas y columnas que necesite(de clase object para que no haya problemas)
        Object[][] data = new String[productos][3];

        try {
            //realizamos la consulta sql 
            PreparedStatement pstm = this.getConnection().prepareStatement("SELECT * FROM Cliente where (Nombre like '%" + buscar + "%' ) ||( DNI like '%" + buscar + "%')|| (Apellidos like '%" + buscar + "%')");
            ResultSet res = pstm.executeQuery();
            int i = 0;

            while (res.next()) { //y llenamos los datos en la matriz
                data[i][0] = res.getString("Dni");
                data[i][1] = res.getString("Nombre");
                data[i][2] = res.getString("Apellidos");
                i++;
            }

            res.close();
            //se añade la matriz de datos en el DefaultTableModel
            tablemodel.setDataVector(data, columNames);

        } catch (SQLException e) {

            System.err.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "No se ha podido conectar con la base de datos.");
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Ha ocurrido un error.");
        }
        return tablemodel;
    }

    public DefaultTableModel buscarPacientes(String buscar) {

        DefaultTableModel tablemodel = new DefaultTableModel();
        int registros = 0; // Indica la cantidad de filas de la tabla.
        String[] columNames = {"Codigo", "Nombre", "Raza"}; // Indica el nombre de las columnas de la tabla.
        //obtenemos la cantidad de registros existentes en la tabla y se almacena en la variable "registros"
        //para formar la matriz de datos
        try {
            PreparedStatement pstm = this.getConnection().prepareStatement("SELECT count(*) as Total FROM Pacientes where (Codigo like '%" + buscar + "%' ) ||( Nombre like '%" + buscar + "%')|| (Raza like '%" + buscar + "%')");
            ResultSet res = pstm.executeQuery();
            res.next();
            registros = res.getInt("total");
            res.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        //se crea una matriz con tantas filas y columnas que necesite
        Object[][] data = new String[registros][3];
        try {
            //realizamos la consulta sql y llenamos los datos en la matriz "Object[][] data"
            PreparedStatement pstm = this.getConnection().prepareStatement("SELECT Codigo, Nombre, Raza FROM Pacientes where (Codigo like '%" + buscar + "%' ) ||( Nombre like '%" + buscar + "%')|| (Raza like '%" + buscar + "%')");
            ResultSet res = pstm.executeQuery();
            int i = 0;
            while (res.next()) {
                data[i][0] = res.getString("Codigo");
                data[i][1] = res.getString("Nombre");
                data[i][2] = res.getString("Raza");
                i++;
            }
            res.close();
            //se añade la matriz de datos en el DefaultTableModel
            tablemodel.setDataVector(data, columNames);
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return tablemodel;
    }

    public DefaultTableModel buscarProveedores(String buscar) {

        DefaultTableModel tablemodel = new DefaultTableModel();
        int registros = 0; // Indica la cantidad de filas de la tabla.
        String[] columNames = {"NIF", "Nombre", "Apellidos"}; // Indica el nombre de las columnas de la tabla.
        //obtenemos la cantidad de registros existentes en la tabla y se almacena en la variable "registros"
        //para formar la matriz de datos
        try {
            PreparedStatement pstm = this.getConnection().prepareStatement("SELECT count(*) as Total FROM Proveedores where (Codigo like '%" + buscar + "%' ) ||( Nombre like '%" + buscar + "%')|| (Raza like '%" + buscar + "%')");
            ResultSet res = pstm.executeQuery();
            res.next();
            registros = res.getInt("total");
            res.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        //se crea una matriz con tantas filas y columnas que necesite
        Object[][] data = new String[registros][3];
        try {
            //realizamos la consulta sql y llenamos los datos en la matriz "Object[][] data"
            PreparedStatement pstm = this.getConnection().prepareStatement("SELECT NIF, Nombre, Apellidos FROM Cliente where (Codigo like '%" + buscar + "%' ) ||( Nombre like '%" + buscar + "%')|| (Raza like '%" + buscar + "%')");
            ResultSet res = pstm.executeQuery();
            int i = 0;
            while (res.next()) {
                data[i][0] = res.getString("NIF");
                data[i][1] = res.getString("Nombre");
                data[i][2] = res.getString("Apellidos");
                i++;
            }
            res.close();
            //se añade la matriz de datos en el DefaultTableModel
            tablemodel.setDataVector(data, columNames);
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return tablemodel;
    }

    public DefaultTableModel buscarProductos(String buscar) {

        DefaultTableModel tablemodel = new DefaultTableModel();
        int registros = 0; // Indica la cantidad de filas de la tabla.
        String[] columNames = {"ID", "Nombre", "Stock", "Precio"}; // Indica el nombre de las columnas de la tabla.
        //obtenemos la cantidad de registros existentes en la tabla y se almacena en la variable "registros"
        //para formar la matriz de datos
        try {
            PreparedStatement pstm = this.getConnection().prepareStatement("SELECT count(*) as Total FROM Productos where (Nombre like '%" + buscar + "%' ");
            ResultSet res = pstm.executeQuery();
            res.next();
            registros = res.getInt("total");
            res.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        //se crea una matriz con tantas filas y columnas que necesite
        Object[][] data = new String[registros][4];
        try {
            //realizamos la consulta sql y llenamos los datos en la matriz "Object[][] data"
            PreparedStatement pstm = this.getConnection().prepareStatement("SELECT ID, Nombre, Stock, Precio FROM Cliente where ( Nombre like '%" + buscar + "%')");
            ResultSet res = pstm.executeQuery();
            int i = 0;
            while (res.next()) {
                data[i][0] = res.getString("ID");
                data[i][1] = res.getString("Nombre");
                data[i][2] = res.getString("Stock");
                data[i][3] = res.getString("Precio");

                i++;
            }
            res.close();
            //se añade la matriz de datos en el DefaultTableModel
            tablemodel.setDataVector(data, columNames);
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return tablemodel;
    }

    public DefaultTableModel buscarTrabajadores(String buscar) {

        DefaultTableModel tablemodel = new DefaultTableModel();
        int registros = 0; // Indica la cantidad de filas de la tabla.
        String[] columNames = {"DNI", "Nombre", "Apellidos"}; // Indica el nombre de las columnas de la tabla.
        //obtenemos la cantidad de registros existentes en la tabla y se almacena en la variable "registros"
        //para formar la matriz de datos
        try {
            PreparedStatement pstm = this.getConnection().prepareStatement("SELECT count(*) as Total FROM Trabajadores where (DNI like '%" + buscar + "%' ) ||( Nombre like '%" + buscar + "%')|| (Apellidos like '%" + buscar + "%')");
            ResultSet res = pstm.executeQuery();
            res.next();
            registros = res.getInt("total");
            res.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        //se crea una matriz con tantas filas y columnas que necesite
        Object[][] data = new String[registros][3];
        try {
            //realizamos la consulta sql y llenamos los datos en la matriz "Object[][] data"
            PreparedStatement pstm = this.getConnection().prepareStatement("SELECT DNI, Nombre, Apellidos FROM Trabajadores where (DNI like '%" + buscar + "%' ) ||( Nombre like '%" + buscar + "%')|| (Apellidos like '%" + buscar + "%')");
            ResultSet res = pstm.executeQuery();
            int i = 0;
            while (res.next()) {
                data[i][0] = res.getString("DNI");
                data[i][1] = res.getString("Nombre");
                data[i][2] = res.getString("Apellidos");
                i++;
            }
            res.close();
            //se añade la matriz de datos en el DefaultTableModel
            tablemodel.setDataVector(data, columNames);
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return tablemodel;
    }

    //--------------------------------- Meotdos Rellenar-----------------------------
    public String[] RellenarCliente(String dni) {
        String[] Relleno = new String[12];
        try {

            PreparedStatement pstm = this.getConnection().prepareStatement("SELECT DNI, Nombre, Apellidos, Direccion, Telefono, Movil, Email, Provincia, Nacimiento, CodigoPostal, Nota FROM Cliente WHERE DNI like '%" + dni + "%'");
            ResultSet res = pstm.executeQuery();

            while (res.next()) {
                Relleno[0] = res.getString("DNI");
                Relleno[1] = res.getString("Nombre");
                Relleno[2] = res.getString("Apellidos");
                Relleno[3] = res.getString("Direccion");
                Relleno[4] = res.getString("Telefono");
                Relleno[5] = res.getString("Movil");
                Relleno[6] = res.getString("Email");
                Relleno[7] = res.getString("Provincia");
                Relleno[8] = res.getString("Nacimiento");
                Relleno[9] = res.getString("Nota");
                Relleno[10] = res.getString("CodigoPostal");

            }
            res.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return Relleno;
    }

    public String[] RellenarProveedor(String nif) {
        String[] Relleno = new String[8];
        try {

            PreparedStatement pstm = this.getConnection().prepareStatement("SELECT NIF, Nombre, Apellidos, Direccion, Telefono, Movil, Email, idProductos FROM Proveedores WHERE NIF like '%" + nif + "%'");
            ResultSet res = pstm.executeQuery();

            while (res.next()) {
                Relleno[0] = res.getString("NIF");
                Relleno[1] = res.getString("Nombre");
                Relleno[2] = res.getString("Apellidos");
                Relleno[3] = res.getString("Direccion");
                Relleno[4] = res.getString("Telefono");
                Relleno[5] = res.getString("Movil");
                Relleno[6] = res.getString("Email");
                Relleno[7] = res.getString("idProductos");

            }
            res.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return Relleno;
    }

    public String[] RellenarPaciente(String codigo) {
        String[] Relleno = new String[5];
        try {

            PreparedStatement pstm = this.getConnection().prepareStatement("SELECT DNI, Nombre, Apellidos, Direccion, Telefono FROM Pacientes WHERE Codigo like '%" + codigo + "%'");
            ResultSet res = pstm.executeQuery();

            while (res.next()) {
                Relleno[0] = res.getString("DNI");
                Relleno[1] = res.getString("Nombre");
                Relleno[2] = res.getString("Apellidos");
                Relleno[3] = res.getString("Direccion");
                Relleno[4] = res.getString("Telefono");

            }
            res.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return Relleno;
    }

    public String[] RellenarProducto(String idProducto) {
        String[] Relleno = new String[6];
        try {

            PreparedStatement pstm = this.getConnection().prepareStatement("SELECT idProducto, Nombre, Stock, Precio, Tipo, Descripcion FROM Productos WHERE idProducto like '%" + idProducto + "%'");
            ResultSet res = pstm.executeQuery();

            while (res.next()) {
            
                Relleno[0] = res.getString("idProducto");
                Relleno[1] = res.getString("Nombre");
                Relleno[2] = res.getString("Stock");
                Relleno[3] = res.getString("Precio");
                Relleno[4] = res.getString("Tipo");
                Relleno[5] = res.getString("Descripcion");
            }
            res.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return Relleno;
    }

    public String[] RellenarTrabajadores(String dni) {
        String[] Relleno = new String[5];
        try {

            PreparedStatement pstm = this.getConnection().prepareStatement("SELECT DNI, Nombre, Apellidos, Direccion, Telefono, Movil, Salario, Email, Nacimiento, Desde, Hasta, CodigoPostal FROM Trabajadores WHERE DNI like '%" + dni + "%'");
            ResultSet res = pstm.executeQuery();

            while (res.next()) {
                Relleno[0] = res.getString("DNI");
                Relleno[1] = res.getString("Nombre");
                Relleno[2] = res.getString("Apellidos");
                Relleno[3] = res.getString("Direccion");
                Relleno[4] = res.getString("Telefono");
                Relleno[5] = res.getString("Movil");
                Relleno[6] = res.getString("Salario");
                Relleno[7] = res.getString("Email");
                Relleno[8] = res.getString("Nacimiento");
                Relleno[9] = res.getString("Desde");
                Relleno[10] = res.getString("Hasta");
                Relleno[11] = res.getString("CodigoPostal");

            }
            res.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return Relleno;
    }

    public String[] RellenarVacunas(String dni) {
        String[] Relleno = new String[5];
        try {

            PreparedStatement pstm = this.getConnection().prepareStatement("SELECT idVacuna, Nombre, CodigoP, Numero, UltimaV, Fecha WHERE DNI like '%" + dni + "%'");
            ResultSet res = pstm.executeQuery();

            while (res.next()) {
                Relleno[0] = res.getString("idVacuna");
                Relleno[1] = res.getString("Nombre");
                Relleno[2] = res.getString("CodigoP");
                Relleno[3] = res.getString("Numero");
                Relleno[4] = res.getString("UltimaV");
                Relleno[5] = res.getString("Fecha");

            }
            res.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return Relleno;
    }

    public ArrayList<String> usuarios() {
        ArrayList<String> ls = new ArrayList<String>();
        try {

            PreparedStatement pstm = this.getConnection().prepareStatement("SELECT DNI FROM Cliente");
            ResultSet res = pstm.executeQuery();

            while (res.next()) {
                ls.add(res.getString("DNI"));
            }
            res.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return ls;
    }

    public ArrayList<String> factura(String dni) {
        ArrayList<String> ls = new ArrayList<String>();
        try {

            PreparedStatement pstm = this.getConnection().prepareStatement("SELECT idFactura FROM Facturas where  DNI like '%" + dni + "%'");
            ResultSet res = pstm.executeQuery();

            while (res.next()) {
                ls.add(res.getString("idFactura"));
            }
            res.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return ls;
    }

    //---------------------- OTROS --------------------------------------
    public boolean compararUsuario(String usuario, String contrasenia) {
        boolean confir = false;
        String[] Relleno = new String[2];

        try {

            PreparedStatement pstm = this.getConnection().prepareStatement("SELECT Nombre , Contrasenia FROM Usuario WHERE Nombre like '%" + usuario + "%'");
            ResultSet res = pstm.executeQuery();

            while (res.next()) {
                Relleno[0] = res.getString("Nombre");
                Relleno[1] = res.getString("Contrasenia");

            }
            res.close();
            if (Relleno[0].equals(usuario) && Relleno[1].equals(contrasenia)) {
                confir = true;
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }

        return confir;

    }

    public boolean compararUsuarioTipo(String usuario) {
        boolean confir = false;
        String[] Relleno = new String[1];

        try {

            PreparedStatement pstm = this.getConnection().prepareStatement("SELECT Tipo FROM Usuario WHERE Nombre like '%" + usuario + "%'");
            ResultSet res = pstm.executeQuery();

            while (res.next()) {
                Relleno[0] = res.getString("Tipo");

            }
            res.close();
            if (Integer.valueOf(Relleno[0]).equals(0)) {
                confir = true;
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }

        return confir;

    }

    //Facturas
    public int getStock(int idProducto) {

        int r = 0;
        String q = "SELECT Stock FROM Productos WHERE idProducto = " + idProducto;

        // Se sacara de la base de datos la información correspondiente al articulo indicado.
        try {

            Statement stmt = this.getConnection().createStatement();

            ResultSet res = stmt.executeQuery(q);
            res.next();
            r = res.getInt("Stock");
            res.close();

        } catch (SQLException e) {

            System.err.println(e.getMessage());

        }

        return r;

    }
    public int getStockCarrito(int idFactura,int idProducto) {

        int r = 0;
        String q = "SELECT Cantidad FROM Carrito WHERE idProducto = " + idProducto+" &&  idFactura= "+idFactura+"" ;

        // Se sacara de la base de datos la información correspondiente al articulo indicado.
        try {

            Statement stmt = this.getConnection().createStatement();

            ResultSet res = stmt.executeQuery(q);
            res.next();
            r = res.getInt("Cantidad");
            res.close();

        } catch (SQLException e) {

            System.err.println(e.getMessage());

        }

        return r;

    }

    public boolean InsertarFactura(String dni, String nombre) {
        //Consulta para insertar 

        String q = " INSERT INTO Facturas (  dni, Nombre)"
                + "VALUES ( '" + dni + "','" + nombre + "') ";
        //se ejecuta la consulta
        try {
            PreparedStatement pstm = this.getConnection().prepareStatement(q);
            pstm.execute();
            pstm.close();
            return true;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return false;
    }

    public String[] RellenarFactura(String idFactura) {
        String[] Relleno = new String[3];
        try {

            PreparedStatement pstm = this.getConnection().prepareStatement("SELECT idFactura, DNI, Nombre FROM Facturas WHERE idFactura like '%" + idFactura + "%'");
            ResultSet res = pstm.executeQuery();

            while (res.next()) {
                Relleno[0] = res.getString("idFactura");
                Relleno[1] = res.getString("DNI");
                Relleno[2] = res.getString("Nombre");
            }
            res.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return Relleno;
    }

    public boolean InsertarCarrito(int idFactura, int idProducto, String Nombre, int stock, Double Precio, String tipo, String descripcion) {
        //Consulta para insertar 

        String q = " INSERT INTO Carrito ( idFactura,idProducto, Nombre ,Cantidad,Precio, Tipo,  Descripcion)"
                + "VALUES ( '" + idFactura + "', '" + idProducto + "', '" + Nombre + "','" + stock + "','" + Precio + "','" + tipo + "','" + descripcion + "') ";
        //se ejecuta la consulta
        try {
            PreparedStatement pstm = this.getConnection().prepareStatement(q);
            pstm.execute();
            pstm.close();
            return true;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return false;
    }

    public boolean EliminarCarrito(int idFactura ,int idProducto) {
        boolean res = false;
        //se arma la consulta
        String q = "DELETE FROM Carrito WHERE  idProducto="+idProducto+" && idFactura="+idFactura+"";
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

    public DefaultTableModel getTablaCarrito(int idFactura) {

        DefaultTableModel tablemodel = new DefaultTableModel();
        int registros = 0; // Indica la cantidad de filas de la tabla.
        String[] columNames = {"id Factura", "id Producto", "Nombre", "Cantidad", "Precio", "Tipo", "Descripcion"}; // Indica el nombre de las columnas de la tabla.
        //obtenemos la cantidad de registros existentes en la tabla y se almacena en la variable "registros"
        //para formar la matriz de datos
        try {
            PreparedStatement pstm = this.getConnection().prepareStatement("SELECT count(*) as Total FROM Carrito");
            ResultSet res = pstm.executeQuery();
            res.next();
            registros = res.getInt("total");
            res.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        //se crea una matriz con tantas filas y columnas que necesite
        Object[][] data = new String[registros][7];
        try {
            //realizamos la consulta sql y llenamos los datos en la matriz "Object[][] data"
            PreparedStatement pstm = this.getConnection().prepareStatement("SELECT idFactura, idProducto, Nombre, Cantidad, Precio , Tipo , Descripcion FROM Carrito where  idFactura=" + idFactura + " ");
            ResultSet res = pstm.executeQuery();
            int i = 0;
            while (res.next()) {

                data[i][0] = res.getString("idFactura");
                data[i][1] = res.getString("idProducto");
                data[i][2] = res.getString("Nombre");
                data[i][3] = res.getString("Cantidad");
                data[i][4] = res.getString("Precio");
                data[i][5] = res.getString("Tipo");
                data[i][6] = res.getString("Descripcion");

                i++;
            }
            res.close();
            //se añade la matriz de datos en el DefaultTableModel
            tablemodel.setDataVector(data, columNames);
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return tablemodel;
    }

    public DefaultTableModel getTablaFacturas() {

        DefaultTableModel tablemodel = new DefaultTableModel();
        int registros = 0; // Indica la cantidad de filas de la tabla.
        String[] columNames = {"id Factura", "DNI", "Nombre"}; // Indica el nombre de las columnas de la tabla.
        //obtenemos la cantidad de registros existentes en la tabla y se almacena en la variable "registros"
        //para formar la matriz de datos
        try {
            PreparedStatement pstm = this.getConnection().prepareStatement("SELECT count(*) as Total FROM Facturas");
            ResultSet res = pstm.executeQuery();
            res.next();
            registros = res.getInt("total");
            res.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        //se crea una matriz con tantas filas y columnas que necesite
        Object[][] data = new String[registros][3];
        try {
            //realizamos la consulta sql y llenamos los datos en la matriz "Object[][] data"
            PreparedStatement pstm = this.getConnection().prepareStatement("SELECT idFactura, DNI , Nombre FROM Facturas ");
            ResultSet res = pstm.executeQuery();
            int i = 0;
            while (res.next()) {

                data[i][0] = res.getString("idFactura");
                data[i][1] = res.getString("DNI");
                data[i][2] = res.getString("Nombre");

                i++;
            }
            res.close();
            //se añade la matriz de datos en el DefaultTableModel
            tablemodel.setDataVector(data, columNames);
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return tablemodel;
    }

    public String[] RellenarCarrito(String idProducto) {
        String[] Relleno = new String[6];
        try {

            PreparedStatement pstm = this.getConnection().prepareStatement("SELECT idProducto, Nombre, Cantidad, Precio, Tipo ,Descripcion FROM Carrito WHERE  idProducto like '%" + idProducto + "%'");
            ResultSet res = pstm.executeQuery();

            while (res.next()) {
                Relleno[0] = res.getString("idProducto");
                Relleno[1] = res.getString("Nombre");
                Relleno[2] = res.getString("Cantidad");
                Relleno[3] = res.getString("Precio");
                Relleno[4] = res.getString("Tipo");
                Relleno[5] = res.getString("Descripcion");
               
                
            }
            res.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return Relleno;
    }

    public void modificarProducto(int idProducto, int stock, double precio) {

        String q = "Update Productos set Stock='" + stock +"',Precio='" + precio + "' where idProducto='"+idProducto+"'";

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

    public boolean modificarCarrito(int idFactura, int idProducto, int stock, double precio) {

        
        String q = "Update Carrito set Cantidad='" + stock + "',Precio='" + precio + "' where idProducto='" + idProducto + "' && idFactura='" + idFactura + "'";

        try {

            //Se mete en la base de datos
            PreparedStatement pstm1 = this.getConnection().prepareStatement(q);
            pstm1.execute();
            pstm1.close();
            return true;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "No se ha podido conectar con la base de datos.");
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "No se ha encontrado la matricula en la base de datos");
        }
        return false;
    }

}
