/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author Roberto
 */
public class facturasFrame extends javax.swing.JInternalFrame {

    /**
     * Creates new form facturasFrame
     */
    public facturasFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        panelClienteDatos6 = new javax.swing.JPanel();
        jLabel61 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        buscadorFactura = new javax.swing.JTextField();
        jLabel70 = new javax.swing.JLabel();
        txtPrecioProductoFactura = new javax.swing.JTextField();
        btnAñadirCarrito = new javax.swing.JButton();
        stock = new javax.swing.JSpinner();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableFactura = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtTipoProductoFactura = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtIDProductoFactura = new javax.swing.JTextField();
        txtNombreProductoFactura = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCarrito = new javax.swing.JTable();
        jLabel71 = new javax.swing.JLabel();
        comboUsuarioF = new javax.swing.JComboBox<>();
        btnAceptarFactura = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TextAreaFactura = new javax.swing.JTextPane();
        btnEleminarProductof = new javax.swing.JButton();
        btnModificarProductoF = new javax.swing.JButton();
        comboFactura = new javax.swing.JComboBox<>();
        jLabel72 = new javax.swing.JLabel();
        btnCrearFactura = new javax.swing.JButton();
        panelFClientes = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableFacturaClientes = new javax.swing.JTable();
        txtFacturaClientes = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1190, 570));
        setPreferredSize(new java.awt.Dimension(1190, 570));

        jTabbedPane2.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);
        jTabbedPane2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        panelClienteDatos6.setBackground(new java.awt.Color(147, 175, 93));
        panelClienteDatos6.setFocusCycleRoot(true);
        panelClienteDatos6.setPreferredSize(new java.awt.Dimension(1170, 449));

        jLabel61.setText("Descripción :");

        jLabel65.setText("Precio :");

        jLabel69.setText("Usuario: ");

        jLabel70.setText("Stock :");

        btnAñadirCarrito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesBotones/guardar_1.png"))); // NOI18N

        tableFactura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tableFactura);

        jLabel5.setText("Buscar :");

        jLabel6.setText("Tipo :");

        jLabel7.setText("ID :");

        jScrollPane1.setToolTipText("");
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        tableCarrito.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Producto", "Nombre Producto", "Stock", "Precio", "Descripcio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableCarrito);

        jLabel71.setText("Nombre :");

        comboUsuarioF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnAceptarFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesBotones/guardar_1.png"))); // NOI18N

        jScrollPane2.setViewportView(TextAreaFactura);

        btnEleminarProductof.setText("Eliminar");

        btnModificarProductoF.setText("jButton1");

        comboFactura.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel72.setText("Id Factura:");

        btnCrearFactura.setText("Crear Factura");

        javax.swing.GroupLayout panelClienteDatos6Layout = new javax.swing.GroupLayout(panelClienteDatos6);
        panelClienteDatos6.setLayout(panelClienteDatos6Layout);
        panelClienteDatos6Layout.setHorizontalGroup(
            panelClienteDatos6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClienteDatos6Layout.createSequentialGroup()
                .addGroup(panelClienteDatos6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelClienteDatos6Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buscadorFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelClienteDatos6Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(panelClienteDatos6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 716, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 716, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(panelClienteDatos6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelClienteDatos6Layout.createSequentialGroup()
                        .addGroup(panelClienteDatos6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelClienteDatos6Layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(btnAceptarFactura)
                                .addGap(18, 18, 18)
                                .addComponent(btnCrearFactura)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelClienteDatos6Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel61)
                                .addGap(255, 255, 255))
                            .addGroup(panelClienteDatos6Layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addGroup(panelClienteDatos6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelClienteDatos6Layout.createSequentialGroup()
                                        .addGroup(panelClienteDatos6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel65)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel71)
                                            .addComponent(jLabel72))
                                        .addGroup(panelClienteDatos6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(panelClienteDatos6Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addGroup(panelClienteDatos6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(panelClienteDatos6Layout.createSequentialGroup()
                                                        .addGroup(panelClienteDatos6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                            .addComponent(txtTipoProductoFactura, javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(txtPrecioProductoFactura, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(47, 47, 47)
                                                        .addGroup(panelClienteDatos6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(jLabel70)
                                                            .addComponent(jLabel7))
                                                        .addGap(18, 18, 18)
                                                        .addGroup(panelClienteDatos6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                            .addComponent(txtIDProductoFactura)
                                                            .addComponent(stock, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                    .addGroup(panelClienteDatos6Layout.createSequentialGroup()
                                                        .addComponent(btnAñadirCarrito)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(btnEleminarProductof)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(btnModificarProductoF))))
                                            .addGroup(panelClienteDatos6Layout.createSequentialGroup()
                                                .addGap(12, 12, 12)
                                                .addComponent(comboFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))))
                                    .addGroup(panelClienteDatos6Layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(jLabel69)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(comboUsuarioF, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(21, Short.MAX_VALUE))
                    .addGroup(panelClienteDatos6Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jScrollPane2)
                        .addContainerGap())))
            .addGroup(panelClienteDatos6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelClienteDatos6Layout.createSequentialGroup()
                    .addGap(910, 910, 910)
                    .addComponent(txtNombreProductoFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        panelClienteDatos6Layout.setVerticalGroup(
            panelClienteDatos6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClienteDatos6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelClienteDatos6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscadorFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelClienteDatos6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelClienteDatos6Layout.createSequentialGroup()
                        .addGroup(panelClienteDatos6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel69)
                            .addComponent(comboUsuarioF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(panelClienteDatos6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel72)
                            .addComponent(comboFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel71)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelClienteDatos6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTipoProductoFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(txtIDProductoFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelClienteDatos6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPrecioProductoFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGroup(panelClienteDatos6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelClienteDatos6Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(panelClienteDatos6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnModificarProductoF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEleminarProductof, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAñadirCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(jLabel61)
                        .addGap(7, 7, 7)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelClienteDatos6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAceptarFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCrearFactura))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelClienteDatos6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))))
            .addGroup(panelClienteDatos6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelClienteDatos6Layout.createSequentialGroup()
                    .addGap(121, 121, 121)
                    .addComponent(txtNombreProductoFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(359, Short.MAX_VALUE)))
        );

        jTabbedPane2.addTab("Factura", panelClienteDatos6);

        jTableFacturaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTableFacturaClientes);

        jLabel3.setText("Buscar :");

        javax.swing.GroupLayout panelFClientesLayout = new javax.swing.GroupLayout(panelFClientes);
        panelFClientes.setLayout(panelFClientesLayout);
        panelFClientesLayout.setHorizontalGroup(
            panelFClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1177, Short.MAX_VALUE)
                    .addGroup(panelFClientesLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(31, 31, 31)
                        .addComponent(txtFacturaClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelFClientesLayout.setVerticalGroup(
            panelFClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtFacturaClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane2.addTab("Facturas Clientes", panelFClientes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 540, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextPane TextAreaFactura;
    public javax.swing.JButton btnAceptarFactura;
    public javax.swing.JButton btnAñadirCarrito;
    public javax.swing.JButton btnCrearFactura;
    public javax.swing.JButton btnEleminarProductof;
    public javax.swing.JButton btnModificarProductoF;
    public javax.swing.JTextField buscadorFactura;
    public javax.swing.JComboBox<String> comboFactura;
    public javax.swing.JComboBox<String> comboUsuarioF;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane2;
    public javax.swing.JTable jTableFacturaClientes;
    private javax.swing.JPanel panelClienteDatos6;
    private javax.swing.JPanel panelFClientes;
    public javax.swing.JSpinner stock;
    public javax.swing.JTable tableCarrito;
    public javax.swing.JTable tableFactura;
    public javax.swing.JTextField txtFacturaClientes;
    public javax.swing.JTextField txtIDProductoFactura;
    public javax.swing.JTextField txtNombreProductoFactura;
    public javax.swing.JTextField txtPrecioProductoFactura;
    public javax.swing.JTextField txtTipoProductoFactura;
    // End of variables declaration//GEN-END:variables
}
