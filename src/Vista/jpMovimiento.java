/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Dato.ImplementacionDao.TablaDao;
import Table.TableArchivoBo;
import Table.ColorTabla;
import static Vista.jpRegistro.id;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.event.MouseEvent;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 * @fecha: 05 - 01 - 2023
 * @author llaguento Carlos Cesar Jk
 */
public class jpMovimiento extends javax.swing.JPanel {

    TableArchivoBo tabl = new TableArchivoBo();

    public jpMovimiento() {
        initComponents();

        cargar_tabla();
//          jTableEntrada.setDefaultRenderer(Object.class, new ColorTabla());
        colorPersonalizarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEntrada = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTableEntrada.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableEntrada.setFocusable(false);
        jTableEntrada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableEntradaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableEntrada);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("BANDEJA DE ENTRADA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 979, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1039, 514));
    }// </editor-fold>//GEN-END:initComponents

    private void jTableEntradaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableEntradaMouseClicked
        this.clic_tabla(evt);
    }//GEN-LAST:event_jTableEntradaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableEntrada;
    // End of variables declaration//GEN-END:variables

    private void cargar_tabla() {
        this.tabl.visualizar_pdf(jTableEntrada);
    }

    private void colorPersonalizarTabla() {
        ColorTabla col = new ColorTabla();
        this.jTableEntrada.getTableHeader().setBackground(new Color(255, 255, 255));
        this.jTableEntrada.getTableHeader().setForeground(Color.BLACK);

        this.jTableEntrada.getColumnModel().getColumn(0).setMinWidth(30);
        this.jTableEntrada.getColumnModel().getColumn(0).setMaxWidth(30);

        this.jTableEntrada.getColumnModel().getColumn(6).setMinWidth(80);
        this.jTableEntrada.getColumnModel().getColumn(6).setMaxWidth(80);

        this.jTableEntrada.getColumnModel().getColumn(7).setMinWidth(60);
        this.jTableEntrada.getColumnModel().getColumn(7).setMaxWidth(60);

        this.jTableEntrada.getColumnModel().getColumn(8).setMinWidth(50);
        this.jTableEntrada.getColumnModel().getColumn(8).setMaxWidth(50);

        for (int i = 0; i < this.jTableEntrada.getColumnCount() - 1; i++) {
            this.jTableEntrada.getColumnModel().getColumn(i).setCellRenderer(col);
        }
    }

    private void clic_tabla(MouseEvent evt) {
        int column = this.jTableEntrada.getColumnModel().getColumnIndexAtX(evt.getX());
        int row = evt.getY() / this.jTableEntrada.getRowHeight();

        if (row < this.jTableEntrada.getRowCount() && row >= 0 && column < this.jTableEntrada.getColumnCount() && column >= 0) {
            id = (int) this.jTableEntrada.getValueAt(row, 0);
            Object value = this.jTableEntrada.getValueAt(row, column);
            if (value instanceof JButton) {
                ((JButton) value).doClick();
                JButton boton = (JButton) value;

                if (boton.getText().equals("Vacio")) {
                    JOptionPane.showMessageDialog(null, "No hay archivo");
                } else {
                    try {
                        TablaDao pd = new TablaDao();
                        pd.ejecutar_pdf(id);
                        Desktop.getDesktop().open(new File("new.pdf"));
                    } catch (Exception ex) {
                    }
                }

            } else {
                String name = "" + this.jTableEntrada.getValueAt(row, 1);

            }
        }
    }
}
