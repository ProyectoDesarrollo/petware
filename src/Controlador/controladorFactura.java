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

  
    facturasFrame frame ;
    modelo modelo;
    int fila = 0;
    
    public controladorFactura(facturasFrame frame) {
        modelo = new modelo();
        this.frame =frame;
       
    }
    
    public void iniciar(){
           try {

            this.frame.tableFactura.setModel(this.modelo.getTablaProductos());

        } catch (Exception e) {
        }
        this.frame.setVisible(true);
        
        this.frame.btnAñadirCarrito.setActionCommand("Añadir");
        this.frame.btnAñadirCarrito.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String comand = e.getActionCommand();
        
        if(comand.equals("Añadir")){
            
        }
    }
    
    
    
    private void tableProductosMouseClicked(java.awt.event.MouseEvent evt) {

        fila = this.frame.tableFactura.getSelectedRow();
        String id = (String) this.frame.tableFactura.getValueAt(fila, 0);

        String[] Relleno = this.modelo.RellenarProducto(id);
        this.frame.txtIDProductoFacctura.setText(id);
        this.frame.txtIDProductoFacctura.enable(false);
        this.frame.txtNombreProductoFactura.setText(Relleno[1]);
        this.frame.stock.setValue(Integer.parseInt(Relleno[2]));
        this.frame.txtPrecioProductoFactura.setText(Relleno[3]);
        this.frame.txtPrecioProductoFactura.setText(Relleno[3]);
        this.frame.txtTipoProductoFactura.setText(Relleno[4]);
        this.frame.txtTipoProductoFactura.setText(Relleno[5]);

    }
}
