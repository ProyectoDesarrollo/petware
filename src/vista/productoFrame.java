/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author Gracia Sanchez
 */
public class productoFrame extends javax.swing.JInternalFrame {

    /**
     * Creates new form productoFrame
     */
    public productoFrame() {
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
        panelClienteDatos5 = new javax.swing.JPanel();
        jLabel60 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        txtNombreProductos = new javax.swing.JTextField();
        jLabel68 = new javax.swing.JLabel();
        txtPrecioProductos = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jSpinner = new javax.swing.JSpinner();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableProductos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtBuscadorProducto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtTipoProducto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtIDProductos = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        TextAreaProducto = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableProductoProveedor = new javax.swing.JTable();
        txtProductos_Proveedor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1180, 570));
        setPreferredSize(new java.awt.Dimension(1180, 570));

        jTabbedPane2.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);
        jTabbedPane2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTabbedPane2.setPreferredSize(new java.awt.Dimension(1175, 500));

        panelClienteDatos5.setBackground(new java.awt.Color(147, 175, 93));
        panelClienteDatos5.setPreferredSize(new java.awt.Dimension(1170, 449));

        jLabel60.setText("Descripción :");

        jLabel64.setText("Precio :");

        jLabel67.setText("Nombre :");

        jLabel68.setText("Stock :");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesBotones/anadir-usuario-icono-4000-32.png"))); // NOI18N

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesBotones/guardar_1.png"))); // NOI18N

        jTableProductos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTableProductos);

        jLabel1.setText("Buscar :");

        jLabel2.setText("Tipo :");

        jLabel3.setText("ID :");

        TextAreaProducto.setColumns(20);
        TextAreaProducto.setRows(5);
        jScrollPane3.setViewportView(TextAreaProducto);

        jLabel4.setText("NIF Proveedor :");

        javax.swing.GroupLayout panelClienteDatos5Layout = new javax.swing.GroupLayout(panelClienteDatos5);
        panelClienteDatos5.setLayout(panelClienteDatos5Layout);
        panelClienteDatos5Layout.setHorizontalGroup(
            panelClienteDatos5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClienteDatos5Layout.createSequentialGroup()
                .addGroup(panelClienteDatos5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelClienteDatos5Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNombreProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelClienteDatos5Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 716, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(panelClienteDatos5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelClienteDatos5Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(panelClienteDatos5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelClienteDatos5Layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(18, 18, 18)
                                .addComponent(jButton4))
                            .addGroup(panelClienteDatos5Layout.createSequentialGroup()
                                .addGroup(panelClienteDatos5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel64)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel67)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(panelClienteDatos5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtBuscadorProducto)
                                    .addGroup(panelClienteDatos5Layout.createSequentialGroup()
                                        .addGroup(panelClienteDatos5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtTipoProducto, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtPrecioProductos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE))
                                        .addGap(47, 47, 47)
                                        .addGroup(panelClienteDatos5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel68)
                                            .addComponent(jLabel3))
                                        .addGap(18, 18, 18)
                                        .addGroup(panelClienteDatos5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtIDProductos)
                                            .addComponent(jSpinner, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelClienteDatos5Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(panelClienteDatos5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel60)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        panelClienteDatos5Layout.setVerticalGroup(
            panelClienteDatos5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClienteDatos5Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panelClienteDatos5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelClienteDatos5Layout.createSequentialGroup()
                        .addGroup(panelClienteDatos5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombreProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelClienteDatos5Layout.createSequentialGroup()
                        .addGroup(panelClienteDatos5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(panelClienteDatos5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBuscadorProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel67))
                        .addGap(18, 18, 18)
                        .addGroup(panelClienteDatos5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTipoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(txtIDProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelClienteDatos5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPrecioProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelClienteDatos5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addComponent(jLabel60)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3)))
                .addGap(0, 0, 0))
        );

        jTabbedPane2.addTab("Productos", panelClienteDatos5);

        jTableProductoProveedor.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(jTableProductoProveedor);

        jLabel5.setText("Buscar :");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 1150, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(33, 33, 33)
                        .addComponent(txtProductos_Proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtProductos_Proveedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane2.addTab("Producto Proveedor", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, Short.MAX_VALUE)
        );

        jTabbedPane2.getAccessibleContext().setAccessibleName("Productos");

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextArea TextAreaProducto;
    public javax.swing.JButton jButton2;
    public javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    public javax.swing.JSpinner jSpinner;
    private javax.swing.JTabbedPane jTabbedPane2;
    public javax.swing.JTable jTableProductoProveedor;
    public javax.swing.JTable jTableProductos;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel panelClienteDatos5;
    public javax.swing.JTextField txtBuscadorProducto;
    public javax.swing.JTextField txtIDProductos;
    public javax.swing.JTextField txtNombreProductos;
    public javax.swing.JTextField txtPrecioProductos;
    public javax.swing.JTextField txtProductos_Proveedor;
    public javax.swing.JTextField txtTipoProducto;
    // End of variables declaration//GEN-END:variables
}
