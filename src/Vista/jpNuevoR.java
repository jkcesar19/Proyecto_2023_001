package Vista;

import Dato.Clase.Archivo;
import Dato.TextPrompt;
import Negocio.ArchivoBo;
import static Vista.Dashboard.content;
import static Vista.Dashboard.usuaa;
import static Vista.jpRegistro.asu;
import static Vista.jpRegistro.des;
import static Vista.jpRegistro.encab;
import static Vista.jpRegistro.esp;
import static Vista.jpRegistro.estad;
import static Vista.jpRegistro.idp;
import static Vista.jpRegistro.opR;
import static Vista.jpRegistro.res;
import static Vista.jpRegistro.tit;
import static Vista.jpUsuario.est;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.io.File;
import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * @fecha: 03/01/2023
 * @author Llaguento Carlos Cesar JK
 */
public class jpNuevoR extends javax.swing.JPanel {

    private DefaultComboBoxModel ComboModel;
    private DefaultComboBoxModel ComboModel1;

    private String destino = "C:\\appjava\\archivos\\";
    private String ruta_archivo = "";
    public static boolean pase = false;

    Archivo objArchivoPdf = new Archivo();

    public jpNuevoR() {
        initComponents();
        this.plaseholder();
        this.cargarCombo();
        this.cargarCombo1();
        this.cargarlbl();
        this.cargarTex(estad);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblEncabezado = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        txtAsunto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResumen = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jComboBoxPersona = new javax.swing.JComboBox<>();
        jComboBoxEstado = new javax.swing.JComboBox<>();
        jComboBoxPrioridad = new javax.swing.JComboBox<>();
        btn_regresar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btn_guardar = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btn_archivo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jlArchivo = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1039, 521));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblEncabezado.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblEncabezado.setText("NUEVO REGISTRO DE ARCHIVO PDF");
        jPanel1.add(lblEncabezado, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 22, -1, -1));

        txtTitulo.setBorder(null);
        jPanel1.add(txtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 72, 950, 32));

        txtAsunto.setBorder(null);
        jPanel1.add(txtAsunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 130, 950, 32));

        txtResumen.setColumns(20);
        txtResumen.setLineWrap(true);
        txtResumen.setRows(5);
        txtResumen.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txtResumen);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 188, 950, 108));

        jSeparator1.setBackground(new java.awt.Color(10, 95, 1));
        jSeparator1.setForeground(new java.awt.Color(0, 128, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 302, 950, 10));

        jSeparator2.setBackground(new java.awt.Color(10, 95, 1));
        jSeparator2.setForeground(new java.awt.Color(0, 128, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 166, 950, 10));

        jSeparator3.setBackground(new java.awt.Color(10, 95, 1));
        jSeparator3.setForeground(new java.awt.Color(0, 128, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 108, 950, 10));

        jComboBoxPersona.setBackground(new java.awt.Color(255, 255, 255));
        jComboBoxPersona.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBoxPersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 324, 273, 34));

        jComboBoxEstado.setBackground(new java.awt.Color(255, 255, 255));
        jComboBoxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "activo", "inactivo" }));
        jPanel1.add(jComboBoxEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 324, 123, 34));

        jComboBoxPrioridad.setBackground(new java.awt.Color(255, 255, 255));
        jComboBoxPrioridad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBoxPrioridad, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 324, 151, 34));

        btn_regresar.setBackground(new java.awt.Color(10, 95, 1));
        btn_regresar.setPreferredSize(new java.awt.Dimension(244, 42));
        btn_regresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_regresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_regresarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_regresarMousePressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/panel/volver.png"))); // NOI18N
        jLabel2.setText("Volver");

        javax.swing.GroupLayout btn_regresarLayout = new javax.swing.GroupLayout(btn_regresar);
        btn_regresar.setLayout(btn_regresarLayout);
        btn_regresarLayout.setHorizontalGroup(
            btn_regresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
        );
        btn_regresarLayout.setVerticalGroup(
            btn_regresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        jPanel1.add(btn_regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 436, -1, -1));

        btn_guardar.setBackground(new java.awt.Color(10, 95, 1));
        btn_guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_guardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_guardarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_guardarMousePressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/panel/modificar.png"))); // NOI18N
        jLabel3.setText("Registrar");

        javax.swing.GroupLayout btn_guardarLayout = new javax.swing.GroupLayout(btn_guardar);
        btn_guardar.setLayout(btn_guardarLayout);
        btn_guardarLayout.setHorizontalGroup(
            btn_guardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
        );
        btn_guardarLayout.setVerticalGroup(
            btn_guardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        jPanel1.add(btn_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(739, 436, 240, -1));

        btn_archivo.setBackground(new java.awt.Color(255, 255, 255));
        btn_archivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_archivoMousePressed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/word.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/excel.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/power.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/pdf.png"))); // NOI18N

        jlArchivo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout btn_archivoLayout = new javax.swing.GroupLayout(btn_archivo);
        btn_archivo.setLayout(btn_archivoLayout);
        btn_archivoLayout.setHorizontalGroup(
            btn_archivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_archivoLayout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(15, 15, 15)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(52, 52, 52))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_archivoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlArchivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        btn_archivoLayout.setVerticalGroup(
            btn_archivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_archivoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btn_archivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlArchivo, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(btn_archivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 310, 310, 80));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 520));
    }// </editor-fold>//GEN-END:initComponents

    private void btn_guardarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_guardarMousePressed
        switch (opR) {
            case 'N':
                if (this.txtTitulo.getText().equals("") || this.txtAsunto.getText().equals("")
                        || this.txtResumen.getText().equals("") || this.jlArchivo.getText().equals("")) {
                    javax.swing.JOptionPane.showMessageDialog(this, "Debe llenar todos los campos \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                    this.txtTitulo.requestFocus();
                } else {
                    this.registrar();
                }
                break;
            case 'M':
                this.modificar();
                break;
        }
    }//GEN-LAST:event_btn_guardarMousePressed

    private void btn_guardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_guardarMouseEntered
        this.btn_guardar.setBackground(new Color(0, 128, 0));
    }//GEN-LAST:event_btn_guardarMouseEntered

    private void btn_guardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_guardarMouseExited
        this.btn_guardar.setBackground(new Color(10, 95, 1));
    }//GEN-LAST:event_btn_guardarMouseExited

    private void btn_regresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_regresarMouseEntered
        this.btn_regresar.setBackground(new Color(0, 128, 0));
    }//GEN-LAST:event_btn_regresarMouseEntered

    private void btn_regresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_regresarMouseExited
        this.btn_regresar.setBackground(new Color(10, 95, 1));
    }//GEN-LAST:event_btn_regresarMouseExited

    private void btn_regresarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_regresarMousePressed
        this.llamdo_panel_registro();

    }//GEN-LAST:event_btn_regresarMousePressed

    private void btn_archivoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_archivoMousePressed
        this.seleccionar_pdf();
    }//GEN-LAST:event_btn_archivoMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btn_archivo;
    private javax.swing.JPanel btn_guardar;
    private javax.swing.JPanel btn_regresar;
    private javax.swing.JComboBox<String> jComboBoxEstado;
    private javax.swing.JComboBox<String> jComboBoxPersona;
    private javax.swing.JComboBox<String> jComboBoxPrioridad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel jlArchivo;
    private javax.swing.JLabel lblEncabezado;
    private javax.swing.JTextField txtAsunto;
    private javax.swing.JTextArea txtResumen;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables

    private void plaseholder() {
        TextPrompt prueba0 = new TextPrompt(" Ingrese el titulo del pdf", this.txtTitulo);
        TextPrompt prueba1 = new TextPrompt(" Ingrese el asunto", this.txtAsunto);
        TextPrompt prueba2 = new TextPrompt(" Ingrese el resumen del pdf", this.txtResumen);
    }

    private void cargarCombo() {
        try {
            this.ComboModel = ArchivoBo.ModeloUsu();
            this.jComboBoxPersona.setModel(this.ComboModel);
            this.jComboBoxPersona.setPreferredSize(new Dimension(65, 26));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
            e.printStackTrace();
        }
    }

    private void cargarCombo1() {
        try {
            this.ComboModel1 = ArchivoBo.ModeloUsu1();
            this.jComboBoxPrioridad.setModel(this.ComboModel1);
            this.jComboBoxPrioridad.setPreferredSize(new Dimension(65, 26));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
            e.printStackTrace();
        }
    }

    private void seleccionar_pdf() {
        JFileChooser j = new JFileChooser();
        FileNameExtensionFilter fi = new FileNameExtensionFilter("Archivos", "pdf", "xlsx", "docx", "pptx");
        j.setFileFilter(fi);
        int se = j.showOpenDialog(this);
        if (se == 0) {
            this.jlArchivo.setText("" + j.getSelectedFile().getName());
            this.ruta_archivo = j.getSelectedFile().getAbsolutePath();

        } else {
        }
    }

    private void registrar() {
        this.cargar_obj();
        try {
            if (ArchivoBo.grabar_pdf(objArchivoPdf)) {
                JOptionPane.showMessageDialog(null, "Se Registró Correctamente", "MENSAJE --> Archivo", JOptionPane.INFORMATION_MESSAGE);
                limpiarcampos();

            } else {
                JOptionPane.showMessageDialog(this, "No se pudo Registrar", "MENSAJE --> Archivo", JOptionPane.ERROR_MESSAGE);
                limpiarcampos();

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "MENSAJE --> Archivo", JOptionPane.ERROR_MESSAGE);
        }

    }

    private void modificar() {

        this.cargar_obj();

        try {
            if (ArchivoBo.modificar_pdf(objArchivoPdf)) {

                JOptionPane.showMessageDialog(null, "Se Modifico Correctamente", "MENSAJE --> Archivo", JOptionPane.INFORMATION_MESSAGE);
                this.limpiarcampos();
                this.llamdo_panel_registro();

            } else {
                JOptionPane.showMessageDialog(this, "No se pudo Modifico", "MENSAJE --> Archivo", JOptionPane.ERROR_MESSAGE);
                this.limpiarcampos();

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "MENSAJE --> Archivo", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void limpiarcampos() {
        this.txtAsunto.setText("");
        this.txtResumen.setText("");
        this.txtTitulo.setText("");
        this.jComboBoxEstado.setSelectedIndex(0);
        this.jComboBoxPersona.setSelectedIndex(0);
        this.jComboBoxPrioridad.setSelectedIndex(0);
        this.ruta_archivo = "";
        this.jlArchivo.setText("");
    }

    private void cargarlbl() {
        this.lblEncabezado.setText(encab);
    }

    private void cargarTex(boolean estad) {
        if (estad == true) {
            this.txtTitulo.setText(tit);
            this.txtAsunto.setText(asu);
            this.txtResumen.setText(res);
            this.jComboBoxPersona.setSelectedItem(des);
            this.jComboBoxPrioridad.setSelectedItem(esp);
            this.jComboBoxEstado.setSelectedItem(est);
        } else {
            this.limpiarcampos();
        }
    }

    private void llamdo_panel_registro() {
        pase = true;
        jpRegistro p1 = new jpRegistro();
        p1.setSize(1039, 521);
        p1.setLocation(0, 0);

        content.removeAll();
        content.add(p1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }

    private void cargar_obj() {

        objArchivoPdf.setUsuar(usuaa);
        objArchivoPdf.setDestino(this.jComboBoxPersona.getSelectedItem().toString());
        objArchivoPdf.setTitulo(this.txtTitulo.getText());
        objArchivoPdf.setAsunto(this.txtAsunto.getText());
        objArchivoPdf.setDescrip(this.txtResumen.getText());
        objArchivoPdf.setEstado(this.jComboBoxPrioridad.getSelectedItem().toString());
        objArchivoPdf.setEst(this.jComboBoxEstado.getSelectedItem().toString());
        objArchivoPdf.setIdpdf(idp);
        objArchivoPdf.setArchivo(this.jlArchivo.getText());
        this.guardar_archivo_folder();
    }

    private void guardar_archivo_folder() {
        String text = this.jlArchivo.getText();
        String archivo = destino +text;
        File folder = new File(this.destino);
        if (!folder.exists()) {
            folder.mkdirs();
        }
        this.enviar_archivo(this.ruta_archivo, archivo);
    }

    private static void enviar_archivo(String ruta, String archivo) {
        try {
            Path rut =  Paths.get(ruta);
            Path ar =  Paths.get(archivo);
            CopyOption[] options = new CopyOption[]{
                StandardCopyOption.REPLACE_EXISTING,
                StandardCopyOption.COPY_ATTRIBUTES
            };
            Files.copy(rut,ar, options);
        } catch (IOException e) {
            System.err.println(e.toString());
        }

    }
}
