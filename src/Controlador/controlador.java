package Controlador;

import Modelo.modelo;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JDesktopPane;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.plaf.metal.MetalTabbedPaneUI;
import vista.Login;
import vista.Principal;

import vista.clienteFrame;
import vista.facturasFrame;
import vista.pacienteFrame;
import vista.productoFrame;
import vista.proveedoresFrame;
import vista.registro;

public class controlador implements ActionListener, MouseListener ,ItemListener {

    Principal vista;
    registro registro;
    modelo modelo;
    controladorFactura controladorFactura;
    controladorCliente controladorCliente;
    String nombrePestaña;
    JTabbedPane tabbedPane;
    
    clienteFrame vistaCliente = new clienteFrame();
    pacienteFrame vistaPaciente = new pacienteFrame();
    proveedoresFrame vistaProveedor = new proveedoresFrame();
    productoFrame vistaProducto = new productoFrame();
    facturasFrame vistaFacturas = new facturasFrame();
;
    JDesktopPane cliente = new JDesktopPane();
    int fila = 0;

    String usuario;
    Login login;
    String adminContraseña ="1111";

    public controlador(Login login, Principal vista) {

        modelo = new modelo();
        this.login = login;
        this.vista = vista;
        registro = new registro();
        
        
    }

    public void iniciar() {


        try {

            controladorCliente = new controladorCliente(vistaCliente);
            controladorCliente.iniciar();
            controladorFactura = new  controladorFactura(vistaFacturas);
            controladorFactura.iniciar();
            
        } catch (Exception e) {
        }
        //Login
        this.login.setVisible(true);
        this.login.setResizable(false);

        this.login.btnAceptarLogin.setActionCommand("btnLogin");
        this.login.btnAceptarLogin.addActionListener(this);

        this.login.olviContra.addMouseListener(new java.awt.event.MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {

                login.olviContra.setForeground(Color.red);

            }

            @Override
            public void mousePressed(MouseEvent me) {
            }

            @Override
            public void mouseReleased(MouseEvent me) {
            }

            @Override
            public void mouseEntered(MouseEvent me) {
                login.olviContra.setForeground(Color.ORANGE);
            }

            @Override
            public void mouseExited(MouseEvent me) {
                login.olviContra.setForeground(Color.blue);
            }
        });
        this.login.olviContra.setActionCommand("Recuperar");
        this.login.olviContra.addActionListener(this);

        this.login.txtRegistrarse.addMouseListener(new java.awt.event.MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {

                login.txtRegistrarse.setForeground(Color.red);
                registro.setVisible(true);
                login.setVisible(false);
               
            }

            @Override
            public void mousePressed(MouseEvent me) {
            }

            @Override
            public void mouseReleased(MouseEvent me) {
            }

            @Override
            public void mouseEntered(MouseEvent me) {
                login.txtRegistrarse.setForeground(Color.ORANGE);
            }

            @Override
            public void mouseExited(MouseEvent me) {
                login.txtRegistrarse.setForeground(Color.blue);
            }
        });
       

        //Registro 
        registro = new registro();
        this.registro.setVisible(false);
        this.registro.tipo.addItemListener(this);

        this.registro.btnAceptarRegistro.setActionCommand("A Registro");
        this.registro.btnAceptarRegistro.addActionListener(this);

        this.registro.btnCancelarRegistro.setActionCommand("C Registro");
        this.registro.btnCancelarRegistro.addActionListener(this);
        this.registro.labelAdmin.setVisible(false);
        this.registro.txtContraAdmin.setVisible(false);

        this.vista.panelPestaña.setUI(new CustomTabbedPaneUI());
        this.vista.setVisible(false);

        //ActionCommand y ActionListener
        this.vista.btnCliente.setActionCommand("btnCliente");
        this.vista.btnCliente.addActionListener(this);

        this.vista.btnMascota.setActionCommand("btnMascotas");
        this.vista.btnMascota.addActionListener(this);

        this.vista.btnProductos.setActionCommand("btnProductos");
        this.vista.btnProductos.addActionListener(this);

        this.vista.btnProveedores.setActionCommand("btnProveedores");
        this.vista.btnProveedores.addActionListener(this);

        this.vista.btnFacturas.setActionCommand("btnFactura");
        this.vista.btnFacturas.addActionListener(this);

        this.vista.btnCerrar.setActionCommand("btnCerrar");
        this.vista.btnCerrar.addActionListener(this);

        //InternalFrame
        this.vistaCliente.setVisible(false);

        //modificacion tabla cliente
        this.vistaCliente.jTableCliente.setShowGrid(false);
        this.vistaCliente.jTableCliente.setOpaque(false);
//        ((DefaultTableCellRenderer)vistaCliente.jTableCliente.getDefaultRenderer(Object.class)).setOpaque(false); //vuelve transparente la celda

        this.vistaCliente.scrollTableCliente.setOpaque(false);
        this.vistaCliente.scrollTableCliente.getViewport().setOpaque(false);

        //--------------------- MouseClick--------------------------
        
        this.vistaProducto.jTableProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableProductosMouseClicked(evt);

            }
        });

        this.vistaProveedor.jTableProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableProveedoresMouseClicked(evt);

            }
        });

        this.vistaPaciente.jTablePacientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablePacientesMouseClicked(evt);
            }
        });

        this.vista.panelPestaña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int index = vista.panelPestaña.getSelectedIndex();

            }

        });
        //---------------------- Buscar--------------------------
        
        //--------------------- Buscar Producto ------------------
        this.vistaProducto.txtBuscadorProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BuscarProductos(evt);
            }
        });
        this.vistaProducto.txtBuscadorProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vistaProducto.txtBuscadorProducto.setText("");
            }
        });
        //-------------------- Buscar Proveedores ------------------
        this.vistaProveedor.txtBuscadorProveedores.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BuscarProveedor(evt);
            }
        });
        this.vistaProveedor.txtBuscadorProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vistaProveedor.txtBuscadorProveedores.setText("");
            }
        });
        //------------------- Buscar Paciente-------------
        this.vistaPaciente.txtBuscadorPaciente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BuscarPacientes(evt);
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
        //Captura en String l comando accionado por el usuario

        String comand = e.getActionCommand();

        if (comand.equals("btnCliente")) {

            if (this.vista.panelPestaña.indexOfTab("Clientes   ") != -1) {

                int ntab = this.vista.panelPestaña.indexOfTab("Clientes   ");
                this.vista.panelPestaña.setSelectedIndex(ntab);
                //Quitamos el marco del jInternalFrame
//                vistaCliente.setUI(null);
                // this.vista.btnCliente.setEnabled(false);
            } else {
                //Invocamos al metodo para crear las pestañas
                crearPestaña("Clientes");
                int ntab = this.vista.panelPestaña.indexOfTab("Clientes   ");
                this.vista.panelPestaña.setSelectedIndex(ntab);
            }

        } else if (comand.equals("btnMascotas")) {
            if (this.vista.panelPestaña.indexOfTab("Mascotas   ") != -1) {
                int ntab = this.vista.panelPestaña.indexOfTab("Mascotas   ");
                this.vista.panelPestaña.setSelectedIndex(ntab);
            } else {
                crearPestaña("Mascotas");
                int ntab = this.vista.panelPestaña.indexOfTab("Mascotas   ");
                this.vista.panelPestaña.setSelectedIndex(ntab);
            }

        } else if (comand.equals("btnProductos")) {
            if (this.vista.panelPestaña.indexOfTab("Productos   ") != -1) {
                int ntab = this.vista.panelPestaña.indexOfTab("Productos   ");
                this.vista.panelPestaña.setSelectedIndex(ntab);

            } else {
                crearPestaña("Productos");
                int ntab = this.vista.panelPestaña.indexOfTab("Productos   ");
                this.vista.panelPestaña.setSelectedIndex(ntab);
            }

        } else if (comand.equals("btnProveedores")) {
            if (this.vista.panelPestaña.indexOfTab("Proveedores   ") != -1) {
                int ntab = this.vista.panelPestaña.indexOfTab("Proveedores   ");
                this.vista.panelPestaña.setSelectedIndex(ntab);
            } else {
                crearPestaña("Proveedores");
                int ntab = this.vista.panelPestaña.indexOfTab("Proveedores   ");
                this.vista.panelPestaña.setSelectedIndex(ntab);
            }

        } else if (comand.equals("btnFactura")) {
            if (this.vista.panelPestaña.indexOfTab("Facturas   ") != -1) {
                
                int ntab = this.vista.panelPestaña.indexOfTab("Facturas    ");
                this.vista.panelPestaña.setSelectedIndex(ntab);
            } else {
               crearPestaña("Facturas");
               int ntab = this.vista.panelPestaña.indexOfTab("Facturas    ");
                this.vista.panelPestaña.setSelectedIndex(ntab);
           }


        } else if (comand.equals("btnAñadirProveedor")) {

            try {

//                String dni = this.vistaProveedor.txtDNIProveedor.getText();
//                String Nombre = this.vistaProveedor.txtNombreProveedor.getText();
//                String Apellidos = this.vistaProveedor.txtApellidosProveedor.getText();
//                String Direccion = this.vistaProveedor.txtDireccionProveedor.getText();
//                int Telefono = Integer.parseInt(this.vistaProveedor.txtTelefonoProveedor.getText());
//                int Movil = Integer.parseInt(this.vistaProveedor.txtMovilProveedor.getText());
//                String Email = this.vistaProveedor.txtEmailProveedor.getText();
////                this.modelo.InsertarProveedor(Nombre, Apellidos, Direccion, Telefono, Movil, Email);
//                this.vistaCliente.jTableCliente.setModel(this.modelo.getTablaCliente());
//                this.vistaCliente.txtDNICliente.setText("");
//                this.vistaCliente.txtNombreCliente.setText("");
//                this.vistaCliente.txtApellidosCliente.setText("");
//                this.vistaCliente.txtDireccionCliente.setText("");
//                this.vistaCliente.txtTelefonoCliente.setText("");
//                this.vistaCliente.txtMovilCliente.setText("");
//                this.vistaCliente.txtEmailCliente.setText("");
            } catch (Exception ex) {
                ex.printStackTrace();
            }

        } else if (comand.equals("btnLogin")) {
            boolean confir;
            boolean admin;
            if (!this.login.txtUsuario.getText().equals("") && !this.login.txtContraseña.getText().equals("")) {

                String contra = this.login.txtContraseña.getText().toString();
                usuario = this.login.txtUsuario.getText();

                confir = modelo.compararUsuario(usuario, contra);
                if (confir == true) {
                    admin = modelo.compararUsuarioTipo(usuario);
                    if (admin == true) {
                        int i = JOptionPane.showConfirmDialog(cliente, "Te vas ha logear como " + this.login.txtUsuario.getText() + "- Administrador" + "\n ¿Continuar?", "Alerta", JOptionPane.YES_NO_OPTION);
                        if (i == 0) {
                            this.login.setVisible(false);
                            this.vista.setVisible(true);
                            this.vista.btnProveedores.setEnabled(true);
                            this.vista.btnMascota.setEnabled(true);
                        }

                    } else {
                        int i = JOptionPane.showConfirmDialog(cliente, "Te vas ha logear como " + this.login.txtUsuario.getText() + "\n ¿Continuar?", "Alerta", JOptionPane.YES_NO_OPTION);
                        if (i == 0) {
                            this.login.setVisible(false);
                            this.vista.btnProveedores.setEnabled(false);
                            this.vista.btnMascota.setEnabled(false);

                            this.vista.setVisible(true);
                        }

                    }

                } else {
                    JOptionPane.showMessageDialog(cliente, "Usuario o Contraseña incorrecto");
                }
            } else {
                JOptionPane.showMessageDialog(cliente, "Debe ingresar un usuario y contraseña");
            }
        } else if (comand.equals("btnCerrar")) {
            int i = JOptionPane.showConfirmDialog(cliente, "¿Estas seguro de que quieres cerrar sesión?", "Alerta", JOptionPane.YES_NO_OPTION);
            if (i == 0) {
                this.login.setVisible(true);
                this.vista.setVisible(false);
                this.vista.panelPestaña.removeAll();
            }
     

       
        } else if (comand.equals("A Registro")) {
            String usuario = this.registro.txtUsuarioRegistro.getText().toString();
            String contrasenia = this.registro.txtContraseñaRegistro.getText().toString();
            String repContrat = this.registro.txtRepetirContraRegistro.getText().toString();
            String adminContr = this.registro.txtContraAdmin.getText().toString();
            String tipo = (String) this.registro.tipo.getSelectedItem();

            if (usuario.equals("") || contrasenia.equals("") || repContrat.equals("")) {
                if(tipo.equals("Administrador") && adminContr.equals("")){
                     JOptionPane.showMessageDialog(cliente, "Debe rellenar todos los campos");
                }else{
                      JOptionPane.showMessageDialog(cliente, "Debe rellenar todos los campos");
                }
               
            } else {
                if(tipo.equals("Administrador")){
                    int i = JOptionPane.showConfirmDialog(cliente, "Te vas ha Registrar como " + usuario +" \n Con la contraseña: "+ contrasenia + "- Administrador" + "\n ¿Continuar?", "Alerta", JOptionPane.YES_NO_OPTION);
                    if (i == 0) {
                        if (contrasenia.equals(repContrat)) {
                           if(adminContr.equals(adminContraseña)){
                               boolean confirUsuario =  this.modelo.InsertarUsuario(usuario, contrasenia, 0);
                                if(confirUsuario){
                                    JOptionPane.showMessageDialog(cliente, "Te has registrado con exito ");
                                    this.registro.txtUsuarioRegistro.setText("");
                                    this.registro.txtContraseñaRegistro.setText("");
                                    this.registro.txtRepetirContraRegistro.setText("");
                                    this.registro.txtContraAdmin.setText("");
                                }else{
                                    JOptionPane.showMessageDialog(cliente, "Fallo en el  registrado ");
                                }
                               
                           }else{
                               JOptionPane.showMessageDialog(cliente, "Contraseña de Administrador incorrecta");
                           }
                           
                           
                          
                            
                        } else {
                            JOptionPane.showMessageDialog(cliente, "Las contraseñas no coinciden");
                        }



                    }else{
                        this.registro.txtUsuarioRegistro.setText("");
                        this.registro.txtContraseñaRegistro.setText("");
                        this.registro.txtRepetirContraRegistro.setText("");
                        this.registro.txtContraAdmin.setText("");
                    }
                }else{
                    int i = JOptionPane.showConfirmDialog(cliente, "Te vas ha Registrar como " + usuario +" \n Con la contraseña: "+ contrasenia + "- Usuario" + "\n ¿Continuar?", "Alerta", JOptionPane.YES_NO_OPTION);
                    if (i == 0) {
                        if (contrasenia.equals(repContrat)) {
                          
                           boolean confirUsuario =  this.modelo.InsertarUsuario(usuario, contrasenia, 1);
                           
                           if(confirUsuario){
                               JOptionPane.showMessageDialog(cliente, "Te has registrado con exito ");
                               this.registro.txtUsuarioRegistro.setText("");
                               this.registro.txtContraseñaRegistro.setText("");
                               this.registro.txtRepetirContraRegistro.setText("");
                           }else{
                               JOptionPane.showMessageDialog(cliente, "Fallo en el  registrado ");
                           }
                            
                        } else {
                            JOptionPane.showMessageDialog(cliente, "Las contraseñas no coinciden");
                        }



                    }else{
                        this.registro.txtUsuarioRegistro.setText("");
                        this.registro.txtContraseñaRegistro.setText("");
                        this.registro.txtRepetirContraRegistro.setText("");
                        
                    }
                }
                
            }

        } else if (comand.endsWith("C Registro")) {
            this.registro.setVisible(false);
            this.login.setVisible(true);

        }

    }
    //-----------------------------Metodo Buscar-------------------------------


    private void BuscarProveedor(java.awt.event.KeyEvent evt) {//Busca Clientes            
        String buscar = this.vistaProveedor.txtBuscadorProveedores.getText();
        this.vistaProveedor.jTableProveedores.setModel(this.modelo.buscarProveedores(buscar));
    }

    private void BuscarProductos(java.awt.event.KeyEvent evt) {//Busca Clientes            
        String buscar = this.vistaProducto.txtBuscadorProducto.getText();
        this.vistaProducto.jTableProductos.setModel(this.modelo.buscarProductos(buscar));
    }

    private void BuscarPacientes(java.awt.event.KeyEvent evt) {//Busca Clientes            
        String buscar = this.vistaPaciente.txtBuscadorPaciente.getText();
        this.vistaPaciente.jTablePacientes.setModel(this.modelo.buscarPacientes(buscar));
    }

    //-----------------------------Crear Cliente----------------------------------
    public void crearPestaña(String nombre) {
        nombrePestaña = nombre;

        if (nombrePestaña.equals("Clientes")) {
            /*
            *De esta forma Segun el boton que pulsemos dara nombre a la pestaña
            *primer parametro es el nombre de la pestaña y el segundo parametro es el componente 
            *que añadimos a la pestaña
             */

            this.vista.panelPestaña.addTab("Clientes   ", vistaCliente);

        } else if (nombrePestaña.equals("Mascotas")) {
            this.vista.panelPestaña.addTab("Mascotas   ", vistaPaciente);

        } else if (nombrePestaña.equals("Productos")) {
            this.vista.panelPestaña.addTab("Productos   ", vistaProducto);

        } else if (nombrePestaña.equals("Proveedores")) {
            this.vista.panelPestaña.addTab("Proveedores   ", vistaProveedor);

//
        } else if (nombrePestaña.equals("Facturas")) {
            this.vista.panelPestaña.addTab("Facturas    ",vistaFacturas);
          
        }
//        } else if (nombrePestaña.equals("Alimentacion")) {
//            this.vista.panelPestaña.addTab(nombrePestaña + "    ", );
//        this.vista.panelPestaña.setSelectedIndex(6);
//        }

    }

    public void mouseClicked(MouseEvent e) {
    }

    public void mousePressed(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }

    //----------------------Permite la selección de elementos dentro de tablas---------------------------
   

    private void tableProveedoresMouseClicked(java.awt.event.MouseEvent evt) {

        fila = this.vistaProveedor.jTableProveedores.getSelectedRow();
        String nif = (String) this.vistaProveedor.jTableProveedores.getValueAt(fila, 0);

        String[] Relleno = this.modelo.RellenarProveedor(nif);
//        this.vistaProveedor.txtDNIProveedor.setText(nif);
//        this.vistaProveedor.txtDNIProveedor.enable(false);
//        this.vistaProveedor.txtNombreProveedor.setText(Relleno[1]);
//        this.vistaProveedor.txtApellidosProveedor.setText(Relleno[2]);
//        this.vistaProveedor.txtDireccionProveedor.setText(Relleno[3]);
//        this.vistaProveedor.txtTelefonoProveedor.setText(Relleno[4]);
//        this.vistaProveedor.txtMovilProveedor.setText(Relleno[5]);
//        this.vistaProveedor.txtEmailProveedor.setText(Relleno[6]);

    }

    private void tableProductosMouseClicked(java.awt.event.MouseEvent evt) {

        fila = this.vistaProducto.jTableProductos.getSelectedRow();
        String id = (String) this.vistaProducto.jTableProductos.getValueAt(fila, 0);

        String[] Relleno = this.modelo.RellenarProducto(id);
        this.vistaProducto.txtIDProductos.setText(id);
        this.vistaProducto.txtIDProductos.enable(false);
        this.vistaProducto.txtNombreProductos.setText(Relleno[1]);
        this.vistaProducto.jSpinner.setValue(Integer.parseInt(Relleno[2]));
        this.vistaProducto.txtPrecioProductos.setText(Relleno[3]);

    }

    private void tablePacientesMouseClicked(java.awt.event.MouseEvent evt) {

        fila = this.vistaPaciente.jTablePacientes.getSelectedRow();
        String codigo = (String) this.vistaPaciente.jTablePacientes.getValueAt(fila, 0);

        String[] Relleno = this.modelo.RellenarPaciente(codigo);

    }

    //Cambio Combobox
    @Override
    public void itemStateChanged(ItemEvent ie) {
            if(registro.tipo.getSelectedIndex() ==  1){
                registro.labelAdmin.setVisible(true);
                registro.txtContraAdmin.setVisible(true);
            }else{
                registro.labelAdmin.setVisible(false);
                registro.txtContraAdmin.setVisible(false);
                registro.txtContraAdmin.setText("");
            }
    
    }

    //Metodo para modificar las pestañas del JTabbedPanel
    class CustomTabbedPaneUI extends MetalTabbedPaneUI {

        Rectangle xRect;

        protected void installListeners() {
            super.installListeners();
            tabPane.addMouseListener(new MyMouseHandler());
        }

        protected void paintTab(Graphics g, int tabPlacement,
                Rectangle[] rects, int tabIndex,
                Rectangle iconRect, Rectangle textRect) {
            super.paintTab(g, tabPlacement, rects, tabIndex, iconRect, textRect);

            Font f = g.getFont();
            g.setFont(new Font("Courier", Font.BOLD, 10));
            FontMetrics fm = g.getFontMetrics(g.getFont());
            int charWidth = fm.charWidth('x');
            int maxAscent = fm.getMaxAscent();
            g.drawString("x", textRect.x + textRect.width - 3, textRect.y + textRect.height - 3);
            g.drawRect(textRect.x + textRect.width - 5,
                    textRect.y + textRect.height - maxAscent, charWidth + 2, maxAscent - 1);
            xRect = new Rectangle(textRect.x + textRect.width - 2,
                    textRect.y + textRect.height - maxAscent, charWidth + 2, maxAscent - 1);
            g.setFont(f);
        }

        public class MyMouseHandler extends MouseAdapter {

            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println(e);
                if (xRect.contains(e.getPoint())) {
                    JTabbedPane tabPane = (JTabbedPane) e.getSource();
                    int tabIndex = tabForCoordinate(tabPane, e.getX(), e.getY());
                    tabPane.remove(tabIndex);
                }
            }
        }

    }

}
