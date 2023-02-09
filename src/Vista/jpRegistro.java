package Vista;

import Dato.ImplementacionDao.TablaDao;
import Dato.TextPrompt;
import Table.TableArchivoBo;
import static Vista.Dashboard.content;
import static Vista.jpNuevoU.pas;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 * @fecha: 01/02/2013
 * @author Llaguento Carlos Cesar Jk
 */
public class jpRegistro extends javax.swing.JPanel {
    
    TableArchivoBo tabl = new TableArchivoBo();
    TablaDao id_pdf = new TablaDao();
    public static int id = -1;
    public static char opR;
    
    public static int idp;
    public static String env;
    public static String des;
    public static String tit;
    public static String asu;
    public static String res;
    public static String esp;
    public static String est;
    
    public static String encab;
    
    public static boolean estad = false;
    
    public jpRegistro() {
        initComponents();
        this.cargarTabla();
        this.personalizarJtable();
        this.plaseholder();
        this.limpiarpase(pas);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_bucar = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btn_modificar = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btn_nuevo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btn_eliminar = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btn_imprimir = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePdf = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();

        setPreferredSize(new java.awt.Dimension(1039, 521));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1039, 521));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("REGISTRO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 29, -1, -1));

        txt_bucar.setBorder(null);
        jPanel1.add(txt_bucar, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 79, 820, 36));

        btn_buscar.setBackground(new java.awt.Color(10, 95, 1));
        btn_buscar.setPreferredSize(new java.awt.Dimension(121, 35));
        btn_buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_buscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_buscarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_buscarMousePressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/panel/buscar.png"))); // NOI18N
        jLabel6.setText("Buscar");

        javax.swing.GroupLayout btn_buscarLayout = new javax.swing.GroupLayout(btn_buscar);
        btn_buscar.setLayout(btn_buscarLayout);
        btn_buscarLayout.setHorizontalGroup(
            btn_buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
        );
        btn_buscarLayout.setVerticalGroup(
            btn_buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jPanel1.add(btn_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(886, 80, -1, -1));

        btn_modificar.setBackground(new java.awt.Color(10, 95, 1));
        btn_modificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_modificarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_modificarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_modificarMousePressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/panel/modificar.png"))); // NOI18N
        jLabel3.setText("Modificar");

        javax.swing.GroupLayout btn_modificarLayout = new javax.swing.GroupLayout(btn_modificar);
        btn_modificar.setLayout(btn_modificarLayout);
        btn_modificarLayout.setHorizontalGroup(
            btn_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
        );
        btn_modificarLayout.setVerticalGroup(
            btn_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jPanel1.add(btn_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(549, 466, -1, -1));

        btn_nuevo.setBackground(new java.awt.Color(10, 95, 1));
        btn_nuevo.setPreferredSize(new java.awt.Dimension(121, 35));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/panel/nuevo.png"))); // NOI18N
        jLabel2.setText("Nuevo");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });

        javax.swing.GroupLayout btn_nuevoLayout = new javax.swing.GroupLayout(btn_nuevo);
        btn_nuevo.setLayout(btn_nuevoLayout);
        btn_nuevoLayout.setHorizontalGroup(
            btn_nuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
        );
        btn_nuevoLayout.setVerticalGroup(
            btn_nuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jPanel1.add(btn_nuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(382, 466, -1, -1));

        btn_eliminar.setBackground(new java.awt.Color(10, 95, 1));
        btn_eliminar.setPreferredSize(new java.awt.Dimension(121, 35));
        btn_eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_eliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_eliminarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_eliminarMousePressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/panel/eliminar.png"))); // NOI18N
        jLabel4.setText("Eliminar");

        javax.swing.GroupLayout btn_eliminarLayout = new javax.swing.GroupLayout(btn_eliminar);
        btn_eliminar.setLayout(btn_eliminarLayout);
        btn_eliminarLayout.setHorizontalGroup(
            btn_eliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
        );
        btn_eliminarLayout.setVerticalGroup(
            btn_eliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jPanel1.add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(719, 466, -1, -1));

        btn_imprimir.setBackground(new java.awt.Color(10, 95, 1));
        btn_imprimir.setPreferredSize(new java.awt.Dimension(121, 35));
        btn_imprimir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_imprimirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_imprimirMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_imprimirMousePressed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/panel/imprimir.png"))); // NOI18N
        jLabel5.setText("Imprimir");

        javax.swing.GroupLayout btn_imprimirLayout = new javax.swing.GroupLayout(btn_imprimir);
        btn_imprimir.setLayout(btn_imprimirLayout);
        btn_imprimirLayout.setHorizontalGroup(
            btn_imprimirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
        );
        btn_imprimirLayout.setVerticalGroup(
            btn_imprimirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jPanel1.add(btn_imprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(886, 466, -1, -1));

        jTablePdf.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9"
            }
        ));
        jTablePdf.setShowVerticalLines(false);
        jTablePdf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePdfMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTablePdfMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTablePdf);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 143, 953, 284));

        jSeparator1.setBackground(new java.awt.Color(10, 95, 1));
        jSeparator1.setForeground(new java.awt.Color(0, 128, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 820, 10));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 520));
    }// </editor-fold>//GEN-END:initComponents

    private void jTablePdfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePdfMouseClicked
        this.ejecutar_pdf(evt);

    }//GEN-LAST:event_jTablePdfMouseClicked

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        this.btn_nuevo.setBackground(new Color(0, 128, 0));
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        this.btn_nuevo.setBackground(new Color(10, 95, 1));
    }//GEN-LAST:event_jLabel2MouseExited

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        opR = 'N';
        encab = "NUEVO ARCHIVO AL REGISTRO";
        jpNuevoR p1 = new jpNuevoR();
        p1.setSize(1039, 520);
        p1.setLocation(0, 0);
        
        content.removeAll();
        content.add(p1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_jLabel2MousePressed

    private void jTablePdfMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePdfMousePressed
        try {
            int index = this.jTablePdf.getSelectedRow();
            idp = Integer.parseInt(this.jTablePdf.getValueAt(index, 0).toString());
            env = this.jTablePdf.getValueAt(index, 1).toString();
            des = this.jTablePdf.getValueAt(index, 2).toString();
            tit = this.jTablePdf.getValueAt(index, 3).toString();
            asu = this.jTablePdf.getValueAt(index, 4).toString();
            res = this.jTablePdf.getValueAt(index, 5).toString();
            esp = this.jTablePdf.getValueAt(index, 6).toString();
            est = this.jTablePdf.getValueAt(index, 7).toString();
        } catch (Exception e) {
            
        }
        
    }//GEN-LAST:event_jTablePdfMousePressed

    private void btn_modificarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_modificarMouseEntered
        this.btn_modificar.setBackground(new Color(0, 128, 0));
    }//GEN-LAST:event_btn_modificarMouseEntered

    private void btn_modificarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_modificarMouseExited
        this.btn_modificar.setBackground(new Color(10, 95, 1));
    }//GEN-LAST:event_btn_modificarMouseExited

    private void btn_modificarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_modificarMousePressed
        if (tit != "") {
            try {
                id_pdf.obtener_pdf(idp);
                opR = 'M';
                encab = "MODIFICAR UN REGISTRO DEL ARCHIVO";
                estad = true;
                
                jpNuevoR p1 = new jpNuevoR();
                p1.setSize(1039, 520);
                p1.setLocation(0, 0);
                
                content.removeAll();
                content.add(p1, BorderLayout.CENTER);
                content.revalidate();
                content.repaint();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error " + e);
            }
            
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione el archivo",
                    "REGISTRO", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btn_modificarMousePressed

    private void btn_eliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_eliminarMouseEntered
        this.btn_eliminar.setBackground(new Color(0, 128, 0));
    }//GEN-LAST:event_btn_eliminarMouseEntered

    private void btn_eliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_eliminarMouseExited
        this.btn_eliminar.setBackground(new Color(10, 95, 1));
    }//GEN-LAST:event_btn_eliminarMouseExited

    private void btn_eliminarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_eliminarMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_eliminarMousePressed

    private void btn_imprimirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_imprimirMouseEntered
        this.btn_imprimir.setBackground(new Color(0, 128, 0));
    }//GEN-LAST:event_btn_imprimirMouseEntered

    private void btn_imprimirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_imprimirMouseExited
        this.btn_imprimir.setBackground(new Color(10, 95, 1));
    }//GEN-LAST:event_btn_imprimirMouseExited

    private void btn_imprimirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_imprimirMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_imprimirMousePressed

    private void btn_buscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_buscarMouseEntered
        this.btn_buscar.setBackground(new Color(0, 128, 0));
    }//GEN-LAST:event_btn_buscarMouseEntered

    private void btn_buscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_buscarMouseExited
        this.btn_buscar.setBackground(new Color(10, 95, 1));
    }//GEN-LAST:event_btn_buscarMouseExited

    private void btn_buscarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_buscarMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_buscarMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btn_buscar;
    private javax.swing.JPanel btn_eliminar;
    private javax.swing.JPanel btn_imprimir;
    private javax.swing.JPanel btn_modificar;
    private javax.swing.JPanel btn_nuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTablePdf;
    private javax.swing.JTextField txt_bucar;
    // End of variables declaration//GEN-END:variables

    private void cargarTabla() {
        this.tabl.visualizar_pdf(jTablePdf);
    }
    
    private void personalizarJtable() {
        this.jTablePdf.getTableHeader().setFont(new Font("Cesar", Font.PLAIN, 12));
        this.jTablePdf.getTableHeader().setOpaque(false);
        this.jTablePdf.getTableHeader().setBackground(new Color(255, 255, 255));
        this.jTablePdf.getTableHeader().setForeground(Color.BLACK);
        
        this.jTablePdf.getColumnModel().getColumn(0).setMinWidth(30);
        this.jTablePdf.getColumnModel().getColumn(0).setMaxWidth(30);
        
        this.jTablePdf.getColumnModel().getColumn(6).setMinWidth(80);
        this.jTablePdf.getColumnModel().getColumn(6).setMaxWidth(80);
        
        this.jTablePdf.getColumnModel().getColumn(7).setMinWidth(60);
        this.jTablePdf.getColumnModel().getColumn(7).setMaxWidth(60);
        
        this.jTablePdf.getColumnModel().getColumn(8).setMinWidth(50);
        this.jTablePdf.getColumnModel().getColumn(8).setMaxWidth(50);
    }
    
    private void ejecutar_pdf(MouseEvent evt) {
        int column = this.jTablePdf.getColumnModel().getColumnIndexAtX(evt.getX());
        int row = evt.getY() / this.jTablePdf.getRowHeight();
        
        if (row < this.jTablePdf.getRowCount() && row >= 0 && column < this.jTablePdf.getColumnCount() && column >= 0) {
            id = (int) this.jTablePdf.getValueAt(row, 0);
            Object value = this.jTablePdf.getValueAt(row, column);
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
                String name = "" + this.jTablePdf.getValueAt(row, 1);
                txt_bucar.setText(name);
            }
        }
    }
    
    private void plaseholder() {
        TextPrompt prueba = new TextPrompt(" Ingrese el nombre de usuario a buscar", this.txt_bucar);
    }

    private void limpiarpase(boolean pas) {
       id = 0;
       env = "";
       des = "";
       tit = "";
       asu = "";
       res = "";
       esp = "";
       est = "";
    }
    
}
