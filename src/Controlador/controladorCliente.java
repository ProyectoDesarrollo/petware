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
import vista.Principal;
import vista.clienteFrame;

/**
 *
 * @author Alejandro
 */
public class controladorCliente implements ActionListener, MouseListener {
  

    clienteFrame vistaCliente = new clienteFrame();
    modelo2 modelo = new modelo2();
    
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
                    String Nacimiento = this.vistaCliente.txtFechaCliente.getText();
                    int CodigoPostal = Integer.parseInt(this.vistaCliente.txtCodigoPCliente.getText());
                    String Provincia = this.vistaCliente.txtProvinciaCliente.getText();
                    String Fecha = this.vistaCliente.txtFechaICliente.getText();
                    this.modelo.InsertarCliente(DNI, Nombre, Apellidos, Direccion, Telefono, Movil, Email, Nacimiento, CodigoPostal, Provincia, Fecha);
                    this.vistaCliente.jTableCliente.setModel(this.modelo.getTablaCliente());
                    this.vistaCliente.txtDNICliente.setText("");
                    this.vistaCliente.txtNombreCliente.setText("");
                    this.vistaCliente.txtApellidosCliente.setText("");
                    this.vistaCliente.txtDireccionCliente.setText("");
                    this.vistaCliente.txtTelefonoCliente.setText("");
                    this.vistaCliente.txtMovilCliente.setText("");
                    this.vistaCliente.txtEmailCliente.setText("");
                    this.vistaCliente.txtCodigoPCliente.setText("");
                    this.vistaCliente.txtProvinciaCliente.setText("");
                    this.vistaCliente.txtProvinciaCliente.setText("");

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
    
}
