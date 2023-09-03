package obj_mi_primera_aplicacion_cs;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

public class Form_Empleado extends javax.swing.JFrame {

    /**
     * Creates new form Form_Cliente
     */
    ImageIcon icono = new ImageIcon("src/Imagenes/Logo_4.png");
    boolean boolea = true;

    public Form_Empleado() {
        initComponents();
        this.setIconImage(icono.getImage());
        this.setTitle("Love - Empleados");
        this.setLocationRelativeTo(null);
        this.Mostar(tbl_empleado, "select * from empleado;");
        btn_cancelar.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        txt_id_empleado = new javax.swing.JTextField();
        txt_mensaje = new javax.swing.JTextField();
        btn_nuevo = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_empleado = new javax.swing.JTable();
        txt_direccion = new javax.swing.JTextField();
        btn_enviar = new javax.swing.JButton();
        lbl_apellidos = new javax.swing.JLabel();
        lbl_nombres = new javax.swing.JLabel();
        btn_actualizar = new javax.swing.JButton();
        txt_cargo = new javax.swing.JTextField();
        lbl_cargo = new javax.swing.JLabel();
        btn_eliminar = new javax.swing.JButton();
        txt_nombres = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        lbl_direccion = new javax.swing.JLabel();
        txt_apellidos = new javax.swing.JTextField();
        lbl_telefono = new javax.swing.JLabel();
        lbl_id_cliente = new javax.swing.JLabel();
        btn_cancelar = new javax.swing.JButton();
        btn_volver = new javax.swing.JButton();
        btn_factura = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txt_id_empleado.setEditable(false);
        txt_id_empleado.setBackground(new java.awt.Color(255, 255, 255));

        btn_nuevo.setBackground(new java.awt.Color(230, 230, 230));
        btn_nuevo.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btn_nuevo.setText("Nuevo");
        btn_nuevo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_nuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevoActionPerformed(evt);
            }
        });

        tbl_empleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID_EMPLEADO", "NOMBRES", "APELLIDOS", "DIRECCION", "TELEFONO", "CARGO"
            }
        ));
        tbl_empleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_empleadoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_empleado);

        btn_enviar.setBackground(new java.awt.Color(230, 230, 230));
        btn_enviar.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btn_enviar.setText("Enviar");
        btn_enviar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_enviar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_enviarActionPerformed(evt);
            }
        });

        lbl_apellidos.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lbl_apellidos.setText("Apellidos:");

        lbl_nombres.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lbl_nombres.setText("Nombres:");

        btn_actualizar.setBackground(new java.awt.Color(230, 230, 230));
        btn_actualizar.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btn_actualizar.setText("Actualizar");
        btn_actualizar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_actualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });

        txt_cargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cargoActionPerformed(evt);
            }
        });

        lbl_cargo.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lbl_cargo.setText("Cargo:");

        btn_eliminar.setBackground(new java.awt.Color(230, 230, 230));
        btn_eliminar.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btn_eliminar.setText("Eliminar");
        btn_eliminar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        lbl_direccion.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lbl_direccion.setText("Direccion:");

        lbl_telefono.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lbl_telefono.setText("Telefono:");

        lbl_id_cliente.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lbl_id_cliente.setText("Id_Empleado:");

        btn_cancelar.setBackground(new java.awt.Color(230, 230, 230));
        btn_cancelar.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btn_cancelar.setText("Cancelar");
        btn_cancelar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        btn_volver.setBackground(new java.awt.Color(230, 230, 230));
        btn_volver.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btn_volver.setText("Menu");
        btn_volver.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_volver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_volverActionPerformed(evt);
            }
        });

        btn_factura.setBackground(new java.awt.Color(230, 230, 230));
        btn_factura.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btn_factura.setText("Factura");
        btn_factura.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_factura.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_factura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_facturaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lbl_telefono)
                                .addGap(69, 69, 69)
                                .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lbl_cargo)
                                .addGap(86, 86, 86)
                                .addComponent(txt_cargo, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lbl_nombres)
                                .addGap(68, 68, 68)
                                .addComponent(txt_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lbl_apellidos)
                                .addGap(66, 66, 66)
                                .addComponent(txt_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lbl_direccion)
                                .addGap(65, 65, 65)
                                .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lbl_id_cliente)
                                .addGap(42, 42, 42)
                                .addComponent(txt_id_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_enviar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btn_factura, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lbl_id_cliente))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_id_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_volver)))
                .addGap(7, 7, 7)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(lbl_nombres))
                            .addComponent(txt_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lbl_apellidos))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(txt_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lbl_direccion))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lbl_telefono))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(lbl_cargo))
                            .addComponent(txt_cargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btn_factura)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(btn_nuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_enviar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_eliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_actualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_cancelar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(txt_mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 710, 440));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/op_2.1.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, -4, 750, 490));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbl_empleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_empleadoMouseClicked
        // TODO add your handling code here:
        //this.MouseClick();
    }//GEN-LAST:event_tbl_empleadoMouseClicked

    private void btn_enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_enviarActionPerformed
        // TODO add your handling code here:
        this.Enviar();
    }//GEN-LAST:event_btn_enviarActionPerformed

    private void btn_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevoActionPerformed
          if (txt_id_empleado.getText().equals("")) {
            this.Nuevo();
          }
    }//GEN-LAST:event_btn_nuevoActionPerformed

    private void txt_cargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cargoActionPerformed

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
        // TODO add your handling code here:
        actualizar();
    }//GEN-LAST:event_btn_actualizarActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        // TODO add your handling code here:
        cancelar();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volverActionPerformed
        // TODO add your handling code here:
        try {
            Form_Menu m = new Form_Menu();
            m.setVisible(true);
            this.setVisible(false);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btn_volverActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        // TODO add your handling code here:
        eliminar();
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_facturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_facturaActionPerformed
        // TODO add your handling code here:
        try {
            Form_Factura f = new Form_Factura();
            f.setVisible(true);
            this.setVisible(false);
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_btn_facturaActionPerformed

    private void Nuevo() {
        try {
            Empleado_Bens cb = new Empleado_Bens();
            Texto_2(cb);
            this.Mostar(tbl_empleado, "select * from empleado;");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error " + e.toString());
        }
    }

    private void Enviar() {
        try {
            Empleado_Bens cb = new Empleado_Bens();
            cb.setId_empleado(Integer.parseInt(txt_id_empleado.getText()));
            cb.setNombres(txt_nombres.getText());
            cb.setApellidos(txt_apellidos.getText());
            cb.setDireccion(txt_direccion.getText());
            cb.setTelefono(txt_telefono.getText());
            cb.setCargo(txt_cargo.getText());
            cb.Insertar_Empleado();
            this.Mostar(tbl_empleado, "select * from empleado;");
            JOptionPane.showMessageDialog(null, "La informacion ha sido registrada con exito...");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error " + e.toString());
        }
    }

    private void Mostar(javax.swing.JTable jt, String sql) {
        try {
            Empleado_Bens cb = new Empleado_Bens();
            ResultSet rs;
            DefaultTableModel modelo = new DefaultTableModel();
            jt.setModel(modelo);
            rs = cb.Consultar_Tabla(sql);
            ResultSetMetaData rsmd;
            rsmd = rs.getMetaData();
            int cantcolumnas = rsmd.getColumnCount();
            for (int i = 1; i <= cantcolumnas; i++) {
                modelo.addColumn(rsmd.getColumnLabel(i));
            }
            while (rs.next()) {
                Object[] columna = new Object[cantcolumnas];
                for (int i = 0; i < cantcolumnas; i++) {
                    columna[i] = rs.getObject(i + 1);
                }
                modelo.addRow(columna);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error " + e.toString());
        }
    }

    public void botones(boolean x) {
        btn_factura.setEnabled(x);
        btn_volver.setEnabled(x);
        btn_eliminar.setEnabled(x);
        btn_enviar.setEnabled(x);
        btn_nuevo.setEnabled(x);
    }

    public void botones_2(boolean x) {
        btn_factura.setEnabled(x);
        btn_volver.setEnabled(x);
        btn_actualizar.setEnabled(x);
        btn_enviar.setEnabled(x);
        btn_nuevo.setEnabled(x);
    }

    public void Texto(ResultSet rs) {
        try {
            txt_id_empleado.setText(rs.getString("id_empleado"));
            txt_nombres.setText(rs.getString("nombres"));
            txt_apellidos.setText(rs.getString("apellidos"));
            txt_direccion.setText(rs.getString("direccion"));
            txt_cargo.setText(rs.getString("cargo"));
            txt_telefono.setText(rs.getString("telefono"));
        } catch (Exception e) {
        }
    }

    public void Texto_2(Empleado_Bens em) {
        try {
            txt_id_empleado.setText("" + em.Incremento_Empleado());
            txt_nombres.setText("");
            txt_apellidos.setText("");
            txt_direccion.setText("");
            txt_cargo.setText("");
            txt_telefono.setText("");
            txt_mensaje.setText("");
        } catch (Exception e) {
        }
    }

    public void actualizar() {
        try {
            Empleado_Bens em = new Empleado_Bens();
            if (boolea) {
                String texto = JOptionPane.showInputDialog("Ingrese el identificador del empleado que quiere actualizar: ");
                ResultSet rs = em.Consultar_Tabla("select * from empleado where id_empleado = " + texto + ";");
                if (rs.next()) {
                    botones(false);
                    Texto(rs);
                    JOptionPane.showMessageDialog(null, "Modifique los datos que quiere actualizar...");
                    txt_mensaje.setText("Modifique los datos que quiere actualizar...");
                    boolea = false;
                    btn_cancelar.setEnabled(true);
                }
            } else {
                em.Actualizar_Empleado(Integer.parseInt(txt_id_empleado.getText()), txt_nombres.getText(), txt_apellidos.getText(), txt_direccion.getText(), txt_telefono.getText(), txt_cargo.getText());
                botones(true);
                Texto_2(em);
                boolea = true;
                this.Mostar(tbl_empleado, "select * from empleado;");
                btn_cancelar.setEnabled(false);
            }
        } catch (Exception e) {
        }
    }

    public void cancelar() {
        try {
            Empleado_Bens em = new Empleado_Bens();
            Texto_2(em);
            botones(true);
            btn_actualizar.setEnabled(true);
            btn_cancelar.setEnabled(false);
            boolea = true;
        } catch (Exception ex) {
        }
    }

    public void eliminar() {
        try {
            Empleado_Bens em = new Empleado_Bens();
            if (boolea) {
                String texto = JOptionPane.showInputDialog("Ingrese el identificador del empleado que quiere eliminar: ");
                ResultSet rs = em.Consultar_Tabla("select * from empleado where id_empleado = " + texto + ";");
                if (rs.next()) {
                    botones_2(false);
                    Texto(rs);
                    JOptionPane.showMessageDialog(null, "Esta es la persona que desea eliminar...");
                    txt_mensaje.setText("Esta es la persona que desea eliminar...");
                    boolea = false;
                    btn_cancelar.setEnabled(true);
                }
            } else {
                em.Eliminar_Empleado(Integer.parseInt(txt_id_empleado.getText()));
                botones_2(true);
                Texto_2(em);
                boolea = true;
                this.Mostar(tbl_empleado, "select * from empleado;");
                btn_cancelar.setEnabled(false);
            }
        } catch (Exception ex) {
        }
    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_enviar;
    private javax.swing.JButton btn_factura;
    private javax.swing.JButton btn_nuevo;
    private javax.swing.JButton btn_volver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_apellidos;
    private javax.swing.JLabel lbl_cargo;
    private javax.swing.JLabel lbl_direccion;
    private javax.swing.JLabel lbl_id_cliente;
    private javax.swing.JLabel lbl_nombres;
    private javax.swing.JLabel lbl_telefono;
    private javax.swing.JTable tbl_empleado;
    private javax.swing.JTextField txt_apellidos;
    private javax.swing.JTextField txt_cargo;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_id_empleado;
    private javax.swing.JTextField txt_mensaje;
    private javax.swing.JTextField txt_nombres;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}
