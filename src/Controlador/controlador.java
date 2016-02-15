package Controlador;

import Modelo.modelo;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.beans.PropertyVetoException;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.plaf.metal.MetalTabbedPaneUI;
import javax.swing.table.DefaultTableCellRenderer;
import sun.util.calendar.LocalGregorianCalendar.Date;
import vista.Principal;
import vista.clienteFrame;
import vista.pacienteFrame;
import vista.productoFrame;
import vista.proveedoresFrame;

public class controlador implements ActionListener, MouseListener {

    Principal vista;
    modelo modelo;
    String nombrePestaña;
    JTabbedPane tabbedPane;
    clienteFrame vistaCliente = new clienteFrame();
    pacienteFrame vistaPaciente = new pacienteFrame();
    proveedoresFrame vistaProveedor = new proveedoresFrame();
    productoFrame vistaProducto = new productoFrame();
    JDesktopPane cliente = new JDesktopPane();
    int fila=0;
    
    public controlador(Principal vista) {

        modelo = new modelo();
        this.vista = vista;
    }

    public void iniciar() {

        try {

            this.vistaCliente.jTableCliente.setModel(this.modelo.getTablaCliente());
            this.vistaProducto.jTableProductos.setModel(this.modelo.getTablaProductos());

        } catch (Exception e) {
        }

        this.vista.panelPestaña.setUI(new CustomTabbedPaneUI());
        this.vista.setVisible(true);
        

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

        this.vista.btnAlimentacion.setActionCommand("btnAlimentacion");
        this.vista.btnAlimentacion.addActionListener(this);
        
        //InternalFrame
        
        this.vistaCliente.setVisible(false);

        //modificacion tabla cliente
        this.vistaCliente.jTableCliente.setShowGrid(false);
        this.vistaCliente.jTableCliente.setOpaque(false);
//        ((DefaultTableCellRenderer)vistaCliente.jTableCliente.getDefaultRenderer(Object.class)).setOpaque(false); //vuelve transparente la celda

        this.vistaCliente.scrollTableCliente.setOpaque(false);
        this.vistaCliente.scrollTableCliente.getViewport().setOpaque(false);

        //--------------------- MouseClick--------------------------
        this.vistaCliente.jTableCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableClientesMouseClicked(evt);
            }
        });
        
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
                tableClientesMouseClicked(evt);
            }
        });
        
        
        
        //---------------------- Buscar--------------------------
        //---------------------- Buscar Cientes------------------
        this.vistaCliente.txtBuscadorCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BuscarClientes(evt);
            }
        });
        this.vistaCliente.txtBuscadorCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vistaCliente.txtBuscadorCliente.setText("");
            }
        });
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
            if (this.vistaCliente.isVisible() == false)  {

                //Invocamos al metodo para crear las pestañas
                crearPestaña("Clientes");

                //Quitamos el marco del jInternalFrame
//                vistaCliente.setUI(null);
            } else if (this.vistaCliente.isVisible() == true) {
                /*
                   En caso de que ya este creada la pestaña ,
                   en vez de crear otra abre la pestaña con el nombre del boton.
                
                 */
                int ntabCLiente = this.vista.panelPestaña.indexOfTab("Clientes");
                this.vista.panelPestaña.setSelectedIndex(ntabCLiente);
            }

        } else if (comand.equals("btnMascotas")) {
            if (this.vista.panelPestaña.indexOfTab("Mascotas") < 0) {
                crearPestaña("Mascotas");
            } else {
                int ntabMascota = this.vista.panelPestaña.indexOfTab("Mascotas");
                this.vista.panelPestaña.setSelectedIndex(ntabMascota);
            }

        } else if (comand.equals("btnProductos")) {
            if (this.vista.panelPestaña.indexOfTab("Productos") < 0) {
                crearPestaña("Productos");
            } else {
                int ntabProductos = this.vista.panelPestaña.indexOfTab("Productos");
                this.vista.panelPestaña.setSelectedIndex(ntabProductos);
            }

        } else if (comand.equals("btnProveedores")) {
            if (this.vista.panelPestaña.indexOfTab("Proveedores") < 0) {
                crearPestaña("Proveedores");
            } else {
                int ntabProveedores = this.vista.panelPestaña.indexOfTab("Proveedores");
                this.vista.panelPestaña.setSelectedIndex(ntabProveedores);
            }

        } else if (comand.equals("btnFactura")) {
            if (this.vista.panelPestaña.indexOfTab("Facturas") < 0) {
                crearPestaña("Facturas");
            } else {
                int ntabFactura = this.vista.panelPestaña.indexOfTab("Facturas");
                this.vista.panelPestaña.setSelectedIndex(ntabFactura);
            }
        } else if (comand.equals("btnAlimentacion")) {
            if (this.vista.panelPestaña.indexOfTab("Alimentacion") < 0) {
                crearPestaña("Alimentacion");
            } else {
                int ntabAlimentacion = this.vista.panelPestaña.indexOfTab("Alimentacion");
                this.vista.panelPestaña.setSelectedIndex(ntabAlimentacion);
            }
        
        } else if (comand.equals("btnAñadirCliente")) {
            
            try {

                    String dni = this.vistaCliente.txtDNICliente.getText();
                    String Nombre = this.vistaCliente.txtNombreCliente.getText();
                    String Apellidos = this.vistaCliente.txtApellidosCliente.getText();
                    String Direccion = this.vistaCliente.txtDireccionCliente.getText();
                    int Telefono = Integer.parseInt(this.vistaCliente.txtTelefonoCliente.getText());
                    int Movil = Integer.parseInt(this.vistaCliente.txtMovilCliente.getText());
                    String Email = this.vistaCliente.txtEmailCliente.getText();
                    String Nacimiento= this.vistaCliente.txtFechaNCliente.getText();
                    int CodigoPostal = Integer.parseInt(this.vistaCliente.txtCodigoPCliente.getText());
                    String Provincia = this.vistaCliente.txtProvinciaCliente.getText();
                    String Fecha= this.vistaCliente.txtProvinciaCliente.getText();
                    String Tipo= this.vistaCliente.txtTipoCliente.getText();
                    
                    this.modelo.InsertarCliente(Nombre, Apellidos, Direccion, Telefono, Movil, Email, Nacimiento, CodigoPostal, Provincia, Fecha, Tipo);
                    this.vistaCliente.jTableCliente.setModel(this.modelo.getTablaCliente());
                    this.vistaCliente.txtDNICliente.setText("");
                    this.vistaCliente.txtNombreCliente.setText("");
                    this.vistaCliente.txtApellidosCliente.setText("");
                    this.vistaCliente.txtDireccionCliente.setText("");
                    this.vistaCliente.txtTelefonoCliente.setText("");
                    this.vistaCliente.txtMovilCliente.setText("");
                    this.vistaCliente.txtEmailCliente.setText("");
                    this.vistaCliente.txtFechaNCliente.setText("");
                    this.vistaCliente.txtFechaNCliente.setText("");
                    this.vistaCliente.txtCodigoPCliente.setText("");
                    this.vistaCliente.txtProvinciaCliente.setText("");
                    this.vistaCliente.txtProvinciaCliente.setText("");
                    this.vistaCliente.txtTipoCliente.setText("");
                    

                } catch (Exception ex) {
                    ex.printStackTrace();
                }
        
        
        } else if (comand.equals("btnAñadirProveedor")) {
            
            try {

                    String dni = this.vistaProveedor.txtDNIProveedor.getText();
                    String Nombre = this.vistaProveedor.txtNombreProveedor.getText();
                    String Apellidos = this.vistaProveedor.txtApellidosProveedor.getText();
                    String Direccion = this.vistaProveedor.txtDireccionProveedor.getText();
                    int Telefono = Integer.parseInt(this.vistaProveedor.txtTelefonoProveedor.getText());
                    int Movil = Integer.parseInt(this.vistaProveedor.txtMovilProveedor.getText());
                    String Email = this.vistaProveedor.txtEmailProveedor.getText();
                    
                    this.modelo.InsertarProveedor (Nombre, Apellidos, Direccion, Telefono, Movil, Email);
                    this.vistaCliente.jTableCliente.setModel(this.modelo.getTablaCliente());
                    this.vistaCliente.txtDNICliente.setText("");
                    this.vistaCliente.txtNombreCliente.setText("");
                    this.vistaCliente.txtApellidosCliente.setText("");
                    this.vistaCliente.txtDireccionCliente.setText("");
                    this.vistaCliente.txtTelefonoCliente.setText("");
                    this.vistaCliente.txtMovilCliente.setText("");
                    this.vistaCliente.txtEmailCliente.setText("");
                    

                } catch (Exception ex) {
                    ex.printStackTrace();
                }
        
        }
        
    }
    //-----------------------------Metodo Buscar-------------------------------

    private void BuscarClientes(java.awt.event.KeyEvent evt) {//Busca Clientes            
        String buscar = this.vistaCliente.txtBuscadorCliente.getText();
        this.vistaCliente.jTableCliente.setModel(this.modelo.buscarCliente(buscar));
    }
    
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

            this.vista.panelPestaña.addTab(nombrePestaña + "    ", vistaCliente);
        } else if (nombrePestaña.equals("Mascotas")) {
            this.vista.panelPestaña.addTab(nombrePestaña + "    ", vistaPaciente);
        } else if (nombrePestaña.equals("Productos")) {
            this.vista.panelPestaña.addTab(nombrePestaña + "    ", vistaProducto);
//
        } else if (nombrePestaña.equals("Proveedores")) {
//            this.vista.panelPestaña.addTab(nombrePestaña + "    ",);
//
        } //else if (nombrePestaña.equals("Facturas")) {
//            this.vista.panelPestaña.addTab(nombrePestaña + "    ", );
//
//        } else if (nombrePestaña.equals("Alimentacion")) {
//            this.vista.panelPestaña.addTab(nombrePestaña + "    ", );
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
    private void tableClientesMouseClicked(java.awt.event.MouseEvent evt) {

        fila = this.vistaCliente.jTableCliente.getSelectedRow();
        String dni = (String) this.vistaCliente.jTableCliente.getValueAt(fila, 0);
    
        String[] Relleno = this.modelo.RellenarCliente(dni);
        this.vistaCliente.txtDNICliente.setText(dni);
        this.vistaCliente.txtDNICliente.enable(false);        
        this.vistaCliente.txtNombreCliente.setText(Relleno[1]);
        this.vistaCliente.txtApellidosCliente.setText(Relleno[2]);
        this.vistaCliente.txtDireccionCliente.setText(Relleno[3]);
        this.vistaCliente.txtTelefonoCliente.setText(Relleno[4]);
        this.vistaCliente.txtMovilCliente.setText(Relleno[5]);
        this.vistaCliente.txtEmailCliente.setText(Relleno[6]);
        this.vistaCliente.txtProvinciaCliente.setText(Relleno[7]);
        this.vistaCliente.txtFechaNCliente.setText(Relleno[8]);
        this.vistaCliente.txtTipoCliente.setText(Relleno[9]);
        this.vistaCliente.txtFechaICliente.setText(Relleno[10]);
        this.vistaCliente.txtCodigoPCliente.setText(Relleno[11]);
    }
    
    private void tableProveedoresMouseClicked(java.awt.event.MouseEvent evt) {

        fila = this.vistaProveedor.jTableProveedores.getSelectedRow();
        String nif = (String) this.vistaProveedor.jTableProveedores.getValueAt(fila, 0);
    
        String[] Relleno = this.modelo.RellenarProveedor(nif);
        this.vistaProveedor.txtDNIProveedor.setText(nif);
        this.vistaProveedor.txtDNIProveedor.enable(false);        
        this.vistaProveedor.txtNombreProveedor.setText(Relleno[1]);
        this.vistaProveedor.txtApellidosProveedor.setText(Relleno[2]);
        this.vistaProveedor.txtDireccionProveedor.setText(Relleno[3]);
        this.vistaProveedor.txtTelefonoProveedor.setText(Relleno[4]);
        this.vistaProveedor.txtMovilProveedor.setText(Relleno[5]);
        this.vistaProveedor.txtEmailProveedor.setText(Relleno[6]);
        this.vistaProveedor.txtFechaNCProveedor.setText(Relleno[8]);
    }
    
    private void tableProductosMouseClicked(java.awt.event.MouseEvent evt) {
        
        fila = this.vistaProducto.jTableProductos.getSelectedRow();
        String id = (String) this.vistaProducto.jTableProductos.getValueAt(fila, 0);
    
        String[] Relleno= this.modelo.RellenarProducto(id);
        this.vistaProducto.txtIDProductos.setText(id);
        this.vistaProducto.txtIDProductos.enable(false);        
        this.vistaProducto.txtNombreProductos.setText(Relleno[1]);
        this.vistaProducto.jSpinner.setValue(Integer.parseInt(Relleno[2]));
        this.vistaProducto.txtPrecioProductos.setText(Relleno[3]);
        this.vistaProducto.jTextAreaProductos.setText(Relleno[4]);
    }
    
    private void tablePacientesMouseClicked(java.awt.event.MouseEvent evt) {
        
        fila = this.vistaPaciente.jTablePacientes.getSelectedRow();
        String codigo = (String) this.vistaPaciente.jTablePacientes.getValueAt(fila, 0);
    
        String[] Relleno= this.modelo.RellenarPaciente(codigo);
        
        
    
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
