package vista;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Roberto
 */
public class clienteFrame extends javax.swing.JInternalFrame {

    /**
     * Creates new form clienteFrame
     */
    public clienteFrame() {
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

        jButton1 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        panelClienteDatos = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        txtApellidosCliente = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JTextField();
        jLabel58 = new javax.swing.JLabel();
        txtDireccionCliente = new javax.swing.JTextField();
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
        txtTipoCliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        pestañaMascotaCliente = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        panelListadoCliente = new javax.swing.JPanel();
        txtBuscadorCliente = new javax.swing.JTextField();
        scrollTableCliente = new javax.swing.JScrollPane();
        jTableCliente = new javax.swing.JTable();
        btnAgregarCliente = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setPreferredSize(new java.awt.Dimension(1300, 640));
        setRequestFocusEnabled(false);

        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);
        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(1160, 682));

        panelClienteDatos.setBackground(new java.awt.Color(117, 218, 193));
        panelClienteDatos.setPreferredSize(new java.awt.Dimension(840, 560));

        jLabel50.setText("Codigo Postal:");

        jLabel51.setText("Provincia :");

        jLabel52.setText("Email :");

        jLabel53.setText("Fecha Nacimiento:");

        jLabel54.setText("Fecha Ingreso :");

        jLabel55.setText("DNI : ");

        jLabel56.setText("Nombre :");

        jLabel57.setText("Apellidos :");

        jLabel58.setText("Dirección :");

        txtDireccionCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionClienteActionPerformed(evt);
            }
        });

        jLabel59.setText("Teléfono :");

        txtTelefonoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
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

        jLabel2.setText("Tipo:");

        javax.swing.GroupLayout panelClienteDatosLayout = new javax.swing.GroupLayout(panelClienteDatos);
        panelClienteDatos.setLayout(panelClienteDatosLayout);
        panelClienteDatosLayout.setHorizontalGroup(
            panelClienteDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClienteDatosLayout.createSequentialGroup()
                .addGroup(panelClienteDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelClienteDatosLayout.createSequentialGroup()
                        .addContainerGap(656, Short.MAX_VALUE)
                        .addComponent(jToggleButton5))
                    .addGroup(panelClienteDatosLayout.createSequentialGroup()
                        .addGroup(panelClienteDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelClienteDatosLayout.createSequentialGroup()
                                .addContainerGap(428, Short.MAX_VALUE)
                                .addGroup(panelClienteDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel52)
                                    .addComponent(jLabel51)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel54)
                                    .addComponent(jLabel50)
                                    .addComponent(jLabel53)))
                            .addGroup(panelClienteDatosLayout.createSequentialGroup()
                                .addGap(0, 94, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jToggleButton2)
                                .addGap(18, 18, 18)
                                .addComponent(jToggleButton3)
                                .addGap(12, 12, 12)))
                        .addGap(13, 13, 13)
                        .addGroup(panelClienteDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFechaICliente)
                            .addComponent(txtFechaNCliente)
                            .addComponent(jToggleButton4)
                            .addComponent(txtTipoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                            .addComponent(txtEmailCliente)
                            .addComponent(txtCodigoPCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                            .addComponent(txtProvinciaCliente)))
                    .addGroup(panelClienteDatosLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(panelClienteDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelClienteDatosLayout.createSequentialGroup()
                                .addGroup(panelClienteDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel58)
                                    .addComponent(jLabel57)
                                    .addComponent(jLabel56)
                                    .addComponent(jLabel55))
                                .addGap(29, 29, 29)
                                .addGroup(panelClienteDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelClienteDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtDireccionCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                                        .addComponent(txtApellidosCliente))
                                    .addComponent(txtDNICliente, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelClienteDatosLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(btnEliminarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelClienteDatosLayout.createSequentialGroup()
                                .addGroup(panelClienteDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelClienteDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtMovilCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                                    .addComponent(txtTelefonoCliente))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 320, Short.MAX_VALUE)
                        .addComponent(btnGuardarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelClienteDatosLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(scrollNotaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 667, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(74, 74, 74))
        );
        panelClienteDatosLayout.setVerticalGroup(
            panelClienteDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClienteDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelClienteDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelClienteDatosLayout.createSequentialGroup()
                        .addComponent(btnEliminarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(121, 121, 121)
                        .addGroup(panelClienteDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelClienteDatosLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(txtProvinciaCliente))
                            .addGroup(panelClienteDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtDNICliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel53)))
                        .addGap(19, 19, 19)
                        .addGroup(panelClienteDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel50)
                            .addComponent(txtCodigoPCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelClienteDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelClienteDatosLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelClienteDatosLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(panelClienteDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtApellidosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(panelClienteDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelClienteDatosLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel58)
                                .addGap(21, 21, 21)
                                .addGroup(panelClienteDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtTelefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel59)))
                            .addGroup(panelClienteDatosLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(panelClienteDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtDireccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel51))))
                        .addGap(15, 15, 15)
                        .addGroup(panelClienteDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMovilCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3))
                    .addGroup(panelClienteDatosLayout.createSequentialGroup()
                        .addComponent(btnGuardarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtEmailCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtFechaNCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(panelClienteDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel54)
                            .addComponent(txtFechaICliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelClienteDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtTipoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)))
                .addGap(28, 28, 28)
                .addGroup(panelClienteDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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

        jTabbedPane1.addTab("Cliente", panelClienteDatos);

        javax.swing.GroupLayout pestañaMascotaClienteLayout = new javax.swing.GroupLayout(pestañaMascotaCliente);
        pestañaMascotaCliente.setLayout(pestañaMascotaClienteLayout);
        pestañaMascotaClienteLayout.setHorizontalGroup(
            pestañaMascotaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 835, Short.MAX_VALUE)
        );
        pestañaMascotaClienteLayout.setVerticalGroup(
            pestañaMascotaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 654, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Mascota", pestañaMascotaCliente);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 835, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 654, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab3", jPanel2);

        panelListadoCliente.setMinimumSize(new java.awt.Dimension(500, 910));
        panelListadoCliente.setPreferredSize(new java.awt.Dimension(502, 914));
        panelListadoCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtBuscadorCliente.setText("Buscar . . .");
        txtBuscadorCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBuscadorClienteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtBuscadorClienteMouseEntered(evt);
            }
        });
        txtBuscadorCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscadorClienteActionPerformed(evt);
            }
        });
        panelListadoCliente.add(txtBuscadorCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 11, 320, 36));

        scrollTableCliente.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollTableCliente.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollTableCliente.setPreferredSize(new java.awt.Dimension(425, 615));

        jTableCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
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
        jTableCliente.setOpaque(false);
        scrollTableCliente.setViewportView(jTableCliente);

        panelListadoCliente.add(scrollTableCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 440, 570));

        btnAgregarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesBotones/anadir-usuario-icono-4000-32.png"))); // NOI18N
        btnAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarClienteActionPerformed(evt);
            }
        });
        panelListadoCliente.add(btnAgregarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 10, 110, 36));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesBotones/fondo2_1.jpg"))); // NOI18N
        jLabel3.setMaximumSize(new java.awt.Dimension(450, 900));
        jLabel3.setMinimumSize(new java.awt.Dimension(250, 600));
        panelListadoCliente.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 430, 570));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelListadoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelListadoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscadorClienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBuscadorClienteMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscadorClienteMouseEntered

    private void txtBuscadorClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBuscadorClienteMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscadorClienteMouseClicked

    private void txtBuscadorClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscadorClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscadorClienteActionPerformed

    private void btnAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarClienteActionPerformed

    private void txtFechaIClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaIClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaIClienteActionPerformed

    private void txtDNIClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDNIClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDNIClienteActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void txtDireccionClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAgregarCliente;
    private javax.swing.JButton btnEliminarCliente;
    private javax.swing.JButton btnGuardarCliente;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
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
    public javax.swing.JTable jTableCliente;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton5;
    public javax.swing.JPanel panelClienteDatos;
    private javax.swing.JPanel panelListadoCliente;
    private javax.swing.JPanel pestañaMascotaCliente;
    private javax.swing.JScrollPane scrollNotaCliente;
    public javax.swing.JScrollPane scrollTableCliente;
    public javax.swing.JTextField txtApellidosCliente;
    public javax.swing.JTextField txtBuscadorCliente;
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
