package vista;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.Cursor;
import java.awt.Point;
import java.awt.Toolkit;

import javax.swing.ImageIcon;

/**
 *
 * @author rober
 */
public class Principal extends javax.swing.JFrame {

//    Cursor cursor;
//    ImageIcon imagenCursor = new ImageIcon(getClass().getResource("ImagenesCursor/cat.ico"));
//    Toolkit TK = Toolkit.getDefaultToolkit();



  

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
//        try{
//            this.cursor = TK.createCustomCursor(imagenCursor.getImage(),new Point(2,2),"Cursor Prueba");
//        }catch(EnumConstantNotPresentException e){
//            
//        }
//        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBotones = new javax.swing.JPanel();
        btnCliente = new javax.swing.JButton();
        btnMascota = new javax.swing.JButton();
        btnProductos = new javax.swing.JButton();
        btnProveedores = new javax.swing.JButton();
        btnFacturas = new javax.swing.JButton();
        btnAlimentacion = new javax.swing.JButton();
        btnTrabajadores = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        panelPestaña = new javax.swing.JTabbedPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1195, 710));
        setPreferredSize(new java.awt.Dimension(1195, 710));
        setResizable(false);

        panelBotones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesBotones/usu1.jpg"))); // NOI18N
        btnCliente.setText("CLIENTE");
        btnCliente.setBorder(null);
        btnCliente.setBorderPainted(false);
        btnCliente.setContentAreaFilled(false);
        btnCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCliente.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesBotones/usu1.jpg"))); // NOI18N
        btnCliente.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesBotones/usu2.png"))); // NOI18N
        btnCliente.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnCliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnClienteMouseEntered(evt);
            }
        });
        btnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteActionPerformed(evt);
            }
        });
        panelBotones.add(btnCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 0, 135, 108));

        btnMascota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesBotones/MascotaC.png"))); // NOI18N
        btnMascota.setText("MASCOTAS");
        btnMascota.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnMascota.setBorderPainted(false);
        btnMascota.setContentAreaFilled(false);
        btnMascota.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnMascota.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMascota.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesBotones/MascotaC.png"))); // NOI18N
        btnMascota.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesBotones/MascotaA.png"))); // NOI18N
        btnMascota.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnMascota.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnMascota.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMascotaMouseEntered(evt);
            }
        });
        panelBotones.add(btnMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 135, 108));

        btnProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesBotones/prod1.png"))); // NOI18N
        btnProductos.setText("PRODUCTOS");
        btnProductos.setBorder(null);
        btnProductos.setBorderPainted(false);
        btnProductos.setContentAreaFilled(false);
        btnProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnProductos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnProductos.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesBotones/prod1.png"))); // NOI18N
        btnProductos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesBotones/prod2.png"))); // NOI18N
        btnProductos.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnProductos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnProductosMouseEntered(evt);
            }
        });
        panelBotones.add(btnProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 0, 135, 108));

        btnProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesBotones/pro1.png"))); // NOI18N
        btnProveedores.setText("PROVEEDORES");
        btnProveedores.setBorder(null);
        btnProveedores.setBorderPainted(false);
        btnProveedores.setContentAreaFilled(false);
        btnProveedores.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnProveedores.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnProveedores.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesBotones/pro1.png"))); // NOI18N
        btnProveedores.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesBotones/pro2.png"))); // NOI18N
        btnProveedores.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnProveedores.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        panelBotones.add(btnProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 135, 108));

        btnFacturas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesBotones/fac1.png"))); // NOI18N
        btnFacturas.setText("FACTURAS");
        btnFacturas.setBorder(null);
        btnFacturas.setBorderPainted(false);
        btnFacturas.setContentAreaFilled(false);
        btnFacturas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnFacturas.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesBotones/fac1.png"))); // NOI18N
        btnFacturas.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesBotones/fac2.png"))); // NOI18N
        btnFacturas.setVerifyInputWhenFocusTarget(false);
        btnFacturas.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnFacturas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        panelBotones.add(btnFacturas, new org.netbeans.lib.awtextra.AbsoluteConstraints(675, 0, 135, 108));

        btnAlimentacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesBotones/ht1.jpg"))); // NOI18N
        btnAlimentacion.setText("ALIMENTACIÓN");
        btnAlimentacion.setBorder(null);
        btnAlimentacion.setBorderPainted(false);
        btnAlimentacion.setContentAreaFilled(false);
        btnAlimentacion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAlimentacion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAlimentacion.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesBotones/ht1.jpg"))); // NOI18N
        btnAlimentacion.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesBotones/ht2.png"))); // NOI18N
        btnAlimentacion.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnAlimentacion.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        panelBotones.add(btnAlimentacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 0, 135, 108));

        btnTrabajadores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesBotones/trabajador1.png"))); // NOI18N
        btnTrabajadores.setText("TRABAJADORES");
        btnTrabajadores.setBorder(null);
        btnTrabajadores.setBorderPainted(false);
        btnTrabajadores.setContentAreaFilled(false);
        btnTrabajadores.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTrabajadores.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesBotones/trabajador1.png"))); // NOI18N
        btnTrabajadores.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesBotones/trabajador.png"))); // NOI18N
        btnTrabajadores.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnTrabajadores.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        panelBotones.add(btnTrabajadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 0, 135, 108));

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesBotones/cerrar1.png"))); // NOI18N
        btnCerrar.setContentAreaFilled(false);
        btnCerrar.setDefaultCapable(false);
        btnCerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCerrar.setLabel("CERRAR SESION");
        btnCerrar.setMaximumSize(new java.awt.Dimension(121, 95));
        btnCerrar.setMinimumSize(new java.awt.Dimension(121, 95));
        btnCerrar.setPreferredSize(new java.awt.Dimension(121, 95));
        btnCerrar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesBotones/cerrar1.png"))); // NOI18N
        btnCerrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesBotones/cerrar2.png"))); // NOI18N
        btnCerrar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnCerrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        panelBotones.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 0, 90, 110));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesBotones/fondoH_2.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setMinimumSize(new java.awt.Dimension(1200, 124));
        jLabel2.setPreferredSize(new java.awt.Dimension(1200, 124));
        panelBotones.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -6, 1200, 120));

        panelPestaña.setBackground(new java.awt.Color(139, 220, 198));
        panelPestaña.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        panelPestaña.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelPestaña)
                    .addComponent(panelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, 1195, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelPestaña))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClienteMouseEntered
        
//        this.btnCliente.setCursor(cursor);
    }//GEN-LAST:event_btnClienteMouseEntered

    private void btnMascotaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMascotaMouseEntered
//        this.btnMascota.setCursor(cursor);
    }//GEN-LAST:event_btnMascotaMouseEntered

    private void btnProductosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductosMouseEntered
//        this.btnProductos.setCursor(cursor);
    }//GEN-LAST:event_btnProductosMouseEntered

    private void btnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClienteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAlimentacion;
    public javax.swing.JButton btnCerrar;
    public javax.swing.JButton btnCliente;
    public javax.swing.JButton btnFacturas;
    public javax.swing.JButton btnMascota;
    public javax.swing.JButton btnProductos;
    public javax.swing.JButton btnProveedores;
    private javax.swing.JButton btnTrabajadores;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel panelBotones;
    public javax.swing.JTabbedPane panelPestaña;
    // End of variables declaration//GEN-END:variables
}
