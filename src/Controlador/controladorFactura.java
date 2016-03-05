/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.modelo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import vista.Principal;
import vista.facturasFrame;

/**
 *
 * @author Roberto
 */
public class controladorFactura implements ActionListener {

  
    facturasFrame frame = new facturasFrame();
    modelo modelo;
    public controladorFactura( ) {
        modelo = new modelo();
       
       
    }
    
    public void iniciar(){
        
        this.frame.setVisible(true);
        this.frame.btnAñadirCarrito.setActionCommand("Añadir");
        this.frame.btnAñadirCarrito.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String comand = ae.getActionCommand();
        
        if(comand.equals("Añadir")){
            JOptionPane.showMessageDialog(frame, "Hola");
        }
    }
}
