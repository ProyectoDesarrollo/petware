package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import paneles.panelCliente;
import vista.Principal;

public class controlador implements ActionListener {

    Principal vista;
    int numeroPestaña = 0;
    JTabbedPane tabbedPane;
    JPanel cliente = new panelCliente();
    JPanel producto = new panelCliente();
    JPanel mascota = new panelCliente();

    public controlador(Principal vista) {

        this.vista = vista;
    }

    public void iniciar() {

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
            JLabel probando = new JLabel("Cliente");
            cliente.add(probando);
            this.vista.panelPestaña.addTab("Cliente", cliente);
            int ntabCLiente = this.vista.panelPestaña.indexOfTab("Cliente");
            this.vista.panelPestaña.setSelectedIndex(ntabCLiente);

//            this.vista.btnCliente.setEnabled(false);
//          this.vista.panelPestaña.add(cliente);
        } else if (comand.equals("btnMascotas")) {
            JLabel probando = new JLabel("Mascota");
            mascota.add(probando);
            this.vista.panelPestaña.addTab("Mascotas", mascota);
            int ntabMascota = this.vista.panelPestaña.indexOfTab("Mascotas");
            this.vista.panelPestaña.setSelectedIndex(ntabMascota);
//            this.vista.btnMascota.setEnabled(false);
//           this.vista.panelPestaña.add(mascota);
        } else if (comand.equals("btnProductos")) {
            JLabel probando = new JLabel("Producto");
            producto.add(probando);
            this.vista.panelPestaña.addTab("Productos", producto);
            int ntabProductos = this.vista.panelPestaña.indexOfTab("Productos");
            this.vista.panelPestaña.setSelectedIndex(ntabProductos);
//            this.vista.btnMascota.setEnabled(false);
//           this.vista.panelPestaña.add(mascota);
        }
    }

    public void crearPestaña() {

    }

}
