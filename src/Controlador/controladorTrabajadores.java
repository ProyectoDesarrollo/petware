/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.modelo2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import vista.clienteFrame;
import vista.trabajadoresFrame;

/**
 *
 * @author Alejandro
 */
public class controladorTrabajadores implements ActionListener, MouseListener {
  

    trabajadoresFrame vistaTrabajador = new trabajadoresFrame();
    modelo2 modelo = new modelo2();
    int fila=-1;
    
    public enum AccionMVC {
        
        btnAgregarTrabajadores,
        btnEliminarTrabajador,
        btnGuardarTrabajador
    }
    
    public controladorTrabajadores(trabajadoresFrame vistaTrabajador) {
        this.vistaTrabajador = vistaTrabajador;

    }
    
    public void iniciar() {

        try {

            this.vistaTrabajador.jTableTrabajadores.setModel(this.modelo.getTablaTrabajadores());
            

        } catch (Exception e) {
        }
        
        this.vistaTrabajador.btnAgregarTrabajadores.setActionCommand("btnAgregarCliente");
        this.vistaTrabajador.btnAgregarTrabajadores.addActionListener(this);

        this.vistaTrabajador.btnEliminarTrabajadores.setActionCommand("btnEliminarCliente");
        this.vistaTrabajador.btnEliminarTrabajadores.addActionListener(this);

        this.vistaTrabajador.btnGuardarTrabajadores.setActionCommand("btnGuardarCliente");
        this.vistaTrabajador.btnGuardarTrabajadores.addActionListener(this);
        
        //modificacion tabla cliente
        this.vistaTrabajador.jTableTrabajadores.setShowGrid(false);
        this.vistaTrabajador.jTableTrabajadores.setOpaque(false);
        
        //--------------------- MouseClick--------------------------
        this.vistaTrabajador.jTableTrabajadores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableTrabajadoresMouseClicked(evt);
            }
        });
        
        //---------------------- Buscar Cientes------------------
        this.vistaTrabajador.txtBuscadorTrabajadores.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BuscarClientes(evt);
            }
        });
        this.vistaTrabajador.txtBuscadorTrabajadores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vistaTrabajador.txtBuscadorTrabajadores.setText("");
            }
        });
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
    switch (AccionMVC.valueOf(e.getActionCommand())) {
        
        case btnAgregarTrabajadores:

                try {

                    String DNI = this.vistaTrabajador.txtDNITrabajadores.getText();
                    String Nombre = this.vistaTrabajador.txtNombreTrabajadores.getText();
                    String Apellidos = this.vistaTrabajador.txtApellidosTrabajadores.getText();
                    String Direccion = this.vistaTrabajador.txtDireccionTrabajadores.getText();
                    int Telefono = Integer.parseInt(this.vistaTrabajador.txtTelefonoTrabajadores.getText());
                    int Movil = Integer.parseInt(this.vistaTrabajador.txtMovilTrabajadores.getText());
                    String Email = this.vistaTrabajador.txtEmailTrabajadores.getText();
                    String Provincia = this.vistaTrabajador.txtProvinciaTrabajadores.getText();
                    String Nacimiento = this.vistaTrabajador.txtFechaTrabajadores.getText();
                    int CodigoPostal = Integer.parseInt(this.vistaTrabajador.txtCodigoPTrabajadores.getText());
                    Double Salario = Double.parseDouble(this.vistaTrabajador.txtMovilTrabajadores.getText());
                    String Desde = this.vistaTrabajador.txtFechaITrabajadores.getText();
                    String Nota = this.vistaTrabajador.TextAreaTrabajadores.getText();
                    this.modelo.InsertarTrabajador(DNI, Nombre, Apellidos, Direccion, Telefono, Movil, Email, Provincia, Nacimiento, CodigoPostal, Salario, Desde, Nota);
                    this.vistaTrabajador.jTableTrabajadores.setModel(this.modelo.getTablaTrabajadores());
                    this.vistaTrabajador.txtDNITrabajadores.setText("");
                    this.vistaTrabajador.txtNombreTrabajadores.setText("");
                    this.vistaTrabajador.txtApellidosTrabajadores.setText("");
                    this.vistaTrabajador.txtDireccionTrabajadores.setText("");
                    this.vistaTrabajador.txtTelefonoTrabajadores.setText("");
                    this.vistaTrabajador.txtMovilTrabajadores.setText("");
                    this.vistaTrabajador.txtEmailTrabajadores.setText("");
                    this.vistaTrabajador.txtProvinciaTrabajadores.setText("");
                    this.vistaTrabajador.txtCodigoPTrabajadores.setText("");
                    this.vistaTrabajador.TextAreaTrabajadores.setText("");

                } catch (Exception ex) {
                    ex.printStackTrace();
                }

                break;
                
        case btnGuardarTrabajador:

                try {

                    String DNI = this.vistaTrabajador.txtDNITrabajadores.getText();
                    String Nombre = this.vistaTrabajador.txtNombreTrabajadores.getText();
                    String Apellidos = this.vistaTrabajador.txtApellidosTrabajadores.getText();
                    String Direccion = this.vistaTrabajador.txtDireccionTrabajadores.getText();
                    int Telefono = Integer.parseInt(this.vistaTrabajador.txtTelefonoTrabajadores.getText());
                    int Movil = Integer.parseInt(this.vistaTrabajador.txtMovilTrabajadores.getText());
                    String Email = this.vistaTrabajador.txtEmailTrabajadores.getText();
                    String Provincia = this.vistaTrabajador.txtProvinciaTrabajadores.getText();
                    String Nacimiento = this.vistaTrabajador.txtFechaTrabajadores.getText();
                    int CodigoPostal = Integer.parseInt(this.vistaTrabajador.txtCodigoPTrabajadores.getText());
                    String Nota = this.vistaTrabajador.TextAreaTrabajadores.getText();
                    this.modelo.modificarCliente(DNI, Nombre, Apellidos, Direccion, Telefono, Movil, Email, Provincia, Nacimiento, CodigoPostal, Nota);
                    this.vistaTrabajador.jTableTrabajadores.setModel(this.modelo.getTablaCliente());
                    this.vistaTrabajador.txtDNITrabajadores.setText("");
                    this.vistaTrabajador.txtNombreTrabajadores.setText("");
                    this.vistaTrabajador.txtApellidosTrabajadores.setText("");
                    this.vistaTrabajador.txtDireccionTrabajadores.setText("");
                    this.vistaTrabajador.txtTelefonoTrabajadores.setText("");
                    this.vistaTrabajador.txtMovilTrabajadores.setText("");
                    this.vistaTrabajador.txtEmailTrabajadores.setText("");
                    this.vistaTrabajador.txtProvinciaTrabajadores.setText("");
                    this.vistaTrabajador.txtFechaTrabajadores.setText("");
                    this.vistaTrabajador.txtCodigoPTrabajadores.setText("");
                    this.vistaTrabajador.TextAreaTrabajadores.setText("");

                } catch (Exception ex) {
                    ex.printStackTrace();
                }

                break;
        
        case btnEliminarTrabajador://Borra un cliente

                try {

                    this.vistaTrabajador.jTableTrabajadores.getSelectedRow();
                    if (this.vistaTrabajador.jTableTrabajadores.getSelectedRow() < 0) {

                        JOptionPane.showMessageDialog(null, "Seleccione una fila");

                    } else {

                        fila = this.vistaTrabajador.jTableTrabajadores.getSelectedRow();
                        String dni = (String) this.vistaTrabajador.jTableTrabajadores.getValueAt(fila, 0);
                        this.modelo.EliminarClientes(dni);
                        this.vistaTrabajador.jTableTrabajadores.setModel(this.modelo.getTablaTrabajadores());

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
        String buscar = this.vistaTrabajador.txtBuscadorTrabajadores.getText();
        this.vistaTrabajador.jTableTrabajadores.setModel(this.modelo.buscarTrabajadores(buscar));
    }
    
    //----------------------Permite la selección de elementos dentro de tablas---------------------------
    private void tableTrabajadoresMouseClicked(java.awt.event.MouseEvent evt) {

        fila = this.vistaTrabajador.jTableTrabajadores.getSelectedRow();
        String DNI = (String) this.vistaTrabajador.jTableTrabajadores.getValueAt(fila, 0);

        String[] Relleno = this.modelo.RellenarCliente(DNI);
        this.vistaTrabajador.txtDNITrabajadores.setText(DNI);
        this.vistaTrabajador.txtDNITrabajadores.enable(false);
        this.vistaTrabajador.txtNombreTrabajadores.setText(Relleno[1]);
        this.vistaTrabajador.txtApellidosTrabajadores.setText(Relleno[2]);
        this.vistaTrabajador.txtDireccionTrabajadores.setText(Relleno[3]);
        this.vistaTrabajador.txtTelefonoTrabajadores.setText(Relleno[4]);
        this.vistaTrabajador.txtMovilTrabajadores.setText(Relleno[5]);
        this.vistaTrabajador.txtEmailTrabajadores.setText(Relleno[6]);
        this.vistaTrabajador.txtProvinciaTrabajadores.setText(Relleno[7]);
        this.vistaTrabajador.txtFechaTrabajadores.setText(Relleno[8]);
        this.vistaTrabajador.txtCodigoPTrabajadores.setText(Relleno[9]);
        this.vistaTrabajador.TextAreaTrabajadores.setText(Relleno[10]);
    }
    
}
