/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import java.awt.Color;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class menuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form menuPrincipal
     */
    public menuPrincipal() {
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

        menuPrincipalEncabezado = new javax.swing.JPanel();
        menuPrincipalTitulo = new javax.swing.JLabel();
        menuPrincipalCuerpo = new javax.swing.JPanel();
        menuPrincipalProductos = new javax.swing.JButton();
        menuPrincipalProveedores = new javax.swing.JButton();
        menuPrincipalCompras = new javax.swing.JButton();
        menuPrincipalVentas = new javax.swing.JButton();
        menuPrincipalClientes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        menuPrincipalEncabezado.setBackground(new java.awt.Color(0, 0, 0));
        menuPrincipalEncabezado.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menuPrincipalEncabezado.setForeground(new java.awt.Color(255, 255, 255));

        menuPrincipalTitulo.setBackground(new java.awt.Color(0, 0, 0));
        menuPrincipalTitulo.setFont(new java.awt.Font("Javanese Text", 1, 26)); // NOI18N
        menuPrincipalTitulo.setForeground(new java.awt.Color(255, 255, 255));
        menuPrincipalTitulo.setText("Menu principal");
        menuPrincipalTitulo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout menuPrincipalEncabezadoLayout = new javax.swing.GroupLayout(menuPrincipalEncabezado);
        menuPrincipalEncabezado.setLayout(menuPrincipalEncabezadoLayout);
        menuPrincipalEncabezadoLayout.setHorizontalGroup(
            menuPrincipalEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPrincipalEncabezadoLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(menuPrincipalTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menuPrincipalEncabezadoLayout.setVerticalGroup(
            menuPrincipalEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPrincipalEncabezadoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(menuPrincipalTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        menuPrincipalCuerpo.setBackground(new java.awt.Color(0, 0, 0));
        menuPrincipalCuerpo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menuPrincipalCuerpo.setForeground(new java.awt.Color(255, 255, 255));

        menuPrincipalProductos.setBackground(new java.awt.Color(255, 255, 255));
        menuPrincipalProductos.setFont(new java.awt.Font("Javanese Text", 1, 22)); // NOI18N
        menuPrincipalProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Productos.jpg"))); // NOI18N
        menuPrincipalProductos.setText("Productos");
        menuPrincipalProductos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menuPrincipalProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuPrincipalProductosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuPrincipalProductosMouseExited(evt);
            }
        });
        menuPrincipalProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPrincipalProductosActionPerformed(evt);
            }
        });

        menuPrincipalProveedores.setBackground(new java.awt.Color(255, 255, 255));
        menuPrincipalProveedores.setFont(new java.awt.Font("Javanese Text", 1, 22)); // NOI18N
        menuPrincipalProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Proveedores.jpg"))); // NOI18N
        menuPrincipalProveedores.setText("Proveedores");
        menuPrincipalProveedores.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menuPrincipalProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuPrincipalProveedoresMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuPrincipalProveedoresMouseExited(evt);
            }
        });
        menuPrincipalProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPrincipalProveedoresActionPerformed(evt);
            }
        });

        menuPrincipalCompras.setBackground(new java.awt.Color(255, 255, 255));
        menuPrincipalCompras.setFont(new java.awt.Font("Javanese Text", 1, 22)); // NOI18N
        menuPrincipalCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Compras.jpg"))); // NOI18N
        menuPrincipalCompras.setText("Compras");
        menuPrincipalCompras.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menuPrincipalCompras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuPrincipalComprasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuPrincipalComprasMouseExited(evt);
            }
        });
        menuPrincipalCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPrincipalComprasActionPerformed(evt);
            }
        });

        menuPrincipalVentas.setBackground(new java.awt.Color(255, 255, 255));
        menuPrincipalVentas.setFont(new java.awt.Font("Javanese Text", 1, 22)); // NOI18N
        menuPrincipalVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ventas.jpg"))); // NOI18N
        menuPrincipalVentas.setText("Ventas");
        menuPrincipalVentas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menuPrincipalVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuPrincipalVentasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuPrincipalVentasMouseExited(evt);
            }
        });
        menuPrincipalVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPrincipalVentasActionPerformed(evt);
            }
        });

        menuPrincipalClientes.setBackground(new java.awt.Color(255, 255, 255));
        menuPrincipalClientes.setFont(new java.awt.Font("Javanese Text", 1, 22)); // NOI18N
        menuPrincipalClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Clientes.jpg"))); // NOI18N
        menuPrincipalClientes.setText("Clientes");
        menuPrincipalClientes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menuPrincipalClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuPrincipalClientesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuPrincipalClientesMouseExited(evt);
            }
        });
        menuPrincipalClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPrincipalClientesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuPrincipalCuerpoLayout = new javax.swing.GroupLayout(menuPrincipalCuerpo);
        menuPrincipalCuerpo.setLayout(menuPrincipalCuerpoLayout);
        menuPrincipalCuerpoLayout.setHorizontalGroup(
            menuPrincipalCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPrincipalCuerpoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuPrincipalCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(menuPrincipalProveedores, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(menuPrincipalClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menuPrincipalProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(menuPrincipalCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menuPrincipalVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menuPrincipalCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menuPrincipalCuerpoLayout.setVerticalGroup(
            menuPrincipalCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPrincipalCuerpoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuPrincipalCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menuPrincipalProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menuPrincipalCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(menuPrincipalCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menuPrincipalVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menuPrincipalProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(menuPrincipalClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menuPrincipalEncabezado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menuPrincipalCuerpo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menuPrincipalEncabezado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menuPrincipalCuerpo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuPrincipalProductosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuPrincipalProductosMouseEntered
        // TODO add your handling code here:
        menuPrincipalProductos.setFont(new java.awt.Font("javanese Text", 3, 22));
        menuPrincipalProductos.setBackground(new Color(0, 0, 196));
    }//GEN-LAST:event_menuPrincipalProductosMouseEntered

    private void menuPrincipalProductosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuPrincipalProductosMouseExited
        // TODO add your handling code here:
        menuPrincipalProductos.setFont(new java.awt.Font("javanese Text", 1, 22));
        menuPrincipalProductos.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_menuPrincipalProductosMouseExited

    private void menuPrincipalProveedoresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuPrincipalProveedoresMouseEntered
        // TODO add your handling code here:
        menuPrincipalProveedores.setFont(new java.awt.Font("javanese Text", 3, 22));
        menuPrincipalProveedores.setBackground(new Color(0, 0, 196));
    }//GEN-LAST:event_menuPrincipalProveedoresMouseEntered

    private void menuPrincipalProveedoresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuPrincipalProveedoresMouseExited
        // TODO add your handling code here:
        menuPrincipalProveedores.setFont(new java.awt.Font("javanese Text", 1, 22));
        menuPrincipalProveedores.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_menuPrincipalProveedoresMouseExited

    private void menuPrincipalComprasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuPrincipalComprasMouseEntered
        // TODO add your handling code here:
        menuPrincipalCompras.setFont(new java.awt.Font("javanese Text", 3, 22));
        menuPrincipalCompras.setBackground(new Color(0, 0, 196));

    }//GEN-LAST:event_menuPrincipalComprasMouseEntered

    private void menuPrincipalComprasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuPrincipalComprasMouseExited
        // TODO add your handling code here:
        menuPrincipalCompras.setFont(new java.awt.Font("javanese Text", 1, 22));
        menuPrincipalCompras.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_menuPrincipalComprasMouseExited

    private void menuPrincipalVentasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuPrincipalVentasMouseEntered
        // TODO add your handling code here:
        menuPrincipalVentas.setFont(new java.awt.Font("javanese Text", 3, 22));
        menuPrincipalVentas.setBackground(new Color(0, 0, 196));
    }//GEN-LAST:event_menuPrincipalVentasMouseEntered

    private void menuPrincipalVentasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuPrincipalVentasMouseExited
        // TODO add your handling code here:
        menuPrincipalVentas.setFont(new java.awt.Font("javanese Text", 1, 22));
        menuPrincipalVentas.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_menuPrincipalVentasMouseExited

    private void menuPrincipalProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPrincipalProductosActionPerformed
        // TODO add your handling code here:
        menuProductos nuevo = new menuProductos();
        this.setVisible(false);
        nuevo.setVisible(true);

    }//GEN-LAST:event_menuPrincipalProductosActionPerformed

    private void menuPrincipalProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPrincipalProveedoresActionPerformed
        // TODO add your handling code here:
        menuProveedores nuevo = new menuProveedores();
        this.setVisible(false);
        nuevo.setVisible(true);
    }//GEN-LAST:event_menuPrincipalProveedoresActionPerformed

    private void menuPrincipalComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPrincipalComprasActionPerformed
        // TODO add your handling code here:
        menuCompras nuevo = new menuCompras();
        this.setVisible(false);
        nuevo.setVisible(true);
    }//GEN-LAST:event_menuPrincipalComprasActionPerformed

    private void menuPrincipalVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPrincipalVentasActionPerformed
        // TODO add your handling code here:
        menuVentas nuevo = new menuVentas();
        this.setVisible(false);
        nuevo.setVisible(true);
    }//GEN-LAST:event_menuPrincipalVentasActionPerformed

    private void menuPrincipalClientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuPrincipalClientesMouseEntered
        // TODO add your handling code here:
        menuPrincipalClientes.setFont(new java.awt.Font("javanese Text", 3, 22));
        menuPrincipalClientes.setBackground(new Color(0, 0, 196));
    }//GEN-LAST:event_menuPrincipalClientesMouseEntered

    private void menuPrincipalClientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuPrincipalClientesMouseExited
        // TODO add your handling code here:
        menuPrincipalClientes.setFont(new java.awt.Font("javanese Text", 1, 22));
        menuPrincipalClientes.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_menuPrincipalClientesMouseExited

    private void menuPrincipalClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPrincipalClientesActionPerformed
        // TODO add your handling code here:
        menuClientes nuevo = new menuClientes();
        this.setVisible(false);
        nuevo.setVisible(true);
    }//GEN-LAST:event_menuPrincipalClientesActionPerformed

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
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton menuPrincipalClientes;
    private javax.swing.JButton menuPrincipalCompras;
    private javax.swing.JPanel menuPrincipalCuerpo;
    private javax.swing.JPanel menuPrincipalEncabezado;
    private javax.swing.JButton menuPrincipalProductos;
    private javax.swing.JButton menuPrincipalProveedores;
    private javax.swing.JLabel menuPrincipalTitulo;
    private javax.swing.JButton menuPrincipalVentas;
    // End of variables declaration//GEN-END:variables
}