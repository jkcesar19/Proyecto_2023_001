package Vista;

import Dato.Clase.Usuario;
import Dato.TextPrompt;
import Negocio.UsuarioBo;
import static Vista.Dashboard.content;
import static Vista.Dashboard.foto;
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
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
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
        btn_img = new javax.swing.JPanel();
        jlImagen = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jlabUsuarioR = new javax.swing.JLabel();
        btn_volver = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btn_registrar = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jtexNombre = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jtexDni = new javax.swing.JTextField();
        jtexTelefono = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jtexDireccion = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jtexUsuario = new javax.swing.JTextField();
        jtexContra = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jComboBox = new javax.swing.JComboBox<>();

        setPreferredSize(new java.awt.Dimension(1039, 520));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_img.setBackground(new java.awt.Color(255, 255, 255));
        btn_img.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 51)));
        btn_img.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_imgMousePressed(evt);
            }
        });

        jlImagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/foto.png"))); // NOI18N

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Click para seleccionar imagen");

        javax.swing.GroupLayout btn_imgLayout = new javax.swing.GroupLayout(btn_img);
        btn_img.setLayout(btn_imgLayout);
        btn_imgLayout.setHorizontalGroup(
            btn_imgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_imgLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btn_imgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                    .addComponent(jlImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        btn_imgLayout.setVerticalGroup(
            btn_imgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_imgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlImagen, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(btn_img, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 90, 250, 290));

        jlabUsuarioR.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jlabUsuarioR.setText("Nuevo registro de usuario");
        jPanel1.add(jlabUsuarioR, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 40, -1, -1));

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

        jPanel1.add(btn_volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(517, 406, -1, 40));

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

        jPanel1.add(btn_registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(755, 406, 200, 40));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jtexNombre.setBorder(null);

        jSeparator1.setBackground(new java.awt.Color(10, 95, 1));
        jSeparator1.setForeground(new java.awt.Color(0, 128, 0));

        jtexDni.setBorder(null);

        jtexTelefono.setBorder(null);

        jSeparator2.setBackground(new java.awt.Color(10, 95, 1));
        jSeparator2.setForeground(new java.awt.Color(0, 128, 0));

        jSeparator3.setBackground(new java.awt.Color(10, 95, 1));
        jSeparator3.setForeground(new java.awt.Color(0, 128, 0));

        jtexDireccion.setBorder(null);

        jSeparator4.setBackground(new java.awt.Color(10, 95, 1));
        jSeparator4.setForeground(new java.awt.Color(0, 128, 0));

        jtexUsuario.setBorder(null);

        jtexContra.setBorder(null);

        jSeparator5.setBackground(new java.awt.Color(10, 95, 1));
        jSeparator5.setForeground(new java.awt.Color(0, 128, 0));

        jSeparator6.setBackground(new java.awt.Color(10, 95, 1));
        jSeparator6.setForeground(new java.awt.Color(0, 128, 0));

        jComboBox.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "activo", "inactivo" }));
        jComboBox.setBorder(null);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtexDireccion)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtexDni, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(jSeparator2))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtexTelefono)
                            .addComponent(jSeparator3)))
                    .addComponent(jtexNombre)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtexUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                            .addComponent(jSeparator5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator6, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                            .addComponent(jtexContra))
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1)
                    .addComponent(jSeparator4))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtexNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtexDni, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtexTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtexDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtexUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtexContra, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 680, 300));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1039, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
        );
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

    private void btn_imgMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_imgMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_imgMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btn_img;
    private javax.swing.JPanel btn_registrar;
    private javax.swing.JPanel btn_volver;
    private javax.swing.JComboBox<String> jComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel jlImagen;
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
            ImageIcon imagen = new ImageIcon("src/Img/"+foto);
            Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(226,248, Image.SCALE_DEFAULT));
            jlImagen.setIcon(icono);    

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
