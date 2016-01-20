/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.*;
import javax.swing.JPanel;

/**
 *
 * @author rober
 */
public class panelCliente extends JPanel {

    //Labels
    JLabel dniL = new JLabel("DNI: ");
    JLabel nombreL = new JLabel("Nombre: ");
    JLabel apellidosL = new JLabel("Apellidos: ");
    JLabel direccionL = new JLabel("Dirección: ");
    JLabel telefonoL = new JLabel("teléfono: ");
    JLabel movilL = new JLabel("Movil: ");
    JLabel emailL = new JLabel("Email: ");
    JLabel ciudadL = new JLabel("Ciudad: ");
    JLabel provinciaL = new JLabel("Provincia: ");
    JLabel nacimientoL = new JLabel("Nacimiento: ");
    JLabel tipoL = new JLabel("Tipo: ");
    JLabel fechaIngresoL = new JLabel("Fecha Ingreso: ");
    JLabel codigoPosL = new JLabel("C.P : ");
    //TextFields 
    JTextField dniT = new JTextField();

    public panelCliente() {
        super();
        this.setSize(1167, 438);
        this.setLayout(new FlowLayout());
        this.add(dniL);
        this.add(dniT);
        dniT.setSize(100, 30);
        this.add(nombreL);
        this.add(apellidosL);
        this.add(telefonoL);
        this.add(movilL);
        this.add(emailL);
        this.add(ciudadL);
        this.add(provinciaL);
        this.add(nacimientoL);
        this.add(tipoL);
        this.add(fechaIngresoL);
        this.add(codigoPosL);

    }

}
