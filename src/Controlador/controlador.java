package Controlador;

import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.PropertyVetoException;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.plaf.metal.MetalTabbedPaneUI;
import paneles.panelCliente;
import vista.Principal;
import vista.clienteF;
import vista.clienteFrame;

public class controlador implements ActionListener {

    Principal vista;
    String nombrePestaña;
    JTabbedPane tabbedPane;
    clienteFrame vistaCliente = new clienteFrame();
    JDesktopPane cliente = new JDesktopPane();
    // JPanel cliente = new panelCliente();
    JPanel producto = new panelCliente();
    JPanel proveedores = new panelCliente();
    JPanel facturas = new panelCliente();
    JPanel alimentacion = new panelCliente();
    JPanel mascota = new panelCliente();

    public controlador(Principal vista) {

        this.vista = vista;
    }

    public void iniciar() {

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

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //Captura en String l comando accionado por el usuario

        String comand = e.getActionCommand();

        if (comand.equals("btnCliente")) {
         if (this.vista.panelPestaña.indexOfTab("Clientes") < 0) {
                crearPestaña("Clientes");
            } else {

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
        }
    }

    public void crearPestaña(String nombre) {
        nombrePestaña = nombre;

        if (nombrePestaña.equals("Clientes")) {
            this.vista.panelPestaña.addTab(nombrePestaña + "    ", vistaCliente);
        } else if (nombrePestaña.equals("Mascotas")) {
            this.vista.panelPestaña.addTab(nombrePestaña + "    ", mascota);
        } else if (nombrePestaña.equals("Productos")) {
            this.vista.panelPestaña.addTab(nombrePestaña + "    ", producto);

        } else if (nombrePestaña.equals("Proveedores")) {
            this.vista.panelPestaña.addTab(nombrePestaña + "    ", proveedores);

        } else if (nombrePestaña.equals("Facturas")) {
            this.vista.panelPestaña.addTab(nombrePestaña + "    ", facturas);

        } else if (nombrePestaña.equals("Alimentacion")) {
            this.vista.panelPestaña.addTab(nombrePestaña + "    ", alimentacion);
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
