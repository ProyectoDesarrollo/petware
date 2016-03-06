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
        // this.frame.txtPrecioProductoFactura.setEnabled(false);
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

//        this.frame.txtUsuarioFactura.addActionListener(new java.awt.event.ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent ae) {  
//                if(!frame.txtFacturaFactura.getText().equals("")){
//                    
//                }
//            
//            }
//        });
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
                frame.btnModificarProductoF.setEnabled(true);

            }
        });
        this.frame.tableCarrito.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableCarritoMouseClicked(evt);
                frame.btnAñadirCarrito.setEnabled(false);
                frame.btnEleminarProductof.setEnabled(true);
                frame.txtPrecioProductoFactura.setEnabled(false);
                frame.btnModificarProductoF.setEnabled(true);

            }
        });
        this.tablaFactura.tablaFacturas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableFacturasMouseClicked(evt);
                tablaFactura.setVisible(false);

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
            String idProducto = this.frame.txtIDProductoFactura.getText().toString();
            String nombre = this.frame.txtNombreProductoFactura.getText().toString();
            String stock = String.valueOf(this.frame.stock.getValue());
            String precio = this.frame.txtPrecioProductoFactura.getText();
            String tipo = this.frame.txtTipoProductoFactura.getText();
            String descripcion = this.frame.TextAreaFactura.getText().toString();
            int stockTotal = this.modelo.getStock(Integer.valueOf(idProducto));

            if (!dni.equals("") && !idFactura.equals("") && !idProducto.equals("") && !nombre.equals(e)
                    && !stock.equals("") && !precio.equals("") && stockTotal >= Integer.valueOf(stock) && Integer.valueOf(stock) > 0) {
                this.frame.tableCarrito.setModel(this.modelo.getTablaCarrito(Integer.valueOf(idFactura)));
                boolean conf = this.modelo.InsertarCarrito(Integer.valueOf(idFactura), Integer.valueOf(idProducto), nombre, Integer.valueOf(stock), Double.valueOf(precio), tipo, descripcion);
                if (conf) {
                    stockTotal = stockTotal - Integer.valueOf(stock);
                    this.modelo.modificarProducto(Integer.valueOf(idProducto), stockTotal, Double.valueOf(precio));

                    this.frame.tableFactura.setModel(this.modelo.getTablaProductos());
                    this.frame.tableCarrito.setModel(this.modelo.getTablaCarrito(Integer.valueOf(idFactura)));

                    this.frame.txtFacturaClientes.setText(" ");
                    this.frame.txtUsuarioFactura.setText(" ");
                    this.frame.txtFacturaFactura.setText(" ");
                    this.frame.txtIDProductoFactura.setText(" ");
                    this.frame.txtNombreProductoFactura.setText(" ");
                    this.frame.txtPrecioProductoFactura.setText(" ");
                    this.frame.txtTipoProductoFactura.setText(" ");
                    this.frame.TextAreaFactura.setText(" ");
                    this.frame.stock.setValue(0);
                    this.frame.btnAñadirCarrito.setEnabled(false);
                    this.frame.btnEleminarProductof.setEnabled(false);
                    this.frame.btnModificarProductoF.setEnabled(false);

                } else {
                    JOptionPane.showMessageDialog(crear, "Fallo al insertar");
                }
            } else {
                JOptionPane.showMessageDialog(crear, "Datos incorrectos");
            }

        } else if (comand.equals("Eliminar")) {

            idFactura = this.frame.txtFacturaFactura.getText();
            String idProducto = this.frame.txtIDProductoFactura.getText();
            int stockTotal = this.modelo.getStock(Integer.valueOf(idProducto));
            String stock = String.valueOf(this.frame.stock.getValue());
            String precio = this.frame.txtPrecioProductoFactura.getText();


            boolean conf = this.modelo.EliminarCarrito(Integer.valueOf(idFactura),Integer.valueOf(idProducto));
            if (conf) {
                stockTotal = stockTotal + Integer.valueOf(stock);
                this.modelo.modificarProducto(Integer.valueOf(idProducto), stockTotal, Double.valueOf(precio));
                this.frame.tableFactura.setModel(this.modelo.getTablaProductos());
                this.frame.tableCarrito.setModel(this.modelo.getTablaCarrito(Integer.valueOf(idFactura)));

                this.frame.txtFacturaClientes.setText(" ");
                this.frame.txtUsuarioFactura.setText(" ");
                this.frame.txtFacturaFactura.setText(" ");
                this.frame.txtIDProductoFactura.setText(" ");
                this.frame.txtNombreProductoFactura.setText(" ");
                this.frame.txtPrecioProductoFactura.setText(" ");
                this.frame.txtTipoProductoFactura.setText(" ");
                this.frame.TextAreaFactura.setText(" ");
                this.frame.stock.setValue(0);
                this.frame.btnAñadirCarrito.setEnabled(false);
                this.frame.btnEleminarProductof.setEnabled(false);
                this.frame.btnModificarProductoF.setEnabled(false);
            } else {
                JOptionPane.showMessageDialog(crear, "Fallo al eliminar");
            }

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

        } else if (comand.equals("Añadir C")) {//crearFacturas
            dni = this.crear.txtDNICrearF.getText().toString();
            usuario = this.crear.txtusuarioCreaF.getText().toString();
            boolean confi = this.modelo.InsertarFactura(dni, usuario);
            if (confi) {
                JOptionPane.showMessageDialog(crear, "Factura creada con exito");
            } else {
                JOptionPane.showMessageDialog(crear, "Fallo en la crearcion de factura");
            }
        } else if (comand.equals("Cancelar C")) {
            this.crear.setVisible(false);
        } else if (comand.equals("Agregar")) {
            this.tablaFactura.setVisible(true);

        } else if (comand.equals("Limpiar")) {
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
        this.frame.txtTipoProductoFactura.setText(Relleno[4]);
        this.frame.TextAreaFactura.setText(String.valueOf(Relleno[5]));

    }

    private void tableCarritoMouseClicked(java.awt.event.MouseEvent evt) {

        fila = this.frame.tableCarrito.getSelectedRow();
        String id = (String) this.frame.tableCarrito.getValueAt(fila, 1);

        String[] Relleno = this.modelo.RellenarCarrito(id);
        this.frame.txtIDProductoFactura.setText(id);
        this.frame.txtIDProductoFactura.enable(false);
        this.frame.txtNombreProductoFactura.setText(Relleno[1]);
        this.frame.stock.setValue(Integer.valueOf(Relleno[2]));
        this.frame.txtPrecioProductoFactura.setText(Relleno[3]);
        this.frame.txtPrecioProductoFactura.enable(false);
        this.frame.txtTipoProductoFactura.setText(Relleno[4]);
        this.frame.TextAreaFactura.setText(String.valueOf(Relleno[5]));
//        

    }

    private void tableFacturasMouseClicked(java.awt.event.MouseEvent evt) {

        fila = this.tablaFactura.tablaFacturas.getSelectedRow();
        idFactura = (String) this.tablaFactura.tablaFacturas.getValueAt(fila, 0);

        String[] Relleno = this.modelo.RellenarFactura(idFactura);
        this.frame.txtFacturaFactura.setText(idFactura);
        this.frame.txtUsuarioFactura.setText(Relleno[1]);
        this.frame.tableCarrito.setModel(modelo.getTablaCarrito(Integer.valueOf(idFactura)));

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
