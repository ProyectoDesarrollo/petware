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
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        panelPestaña = new javax.swing.JTabbedPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesBotones/trabajador1.png"))); // NOI18N
        jButton1.setText("TRABAJADORES");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesBotones/trabajador1.png"))); // NOI18N
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesBotones/trabajador.png"))); // NOI18N
        jButton1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        panelBotones.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(945, 0, 135, 108));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesBotones/fondoH_2.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        panelBotones.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -6, 1300, 120));

        panelPestaña.setBackground(new java.awt.Color(139, 220, 198));
        panelPestaña.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        panelPestaña.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jMenuBar1.setPreferredSize(new java.awt.Dimension(1300, 21));

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenu4.setText("Archivo");
        jMenuBar1.add(jMenu4);

        jMenu5.setText("Visualizar");

        jMenuItem1.setText("Cliente");
        jMenu5.add(jMenuItem1);

        jMenuItem2.setText("Mascota");
        jMenu5.add(jMenuItem2);

        jMenuItem3.setText("Productos");
        jMenu5.add(jMenuItem3);

        jMenuItem4.setText("Factura");
        jMenu5.add(jMenuItem4);

        jMenuBar1.add(jMenu5);

        jMenu6.setText("Ajustes");
        jMenuBar1.add(jMenu6);

        jMenu3.setText("Ayuda");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPestaña)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, 1300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelPestaña, javax.swing.GroupLayout.DEFAULT_SIZE, 765, Short.MAX_VALUE))
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
    public javax.swing.JButton btnCliente;
    public javax.swing.JButton btnFacturas;
    public javax.swing.JButton btnMascota;
    public javax.swing.JButton btnProductos;
    public javax.swing.JButton btnProveedores;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel panelBotones;
    public javax.swing.JTabbedPane panelPestaña;
    // End of variables declaration//GEN-END:variables
}
