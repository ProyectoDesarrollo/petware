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
public class proveedoresFrame extends javax.swing.JInternalFrame {

    /**
     * Creates new form proveedoresFrame
     */
    public proveedoresFrame() {
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        panelTrabajadorDatos = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        txtApellidosProveedor = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        txtNombreProveedor = new javax.swing.JTextField();
        jLabel58 = new javax.swing.JLabel();
        txtDireccionProveedor = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        txtTelefonoProveedor = new javax.swing.JTextField();
        jLabel60 = new javax.swing.JLabel();
        txtMovilProveedor = new javax.swing.JTextField();
        txtDNIProveedor = new javax.swing.JTextField();
        txtFechaNCProveedor = new javax.swing.JTextField();
        txtEmailProveedor = new javax.swing.JTextField();
        btnEliminarCliente = new javax.swing.JButton();
        btnGuardarCliente = new javax.swing.JButton();
        scrollNotaCliente = new javax.swing.JScrollPane();
        txtPCliente = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jToggleButton5 = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        panelListadoTrabajador = new javax.swing.JPanel();
        txtBuscadorProveedores = new javax.swing.JTextField();
        scrollTableTrabajador = new javax.swing.JScrollPane();
        jTableProveedores = new javax.swing.JTable();
        btnAgregarTrabajador = new javax.swing.JButton();

        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);
        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(1160, 682));

        panelTrabajadorDatos.setPreferredSize(new java.awt.Dimension(1160, 449));

        jLabel52.setText("Email :");

        jLabel53.setText("Fecha Nacimiento:");

        jLabel55.setText("NIF :");

        jLabel56.setText("Nombre :");

        jLabel57.setText("Apellidos :");

        jLabel58.setText("Dirección :");

        txtDireccionProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionProveedorActionPerformed(evt);
            }
        });

        jLabel59.setText("Teléfono :");

        txtTelefonoProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoProveedorjTextField3ActionPerformed(evt);
            }
        });

        jLabel60.setText("Móvil :");

        txtDNIProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDNIProveedorActionPerformed(evt);
            }
        });

        btnEliminarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesBotones/eliminar-usuario-icono-7266-32.png"))); // NOI18N

        btnGuardarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesBotones/guardar_1.png"))); // NOI18N

        scrollNotaCliente.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollNotaCliente.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollNotaCliente.setViewportView(txtPCliente);

        jLabel1.setText("Nota :");

        jToggleButton1.setText("jToggleButton1");

        jToggleButton2.setText("jToggleButton2");

        jToggleButton3.setText("jToggleButton3");

        jToggleButton4.setText("jToggleButton4");

        jToggleButton5.setText("jToggleButton5");

        javax.swing.GroupLayout panelTrabajadorDatosLayout = new javax.swing.GroupLayout(panelTrabajadorDatos);
        panelTrabajadorDatos.setLayout(panelTrabajadorDatosLayout);
        panelTrabajadorDatosLayout.setHorizontalGroup(
            panelTrabajadorDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTrabajadorDatosLayout.createSequentialGroup()
                .addComponent(scrollNotaCliente)
                .addGap(186, 186, 186))
            .addGroup(panelTrabajadorDatosLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(panelTrabajadorDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTrabajadorDatosLayout.createSequentialGroup()
                        .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(panelTrabajadorDatosLayout.createSequentialGroup()
                        .addGroup(panelTrabajadorDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel57)
                            .addComponent(jLabel56)
                            .addComponent(jLabel55)
                            .addGroup(panelTrabajadorDatosLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(19, 19, 19)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelTrabajadorDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelTrabajadorDatosLayout.createSequentialGroup()
                                .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jToggleButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jToggleButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jToggleButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jToggleButton5))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTrabajadorDatosLayout.createSequentialGroup()
                                .addGroup(panelTrabajadorDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(panelTrabajadorDatosLayout.createSequentialGroup()
                                        .addComponent(btnEliminarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 656, Short.MAX_VALUE)
                                        .addComponent(btnGuardarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelTrabajadorDatosLayout.createSequentialGroup()
                                        .addGroup(panelTrabajadorDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtTelefonoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(panelTrabajadorDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(txtApellidosProveedor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                                                .addComponent(txtNombreProveedor, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtDNIProveedor, javax.swing.GroupLayout.Alignment.LEADING)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(panelTrabajadorDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel52, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel53, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel60, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel58, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGap(18, 18, 18)
                                        .addGroup(panelTrabajadorDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtDireccionProveedor)
                                            .addComponent(txtFechaNCProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                                            .addComponent(txtEmailProveedor)
                                            .addComponent(txtMovilProveedor))))
                                .addGap(186, 186, 186))))))
        );
        panelTrabajadorDatosLayout.setVerticalGroup(
            panelTrabajadorDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTrabajadorDatosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelTrabajadorDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEliminarCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardarCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelTrabajadorDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDNIProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel53)
                    .addComponent(txtFechaNCProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panelTrabajadorDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTrabajadorDatosLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelTrabajadorDatosLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(panelTrabajadorDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombreProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDireccionProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel58))))
                .addGap(18, 18, 18)
                .addGroup(panelTrabajadorDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelTrabajadorDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtApellidosProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtEmailProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(panelTrabajadorDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefonoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel59)
                    .addComponent(txtMovilProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(panelTrabajadorDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTrabajadorDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jToggleButton1)
                        .addComponent(jToggleButton2)
                        .addComponent(jToggleButton3)
                        .addComponent(jToggleButton4)
                        .addComponent(jToggleButton5)))
                .addGap(34, 34, 34)
                .addComponent(scrollNotaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Cliente", panelTrabajadorDatos);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1155, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 607, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab3", jPanel2);

        txtBuscadorProveedores.setText("Buscar . . .");
        txtBuscadorProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBuscadorProveedoresMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtBuscadorProveedoresMouseEntered(evt);
            }
        });
        txtBuscadorProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscadorProveedoresActionPerformed(evt);
            }
        });

        scrollTableTrabajador.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollTableTrabajador.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollTableTrabajador.setOpaque(false);

        jTableProveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "NIF", "Nombre", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableProveedores.setOpaque(false);
        scrollTableTrabajador.setViewportView(jTableProveedores);

        btnAgregarTrabajador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesBotones/anadir-usuario-icono-4000-32.png"))); // NOI18N

        javax.swing.GroupLayout panelListadoTrabajadorLayout = new javax.swing.GroupLayout(panelListadoTrabajador);
        panelListadoTrabajador.setLayout(panelListadoTrabajadorLayout);
        panelListadoTrabajadorLayout.setHorizontalGroup(
            panelListadoTrabajadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListadoTrabajadorLayout.createSequentialGroup()
                .addComponent(txtBuscadorProveedores)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAgregarTrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(panelListadoTrabajadorLayout.createSequentialGroup()
                .addComponent(scrollTableTrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelListadoTrabajadorLayout.setVerticalGroup(
            panelListadoTrabajadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListadoTrabajadorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelListadoTrabajadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAgregarTrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBuscadorProveedores))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollTableTrabajador))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelListadoTrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelListadoTrabajador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 635, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDireccionProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionProveedorActionPerformed

    private void txtTelefonoProveedorjTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoProveedorjTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoProveedorjTextField3ActionPerformed

    private void txtDNIProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDNIProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDNIProveedorActionPerformed

    private void txtBuscadorProveedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBuscadorProveedoresMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscadorProveedoresMouseClicked

    private void txtBuscadorProveedoresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBuscadorProveedoresMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscadorProveedoresMouseEntered

    private void txtBuscadorProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscadorProveedoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscadorProveedoresActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarTrabajador;
    private javax.swing.JButton btnEliminarCliente;
    private javax.swing.JButton btnGuardarCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    public javax.swing.JTable jTableProveedores;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JPanel panelListadoTrabajador;
    public javax.swing.JPanel panelTrabajadorDatos;
    private javax.swing.JScrollPane scrollNotaCliente;
    public javax.swing.JScrollPane scrollTableTrabajador;
    public javax.swing.JTextField txtApellidosProveedor;
    public javax.swing.JTextField txtBuscadorProveedores;
    public javax.swing.JTextField txtDNIProveedor;
    public javax.swing.JTextField txtDireccionProveedor;
    public javax.swing.JTextField txtEmailProveedor;
    public javax.swing.JTextField txtFechaNCProveedor;
    public javax.swing.JTextField txtMovilProveedor;
    public javax.swing.JTextField txtNombreProveedor;
    private javax.swing.JTextPane txtPCliente;
    public javax.swing.JTextField txtTelefonoProveedor;
    // End of variables declaration//GEN-END:variables
}
