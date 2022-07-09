/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Clases.Conexion;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class consultaGeneralCompras extends javax.swing.JFrame {

    String datos[] = new String[4];
    String query;
    Conexion bd;
    Statement s;
    ResultSet res;

    /**
     * Creates new form consultaGeneralCompras
     */
    public consultaGeneralCompras() {
        initComponents();
    }
    int bandera = 0;
    DefaultTableModel modelo = new DefaultTableModel();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        consultaGeneralComprasEncabezado = new javax.swing.JPanel();
        consultaGeneralComprasTitulo = new javax.swing.JLabel();
        consultaGeneralComprasCuerpo = new javax.swing.JPanel();
        consultaGeneralProductosScrollPane = new javax.swing.JScrollPane();
        consultaGeneralComprasTabla = new javax.swing.JTable();
        consultaGeneralComprasPie = new javax.swing.JPanel();
        consultaGeneralComprasBotonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                activarVentanaConsultaGeneralCompras(evt);
            }
        });

        consultaGeneralComprasEncabezado.setBackground(new java.awt.Color(0, 0, 0));
        consultaGeneralComprasEncabezado.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        consultaGeneralComprasTitulo.setBackground(new java.awt.Color(0, 0, 0));
        consultaGeneralComprasTitulo.setFont(new java.awt.Font("Javanese Text", 1, 26)); // NOI18N
        consultaGeneralComprasTitulo.setForeground(new java.awt.Color(255, 255, 255));
        consultaGeneralComprasTitulo.setText("Lista de compras");

        javax.swing.GroupLayout consultaGeneralComprasEncabezadoLayout = new javax.swing.GroupLayout(consultaGeneralComprasEncabezado);
        consultaGeneralComprasEncabezado.setLayout(consultaGeneralComprasEncabezadoLayout);
        consultaGeneralComprasEncabezadoLayout.setHorizontalGroup(
            consultaGeneralComprasEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(consultaGeneralComprasEncabezadoLayout.createSequentialGroup()
                .addGap(286, 286, 286)
                .addComponent(consultaGeneralComprasTitulo)
                .addContainerGap(339, Short.MAX_VALUE))
        );
        consultaGeneralComprasEncabezadoLayout.setVerticalGroup(
            consultaGeneralComprasEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, consultaGeneralComprasEncabezadoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(consultaGeneralComprasTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        consultaGeneralComprasCuerpo.setBackground(new java.awt.Color(0, 0, 0));
        consultaGeneralComprasCuerpo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        consultaGeneralComprasTabla.setBackground(new java.awt.Color(0, 0, 0));
        consultaGeneralComprasTabla.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        consultaGeneralComprasTabla.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        consultaGeneralComprasTabla.setForeground(new java.awt.Color(255, 255, 255));
        consultaGeneralComprasTabla.setModel(new javax.swing.table.DefaultTableModel(
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
        consultaGeneralComprasTabla.setEnabled(false);
        consultaGeneralComprasTabla.setGridColor(new java.awt.Color(255, 255, 255));
        consultaGeneralProductosScrollPane.setViewportView(consultaGeneralComprasTabla);

        javax.swing.GroupLayout consultaGeneralComprasCuerpoLayout = new javax.swing.GroupLayout(consultaGeneralComprasCuerpo);
        consultaGeneralComprasCuerpo.setLayout(consultaGeneralComprasCuerpoLayout);
        consultaGeneralComprasCuerpoLayout.setHorizontalGroup(
            consultaGeneralComprasCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(consultaGeneralComprasCuerpoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(consultaGeneralProductosScrollPane)
                .addContainerGap())
        );
        consultaGeneralComprasCuerpoLayout.setVerticalGroup(
            consultaGeneralComprasCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(consultaGeneralComprasCuerpoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(consultaGeneralProductosScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        consultaGeneralComprasPie.setBackground(new java.awt.Color(0, 0, 0));
        consultaGeneralComprasPie.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        consultaGeneralComprasPie.setForeground(new java.awt.Color(255, 255, 255));

        consultaGeneralComprasBotonSalir.setBackground(new java.awt.Color(255, 255, 255));
        consultaGeneralComprasBotonSalir.setFont(new java.awt.Font("Javanese Text", 1, 14)); // NOI18N
        consultaGeneralComprasBotonSalir.setForeground(new java.awt.Color(0, 0, 0));
        consultaGeneralComprasBotonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Salir.jpg"))); // NOI18N
        consultaGeneralComprasBotonSalir.setText("Salir");
        consultaGeneralComprasBotonSalir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        consultaGeneralComprasBotonSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                consultaGeneralComprasBotonSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                consultaGeneralComprasBotonSalirMouseExited(evt);
            }
        });
        consultaGeneralComprasBotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaGeneralComprasBotonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout consultaGeneralComprasPieLayout = new javax.swing.GroupLayout(consultaGeneralComprasPie);
        consultaGeneralComprasPie.setLayout(consultaGeneralComprasPieLayout);
        consultaGeneralComprasPieLayout.setHorizontalGroup(
            consultaGeneralComprasPieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(consultaGeneralComprasPieLayout.createSequentialGroup()
                .addGap(376, 376, 376)
                .addComponent(consultaGeneralComprasBotonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        consultaGeneralComprasPieLayout.setVerticalGroup(
            consultaGeneralComprasPieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(consultaGeneralComprasPieLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(consultaGeneralComprasBotonSalir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(consultaGeneralComprasEncabezado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(consultaGeneralComprasCuerpo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(consultaGeneralComprasPie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(consultaGeneralComprasEncabezado, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(consultaGeneralComprasCuerpo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(consultaGeneralComprasPie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void consultaGeneralComprasBotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaGeneralComprasBotonSalirActionPerformed
        // TODO add your handling code here:
        menuCompras nuevo = new menuCompras();
        this.setVisible(false);
        nuevo.setVisible(true);
    }//GEN-LAST:event_consultaGeneralComprasBotonSalirActionPerformed

    public void cargarTabla() {
        modelo.addColumn("Compra");
        modelo.addColumn("Fecha");
        modelo.addColumn("Proveedor");
        modelo.addColumn("Total");

        consultaGeneralComprasTabla.setModel(modelo);

        query = "select c.id_compra, c.dia_compra, c.mes_compra, c.año_compra, p.empresa, c.total from compras c join proveedores p on c.id_proveedor=p.id_proveedor";

        try {

            bd = new Conexion();
            s = null;
            s = Conexion.conectar().createStatement();
            res = s.executeQuery(query);
            while (res.next()) {
                datos[0] = res.getString("ID_compra");
                datos[1] = res.getString("dia_compra") + "/" + res.getString("mes_compra") + "/" + res.getString("año_compra");
                datos[2] = res.getString("empresa");
                datos[3] = "$" + res.getString("total");
                modelo.addRow(datos);
            }

            consultaGeneralComprasTabla.setModel(modelo);

        } catch (Exception e) {

        }
    }

    private void activarVentanaConsultaGeneralCompras(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_activarVentanaConsultaGeneralCompras
        // TODO add your handling code here:
        if (bandera == 0) {
            cargarTabla();
            bandera = 1;
        }
    }//GEN-LAST:event_activarVentanaConsultaGeneralCompras

    private void consultaGeneralComprasBotonSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consultaGeneralComprasBotonSalirMouseEntered
        // TODO add your handling code here:
        consultaGeneralComprasBotonSalir.setFont(new java.awt.Font("javanese Text", 3, 14));
        consultaGeneralComprasBotonSalir.setBackground(new Color(0, 0, 196));
    }//GEN-LAST:event_consultaGeneralComprasBotonSalirMouseEntered

    private void consultaGeneralComprasBotonSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consultaGeneralComprasBotonSalirMouseExited
        // TODO add your handling code here:
        consultaGeneralComprasBotonSalir.setFont(new java.awt.Font("javanese Text", 1, 14));
        consultaGeneralComprasBotonSalir.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_consultaGeneralComprasBotonSalirMouseExited

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
            java.util.logging.Logger.getLogger(consultaGeneralCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(consultaGeneralCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(consultaGeneralCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(consultaGeneralCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new consultaGeneralCompras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton consultaGeneralComprasBotonSalir;
    private javax.swing.JPanel consultaGeneralComprasCuerpo;
    private javax.swing.JPanel consultaGeneralComprasEncabezado;
    private javax.swing.JPanel consultaGeneralComprasPie;
    private javax.swing.JTable consultaGeneralComprasTabla;
    private javax.swing.JLabel consultaGeneralComprasTitulo;
    private javax.swing.JScrollPane consultaGeneralProductosScrollPane;
    // End of variables declaration//GEN-END:variables
}