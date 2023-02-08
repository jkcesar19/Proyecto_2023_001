package Vista;

import Dato.Clase.Usuario;
import Dato.TextPrompt;
import Negocio.UsuarioBo;
import static Vista.Dashboard.content;
import static Vista.jpNuevoU.pas;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 * @fecha: 30 - 12 - 2022
 * @author: Llaguento Carlos Jk Cesar
 */
public class jpUsuario extends javax.swing.JPanel {

    private DefaultTableModel UsuarioTableModel;
    Usuario oUsuario = new Usuario();
    private int index;
    public static int id;
    public static String nom;
    public static String dni;
    public static String dir;
    public static String tel;
    public static String usu;
    public static String con;
    public static String est;
    public static boolean estado = false;
    public static char op;
    public static String enca;

    public jpUsuario() {
        initComponents();
        loadTableUser();
        plaseholder();
        limpiarpase(pas);
        personalizarJtable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtableUsuario = new javax.swing.JTable();
        jtexBuscar = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btn_eliminar = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btn_modificar = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btn_nuevo = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btn_imprimir = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setPreferredSize(new java.awt.Dimension(1039, 521));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1039, 520));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("USUARIO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 31, -1, -1));

        jtableUsuario.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jtableUsuario.setForeground(new java.awt.Color(51, 51, 51));
        jtableUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Dirección", "Teléfono", "Usuario", "Contraseña", "Estado"
            }
        ));
        jtableUsuario.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jtableUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtableUsuarioMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jtableUsuario);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 121, 955, 331));

        jtexBuscar.setBorder(null);
        jPanel1.add(jtexBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 69, 837, 34));

        btn_buscar.setBackground(new java.awt.Color(10, 95, 1));
        btn_buscar.setPreferredSize(new java.awt.Dimension(100, 34));
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
        btn_buscar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/panel/buscar.png"))); // NOI18N
        jLabel5.setText("Buscar");
        btn_buscar.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 30));

        jPanel1.add(btn_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(897, 69, -1, -1));

        btn_eliminar.setBackground(new java.awt.Color(10, 95, 1));
        btn_eliminar.setPreferredSize(new java.awt.Dimension(100, 34));
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
        btn_eliminar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/panel/eliminar.png"))); // NOI18N
        jLabel7.setText("Eliminar");
        btn_eliminar.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, -4, 110, 40));

        jPanel1.add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(768, 470, -1, -1));

        btn_modificar.setBackground(new java.awt.Color(10, 95, 1));
        btn_modificar.setPreferredSize(new java.awt.Dimension(100, 34));
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
        btn_modificar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/panel/modificar.png"))); // NOI18N
        jLabel6.setText("Modificar");
        btn_modificar.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 30));

        jPanel1.add(btn_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(636, 470, -1, -1));

        btn_nuevo.setBackground(new java.awt.Color(10, 95, 1));
        btn_nuevo.setPreferredSize(new java.awt.Dimension(100, 34));
        btn_nuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_nuevoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_nuevoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_nuevoMousePressed(evt);
            }
        });
        btn_nuevo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/panel/nuevo.png"))); // NOI18N
        jLabel4.setText("Nuevo");
        btn_nuevo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 30));

        jPanel1.add(btn_nuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(488, 470, -1, -1));

        btn_imprimir.setBackground(new java.awt.Color(10, 95, 1));
        btn_imprimir.setPreferredSize(new java.awt.Dimension(100, 34));
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
        btn_imprimir.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/panel/imprimir.png"))); // NOI18N
        jLabel3.setText("Imprimir");
        btn_imprimir.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 30));

        jPanel1.add(btn_imprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 470, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(10, 95, 1));
        jSeparator1.setForeground(new java.awt.Color(0, 128, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 840, 10));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, 0, 1039, 520));
    }// </editor-fold>//GEN-END:initComponents

    private void btn_nuevoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_nuevoMouseEntered
        this.btn_nuevo.setBackground(new Color(0, 128, 0));
    }//GEN-LAST:event_btn_nuevoMouseEntered

    private void btn_nuevoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_nuevoMouseExited
        this.btn_nuevo.setBackground(new Color(10, 95, 1));
    }//GEN-LAST:event_btn_nuevoMouseExited

    private void btn_nuevoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_nuevoMousePressed
        op = 'N';
        enca = "REGISTRO NUEVO USUARIO";
        jpNuevoU p1 = new jpNuevoU();
        p1.setSize(1039, 520);
        p1.setLocation(0, 0);

        content.removeAll();
        content.add(p1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();

    }//GEN-LAST:event_btn_nuevoMousePressed

    private void jtableUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtableUsuarioMousePressed
        try {
            index = this.jtableUsuario.getSelectedRow();
            id = Integer.parseInt(this.jtableUsuario.getValueAt(index, 0).toString());
            nom = this.jtableUsuario.getValueAt(index, 1).toString();
            dni = this.jtableUsuario.getValueAt(index, 2).toString();
            dir = this.jtableUsuario.getValueAt(index, 3).toString();
            tel = this.jtableUsuario.getValueAt(index, 4).toString();
            usu = this.jtableUsuario.getValueAt(index, 5).toString();
            con = this.jtableUsuario.getValueAt(index, 6).toString();
            est = this.jtableUsuario.getValueAt(index, 7).toString();
        } catch (Exception e) {

        }
    }//GEN-LAST:event_jtableUsuarioMousePressed

    private void btn_modificarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_modificarMouseEntered
        this.btn_modificar.setBackground(new Color(0, 128, 0));
    }//GEN-LAST:event_btn_modificarMouseEntered

    private void btn_modificarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_modificarMouseExited
        this.btn_modificar.setBackground(new Color(10, 95, 1));
    }//GEN-LAST:event_btn_modificarMouseExited

    private void btn_modificarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_modificarMousePressed
        if (nom != " ") {
            try {
                op = 'M';
                 enca = "MODIFICAR UN USUARIO";
                estado = true;

                jpNuevoU p1 = new jpNuevoU();
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
            JOptionPane.showMessageDialog(this, "Seleccione el usuario",
                    "TRABAJADOR", JOptionPane.WARNING_MESSAGE);
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jtableUsuario;
    private javax.swing.JTextField jtexBuscar;
    // End of variables declaration//GEN-END:variables

    private void loadTableUser() {
        try {
            TableColumn columna;
            this.UsuarioTableModel = UsuarioBo.ListaTable();
            this.jtableUsuario.setModel(this.UsuarioTableModel);
//            setAnchoColumnas();
            columna = this.jtableUsuario.getColumnModel().getColumn(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void plaseholder() {
        TextPrompt prueba = new TextPrompt(" Ingrese el nombre de usuario a buscar", this.jtexBuscar);
    }

    private void limpiarpase(boolean b) {
        if (b == true) {
            id = 0;
            nom = " ";
            dni = " ";
            dir = " ";
            est = " ";
            usu = " ";
            con = " ";
            tel = " ";
        }
    }

    private void personalizarJtable() {
        this.jtableUsuario.getTableHeader().setFont(new Font("Cesar", Font.PLAIN, 12));
        this.jtableUsuario.getTableHeader().setOpaque(false);
        this.jtableUsuario.getTableHeader().setBackground(new Color(255, 255, 255));
        this.jtableUsuario.getTableHeader().setForeground(Color.BLACK);

        this.jtableUsuario.getColumnModel().getColumn(0).setMinWidth(30);
        this.jtableUsuario.getColumnModel().getColumn(0).setMaxWidth(30);
        
        this.jtableUsuario.getColumnModel().getColumn(2).setMinWidth(80);
        this.jtableUsuario.getColumnModel().getColumn(2).setMaxWidth(80);

        this.jtableUsuario.getColumnModel().getColumn(4).setMinWidth(80);
        this.jtableUsuario.getColumnModel().getColumn(4).setMaxWidth(80);

        this.jtableUsuario.getColumnModel().getColumn(5).setMinWidth(60);
        this.jtableUsuario.getColumnModel().getColumn(5).setMaxWidth(60);

        this.jtableUsuario.getColumnModel().getColumn(6).setMinWidth(70);
        this.jtableUsuario.getColumnModel().getColumn(6).setMaxWidth(70);

        this.jtableUsuario.getColumnModel().getColumn(7).setMinWidth(60);
        this.jtableUsuario.getColumnModel().getColumn(7).setMaxWidth(60);
    }
}
