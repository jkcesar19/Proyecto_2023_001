package Vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.time.LocalDate;

/**
 * @fecha: 28 - 12 - 2022
 * @author: llaguento Carlos Jk Cesar
 */
public class Dashboard extends javax.swing.JFrame {

    public static int urgente;
    public static int no_urgente;
    public static int importante;
    public static int no_importante;
    
    public static String adm;
    public static String usuaa;
    public static byte[] bite = null;
    
    int xMouse;
    int yMouse;

    public Dashboard() {
        initComponents();
        this.setLocationRelativeTo(null);

        this.jlabAdmin.setText(adm);

        LocalDate now = LocalDate.now();
        int year = now.getYear();
        int dia = now.getDayOfMonth();
        int month = now.getMonthValue();
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", " ;Septiembre",
            "Octubre", "Noviembre", "Diciemrbre"};
        this.jlfecha.setText("Hoy es " + dia + " de " + meses[month - 1] + " de " + year);

        jpPrincipal.setBackground(new Color(0, 128, 0));
        Principal p1 = new Principal();
        p1.setSize(1039, 521);
        p1.setLocation(0, 0);

        content.removeAll();
        content.add(p1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Dashboard = new javax.swing.JPanel();
        Menu = new javax.swing.JPanel();
        app_name = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jpPrincipal = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jpReporte = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jpMovimiento = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jpRegistro = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jpUsuario = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Header = new javax.swing.JPanel();
        jlabAdmin = new javax.swing.JLabel();
        jlfecha = new javax.swing.JLabel();
        jlabPerfil = new javax.swing.JLabel();
        Title = new javax.swing.JPanel();
        red_squr = new javax.swing.JPanel();
        exit = new javax.swing.JLabel();
        btn_min = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Dashboard.setBackground(new java.awt.Color(255, 255, 255));
        Dashboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Menu.setBackground(new java.awt.Color(10, 95, 1));
        Menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        app_name.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        app_name.setForeground(new java.awt.Color(255, 255, 255));
        app_name.setText("System");
        Menu.add(app_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, -1, -1));
        Menu.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 160, 10));

        jpPrincipal.setBackground(new java.awt.Color(0, 128, 0));
        jpPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpPrincipalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpPrincipalMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpPrincipalMousePressed(evt);
            }
        });
        jpPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/menu/principal.png"))); // NOI18N
        jLabel4.setText("Principal");
        jpPrincipal.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 160, 30));

        Menu.add(jpPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 250, 50));

        jpReporte.setBackground(new java.awt.Color(10, 95, 1));
        jpReporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpReporteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpReporteMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpReporteMousePressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/menu/reporte.png"))); // NOI18N
        jLabel5.setText("Reposte");

        javax.swing.GroupLayout jpReporteLayout = new javax.swing.GroupLayout(jpReporte);
        jpReporte.setLayout(jpReporteLayout);
        jpReporteLayout.setHorizontalGroup(
            jpReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpReporteLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jpReporteLayout.setVerticalGroup(
            jpReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpReporteLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Menu.add(jpReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, -1, 50));

        jpMovimiento.setBackground(new java.awt.Color(10, 95, 1));
        jpMovimiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpMovimientoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpMovimientoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpMovimientoMousePressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/menu/movimientos.png"))); // NOI18N
        jLabel3.setText("Movimiento");

        javax.swing.GroupLayout jpMovimientoLayout = new javax.swing.GroupLayout(jpMovimiento);
        jpMovimiento.setLayout(jpMovimientoLayout);
        jpMovimientoLayout.setHorizontalGroup(
            jpMovimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMovimientoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jpMovimientoLayout.setVerticalGroup(
            jpMovimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpMovimientoLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Menu.add(jpMovimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, -1, 50));

        jpRegistro.setBackground(new java.awt.Color(10, 95, 1));
        jpRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpRegistroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpRegistroMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpRegistroMousePressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/menu/registro.png"))); // NOI18N
        jLabel2.setText("Registro");

        javax.swing.GroupLayout jpRegistroLayout = new javax.swing.GroupLayout(jpRegistro);
        jpRegistro.setLayout(jpRegistroLayout);
        jpRegistroLayout.setHorizontalGroup(
            jpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRegistroLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jpRegistroLayout.setVerticalGroup(
            jpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpRegistroLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Menu.add(jpRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, -1, 50));

        jpUsuario.setBackground(new java.awt.Color(10, 95, 1));
        jpUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpUsuarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpUsuarioMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpUsuarioMousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/menu/usuario.png"))); // NOI18N
        jLabel1.setText("Usuario");

        javax.swing.GroupLayout jpUsuarioLayout = new javax.swing.GroupLayout(jpUsuario);
        jpUsuario.setLayout(jpUsuarioLayout);
        jpUsuarioLayout.setHorizontalGroup(
            jpUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpUsuarioLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jpUsuarioLayout.setVerticalGroup(
            jpUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpUsuarioLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Menu.add(jpUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, -1, 50));

        Dashboard.add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 680));

        Header.setBackground(new java.awt.Color(0, 128, 0));

        jlabAdmin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlabAdmin.setForeground(new java.awt.Color(255, 255, 255));
        jlabAdmin.setText("Jk Cesar Llaguento Carlos");

        jlfecha.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jlfecha.setForeground(new java.awt.Color(255, 255, 255));
        jlfecha.setText("Hoy es Jueves 29 de Dicembre de 2022");

        jlabPerfil.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlabPerfil.setForeground(new java.awt.Color(255, 255, 255));
        jlabPerfil.setText("Adminstrador: ");

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HeaderLayout.createSequentialGroup()
                        .addComponent(jlabPerfil)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlabAdmin))
                    .addComponent(jlfecha))
                .addContainerGap(530, Short.MAX_VALUE))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlabPerfil)
                    .addComponent(jlabAdmin))
                .addGap(18, 18, 18)
                .addComponent(jlfecha)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        Dashboard.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 1040, 130));

        Title.setBackground(new java.awt.Color(255, 255, 255));
        Title.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                TitleMouseDragged(evt);
            }
        });
        Title.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TitleMousePressed(evt);
            }
        });

        red_squr.setBackground(new java.awt.Color(255, 255, 255));
        red_squr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                red_squrMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                red_squrMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                red_squrMousePressed(evt);
            }
        });

        exit.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit.setText("X");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exitMousePressed(evt);
            }
        });

        javax.swing.GroupLayout red_squrLayout = new javax.swing.GroupLayout(red_squr);
        red_squr.setLayout(red_squrLayout);
        red_squrLayout.setHorizontalGroup(
            red_squrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(red_squrLayout.createSequentialGroup()
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        red_squrLayout.setVerticalGroup(
            red_squrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btn_min.setBackground(new java.awt.Color(255, 255, 255));
        btn_min.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_minMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_minMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_minMousePressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("-");

        javax.swing.GroupLayout btn_minLayout = new javax.swing.GroupLayout(btn_min);
        btn_min.setLayout(btn_minLayout);
        btn_minLayout.setHorizontalGroup(
            btn_minLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
        );
        btn_minLayout.setVerticalGroup(
            btn_minLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout TitleLayout = new javax.swing.GroupLayout(Title);
        Title.setLayout(TitleLayout);
        TitleLayout.setHorizontalGroup(
            TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TitleLayout.createSequentialGroup()
                .addContainerGap(1203, Short.MAX_VALUE)
                .addComponent(btn_min, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(red_squr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        TitleLayout.setVerticalGroup(
            TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(red_squr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(TitleLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_min, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Dashboard.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, 30));

        content.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1040, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );

        Dashboard.add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 1040, 520));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 1284, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TitleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TitleMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_TitleMousePressed

    private void TitleMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TitleMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_TitleMouseDragged

    private void jpPrincipalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpPrincipalMouseEntered

        this.jpPrincipal.setBackground(new Color(0, 128, 0));
    }//GEN-LAST:event_jpPrincipalMouseEntered

    private void jpPrincipalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpPrincipalMouseExited
        this.jpPrincipal.setBackground(new Color(10, 95, 1));
    }//GEN-LAST:event_jpPrincipalMouseExited

    private void jpUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpUsuarioMouseEntered
        this.jpUsuario.setBackground(new Color(0, 128, 0));
    }//GEN-LAST:event_jpUsuarioMouseEntered

    private void jpUsuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpUsuarioMouseExited
        this.jpUsuario.setBackground(new Color(10, 95, 1));
    }//GEN-LAST:event_jpUsuarioMouseExited

    private void jpRegistroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpRegistroMouseEntered
        this.jpRegistro.setBackground(new Color(0, 128, 0));

    }//GEN-LAST:event_jpRegistroMouseEntered

    private void jpRegistroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpRegistroMouseExited
        this.jpRegistro.setBackground(new Color(10, 95, 1));
    }//GEN-LAST:event_jpRegistroMouseExited

    private void jpMovimientoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpMovimientoMouseEntered
        this.jpMovimiento.setBackground(new Color(0, 128, 0));
    }//GEN-LAST:event_jpMovimientoMouseEntered

    private void jpMovimientoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpMovimientoMouseExited
        this.jpMovimiento.setBackground(new Color(10, 95, 1));
    }//GEN-LAST:event_jpMovimientoMouseExited

    private void jpReporteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpReporteMouseEntered
        this.jpReporte.setBackground(new Color(0, 128, 0));
    }//GEN-LAST:event_jpReporteMouseEntered

    private void jpReporteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpReporteMouseExited
        this.jpReporte.setBackground(new Color(10, 95, 1));
    }//GEN-LAST:event_jpReporteMouseExited

    private void jpPrincipalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpPrincipalMousePressed
        this.jpPrincipal.setBackground(new Color(0, 128, 0));

        // Abrir sección
        Principal p1 = new Principal();
        p1.setSize(1039, 521);
        p1.setLocation(0, 0);

        content.removeAll();
        content.add(p1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_jpPrincipalMousePressed

    private void jpUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpUsuarioMousePressed
        this.jpUsuario.setBackground(new Color(0, 128, 0));
        jpUsuario u1 = new jpUsuario();
        u1.setSize(1039, 521);
        u1.setLocation(0, 0);

        content.removeAll();
        content.add(u1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_jpUsuarioMousePressed

    private void jpRegistroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpRegistroMousePressed
        this.jpRegistro.setBackground(new Color(0, 128, 0));

        // Abrir sección
        jpRegistro p1 = new jpRegistro();
        p1.setSize(1039, 521);
        p1.setLocation(0, 0);

        content.removeAll();
        content.add(p1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_jpRegistroMousePressed

    private void jpMovimientoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpMovimientoMousePressed
        this.jpMovimiento.setBackground(new Color(0, 128, 0));
        // Abrir sección
        jpMovimiento p1 = new jpMovimiento();
        p1.setSize(1039, 521);
        p1.setLocation(0, 0);

        content.removeAll();
        content.add(p1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_jpMovimientoMousePressed

    private void jpReporteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpReporteMousePressed
        this.jpReporte.setBackground(new Color(0, 128, 0));

        // Abrir sección
        jpReporte p1 = new jpReporte();
        p1.setSize(1039, 521);
        p1.setLocation(0, 0);

        content.removeAll();
        content.add(p1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_jpReporteMousePressed

    private void btn_minMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_minMouseEntered
        this.btn_min.setBackground(new Color(153, 153, 153));
    }//GEN-LAST:event_btn_minMouseEntered

    private void btn_minMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_minMouseExited
        this.btn_min.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_btn_minMouseExited

    private void red_squrMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_red_squrMousePressed
        System.exit(0);
    }//GEN-LAST:event_red_squrMousePressed

    private void red_squrMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_red_squrMouseExited
        this.red_squr.setBackground(new Color(255, 255, 255));
        this.exit.setForeground(new Color(102, 102, 102));
    }//GEN-LAST:event_red_squrMouseExited

    private void red_squrMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_red_squrMouseEntered
        this.red_squr.setBackground(new Color(204, 0, 0));
        this.exit.setForeground(Color.white);
    }//GEN-LAST:event_red_squrMouseEntered

    private void exitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMousePressed
        System.exit(0);
    }//GEN-LAST:event_exitMousePressed

    private void exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseExited
        this.red_squr.setBackground(new Color(255, 255, 255));
        this.exit.setForeground(new Color(102, 102, 102));
    }//GEN-LAST:event_exitMouseExited

    private void exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseEntered
        this.red_squr.setBackground(new Color(204, 0, 0));
        this.exit.setForeground(Color.white);
    }//GEN-LAST:event_exitMouseEntered

    private void btn_minMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_minMousePressed
       
    }//GEN-LAST:event_btn_minMousePressed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Dashboard;
    private javax.swing.JPanel Header;
    private javax.swing.JPanel Menu;
    private javax.swing.JPanel Title;
    private javax.swing.JLabel app_name;
    private javax.swing.JPanel btn_min;
    public static javax.swing.JPanel content;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel jlabAdmin;
    private javax.swing.JLabel jlabPerfil;
    private javax.swing.JLabel jlfecha;
    private javax.swing.JPanel jpMovimiento;
    private javax.swing.JPanel jpPrincipal;
    private javax.swing.JPanel jpRegistro;
    private javax.swing.JPanel jpReporte;
    private javax.swing.JPanel jpUsuario;
    private javax.swing.JPanel red_squr;
    // End of variables declaration//GEN-END:variables

}
