/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.modelo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import vista.Principal;
import vista.crearFactura;
import vista.facturasFrame;
import vista.tablaFactura;

/**
 *
 * @author Roberto
 */
public class controladorFactura implements ActionListener, ItemListener {

    facturasFrame frame;
    modelo modelo = new modelo();
    crearFactura crear = new crearFactura();
    tablaFactura tablaFactura = new tablaFactura();
    int fila = 0;
    DefaultTableModel model;
    ArrayList<Object> listaCarrito;

    String dni;
    String usuario;
    String idFactura;

    public controladorFactura(facturasFrame frame) {

        this.frame = frame;

    }

    public void iniciar() {
        try {

            this.frame.tableFactura.setModel(this.modelo.getTablaProductos());
            this.tablaFactura.tablaFacturas.setModel(this.modelo.getTablaFacturas());
            this.crear.tableClienteF.setModel(this.modelo.getTablaCliente());

        } catch (Exception e) {
        }

        this.frame.setVisible(true);
        this.crear.setVisible(false);
        this.tablaFactura.setVisible(false);
        
        this.frame.btnAñadirCarrito.setEnabled(false);
        this.frame.btnEleminarProductof.setEnabled(false);
        this.frame.btnModificarProductoF.setEnabled(false);
        this.frame.txtIDProductoFactura.setEnabled(false);
        this.frame.txtUsuarioFactura.setEnabled(false);
        this.frame.txtFacturaFactura.setEnabled(false);
        this.frame.txtPrecioProductoFactura.setEnabled(false);
        this.frame.txtNombreProductoFactura.setEnabled(false);
        this.frame.txtTipoProductoFactura.setEnabled(false);
        this.frame.TextAreaFactura.setEnabled(false);
        this.frame.TextAreaFactura.setLineWrap(true);
        
        this.frame.txtFacturaFactura.setText("");
        this.frame.txtUsuarioFactura.setText("");

        //Bottones
            
        this.frame.btnAgregarUsuarioF.setActionCommand("Agregar");
        this.frame.btnAgregarUsuarioF.addActionListener(this);
        
        this.frame.btnLimpiarFactura.setActionCommand("Limpiar");
        this.frame.btnLimpiarFactura.addActionListener(this);

        this.frame.btnAñadirCarrito.setActionCommand("Añadir");
        this.frame.btnAñadirCarrito.addActionListener(this);
    
        this.frame.btnAñadirCarrito.setEnabled(false);
        this.frame.txtIDProductoFactura.setEnabled(false);

        //botones facturaFrame
        this.frame.btnEleminarProductof.setActionCommand("Eliminar");
        this.frame.btnEleminarProductof.addActionListener(this);

        this.frame.btnEleminarProductof.setActionCommand("Modificar");
        this.frame.btnEleminarProductof.addActionListener(this);

        this.frame.btnCrearFactura.setActionCommand("Crear");
        this.frame.btnCrearFactura.addActionListener(this);
        //Botones CrearFactura
        this.crear.btnAñadirFactura.setActionCommand("Añadir C");
        this.crear.btnAñadirFactura.addActionListener(this);
        this.crear.btnCancelarAñadirFactura.setActionCommand("Cancelar C");
        this.crear.btnCancelarAñadirFactura.addActionListener(this);

//        this.frame.comboUsuarioF.addItemListener(new java.awt.event.ItemListener() {
//               @Override
//               public void itemStateChanged(ItemEvent ie) { 
//                   if(ie.getStateChange() == ItemEvent.SELECTED){
//                         dni =String.valueOf( ie.getItemSelectable());
//                         llenarFactura(dni);
//                   }else{
//                         dni =String.valueOf( ie.getItemSelectable());
//                         llenarFactura(dni);
//                   }
////              (String) frame.comboUsuarioF.getSelectedItem();
////               llenarFactura(dni);
//               }
//           });
        this.frame.tableFactura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableProductosMouseClicked(evt);
                frame.btnAñadirCarrito.setEnabled(true);
                frame.btnEleminarProductof.setEnabled(true);
                frame.btnModificarProductoF.setEnabled(true);

            }
        });
        this.frame.tableCarrito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableCarritoMouseClicked(evt);
                frame.btnAñadirCarrito.setEnabled(true);
                frame.btnEleminarProductof.setEnabled(true);
                frame.btnModificarProductoF.setEnabled(true);

            }
        });
        this.tablaFactura.tablaFacturas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableFacturasMouseClicked(evt);

            }
        });
         this.crear.tableClienteF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableClienteMouseClicked(evt);

            }
        });


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String comand = e.getActionCommand();

        if (comand.equals("Añadir")) {
            dni = this.frame.txtUsuarioFactura.getText().toString();
            idFactura = this.frame.txtFacturaFactura.getText().toString();
            String idProduc = this.frame.txtIDProductoFactura.getText().toString();
            String nombre = this.frame.txtNombreProductoFactura.getText().toString();
            int stock  = Integer.valueOf(String.valueOf(this.frame.stock.getValue()));
            double precio = Double.valueOf(this.frame.txtPrecioProductoFactura.getText());
            
            
            if(!dni.equals("") && !idFactura.equals("")){
                
            }else{
                JOptionPane.showMessageDialog(crear, "Debe rellenar todos los campos");
            }
          
        } else if (comand.equals("Eliminar")) {
//            
//            fila = this.frame.tableCarrito.getSelectedRow();
//            this.frame.tableCarrito.remove(fila);
// 
//            this.frame.btnAñadirCarrito.setEnabled(false);

        } else if (comand.equals("Modificar")) {
//          
//            Object [] productoA = new String[6];
//            productoA[0] = this.frame.txtIDProductoFactura.getText().toString();
//            productoA[1] = this.frame.txtNombreProductoFactura.getText().toString();
//            productoA[2] = String.valueOf(this.frame.stock.getValue());
//            productoA[3] = this.frame.txtPrecioProductoFactura.getText().toString();
//            productoA[4] = this.frame.txtTipoProductoFactura.getText().toString();
//            productoA[5] = this.frame.TextAreaFactura.getText().toString();
//            
//            model.addRow(productoA);
//            
//            this.frame.tableCarrito.setModel(model);
//            this.frame.btnAñadirCarrito.setEnabled(false);
        } else if (comand.equals("Crear")) {
            this.crear.setVisible(true);
            
            
        }else if(comand.equals("Añadir C")){//crearFacturas
            dni = this.crear.txtDNICrearF.getText().toString();
            usuario  = this.crear.txtusuarioCreaF.getText().toString();
            boolean confi =  this.modelo.InsertarFactura( dni, usuario);
            if(confi){
                JOptionPane.showMessageDialog(crear, "Factura creada con exito");
            }else{
                 JOptionPane.showMessageDialog(crear, "Fallo en la crearcion de factura");
            }
        }else if(comand.equals("Cancelar C")){
            this.crear.setVisible(false);
        }else if (comand.equals("Agregar")){
            this.tablaFactura.setVisible(true);
            
        }else if(comand.equals("Limpiar")){
            this.frame.txtFacturaClientes.setText(" ");
            this.frame.txtUsuarioFactura.setText(" ");
            this.frame.txtFacturaFactura.setText(" ");
            this.frame.txtIDProductoFactura.setText(" ");
            this.frame.txtNombreProductoFactura.setText(" ");
            this.frame.txtPrecioProductoFactura.setText(" ");
            this.frame.txtTipoProductoFactura.setText(" ");
            this.frame.TextAreaFactura.setText(" ");
            this.frame.stock.setValue(0);
        }
    }

    private void tableProductosMouseClicked(java.awt.event.MouseEvent evt) {

        fila = this.frame.tableFactura.getSelectedRow();
        String id = (String) this.frame.tableFactura.getValueAt(fila, 0);

        String[] Relleno = this.modelo.RellenarProducto(id);
        this.frame.txtIDProductoFactura.setText(id);
        this.frame.txtIDProductoFactura.enable(false);
        this.frame.txtNombreProductoFactura.setText(Relleno[1]);
        this.frame.stock.setValue(Integer.parseInt(Relleno[2]));
        this.frame.txtPrecioProductoFactura.setText(Relleno[3]);
        this.frame.txtPrecioProductoFactura.setText(Relleno[3]);
        this.frame.txtTipoProductoFactura.setText(Relleno[4]);
        this.frame.TextAreaFactura.append(String.valueOf(Relleno[5]));

    }
    private void tableCarritoMouseClicked(java.awt.event.MouseEvent evt) {

        fila = this.frame.tableCarrito.getSelectedRow();
        String id = (String) this.frame.tableCarrito.getValueAt(fila, 0);

        String[] Relleno = this.modelo.RellenarProducto(id);
        this.frame.txtIDProductoFactura.setText(id);
        this.frame.txtIDProductoFactura.enable(false);
        this.frame.txtNombreProductoFactura.setText(Relleno[1]);
        this.frame.stock.setValue(Integer.parseInt(Relleno[2]));
        this.frame.txtPrecioProductoFactura.setText(Relleno[3]);
        this.frame.txtPrecioProductoFactura.setText(Relleno[3]);
        this.frame.txtTipoProductoFactura.setText(Relleno[4]);
//        this.frame.TextAreaFactura.setText(Relleno[5]);

    }
    private void tableFacturasMouseClicked(java.awt.event.MouseEvent evt) {

        fila = this.tablaFactura.tablaFacturas.getSelectedRow();
        String idFactura = (String) this.tablaFactura.tablaFacturas.getValueAt(fila, 0);

        String[] Relleno = this.modelo.RellenarFactura(idFactura);
        this.frame.txtFacturaFactura.setText(idFactura);
        this.frame.txtUsuarioFactura.setText(Relleno[1]);

        this.frame.tableCarrito.setModel(this.modelo.getTablaCarrito(Integer.valueOf(idFactura)));
        this.tablaFactura.setVisible(false);

    }
    private void tableClienteMouseClicked(java.awt.event.MouseEvent evt) {

        fila = this.crear.tableClienteF.getSelectedRow();
        String id = (String) this.crear.tableClienteF.getValueAt(fila, 0);

        String[] Relleno = this.modelo.RellenarCliente(id);
        this.crear.txtDNICrearF.setText(id);
        this.crear.txtusuarioCreaF.setText(Relleno[1]);


    }

    @Override
    public void itemStateChanged(ItemEvent ie) {

    }
}
