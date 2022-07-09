/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Clases.Conexion;
import java.awt.Color;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.view.JasperViewer;
import net.sf.jasperreports.engine.util.JRLoader;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class menuProductos extends javax.swing.JFrame {

    /**
     * Creates new form menuPrincipal
     */
    public menuProductos() {
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

        menuProductosEncabezado = new javax.swing.JPanel();
        menuProductosTitulo = new javax.swing.JLabel();
        menuProductosCuerpo = new javax.swing.JPanel();
        menuProductosRegistrar = new javax.swing.JButton();
        menuProductosModificar = new javax.swing.JButton();
        menuProductosEliminar = new javax.swing.JButton();
        menuProductosBuscar = new javax.swing.JButton();
        menuProductosListado = new javax.swing.JButton();
        menuProductosVolver = new javax.swing.JButton();
        menuProductosReporte = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        menuProductosEncabezado.setBackground(new java.awt.Color(0, 0, 0));
        menuProductosEncabezado.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menuProductosEncabezado.setForeground(new java.awt.Color(255, 255, 255));

        menuProductosTitulo.setBackground(new java.awt.Color(0, 0, 0));
        menuProductosTitulo.setFont(new java.awt.Font("Javanese Text", 1, 26)); // NOI18N
        menuProductosTitulo.setForeground(new java.awt.Color(255, 255, 255));
        menuProductosTitulo.setText("Menu productos");
        menuProductosTitulo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout menuProductosEncabezadoLayout = new javax.swing.GroupLayout(menuProductosEncabezado);
        menuProductosEncabezado.setLayout(menuProductosEncabezadoLayout);
        menuProductosEncabezadoLayout.setHorizontalGroup(
            menuProductosEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuProductosEncabezadoLayout.createSequentialGroup()
                .addContainerGap(95, Short.MAX_VALUE)
                .addComponent(menuProductosTitulo)
                .addGap(94, 94, 94))
        );
        menuProductosEncabezadoLayout.setVerticalGroup(
            menuProductosEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuProductosEncabezadoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(menuProductosTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        menuProductosCuerpo.setBackground(new java.awt.Color(0, 0, 0));
        menuProductosCuerpo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menuProductosCuerpo.setForeground(new java.awt.Color(255, 255, 255));

        menuProductosRegistrar.setBackground(new java.awt.Color(255, 255, 255));
        menuProductosRegistrar.setFont(new java.awt.Font("Javanese Text", 1, 22)); // NOI18N
        menuProductosRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Registrar.jpg"))); // NOI18N
        menuProductosRegistrar.setText("Registrar");
        menuProductosRegistrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menuProductosRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuProductosRegistrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuProductosRegistrarMouseExited(evt);
            }
        });
        menuProductosRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuProductosRegistrarActionPerformed(evt);
            }
        });

        menuProductosModificar.setBackground(new java.awt.Color(255, 255, 255));
        menuProductosModificar.setFont(new java.awt.Font("Javanese Text", 1, 22)); // NOI18N
        menuProductosModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Modificar.jpg"))); // NOI18N
        menuProductosModificar.setText("Modificar");
        menuProductosModificar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menuProductosModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuProductosModificarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuProductosModificarMouseExited(evt);
            }
        });
        menuProductosModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuProductosModificarActionPerformed(evt);
            }
        });

        menuProductosEliminar.setBackground(new java.awt.Color(255, 255, 255));
        menuProductosEliminar.setFont(new java.awt.Font("Javanese Text", 1, 22)); // NOI18N
        menuProductosEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Eliminar.jpg"))); // NOI18N
        menuProductosEliminar.setText("Eliminar");
        menuProductosEliminar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menuProductosEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuProductosEliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuProductosEliminarMouseExited(evt);
            }
        });
        menuProductosEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuProductosEliminarActionPerformed(evt);
            }
        });

        menuProductosBuscar.setBackground(new java.awt.Color(255, 255, 255));
        menuProductosBuscar.setFont(new java.awt.Font("Javanese Text", 1, 22)); // NOI18N
        menuProductosBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ConsultaGeneral.jpg"))); // NOI18N
        menuProductosBuscar.setText("Buscar");
        menuProductosBuscar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menuProductosBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuProductosBuscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuProductosBuscarMouseExited(evt);
            }
        });
        menuProductosBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuProductosBuscarActionPerformed(evt);
            }
        });

        menuProductosListado.setBackground(new java.awt.Color(255, 255, 255));
        menuProductosListado.setFont(new java.awt.Font("Javanese Text", 1, 22)); // NOI18N
        menuProductosListado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Listado.jpg"))); // NOI18N
        menuProductosListado.setText("Listado");
        menuProductosListado.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menuProductosListado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuProductosListadoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuProductosListadoMouseExited(evt);
            }
        });
        menuProductosListado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuProductosListadoActionPerformed(evt);
            }
        });

        menuProductosVolver.setBackground(new java.awt.Color(255, 255, 255));
        menuProductosVolver.setFont(new java.awt.Font("Javanese Text", 1, 22)); // NOI18N
        menuProductosVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Salir.jpg"))); // NOI18N
        menuProductosVolver.setText("Volver al menu principal");
        menuProductosVolver.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menuProductosVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuProductosVolverMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuProductosVolverMouseExited(evt);
            }
        });
        menuProductosVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuProductosVolverActionPerformed(evt);
            }
        });

        menuProductosReporte.setBackground(new java.awt.Color(255, 255, 255));
        menuProductosReporte.setFont(new java.awt.Font("Javanese Text", 1, 22)); // NOI18N
        menuProductosReporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Reportes.jpg"))); // NOI18N
        menuProductosReporte.setText("Reporte");
        menuProductosReporte.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menuProductosReporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuProductosReporteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuProductosReporteMouseExited(evt);
            }
        });
        menuProductosReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuProductosReporteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuProductosCuerpoLayout = new javax.swing.GroupLayout(menuProductosCuerpo);
        menuProductosCuerpo.setLayout(menuProductosCuerpoLayout);
        menuProductosCuerpoLayout.setHorizontalGroup(
            menuProductosCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuProductosCuerpoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuProductosCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(menuProductosVolver, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                    .addGroup(menuProductosCuerpoLayout.createSequentialGroup()
                        .addGroup(menuProductosCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(menuProductosRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(menuProductosModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(menuProductosEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(menuProductosCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(menuProductosListado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(menuProductosReporte, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(menuProductosBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menuProductosCuerpoLayout.setVerticalGroup(
            menuProductosCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuProductosCuerpoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuProductosCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menuProductosRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menuProductosBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(menuProductosCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menuProductosListado, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menuProductosModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(menuProductosCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menuProductosEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menuProductosReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(menuProductosVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menuProductosEncabezado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menuProductosCuerpo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menuProductosEncabezado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menuProductosCuerpo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuProductosRegistrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuProductosRegistrarMouseEntered
        // TODO add your handling code here:
        menuProductosRegistrar.setFont(new java.awt.Font("javanese Text", 3, 22));
        menuProductosRegistrar.setBackground(new Color(0, 0, 196));
    }//GEN-LAST:event_menuProductosRegistrarMouseEntered

    private void menuProductosRegistrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuProductosRegistrarMouseExited
        // TODO add your handling code here:
        menuProductosRegistrar.setFont(new java.awt.Font("javanese Text", 1, 22));
        menuProductosRegistrar.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_menuProductosRegistrarMouseExited

    private void menuProductosModificarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuProductosModificarMouseEntered
        // TODO add your handling code here:
        menuProductosModificar.setFont(new java.awt.Font("javanese Text", 3, 22));
        menuProductosModificar.setBackground(new Color(0, 0, 196));
    }//GEN-LAST:event_menuProductosModificarMouseEntered

    private void menuProductosModificarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuProductosModificarMouseExited
        // TODO add your handling code here:
        menuProductosModificar.setFont(new java.awt.Font("javanese Text", 1, 22));
        menuProductosModificar.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_menuProductosModificarMouseExited

    private void menuProductosEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuProductosEliminarMouseEntered
        // TODO add your handling code here:
        menuProductosEliminar.setFont(new java.awt.Font("javanese Text", 3, 22));
        menuProductosEliminar.setBackground(new Color(0, 0, 196));
    }//GEN-LAST:event_menuProductosEliminarMouseEntered

    private void menuProductosEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuProductosEliminarMouseExited
        // TODO add your handling code here:
        menuProductosEliminar.setFont(new java.awt.Font("javanese Text", 1, 22));
        menuProductosEliminar.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_menuProductosEliminarMouseExited

    private void menuProductosBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuProductosBuscarMouseEntered
        // TODO add your handling code here:
        menuProductosBuscar.setFont(new java.awt.Font("javanese Text", 3, 22));
        menuProductosBuscar.setBackground(new Color(0, 0, 196));

    }//GEN-LAST:event_menuProductosBuscarMouseEntered

    private void menuProductosBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuProductosBuscarMouseExited
        // TODO add your handling code here:
        menuProductosBuscar.setFont(new java.awt.Font("javanese Text", 1, 22));
        menuProductosBuscar.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_menuProductosBuscarMouseExited

    private void menuProductosListadoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuProductosListadoMouseEntered
        // TODO add your handling code here:
        menuProductosListado.setFont(new java.awt.Font("javanese Text", 3, 22));
        menuProductosListado.setBackground(new Color(0, 0, 196));
    }//GEN-LAST:event_menuProductosListadoMouseEntered

    private void menuProductosListadoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuProductosListadoMouseExited
        // TODO add your handling code here:
        menuProductosListado.setFont(new java.awt.Font("javanese Text", 1, 22));
        menuProductosListado.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_menuProductosListadoMouseExited

    private void menuProductosVolverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuProductosVolverMouseEntered
        // TODO add your handling code here:
        menuProductosVolver.setFont(new java.awt.Font("javanese Text", 3, 22));
        menuProductosVolver.setBackground(new Color(0, 0, 196));

    }//GEN-LAST:event_menuProductosVolverMouseEntered

    private void menuProductosVolverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuProductosVolverMouseExited
        // TODO add your handling code here:
        menuProductosVolver.setFont(new java.awt.Font("javanese Text", 1, 22));
        menuProductosVolver.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_menuProductosVolverMouseExited

    private void menuProductosRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuProductosRegistrarActionPerformed
        // TODO add your handling code here:
        registrarProductos nuevo = new registrarProductos();
        this.setVisible(false);
        nuevo.setVisible(true);
    }//GEN-LAST:event_menuProductosRegistrarActionPerformed

    private void menuProductosModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuProductosModificarActionPerformed
        // TODO add your handling code here:
        modificarProductos nuevo = new modificarProductos();
        this.setVisible(false);
        nuevo.setVisible(true);
    }//GEN-LAST:event_menuProductosModificarActionPerformed

    private void menuProductosEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuProductosEliminarActionPerformed
        // TODO add your handling code here:
        eliminarProductos nuevo = new eliminarProductos();
        this.setVisible(false);
        nuevo.setVisible(true);
    }//GEN-LAST:event_menuProductosEliminarActionPerformed

    private void menuProductosBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuProductosBuscarActionPerformed
        // TODO add your handling code here:
        consultaIndividualProductos nuevo = new consultaIndividualProductos();
        this.setVisible(false);
        nuevo.setVisible(true);
    }//GEN-LAST:event_menuProductosBuscarActionPerformed

    private void menuProductosListadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuProductosListadoActionPerformed
        // TODO add your handling code here:
        consultaGeneralProductos nuevo = new consultaGeneralProductos();
        this.setVisible(false);
        nuevo.setVisible(true);
    }//GEN-LAST:event_menuProductosListadoActionPerformed

    private void menuProductosVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuProductosVolverActionPerformed
        // TODO add your handling code here:
        menuPrincipal nuevo = new menuPrincipal();
        this.setVisible(false);
        nuevo.setVisible(true);
    }//GEN-LAST:event_menuProductosVolverActionPerformed

    private void menuProductosReporteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuProductosReporteMouseEntered
        // TODO add your handling code here:
        menuProductosReporte.setFont(new java.awt.Font("javanese Text", 3, 22));
        menuProductosReporte.setBackground(new Color(0, 0, 196));
    }//GEN-LAST:event_menuProductosReporteMouseEntered

    private void menuProductosReporteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuProductosReporteMouseExited
        // TODO add your handling code here:
        menuProductosReporte.setFont(new java.awt.Font("javanese Text", 1, 22));
        menuProductosReporte.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_menuProductosReporteMouseExited

    private void menuProductosReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuProductosReporteActionPerformed
        // TODO add your handling code here:
        try {
                ver(1);
            } catch(SQLException ex)  {
                Logger.getLogger(menuProductos.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_menuProductosReporteActionPerformed

    public void ver(int opc) throws SQLException {
        JasperReport jasperReport;
        JasperPrint jasperPrint = null;
        String path = "C:\\Users\\EMPEÑOS TINO\\Documents\\NetBeansProjects\\Proyecto_TBD\\src\\Reportes\\reporteProductos.jrxml";

        try {
            Conexion c = new Conexion();
            JasperReport report = JasperCompileManager.compileReport(path);
            JasperPrint print = JasperFillManager.fillReport(report, new HashMap(), Conexion.conectar());
            if (opc == 1)//si la opcion elegida fue 1, se invoca aL REPORTE
            {

                JasperViewer.viewReport(print, false);
            }

        } catch (JRException ex) {
            System.err.println("Error iReport: " + ex.getMessage());
        }
    }

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
            java.util.logging.Logger.getLogger(menuProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuProductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton menuProductosBuscar;
    private javax.swing.JPanel menuProductosCuerpo;
    private javax.swing.JButton menuProductosEliminar;
    private javax.swing.JPanel menuProductosEncabezado;
    private javax.swing.JButton menuProductosListado;
    private javax.swing.JButton menuProductosModificar;
    private javax.swing.JButton menuProductosRegistrar;
    private javax.swing.JButton menuProductosReporte;
    private javax.swing.JLabel menuProductosTitulo;
    private javax.swing.JButton menuProductosVolver;
    // End of variables declaration//GEN-END:variables
}