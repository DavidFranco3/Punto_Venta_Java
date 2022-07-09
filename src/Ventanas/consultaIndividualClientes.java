/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Clases.Conexion;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author David Franco
 */
public class consultaIndividualClientes extends javax.swing.JFrame {

    String id, queryotro;
    Conexion bd;
    Statement s;
    ResultSet res;

    /**
     * Creates new form consultaIndividualClientes
     */
    public consultaIndividualClientes() {

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

        consultaIndividualClientesEncabezado = new javax.swing.JPanel();
        consultaIndividualClientesTitulo = new javax.swing.JLabel();
        consultaIndividualClientesCuerpo = new javax.swing.JPanel();
        consultaIndividualClientesID = new javax.swing.JLabel();
        consultaIndividualClientesNombre = new javax.swing.JLabel();
        consultaIndividualClientesApellidoPaterno = new javax.swing.JLabel();
        consultaIndividualClientesApellidoMaterno = new javax.swing.JLabel();
        consultaIndividualClientesSexo = new javax.swing.JLabel();
        consultaIndividualClientesEscribirID = new javax.swing.JTextField();
        consultaIndividualClientesEscribirNombre = new javax.swing.JTextField();
        consultaIndividualClientesEscribirApellidoPaterno = new javax.swing.JTextField();
        consultaIndividualClientesEscribirApellidoMaterno = new javax.swing.JTextField();
        consultaIndividualClientesBotonBuscar = new javax.swing.JButton();
        consultaIndividualClientesEscribirSexo = new javax.swing.JComboBox<String>();
        consultaIndividualClientesPie = new javax.swing.JPanel();
        consultaIndividualClientesBotonSalir = new javax.swing.JButton();
        consultaIndividualClientesBotonLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        consultaIndividualClientesEncabezado.setBackground(new java.awt.Color(0, 0, 0));
        consultaIndividualClientesEncabezado.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        consultaIndividualClientesTitulo.setBackground(new java.awt.Color(0, 0, 0));
        consultaIndividualClientesTitulo.setFont(new java.awt.Font("Javanese Text", 1, 26)); // NOI18N
        consultaIndividualClientesTitulo.setForeground(new java.awt.Color(255, 255, 255));
        consultaIndividualClientesTitulo.setText("Buscar clientes");
        consultaIndividualClientesTitulo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout consultaIndividualClientesEncabezadoLayout = new javax.swing.GroupLayout(consultaIndividualClientesEncabezado);
        consultaIndividualClientesEncabezado.setLayout(consultaIndividualClientesEncabezadoLayout);
        consultaIndividualClientesEncabezadoLayout.setHorizontalGroup(
            consultaIndividualClientesEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(consultaIndividualClientesEncabezadoLayout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(consultaIndividualClientesTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        consultaIndividualClientesEncabezadoLayout.setVerticalGroup(
            consultaIndividualClientesEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, consultaIndividualClientesEncabezadoLayout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(consultaIndividualClientesTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        consultaIndividualClientesCuerpo.setBackground(new java.awt.Color(0, 0, 0));
        consultaIndividualClientesCuerpo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        consultaIndividualClientesID.setBackground(new java.awt.Color(0, 0, 0));
        consultaIndividualClientesID.setFont(new java.awt.Font("Javanese Text", 1, 14)); // NOI18N
        consultaIndividualClientesID.setForeground(new java.awt.Color(255, 255, 255));
        consultaIndividualClientesID.setText("ID del cliente");
        consultaIndividualClientesID.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        consultaIndividualClientesNombre.setBackground(new java.awt.Color(0, 0, 0));
        consultaIndividualClientesNombre.setFont(new java.awt.Font("Javanese Text", 1, 14)); // NOI18N
        consultaIndividualClientesNombre.setForeground(new java.awt.Color(255, 255, 255));
        consultaIndividualClientesNombre.setText("Nombre");
        consultaIndividualClientesNombre.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        consultaIndividualClientesApellidoPaterno.setBackground(new java.awt.Color(0, 0, 0));
        consultaIndividualClientesApellidoPaterno.setFont(new java.awt.Font("Javanese Text", 1, 14)); // NOI18N
        consultaIndividualClientesApellidoPaterno.setForeground(new java.awt.Color(255, 255, 255));
        consultaIndividualClientesApellidoPaterno.setText("Apellido Paterno");
        consultaIndividualClientesApellidoPaterno.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        consultaIndividualClientesApellidoMaterno.setBackground(new java.awt.Color(0, 0, 0));
        consultaIndividualClientesApellidoMaterno.setFont(new java.awt.Font("Javanese Text", 1, 14)); // NOI18N
        consultaIndividualClientesApellidoMaterno.setForeground(new java.awt.Color(255, 255, 255));
        consultaIndividualClientesApellidoMaterno.setText("Apellido Materno");
        consultaIndividualClientesApellidoMaterno.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        consultaIndividualClientesSexo.setBackground(new java.awt.Color(0, 0, 0));
        consultaIndividualClientesSexo.setFont(new java.awt.Font("Javanese Text", 1, 14)); // NOI18N
        consultaIndividualClientesSexo.setForeground(new java.awt.Color(255, 255, 255));
        consultaIndividualClientesSexo.setText("Sexo");
        consultaIndividualClientesSexo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        consultaIndividualClientesEscribirID.setFont(new java.awt.Font("Javanese Text", 1, 14)); // NOI18N
        consultaIndividualClientesEscribirID.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        consultaIndividualClientesEscribirID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                resaltarConsultaIndividualClientesID(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                restaurarConsultaIndividualClientesID(evt);
            }
        });
        consultaIndividualClientesEscribirID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                verificiarConsultaIndividualClientesID(evt);
            }
        });

        consultaIndividualClientesEscribirNombre.setFont(new java.awt.Font("Javanese Text", 1, 14)); // NOI18N
        consultaIndividualClientesEscribirNombre.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        consultaIndividualClientesEscribirNombre.setEnabled(false);

        consultaIndividualClientesEscribirApellidoPaterno.setFont(new java.awt.Font("Javanese Text", 1, 14)); // NOI18N
        consultaIndividualClientesEscribirApellidoPaterno.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        consultaIndividualClientesEscribirApellidoPaterno.setEnabled(false);

        consultaIndividualClientesEscribirApellidoMaterno.setFont(new java.awt.Font("Javanese Text", 1, 14)); // NOI18N
        consultaIndividualClientesEscribirApellidoMaterno.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        consultaIndividualClientesEscribirApellidoMaterno.setEnabled(false);

        consultaIndividualClientesBotonBuscar.setBackground(new java.awt.Color(255, 255, 255));
        consultaIndividualClientesBotonBuscar.setFont(new java.awt.Font("Javanese Text", 1, 14)); // NOI18N
        consultaIndividualClientesBotonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Buscar.jpg"))); // NOI18N
        consultaIndividualClientesBotonBuscar.setText("Buscar");
        consultaIndividualClientesBotonBuscar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        consultaIndividualClientesBotonBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                consultaIndividualClientesBotonBuscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                consultaIndividualClientesBotonBuscarMouseExited(evt);
            }
        });
        consultaIndividualClientesBotonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaIndividualClientesBotonBuscarActionPerformed(evt);
            }
        });

        consultaIndividualClientesEscribirSexo.setBackground(new java.awt.Color(255, 255, 255));
        consultaIndividualClientesEscribirSexo.setFont(new java.awt.Font("Javanese Text", 1, 14)); // NOI18N
        consultaIndividualClientesEscribirSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Elegir el sexo", "Masculino", "Femenino" }));
        consultaIndividualClientesEscribirSexo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        consultaIndividualClientesEscribirSexo.setEnabled(false);

        javax.swing.GroupLayout consultaIndividualClientesCuerpoLayout = new javax.swing.GroupLayout(consultaIndividualClientesCuerpo);
        consultaIndividualClientesCuerpo.setLayout(consultaIndividualClientesCuerpoLayout);
        consultaIndividualClientesCuerpoLayout.setHorizontalGroup(
            consultaIndividualClientesCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(consultaIndividualClientesCuerpoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(consultaIndividualClientesCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(consultaIndividualClientesCuerpoLayout.createSequentialGroup()
                        .addComponent(consultaIndividualClientesSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(consultaIndividualClientesEscribirSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(consultaIndividualClientesCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, consultaIndividualClientesCuerpoLayout.createSequentialGroup()
                            .addComponent(consultaIndividualClientesNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(consultaIndividualClientesEscribirNombre))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, consultaIndividualClientesCuerpoLayout.createSequentialGroup()
                            .addComponent(consultaIndividualClientesID)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(consultaIndividualClientesEscribirID, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, consultaIndividualClientesCuerpoLayout.createSequentialGroup()
                            .addGroup(consultaIndividualClientesCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(consultaIndividualClientesApellidoPaterno)
                                .addComponent(consultaIndividualClientesApellidoMaterno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(consultaIndividualClientesCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(consultaIndividualClientesEscribirApellidoPaterno)
                                .addComponent(consultaIndividualClientesEscribirApellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(consultaIndividualClientesBotonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        consultaIndividualClientesCuerpoLayout.setVerticalGroup(
            consultaIndividualClientesCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(consultaIndividualClientesCuerpoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(consultaIndividualClientesCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(consultaIndividualClientesID)
                    .addComponent(consultaIndividualClientesEscribirID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(consultaIndividualClientesBotonBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(consultaIndividualClientesCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(consultaIndividualClientesNombre)
                    .addComponent(consultaIndividualClientesEscribirNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(consultaIndividualClientesCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(consultaIndividualClientesApellidoPaterno)
                    .addComponent(consultaIndividualClientesEscribirApellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(consultaIndividualClientesCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(consultaIndividualClientesApellidoMaterno)
                    .addComponent(consultaIndividualClientesEscribirApellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(consultaIndividualClientesCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(consultaIndividualClientesSexo)
                    .addComponent(consultaIndividualClientesEscribirSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(122, 122, 122))
        );

        consultaIndividualClientesPie.setBackground(new java.awt.Color(0, 0, 0));
        consultaIndividualClientesPie.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        consultaIndividualClientesPie.setForeground(new java.awt.Color(255, 255, 255));

        consultaIndividualClientesBotonSalir.setBackground(new java.awt.Color(255, 255, 255));
        consultaIndividualClientesBotonSalir.setFont(new java.awt.Font("Javanese Text", 1, 14)); // NOI18N
        consultaIndividualClientesBotonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Salir.jpg"))); // NOI18N
        consultaIndividualClientesBotonSalir.setText("Salir");
        consultaIndividualClientesBotonSalir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        consultaIndividualClientesBotonSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                consultaIndividualClientesBotonSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                consultaIndividualClientesBotonSalirMouseExited(evt);
            }
        });
        consultaIndividualClientesBotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaIndividualClientesBotonSalirActionPerformed(evt);
            }
        });

        consultaIndividualClientesBotonLimpiar.setBackground(new java.awt.Color(255, 255, 255));
        consultaIndividualClientesBotonLimpiar.setFont(new java.awt.Font("Javanese Text", 1, 14)); // NOI18N
        consultaIndividualClientesBotonLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Limpiar.jpg"))); // NOI18N
        consultaIndividualClientesBotonLimpiar.setText("Limpiar");
        consultaIndividualClientesBotonLimpiar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        consultaIndividualClientesBotonLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                consultaIndividualClientesBotonLimpiarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                consultaIndividualClientesBotonLimpiarMouseExited(evt);
            }
        });
        consultaIndividualClientesBotonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaIndividualClientesBotonLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout consultaIndividualClientesPieLayout = new javax.swing.GroupLayout(consultaIndividualClientesPie);
        consultaIndividualClientesPie.setLayout(consultaIndividualClientesPieLayout);
        consultaIndividualClientesPieLayout.setHorizontalGroup(
            consultaIndividualClientesPieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(consultaIndividualClientesPieLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(consultaIndividualClientesBotonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(consultaIndividualClientesBotonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        consultaIndividualClientesPieLayout.setVerticalGroup(
            consultaIndividualClientesPieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(consultaIndividualClientesPieLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(consultaIndividualClientesPieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(consultaIndividualClientesBotonSalir)
                    .addComponent(consultaIndividualClientesBotonLimpiar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(consultaIndividualClientesPie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(consultaIndividualClientesCuerpo, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(consultaIndividualClientesEncabezado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(consultaIndividualClientesEncabezado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(consultaIndividualClientesCuerpo, javax.swing.GroupLayout.PREFERRED_SIZE, 269, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(consultaIndividualClientesPie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void consultaIndividualClientesBotonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaIndividualClientesBotonLimpiarActionPerformed
        // TODO add your handling code here:
        consultaIndividualClientesEscribirID.setText(null);
        consultaIndividualClientesEscribirNombre.setText(null);
        consultaIndividualClientesEscribirApellidoPaterno.setText(null);
        consultaIndividualClientesEscribirApellidoMaterno.setText(null);
        consultaIndividualClientesEscribirSexo.setSelectedIndex(0);
        
        consultaIndividualClientesEscribirID.requestFocus();
    }//GEN-LAST:event_consultaIndividualClientesBotonLimpiarActionPerformed

    private void consultaIndividualClientesBotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaIndividualClientesBotonSalirActionPerformed
        // TODO add your handling code here:
        menuClientes nuevo = new menuClientes();
        this.setVisible(false);
        nuevo.setVisible(true);
    }//GEN-LAST:event_consultaIndividualClientesBotonSalirActionPerformed

    private void resaltarConsultaIndividualClientesID(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_resaltarConsultaIndividualClientesID
        // TODO add your handling code here:
        consultaIndividualClientesID.setFont(new java.awt.Font("javanese Text", 3, 14));
        consultaIndividualClientesEscribirID.setBackground(new Color(0, 0, 196));
    }//GEN-LAST:event_resaltarConsultaIndividualClientesID

    private void restaurarConsultaIndividualClientesID(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_restaurarConsultaIndividualClientesID
        // TODO add your handling code here:
        consultaIndividualClientesID.setFont(new java.awt.Font("javanese Text", 1, 14));
        consultaIndividualClientesEscribirID.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_restaurarConsultaIndividualClientesID

    private void consultaIndividualClientesBotonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaIndividualClientesBotonBuscarActionPerformed
        // TODO add your handling code here:
        id = consultaIndividualClientesEscribirID.getText().toString();

        if (id.length() == 0) {
            JOptionPane.showMessageDialog(null, "Por favor ingresa un ID");
            consultaIndividualClientesEscribirID.requestFocus();
        } else {

            try {
                bd = new Conexion();
                s = null;
                s = Conexion.conectar().createStatement();
                queryotro = "select * from clientes where ID_cliente='" + id + "';";
                res = bd.resultado(queryotro);

                if (res.next()) {

                    consultaIndividualClientesEscribirNombre.setText(res.getString("nombre"));
                    consultaIndividualClientesEscribirApellidoPaterno.setText(res.getString("apellido_paterno"));
                    consultaIndividualClientesEscribirApellidoMaterno.setText(res.getString("apellido_materno"));
                    consultaIndividualClientesEscribirSexo.setSelectedItem(res.getString("sexo"));

                    consultaIndividualClientesEscribirID.requestFocus();
                    bd.cerrar();
                } else {

                    JOptionPane.showMessageDialog(null, "el cliente no existe");
                    consultaIndividualClientesEscribirID.setText(null);
                    consultaIndividualClientesEscribirID.requestFocus();
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Se ah generado un error," + e);
            }
        }
    }//GEN-LAST:event_consultaIndividualClientesBotonBuscarActionPerformed

    private void verificiarConsultaIndividualClientesID(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_verificiarConsultaIndividualClientesID
        // TODO add your handling code here:
        char caracter = evt.getKeyChar();

        if ((caracter < '0' || caracter > '9' && caracter != 'C')) {

            evt.consume();
        } else if (consultaIndividualClientesEscribirID.getText().length() >= 20) {

            evt.consume();
        }
    }//GEN-LAST:event_verificiarConsultaIndividualClientesID

    private void consultaIndividualClientesBotonBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consultaIndividualClientesBotonBuscarMouseEntered
        // TODO add your handling code here:
        consultaIndividualClientesBotonBuscar.setFont(new java.awt.Font("javanese Text", 3, 14));
        consultaIndividualClientesBotonBuscar.setBackground(new Color(0, 0, 196));
    }//GEN-LAST:event_consultaIndividualClientesBotonBuscarMouseEntered

    private void consultaIndividualClientesBotonBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consultaIndividualClientesBotonBuscarMouseExited
        // TODO add your handling code here:
        consultaIndividualClientesBotonBuscar.setFont(new java.awt.Font("javanese Text", 1, 14));
        consultaIndividualClientesBotonBuscar.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_consultaIndividualClientesBotonBuscarMouseExited

    private void consultaIndividualClientesBotonLimpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consultaIndividualClientesBotonLimpiarMouseEntered
        // TODO add your handling code here:
        consultaIndividualClientesBotonLimpiar.setFont(new java.awt.Font("javanese Text", 3, 14));
        consultaIndividualClientesBotonLimpiar.setBackground(new Color(0, 0, 196));
    }//GEN-LAST:event_consultaIndividualClientesBotonLimpiarMouseEntered

    private void consultaIndividualClientesBotonLimpiarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consultaIndividualClientesBotonLimpiarMouseExited
        // TODO add your handling code here:
        consultaIndividualClientesBotonLimpiar.setFont(new java.awt.Font("javanese Text", 1, 14));
        consultaIndividualClientesBotonLimpiar.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_consultaIndividualClientesBotonLimpiarMouseExited

    private void consultaIndividualClientesBotonSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consultaIndividualClientesBotonSalirMouseEntered
        // TODO add your handling code here:
        consultaIndividualClientesBotonSalir.setFont(new java.awt.Font("javanese Text", 3, 14));
        consultaIndividualClientesBotonSalir.setBackground(new Color(0, 0, 196));
    }//GEN-LAST:event_consultaIndividualClientesBotonSalirMouseEntered

    private void consultaIndividualClientesBotonSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consultaIndividualClientesBotonSalirMouseExited
        // TODO add your handling code here:
        consultaIndividualClientesBotonSalir.setFont(new java.awt.Font("javanese Text", 1, 14));
        consultaIndividualClientesBotonSalir.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_consultaIndividualClientesBotonSalirMouseExited

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
            java.util.logging.Logger.getLogger(consultaIndividualClientes.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(consultaIndividualClientes.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(consultaIndividualClientes.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(consultaIndividualClientes.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new consultaIndividualClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel consultaIndividualClientesApellidoMaterno;
    private javax.swing.JLabel consultaIndividualClientesApellidoPaterno;
    private javax.swing.JButton consultaIndividualClientesBotonBuscar;
    private javax.swing.JButton consultaIndividualClientesBotonLimpiar;
    private javax.swing.JButton consultaIndividualClientesBotonSalir;
    private javax.swing.JPanel consultaIndividualClientesCuerpo;
    private javax.swing.JPanel consultaIndividualClientesEncabezado;
    private javax.swing.JTextField consultaIndividualClientesEscribirApellidoMaterno;
    private javax.swing.JTextField consultaIndividualClientesEscribirApellidoPaterno;
    private javax.swing.JTextField consultaIndividualClientesEscribirID;
    private javax.swing.JTextField consultaIndividualClientesEscribirNombre;
    private javax.swing.JComboBox<String> consultaIndividualClientesEscribirSexo;
    private javax.swing.JLabel consultaIndividualClientesID;
    private javax.swing.JLabel consultaIndividualClientesNombre;
    private javax.swing.JPanel consultaIndividualClientesPie;
    private javax.swing.JLabel consultaIndividualClientesSexo;
    private javax.swing.JLabel consultaIndividualClientesTitulo;
    // End of variables declaration//GEN-END:variables
}