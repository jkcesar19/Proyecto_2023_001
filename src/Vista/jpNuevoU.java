package Vista;

import Dato.Clase.Usuario;
import Dato.TextPrompt;
import Negocio.UsuarioBo;
import static Vista.Dashboard.content;
import static Vista.jpUsuario.con;
import static Vista.jpUsuario.dir;
import static Vista.jpUsuario.dni;
import static Vista.jpUsuario.enca;
import static Vista.jpUsuario.est;
import static Vista.jpUsuario.estado;
import static Vista.jpUsuario.id;
import static Vista.jpUsuario.nom;
import static Vista.jpUsuario.op;
import static Vista.jpUsuario.tel;
import static Vista.jpUsuario.usu;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 * @fecha: 31/12/2022
 * @author Llaguento Carlos Cesar Jk
 */
public class jpNuevoU extends javax.swing.JPanel {

    Usuario objUsiario = new Usuario();
    public static boolean pas = false;

    public jpNuevoU() {
        initComponents();
        this.plaseholder();
        this.activarcampo(estado);
        this.cargarlbl();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlabUsuarioR = new javax.swing.JLabel();
        jtexUsuario = new javax.swing.JTextField();
        jtexDireccion = new javax.swing.JTextField();
        jtexNombre = new javax.swing.JTextField();
        jtexDni = new javax.swing.JTextField();
        jtexTelefono = new javax.swing.JTextField();
        jtexContra = new javax.swing.JTextField();
        jComboBox = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        btn_volver = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btn_registrar = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1039, 520));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jlabUsuarioR.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jlabUsuarioR.setText("Nuevo registro de usuario");

        jtexUsuario.setBorder(null);

        jtexDireccion.setBorder(null);

        jtexNombre.setBorder(null);

        jtexDni.setBorder(null);

        jtexTelefono.setBorder(null);

        jtexContra.setBorder(null);

        jComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "activo", "inactivo" }));
        jComboBox.setBorder(null);

        jSeparator1.setBackground(new java.awt.Color(10, 95, 1));
        jSeparator1.setForeground(new java.awt.Color(0, 128, 0));

        jSeparator2.setBackground(new java.awt.Color(10, 95, 1));
        jSeparator2.setForeground(new java.awt.Color(0, 128, 0));

        jSeparator3.setBackground(new java.awt.Color(10, 95, 1));
        jSeparator3.setForeground(new java.awt.Color(0, 128, 0));

        jSeparator4.setBackground(new java.awt.Color(10, 95, 1));
        jSeparator4.setForeground(new java.awt.Color(0, 128, 0));

        jSeparator5.setBackground(new java.awt.Color(10, 95, 1));
        jSeparator5.setForeground(new java.awt.Color(0, 128, 0));

        jSeparator6.setBackground(new java.awt.Color(10, 95, 1));
        jSeparator6.setForeground(new java.awt.Color(0, 128, 0));

        btn_volver.setBackground(new java.awt.Color(10, 95, 1));
        btn_volver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_volverMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_volverMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_volverMousePressed(evt);
            }
        });
        btn_volver.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/panel/volver.png"))); // NOI18N
        jLabel2.setText("VOLVER");
        btn_volver.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -5, 200, 50));

        btn_registrar.setBackground(new java.awt.Color(10, 95, 1));
        btn_registrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_registrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_registrarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_registrarMousePressed(evt);
            }
        });
        btn_registrar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/panel/anadir.png"))); // NOI18N
        jLabel3.setText("REGISTRAR");
        btn_registrar.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, -5, 200, 50));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(btn_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jlabUsuarioR)
                        .addComponent(jtexNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 906, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 906, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtexDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 906, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 906, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jtexUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(31, 31, 31)
                            .addComponent(jtexContra, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(31, 31, 31)
                            .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jtexDni, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(70, 70, 70))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(68, 68, 68)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)
                                .addComponent(jtexTelefono)))))
                .addGap(94, 94, 94))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jlabUsuarioR)
                .addGap(45, 45, 45)
                .addComponent(jtexNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtexDni, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtexTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jtexDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtexUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtexContra, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(84, 84, 84))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 530));
    }// </editor-fold>//GEN-END:initComponents

    private void btn_registrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_registrarMouseEntered
        this.btn_registrar.setBackground(new Color(0, 128, 0));
    }//GEN-LAST:event_btn_registrarMouseEntered

    private void btn_registrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_registrarMouseExited
        this.btn_registrar.setBackground(new Color(10, 95, 1));
    }//GEN-LAST:event_btn_registrarMouseExited

    private void btn_registrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_registrarMousePressed
        switch (op) {
            case 'N':
                if (this.jtexNombre.getText().equals("") || this.jtexDni.getText().equals("")
                        || this.jtexTelefono.getText().equals("") || this.jtexDireccion.getText().equals("")
                        || this.jtexUsuario.getText().equals("") || this.jtexContra.getText().equals("")) {
                    javax.swing.JOptionPane.showMessageDialog(this, "Debe llenar todos los campos \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                    this.jtexNombre.requestFocus();
                } else {
                    this.registrar();
                }
                break;
            case 'M':
                this.modificar();
                break;
        }

    }//GEN-LAST:event_btn_registrarMousePressed

    private void btn_volverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_volverMouseEntered
        this.btn_volver.setBackground(new Color(0, 128, 0));
    }//GEN-LAST:event_btn_volverMouseEntered

    private void btn_volverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_volverMouseExited
        this.btn_volver.setBackground(new Color(10, 95, 1));
    }//GEN-LAST:event_btn_volverMouseExited

    private void btn_volverMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_volverMousePressed
       this.llamdo_panel_nuevo();
    }//GEN-LAST:event_btn_volverMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btn_registrar;
    private javax.swing.JPanel btn_volver;
    private javax.swing.JComboBox<String> jComboBox;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel jlabUsuarioR;
    private javax.swing.JTextField jtexContra;
    private javax.swing.JTextField jtexDireccion;
    private javax.swing.JTextField jtexDni;
    private javax.swing.JTextField jtexNombre;
    private javax.swing.JTextField jtexTelefono;
    private javax.swing.JTextField jtexUsuario;
    // End of variables declaration//GEN-END:variables
private void plaseholder() {
        TextPrompt prueba0 = new TextPrompt(" Ingrese los nombres del nuevo usuario", this.jtexNombre);
        TextPrompt prueba1 = new TextPrompt(" Ingrese el DNI", this.jtexDni);
        TextPrompt prueba2 = new TextPrompt(" Ingrese el teléfono", this.jtexTelefono);
        TextPrompt prueba3 = new TextPrompt(" Ingrese la dirección", this.jtexDireccion);
        TextPrompt prueba4 = new TextPrompt(" Ingrese el usuario", this.jtexUsuario);
        TextPrompt prueba5 = new TextPrompt(" Ingrese la Contraseña", this.jtexContra);
    }

    private void registrar() {
        this.cargar_obj();
        try {
            if (UsuarioBo.grabarUsuario(objUsiario)) {
                JOptionPane.showMessageDialog(null, "Se Registró Correctamente", "MENSAJE --> Usuario", JOptionPane.INFORMATION_MESSAGE);
                this.limpiarcampos();

            } else {
                JOptionPane.showMessageDialog(this, "No se pudo Registrar", "MENSAJE --> Usuario", JOptionPane.ERROR_MESSAGE);
                this.limpiarcampos();

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "MENSAJE --> Usuario", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void limpiarcampos() {
        this.jtexContra.setText("");
        this.jtexNombre.setText("");
        this.jtexDni.setText("");
        this.jtexDireccion.setText("");
        this.jtexUsuario.setText("");
        this.jtexTelefono.setText("");
        this.jComboBox.setSelectedIndex(0);
    }

    private void activarcampo(boolean b) {
        if (b == true) {
            this.jtexNombre.setText(nom);
            this.jtexDni.setText(dni);
            this.jtexDireccion.setText(dir);
            this.jtexContra.setText(con);
            this.jtexUsuario.setText(usu);
            this.jtexTelefono.setText(tel);
            this.jComboBox.setSelectedItem(est);
        } else {
            this.limpiarcampos();
        }

    }

    private void modificar() {  
        this.cargar_obj();
        try {
            if (UsuarioBo.modificarUsuario(objUsiario)) {
                JOptionPane.showMessageDialog(null, "Se Registró Correctamente", "MENSAJE --> Usuario", JOptionPane.INFORMATION_MESSAGE);
                this.llamdo_panel_nuevo();
                this.limpiarcampos();

            } else {
                JOptionPane.showMessageDialog(this, "No se pudo Registrar", "MENSAJE --> Usuario", JOptionPane.ERROR_MESSAGE);
                this.limpiarcampos();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "MENSAJE --> Usuario", JOptionPane.ERROR_MESSAGE);
        }

    }

    private void cargarlbl() {
        this.jlabUsuarioR.setText(enca);
    }

    private void cargar_obj() {
        objUsiario.setIdpersona(id);
        objUsiario.setNombre(this.jtexNombre.getText());
        objUsiario.setDni(this.jtexDni.getText());
        objUsiario.setDireccion(this.jtexDireccion.getText());
        objUsiario.setTelefono(this.jtexTelefono.getText());
        objUsiario.setUsuario(this.jtexUsuario.getText());
        objUsiario.setContra(this.jtexContra.getText());
        objUsiario.setEstado(this.jComboBox.getSelectedItem().toString()); 
    }

    private void llamdo_panel_nuevo() {
        pas = true;
        jpUsuario p1 = new jpUsuario();
        p1.setSize(1039, 520);
        p1.setLocation(0, 0);

        content.removeAll();
        content.add(p1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }

}
