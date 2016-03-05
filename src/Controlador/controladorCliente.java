/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.modelo;
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
    modelo modelo = new modelo();
    
    public enum AccionMVC {
        
        btnAñadirCliente,
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
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {}

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
