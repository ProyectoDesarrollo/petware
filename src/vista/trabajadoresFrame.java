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
public class trabajadoresFrame extends javax.swing.JInternalFrame {

    /**
     * Creates new form trabajadoresFrame
     */
    public trabajadoresFrame() {
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
        jLabel57 = new javax.swing.JLabel();
        jToggleButton4 = new javax.swing.JToggleButton();
        txtNombreCliente = new javax.swing.JTextField();
        jToggleButton5 = new javax.swing.JToggleButton();
        jLabel58 = new javax.swing.JLabel();
        txtTipoCliente = new javax.swing.JTextField();
        txtDireccionCliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        txtTelefonoCliente = new javax.swing.JTextField();
        jLabel60 = new javax.swing.JLabel();
        txtMovilCliente = new javax.swing.JTextField();
        txtDNICliente = new javax.swing.JTextField();
        txtFechaNCliente = new javax.swing.JTextField();
        txtCodigoPCliente = new javax.swing.JTextField();
        txtEmailCliente = new javax.swing.JTextField();
        txtFechaICliente = new javax.swing.JTextField();
        txtProvinciaCliente = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        btnEliminarCliente = new javax.swing.JButton();
        jLabel51 = new javax.swing.JLabel();
        btnGuardarCliente = new javax.swing.JButton();
        jLabel52 = new javax.swing.JLabel();
        scrollNotaCliente = new javax.swing.JScrollPane();
        txtPCliente = new javax.swing.JTextPane();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel56 = new javax.swing.JLabel();
        jToggleButton2 = new javax.swing.JToggleButton();
        txtApellidosCliente = new javax.swing.JTextField();
        jToggleButton3 = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        panelListadoTrabajador = new javax.swing.JPanel();
        txtBuscadorTrabajador = new javax.swing.JTextField();
        scrollTableTrabajador = new javax.swing.JScrollPane();
        jTableTrabajadores = new javax.swing.JTable();
        btnAgregarTrabajador = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1300, 640));

        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);
        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(1160, 682));

        panelTrabajadorDatos.setBackground(new java.awt.Color(117, 218, 193));
        panelTrabajadorDatos.setPreferredSize(new java.awt.Dimension(840, 560));

        jLabel57.setText("Apellidos :");

        jToggleButton4.setText("jToggleButton4");

        jToggleButton5.setText("jToggleButton5");

        jLabel58.setText("Dirección :");

        txtDireccionCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionClienteActionPerformed(evt);
            }
        });

        jLabel2.setText("Tipo:");

        jLabel59.setText("Teléfono :");

        txtTelefonoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoClientejTextField3ActionPerformed(evt);
            }
        });

        jLabel60.setText("Móvil :");

        txtDNICliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDNIClienteActionPerformed(evt);
            }
        });

        txtFechaICliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaIClienteActionPerformed(evt);
            }
        });

        jLabel50.setText("Codigo Postal:");

        btnEliminarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesBotones/eliminar-usuario-icono-7266-32.png"))); // NOI18N

        jLabel51.setText("Provincia :");

        btnGuardarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesBotones/guardar_1.png"))); // NOI18N

        jLabel52.setText("Email :");

        scrollNotaCliente.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollNotaCliente.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollNotaCliente.setViewportView(txtPCliente);

        jLabel53.setText("Fecha Nacimiento:");

        jLabel54.setText("Fecha Ingreso :");

        jLabel55.setText("DNI : ");

        jLabel1.setText("Nota :");

        jToggleButton1.setText("jToggleButton1");

        jLabel56.setText("Nombre :");

        jToggleButton2.setText("jToggleButton2");

        jToggleButton3.setText("jToggleButton3");

        javax.swing.GroupLayout panelTrabajadorDatosLayout = new javax.swing.GroupLayout(panelTrabajadorDatos);
        panelTrabajadorDatos.setLayout(panelTrabajadorDatosLayout);
        panelTrabajadorDatosLayout.setHorizontalGroup(
            panelTrabajadorDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTrabajadorDatosLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jToggleButton2)
                .addGap(18, 18, 18)
                .addComponent(jToggleButton3)
                .addGap(25, 25, 25)
                .addComponent(jToggleButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jToggleButton5)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTrabajadorDatosLayout.createSequentialGroup()
                .addGroup(panelTrabajadorDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelTrabajadorDatosLayout.createSequentialGroup()
                        .addContainerGap(73, Short.MAX_VALUE)
                        .addComponent(scrollNotaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 693, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelTrabajadorDatosLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(panelTrabajadorDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelTrabajadorDatosLayout.createSequentialGroup()
                                .addGroup(panelTrabajadorDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel58)
                                    .addComponent(jLabel57)
                                    .addComponent(jLabel56)
                                    .addComponent(jLabel55))
                                .addGap(29, 29, 29)
                                .addGroup(panelTrabajadorDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelTrabajadorDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtDireccionCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                                        .addComponent(txtApellidosCliente))
                                    .addComponent(txtDNICliente, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelTrabajadorDatosLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(btnEliminarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelTrabajadorDatosLayout.createSequentialGroup()
                                .addGroup(panelTrabajadorDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelTrabajadorDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtMovilCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                                    .addComponent(txtTelefonoCliente))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelTrabajadorDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGuardarCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTrabajadorDatosLayout.createSequentialGroup()
                                .addGroup(panelTrabajadorDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel52)
                                    .addComponent(jLabel51)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel54)
                                    .addComponent(jLabel50)
                                    .addComponent(jLabel53))
                                .addGap(13, 13, 13)
                                .addGroup(panelTrabajadorDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtProvinciaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelTrabajadorDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtTipoCliente)
                                        .addComponent(txtFechaICliente)
                                        .addComponent(txtEmailCliente)
                                        .addComponent(txtFechaNCliente)
                                        .addComponent(txtCodigoPCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(74, 74, 74))
        );
        panelTrabajadorDatosLayout.setVerticalGroup(
            panelTrabajadorDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTrabajadorDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTrabajadorDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEliminarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(panelTrabajadorDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTrabajadorDatosLayout.createSequentialGroup()
                        .addGroup(panelTrabajadorDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDNICliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(panelTrabajadorDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelTrabajadorDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelTrabajadorDatosLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelTrabajadorDatosLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtApellidosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(panelTrabajadorDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelTrabajadorDatosLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel58)
                                .addGap(21, 21, 21)
                                .addGroup(panelTrabajadorDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtTelefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel59)))
                            .addGroup(panelTrabajadorDatosLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtDireccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(15, 15, 15)
                        .addGroup(panelTrabajadorDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMovilCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelTrabajadorDatosLayout.createSequentialGroup()
                        .addGroup(panelTrabajadorDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel53)
                            .addComponent(txtProvinciaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(panelTrabajadorDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel50)
                            .addComponent(txtCodigoPCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel51))
                    .addGroup(panelTrabajadorDatosLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(txtEmailCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtFechaNCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(panelTrabajadorDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel54)
                            .addComponent(txtFechaICliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelTrabajadorDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtTipoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(31, 31, 31)
                .addGroup(panelTrabajadorDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton1)
                    .addComponent(jToggleButton2)
                    .addComponent(jToggleButton3)
                    .addComponent(jToggleButton4)
                    .addComponent(jToggleButton5)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(scrollNotaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
            .addGap(0, 654, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab3", jPanel2);

        txtBuscadorTrabajador.setText("Buscar . . .");
        txtBuscadorTrabajador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBuscadorTrabajadorMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtBuscadorTrabajadorMouseEntered(evt);
            }
        });
        txtBuscadorTrabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscadorTrabajadorActionPerformed(evt);
            }
        });

        scrollTableTrabajador.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollTableTrabajador.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollTableTrabajador.setOpaque(false);
        scrollTableTrabajador.setPreferredSize(new java.awt.Dimension(425, 615));

        jTableTrabajadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "DNI", "Nombre", "Apellidos"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableTrabajadores.setOpaque(false);
        scrollTableTrabajador.setViewportView(jTableTrabajadores);

        btnAgregarTrabajador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesBotones/anadir-usuario-icono-4000-32.png"))); // NOI18N

        javax.swing.GroupLayout panelListadoTrabajadorLayout = new javax.swing.GroupLayout(panelListadoTrabajador);
        panelListadoTrabajador.setLayout(panelListadoTrabajadorLayout);
        panelListadoTrabajadorLayout.setHorizontalGroup(
            panelListadoTrabajadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListadoTrabajadorLayout.createSequentialGroup()
                .addComponent(txtBuscadorTrabajador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAgregarTrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(scrollTableTrabajador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelListadoTrabajadorLayout.setVerticalGroup(
            panelListadoTrabajadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListadoTrabajadorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelListadoTrabajadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAgregarTrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBuscadorTrabajador))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollTableTrabajador, javax.swing.GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE))
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

    private void txtBuscadorTrabajadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBuscadorTrabajadorMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscadorTrabajadorMouseClicked

    private void txtBuscadorTrabajadorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBuscadorTrabajadorMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscadorTrabajadorMouseEntered

    private void txtBuscadorTrabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscadorTrabajadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscadorTrabajadorActionPerformed

    private void txtDireccionClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionClienteActionPerformed

    private void txtTelefonoClientejTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoClientejTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoClientejTextField3ActionPerformed

    private void txtDNIClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDNIClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDNIClienteActionPerformed

    private void txtFechaIClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaIClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaIClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarTrabajador;
    private javax.swing.JButton btnEliminarCliente;
    private javax.swing.JButton btnGuardarCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    public javax.swing.JTable jTableTrabajadores;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JPanel panelListadoTrabajador;
    public javax.swing.JPanel panelTrabajadorDatos;
    private javax.swing.JScrollPane scrollNotaCliente;
    public javax.swing.JScrollPane scrollTableTrabajador;
    public javax.swing.JTextField txtApellidosCliente;
    public javax.swing.JTextField txtBuscadorTrabajador;
    public javax.swing.JTextField txtCodigoPCliente;
    public javax.swing.JTextField txtDNICliente;
    public javax.swing.JTextField txtDireccionCliente;
    public javax.swing.JTextField txtEmailCliente;
    public javax.swing.JTextField txtFechaICliente;
    public javax.swing.JTextField txtFechaNCliente;
    public javax.swing.JTextField txtMovilCliente;
    public javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextPane txtPCliente;
    public javax.swing.JTextField txtProvinciaCliente;
    public javax.swing.JTextField txtTelefonoCliente;
    public javax.swing.JTextField txtTipoCliente;
    // End of variables declaration//GEN-END:variables
}
