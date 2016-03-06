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
import vista.pacienteFrame;
import vista.trabajadoresFrame;

/**
 *
 * @author Alejandro
 */
public class controladorPaciente implements ActionListener, MouseListener {
  

    pacienteFrame vistaPaciente = new pacienteFrame();
    modelo2 modelo = new modelo2();
    int fila=-1;
    
    public enum AccionMVC {
        
        btnAgregarPaciente,
        btnEliminarPaciente,
        btnGuardarPaciente
    }
    
    public controladorPaciente(pacienteFrame vistaPaciente) {
        this.vistaPaciente = vistaPaciente;

    }
    
    public void iniciar() {

        try {

            this.vistaPaciente.jTablePacientes.setModel(this.modelo.getTablaTrabajadores());
            

        } catch (Exception e) {
        }
        
        this.vistaPaciente.btnAgregarPaciente.setActionCommand("btnAgregarPaciente");
        this.vistaPaciente.btnAgregarPaciente.addActionListener(this);

        this.vistaPaciente.btnEliminarPaciente.setActionCommand("btnEliminarPaciente");
        this.vistaPaciente.btnEliminarPaciente.addActionListener(this);

        this.vistaPaciente.btnGuardarPaciente.setActionCommand("btnGuardarPaciente");
        this.vistaPaciente.btnGuardarPaciente.addActionListener(this);
        
        //modificacion tabla cliente
        this.vistaPaciente.jTablePacientes.setShowGrid(false);
        this.vistaPaciente.jTablePacientes.setOpaque(false);
        
        //--------------------- MouseClick--------------------------
        this.vistaPaciente.jTablePacientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableTrabajadoresMouseClicked(evt);
            }
        });
        
        //---------------------- Buscar Cientes------------------
        this.vistaPaciente.txtBuscadorPaciente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BuscarClientes(evt);
            }
        });
        this.vistaPaciente.txtBuscadorPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vistaPaciente.txtBuscadorPaciente.setText("");
            }
        });
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
    switch (AccionMVC.valueOf(e.getActionCommand())) {
        
        case btnAgregarPaciente:

                try {

                    String Especie = this.vistaPaciente.jTextField2.getText();
                    String Nombre = this.vistaPaciente.txtNombrePacientes.getText();
                    String Raza= this.vistaPaciente.jTextField3.getText();
                    String Sexo= this.vistaPaciente.jTextField5.getText();
                    int Edad= Integer.parseInt(this.vistaPaciente.jTextField6.getText());
                    double Peso= Double.parseDouble(this.vistaPaciente.jTextField7.getText());
                    int Codigo= Integer.parseInt(this.vistaPaciente.jTextField8.getText());
                    String Nacimiento= this.vistaPaciente.jTextField9.getText();
                    String Fecha= this.vistaPaciente.jTextField10.getText();
                    String Desde= this.vistaPaciente.jTextField11.getText();
                    String DNICliente= this.vistaPaciente.jTextField13.getText();
                    String Caracter= this.vistaPaciente.jTextAreaCaracter.getText();
                    String Ejercicio= this.vistaPaciente.jTextField14.getText();
                    String Alimentacion= this.vistaPaciente.jTextArea3.getText();
                    String Color= this.vistaPaciente.jTextField15.getText();
                    String Piel= this.vistaPaciente.jTextField16.getText();
                    String Pelo= this.vistaPaciente.jTextField12.getText();
                    String Cabeza= this.vistaPaciente.jTextArea4.getText();
                    String Cuello= this.vistaPaciente.jTextArea5.getText();
                    String Oidos= this.vistaPaciente.jTextArea6.getText();
                    String Labios= this.vistaPaciente.jTextArea7.getText();
                    String Dientes= this.vistaPaciente.jTextArea8.getText();
                    String Lengua= this.vistaPaciente.jTextArea9.getText();
                    String Boca= this.vistaPaciente.jTextArea10.getText();
                    String Masticadores= this.vistaPaciente.jTextArea11.getText();
                    String Torax= this.vistaPaciente.jTextArea12.getText();
                    String AparatoLocomotor= this.vistaPaciente.jTextArea13.getText();
                    String Conciencia= this.vistaPaciente.jTextArea14.getText();
                    String AbdomenForma= this.vistaPaciente.jTextArea15.getText();
                    String AbdomenPalpacion= this.vistaPaciente.jTextArea16.getText();
                    String AbdomenProfunda= this.vistaPaciente.jTextArea17.getText();
                    String IntestinoPercusion= this.vistaPaciente.jTextArea18.getText();
                    String IntestinoAuscultacion= this.vistaPaciente.jTextArea19.getText();
                    String IntestinoOndulacion= this.vistaPaciente.jTextArea20.getText();
                    String Extremidades= this.vistaPaciente.jTextArea21.getText();
                    String SistemaNervioso= this.vistaPaciente.jTextArea22.getText();
                    String Genitales= this.vistaPaciente.jTextArea23.getText();
                    String Recto= this.vistaPaciente.jTextArea24.getText();
                    String Ano= this.vistaPaciente.jTextAre25.getText();
                    String Orina= this.vistaPaciente.jTextArea27.getText();
                    String Heces= this.vistaPaciente.jTextArea28.getText();
                    String Enfermedades= this.vistaPaciente.jTextArea29.getText();
                    String CirugiasPrevias= this.vistaPaciente.jTextArea30.getText();
                    String Esterilizacion= this.vistaPaciente.jTextArea31.getText();
                    String Vacunacion= this.vistaPaciente.jTextArea32.getText();
                    String Desparasitacion= this.vistaPaciente.jTextArea33.getText();
                    String Leishmaniosis= this.vistaPaciente.jTextArea34.getText();
                    String Habitat= this.vistaPaciente.jTextArea35.getText();
                    String Entorno= this.vistaPaciente.jTextArea36.getText();
                    String Viajes= this.vistaPaciente.jTextArea37.getText();
                    String Notas= this.vistaPaciente.jTextAreaNotas.getText();
                    
                    this.modelo.InsertarPacientes(Especie, Nombre, Raza, Sexo, Edad, Edad, Codigo, Nacimiento, Fecha, Desde, DNICliente, Caracter, Ejercicio, Alimentacion, Color, Piel, Pelo, Cabeza, Cuello, Oidos, Labios, Dientes, Lengua, Boca, Masticadores, Torax, AparatoLocomotor, Conciencia, AbdomenForma, AbdomenPalpacion, AbdomenProfunda, AbdomenPalpacion, IntestinoPercusion, IntestinoAuscultacion, IntestinoOndulacion, Extremidades, SistemaNervioso, Genitales, Recto, Ano, Orina, Heces, Enfermedades, CirugiasPrevias, Boolean.TRUE, Vacunacion, Desparasitacion, Leishmaniosis, Habitat, Entorno, Viajes, Notas);
                    this.vistaPaciente.jTablePacientes.setModel(this.modelo.getTablaTrabajadores());
    

                } catch (Exception ex) {
                    ex.printStackTrace();
                }

                break;
                
        case btnGuardarPaciente:

                try {

                    String Especie = this.vistaPaciente.jTextField2.getText();
                    String Nombre = this.vistaPaciente.txtNombrePacientes.getText();
                    String Raza= this.vistaPaciente.jTextField3.getText();
                    String Sexo= this.vistaPaciente.jTextField5.getText();
                    int Edad= Integer.parseInt(this.vistaPaciente.jTextField6.getText());
                    double Peso= Double.parseDouble(this.vistaPaciente.jTextField7.getText());
                    int Codigo= Integer.parseInt(this.vistaPaciente.jTextField8.getText());
                    String Nacimiento= this.vistaPaciente.jTextField9.getText();
                    String Fecha= this.vistaPaciente.jTextField10.getText();
                    String Desde= this.vistaPaciente.jTextField11.getText();
                    String DNICliente= this.vistaPaciente.jTextField13.getText();
                    String Caracter= this.vistaPaciente.jTextAreaCaracter.getText();
                    String Ejercicio= this.vistaPaciente.jTextField14.getText();
                    String Alimentacion= this.vistaPaciente.jTextArea3.getText();
                    String Color= this.vistaPaciente.jTextField15.getText();
                    String Piel= this.vistaPaciente.jTextField16.getText();
                    String Pelo= this.vistaPaciente.jTextField12.getText();
                    String Cabeza= this.vistaPaciente.jTextArea4.getText();
                    String Cuello= this.vistaPaciente.jTextArea5.getText();
                    String Oidos= this.vistaPaciente.jTextArea6.getText();
                    String Labios= this.vistaPaciente.jTextArea7.getText();
                    String Dientes= this.vistaPaciente.jTextArea8.getText();
                    String Lengua= this.vistaPaciente.jTextArea9.getText();
                    String Boca= this.vistaPaciente.jTextArea10.getText();
                    String Masticadores= this.vistaPaciente.jTextArea11.getText();
                    String Torax= this.vistaPaciente.jTextArea12.getText();
                    String AparatoLocomotor= this.vistaPaciente.jTextArea13.getText();
                    String Conciencia= this.vistaPaciente.jTextArea14.getText();
                    String AbdomenForma= this.vistaPaciente.jTextArea15.getText();
                    String AbdomenPalpacion= this.vistaPaciente.jTextArea16.getText();
                    String AbdomenProfunda= this.vistaPaciente.jTextArea17.getText();
                    String IntestinoPercusion= this.vistaPaciente.jTextArea18.getText();
                    String IntestinoAuscultacion= this.vistaPaciente.jTextArea19.getText();
                    String IntestinoOndulacion= this.vistaPaciente.jTextArea20.getText();
                    String Extremidades= this.vistaPaciente.jTextArea21.getText();
                    String SistemaNervioso= this.vistaPaciente.jTextArea22.getText();
                    String Genitales= this.vistaPaciente.jTextArea23.getText();
                    String Recto= this.vistaPaciente.jTextArea24.getText();
                    String Ano= this.vistaPaciente.jTextAre25.getText();
                    String Orina= this.vistaPaciente.jTextArea27.getText();
                    String Heces= this.vistaPaciente.jTextArea28.getText();
                    String Enfermedades= this.vistaPaciente.jTextArea29.getText();
                    String CirugiasPrevias= this.vistaPaciente.jTextArea30.getText();
                    String Esterilizacion= this.vistaPaciente.jTextArea31.getText();
                    String Vacunacion= this.vistaPaciente.jTextArea32.getText();
                    String Desparasitacion= this.vistaPaciente.jTextArea33.getText();
                    String Leishmaniosis= this.vistaPaciente.jTextArea34.getText();
                    String Habitat= this.vistaPaciente.jTextArea35.getText();
                    String Entorno= this.vistaPaciente.jTextArea36.getText();
                    String Viajes= this.vistaPaciente.jTextArea37.getText();
                    String Notas= this.vistaPaciente.jTextAreaNotas.getText();
                    this.modelo.modificarPaciente(Especie, Nombre, Raza, Sexo, Edad, Edad, Codigo, Nacimiento, Fecha, Desde, DNICliente, Caracter, Ejercicio, Alimentacion, Color, Piel, Pelo, Cabeza, Cuello, Oidos, Labios, Dientes, Lengua, Boca, Masticadores, Torax, AparatoLocomotor, Conciencia, AbdomenForma, AbdomenPalpacion, AbdomenProfunda, AbdomenPalpacion, IntestinoPercusion, IntestinoAuscultacion, IntestinoOndulacion, Extremidades, SistemaNervioso, Genitales, Recto, Ano, Orina, Heces, Enfermedades, CirugiasPrevias, Boolean.TRUE, Vacunacion, Desparasitacion, Leishmaniosis, Habitat, Entorno, Viajes, Notas);
                    this.vistaPaciente.jTablePacientes.setModel(this.modelo.getTablaTrabajadores());

                } catch (Exception ex) {
                    ex.printStackTrace();
                }

                break;
        
        case btnEliminarPaciente://Borra un cliente

            try {

                    this.vistaPaciente.jTablePacientes.getSelectedRow();
                    if (this.vistaPaciente.jTablePacientes.getSelectedRow() < 0) {
                    JOptionPane.showMessageDialog(null, "Seleccione una fila");

            } else {

                        fila = this.vistaPaciente.jTablePacientes.getSelectedRow();
                        String dni = (String) this.vistaPaciente.jTablePacientes.getValueAt(fila, 0);
                        this.modelo.EliminarTrabajador(dni);
                        this.vistaPaciente.jTablePacientes.setModel(this.modelo.getTablaTrabajadores());

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
        String buscar = this.vistaPaciente.txtBuscadorPaciente.getText();
        this.vistaPaciente.jTablePacientes.setModel(this.modelo.buscarTrabajadores(buscar));
    }
    
    //----------------------Permite la selección de elementos dentro de tablas---------------------------
    private void tableTrabajadoresMouseClicked(java.awt.event.MouseEvent evt) {

        fila = this.vistaTrabajador.jTableTrabajadores.getSelectedRow();
        String DNI = (String) this.vistaTrabajador.jTableTrabajadores.getValueAt(fila, 0);

        String[] Relleno = this.modelo.RellenarTrabajadores(DNI);
        this.vistaPaciente.txtDNITrabajadores.setText(DNI);
        this.vistaPaciente.txtDNITrabajadores.enable(false);
        this.vistaPaciente.txtNombreTrabajadores.setText(Relleno[1]);
        this.vistaPaciente.txtApellidosTrabajadores.setText(Relleno[2]);
        this.vistaPaciente.txtDireccionTrabajadores.setText(Relleno[3]);
        this.vistaPaciente.txtTelefonoTrabajadores.setText(Relleno[4]);
        this.vistaPaciente.txtMovilTrabajadores.setText(Relleno[5]);
        this.vistaPaciente.txtEmailTrabajadores.setText(Relleno[6]);
        this.vistaPaciente.txtProvinciaTrabajadores.setText(Relleno[7]);
        this.vistaPaciente.txtFechaTrabajadores.setText(Relleno[8]);
        this.vistaPaciente.txtCodigoPTrabajadores.setText(Relleno[9]);
        this.vistaPaciente.txtSalarioTrabajadores.setText(Relleno[10]);
        this.vistaPaciente.txtFechaITrabajadores.setText(Relleno[11]);
        this.vistaPaciente.TextAreaTrabajadores.setText(Relleno[12]);
    }
    
}
