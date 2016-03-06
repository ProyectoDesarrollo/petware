/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.modelo;
import Modelo.modelo2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import vista.Principal;
import vista.clienteFrame;

/**
 *
 * @author Alejandro
 */
public class controladorCliente implements ActionListener, MouseListener {
  

    clienteFrame vistaCliente = new clienteFrame();
    modelo2 modelo = new modelo2();
    int fila=-1;
    
    public enum AccionMVC {
        
        btnAgregarCliente,
        btnEliminarCliente,
        btnGuardarCliente
    }
    
    public controladorCliente(clienteFrame vistaCliente) {
        this.vistaCliente = vistaCliente;

    }
    
    public void iniciar() {

        try {

            this.vistaCliente.jTableCliente.setModel(this.modelo.getTablaCliente());
            

        } catch (Exception e) {
        }
        
        this.vistaCliente.btnAgregarCliente.setActionCommand("btnAgregarCliente");
        this.vistaCliente.btnAgregarCliente.addActionListener(this);

        this.vistaCliente.btnEliminarCliente.setActionCommand("btnEliminarCliente");
        this.vistaCliente.btnEliminarCliente.addActionListener(this);

        this.vistaCliente.btnGuardarCliente.setActionCommand("btnGuardarCliente");
        this.vistaCliente.btnGuardarCliente.addActionListener(this);
        
        //modificacion tabla cliente
        this.vistaCliente.jTableCliente.setShowGrid(false);
        this.vistaCliente.jTableCliente.setOpaque(false);
        
        //--------------------- MouseClick--------------------------
        this.vistaCliente.jTableCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableClientesMouseClicked(evt);
            }
        });
        
        //---------------------- Buscar Cientes------------------
        this.vistaCliente.txtBuscadorCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BuscarClientes(evt);
            }
        });
        this.vistaCliente.txtBuscadorCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vistaCliente.txtBuscadorCliente.setText("");
            }
        });
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
    switch (AccionMVC.valueOf(e.getActionCommand())) {
        
        case btnAgregarCliente:

                try {

                    String DNI = this.vistaCliente.txtDNICliente.getText();
                    String Nombre = this.vistaCliente.txtNombreCliente.getText();
                    String Apellidos = this.vistaCliente.txtApellidosCliente.getText();
                    String Direccion = this.vistaCliente.txtDireccionCliente.getText();
                    int Telefono = Integer.parseInt(this.vistaCliente.txtTelefonoCliente.getText());
                    int Movil = Integer.parseInt(this.vistaCliente.txtMovilCliente.getText());
                    String Email = this.vistaCliente.txtEmailCliente.getText();
                    String Provincia = this.vistaCliente.txtProvinciaCliente.getText();
                    String Nacimiento = this.vistaCliente.txtFechaCliente.getText();
                    int CodigoPostal = Integer.parseInt(this.vistaCliente.txtCodigoPCliente.getText());
                    String Nota = this.vistaCliente.TextAreaCliente.getText();
                    this.modelo.InsertarCliente(DNI, Nombre, Apellidos, Direccion, Telefono, Movil, Email, Provincia, Nacimiento, CodigoPostal, Nota);
                    this.vistaCliente.jTableCliente.setModel(this.modelo.getTablaCliente());
                    this.vistaCliente.txtDNICliente.setText("");
                    this.vistaCliente.txtNombreCliente.setText("");
                    this.vistaCliente.txtApellidosCliente.setText("");
                    this.vistaCliente.txtDireccionCliente.setText("");
                    this.vistaCliente.txtTelefonoCliente.setText("");
                    this.vistaCliente.txtMovilCliente.setText("");
                    this.vistaCliente.txtEmailCliente.setText("");
                    this.vistaCliente.txtProvinciaCliente.setText("");
                    this.vistaCliente.txtFechaCliente.setText("");
                    this.vistaCliente.txtCodigoPCliente.setText("");
                    this.vistaCliente.TextAreaCliente.setText("");

                } catch (Exception ex) {
                    ex.printStackTrace();
                }

                break;
                
        case btnGuardarCliente:

                try {

                    String DNI = this.vistaCliente.txtDNICliente.getText();
                    String Nombre = this.vistaCliente.txtNombreCliente.getText();
                    String Apellidos = this.vistaCliente.txtApellidosCliente.getText();
                    String Direccion = this.vistaCliente.txtDireccionCliente.getText();
                    int Telefono = Integer.parseInt(this.vistaCliente.txtTelefonoCliente.getText());
                    int Movil = Integer.parseInt(this.vistaCliente.txtMovilCliente.getText());
                    String Email = this.vistaCliente.txtEmailCliente.getText();
                    String Provincia = this.vistaCliente.txtProvinciaCliente.getText();
                    String Nacimiento = this.vistaCliente.txtFechaCliente.getText();
                    int CodigoPostal = Integer.parseInt(this.vistaCliente.txtCodigoPCliente.getText());
                    String Nota = this.vistaCliente.TextAreaCliente.getText();
                    this.modelo.modificarCliente(DNI, Nombre, Apellidos, Direccion, Telefono, Movil, Email, Provincia, Nacimiento, CodigoPostal, Nota);
                    this.vistaCliente.jTableCliente.setModel(this.modelo.getTablaCliente());
                    this.vistaCliente.txtDNICliente.setText("");
                    this.vistaCliente.txtNombreCliente.setText("");
                    this.vistaCliente.txtApellidosCliente.setText("");
                    this.vistaCliente.txtDireccionCliente.setText("");
                    this.vistaCliente.txtTelefonoCliente.setText("");
                    this.vistaCliente.txtMovilCliente.setText("");
                    this.vistaCliente.txtEmailCliente.setText("");
                    this.vistaCliente.txtProvinciaCliente.setText("");
                    this.vistaCliente.txtFechaCliente.setText("");
                    this.vistaCliente.txtCodigoPCliente.setText("");
                    this.vistaCliente.TextAreaCliente.setText("");

                } catch (Exception ex) {
                    ex.printStackTrace();
                }

                break;
        
        case btnEliminarCliente://Borra un cliente

                try {

                    this.vistaCliente.jTableCliente.getSelectedRow();
                    if (this.vistaCliente.jTableCliente.getSelectedRow() < 0) {

                        JOptionPane.showMessageDialog(null, "Seleccione una fila");

                    } else {

                        fila = this.vistaCliente.jTableCliente.getSelectedRow();
                        String dni = (String) this.vistaCliente.jTableCliente.getValueAt(fila, 0);
                        this.modelo.EliminarClientes(dni);
                        this.vistaCliente.jTableCliente.setModel(this.modelo.getTablaCliente());

                    }

                } catch (Exception ex) {
                    ex.printStackTrace();
                }

                break;        
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {}

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}
    
    
    //-----------------------------Metodo Buscar-------------------------------

    private void BuscarClientes(java.awt.event.KeyEvent evt) {//Busca Clientes            
        String buscar = this.vistaCliente.txtBuscadorCliente.getText();
        this.vistaCliente.jTableCliente.setModel(this.modelo.buscarCliente(buscar));
    }
    
    //----------------------Permite la selección de elementos dentro de tablas---------------------------
    private void tableClientesMouseClicked(java.awt.event.MouseEvent evt) {

        fila = this.vistaCliente.jTableCliente.getSelectedRow();
        String DNI = (String) this.vistaCliente.jTableCliente.getValueAt(fila, 0);

        String[] Relleno = this.modelo.RellenarCliente(DNI);
        this.vistaCliente.txtDNICliente.setText(DNI);
        this.vistaCliente.txtDNICliente.enable(false);
        this.vistaCliente.txtNombreCliente.setText(Relleno[1]);
        this.vistaCliente.txtApellidosCliente.setText(Relleno[2]);
        this.vistaCliente.txtDireccionCliente.setText(Relleno[3]);
        this.vistaCliente.txtTelefonoCliente.setText(Relleno[4]);
        this.vistaCliente.txtMovilCliente.setText(Relleno[5]);
        this.vistaCliente.txtEmailCliente.setText(Relleno[6]);
        this.vistaCliente.txtProvinciaCliente.setText(Relleno[7]);
        this.vistaCliente.txtFechaCliente.setText(Relleno[8]);
        this.vistaCliente.txtCodigoPCliente.setText(Relleno[9]);
        this.vistaCliente.TextAreaCliente.setText(Relleno[10]);
    }
    
}
