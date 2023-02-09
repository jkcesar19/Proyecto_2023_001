package Vista;

import Componete_grafico.ModelChart;
import Dato.ImplementacionDao.TablaDao;
import static Vista.Dashboard.importante;
import static Vista.Dashboard.jpPrincipal;
import static Vista.Dashboard.no_importante;
import static Vista.Dashboard.no_urgente;
import static Vista.Dashboard.urgente;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 * @fecha: 30 - 12 - 2022
 * @author: Llaguento Carlos Jk Cesar
 */
public class Principal extends javax.swing.JPanel {

    public Principal() {
        initComponents();
        setOpaque(false);

        this.obtener_numero();
        this.obtener_numero_prioridades();
        this.obtener_porcentaje();
//        this.grafico_pastel();
//        this.grafico_barras();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jnum_total = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jnum_urg = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jpor_urg = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jpor_no_urg = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jnum_no_urg = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jnum_imp = new javax.swing.JLabel();
        jpor_imp = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jpor_no_imp = new javax.swing.JLabel();
        jnum_no_imp = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel12 = new javax.swing.JPanel();
        panelShadow1 = new Componete_grafico.PanelShadow();
        gaugeChart1 = new Componete_grafico.GaugeChart();
        jLabel5 = new javax.swing.JLabel();
        panelShadow2 = new Componete_grafico.PanelShadow();
        gaugeChart2 = new Componete_grafico.GaugeChart();
        jLabel6 = new javax.swing.JLabel();
        panelShadow3 = new Componete_grafico.PanelShadow();
        gaugeChart3 = new Componete_grafico.GaugeChart();
        jLabel7 = new javax.swing.JLabel();
        panelShadow4 = new Componete_grafico.PanelShadow();
        gaugeChart4 = new Componete_grafico.GaugeChart();
        jLabel9 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        panelShadow5 = new Componete_grafico.PanelShadow();
        barChart = new Componete_grafico.Chart();

        setPreferredSize(new java.awt.Dimension(1039, 519));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1047, 519));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("BIENVENIDO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("\"Es genial trabajar con ordenadores. No discuten, lo recuerdan todo y no se beben tu cerveza\"\n");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        jPanel2.setBackground(new java.awt.Color(125, 97, 231));
        jPanel2.setMinimumSize(new java.awt.Dimension(160, 80));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(52, 39, 89));
        jPanel3.setPreferredSize(new java.awt.Dimension(60, 80));
        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 80));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("100%");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("TOTAL");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        jnum_total.setForeground(new java.awt.Color(255, 255, 255));
        jnum_total.setText("1,200");
        jPanel2.add(jnum_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 160, 80));

        jPanel4.setBackground(new java.awt.Color(234, 89, 61));
        jPanel4.setMinimumSize(new java.awt.Dimension(160, 80));
        jPanel4.setPreferredSize(new java.awt.Dimension(160, 80));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(166, 70, 52));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 80));

        jnum_urg.setForeground(new java.awt.Color(255, 255, 255));
        jnum_urg.setText("40");
        jPanel4.add(jnum_urg, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("URGENTE");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        jpor_urg.setForeground(new java.awt.Color(255, 255, 255));
        jpor_urg.setText("30%");
        jPanel4.add(jpor_urg, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 160, 80));

        jPanel6.setBackground(new java.awt.Color(0, 173, 240));
        jPanel6.setMinimumSize(new java.awt.Dimension(160, 80));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(0, 139, 190));
        jPanel7.setPreferredSize(new java.awt.Dimension(60, 80));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 80));

        jpor_no_urg.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jpor_no_urg.setForeground(new java.awt.Color(255, 255, 255));
        jpor_no_urg.setText("50%");
        jPanel6.add(jpor_no_urg, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("NO URGENTE");
        jPanel6.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        jnum_no_urg.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jnum_no_urg.setForeground(new java.awt.Color(255, 255, 255));
        jnum_no_urg.setText("230");
        jPanel6.add(jnum_no_urg, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 30, -1));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 160, 80));

        jPanel8.setBackground(new java.awt.Color(0, 143, 86));
        jPanel8.setMinimumSize(new java.awt.Dimension(160, 80));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBackground(new java.awt.Color(1, 116, 76));
        jPanel9.setPreferredSize(new java.awt.Dimension(60, 80));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        jPanel8.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 80));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("IMPORTANTE");
        jPanel8.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        jnum_imp.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jnum_imp.setForeground(new java.awt.Color(255, 255, 255));
        jnum_imp.setText("230");
        jPanel8.add(jnum_imp, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        jpor_imp.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jpor_imp.setForeground(new java.awt.Color(255, 255, 255));
        jpor_imp.setText("15%");
        jPanel8.add(jpor_imp, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 110, 160, 80));

        jPanel10.setBackground(new java.awt.Color(248, 155, 10));
        jPanel10.setMinimumSize(new java.awt.Dimension(160, 80));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setBackground(new java.awt.Color(201, 125, 12));
        jPanel11.setPreferredSize(new java.awt.Dimension(60, 80));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        jPanel10.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 80));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("NO IMPORTANTE");
        jPanel10.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        jpor_no_imp.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jpor_no_imp.setForeground(new java.awt.Color(255, 255, 255));
        jpor_no_imp.setText("5%");
        jPanel10.add(jpor_no_imp, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, -1, -1));

        jnum_no_imp.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jnum_no_imp.setForeground(new java.awt.Color(255, 255, 255));
        jnum_no_imp.setText("230");
        jPanel10.add(jnum_no_imp, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        jPanel1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 110, 160, 80));

        jSeparator1.setBackground(new java.awt.Color(10, 95, 1));
        jSeparator1.setForeground(new java.awt.Color(0, 128, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 970, 10));

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));

        gaugeChart1.setColor1(new java.awt.Color(234, 89, 61));
        gaugeChart1.setColor2(new java.awt.Color(166, 70, 52));
        gaugeChart1.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        gaugeChart1.setPreferredSize(new java.awt.Dimension(80, 80));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel5.setText("URGENTE");

        javax.swing.GroupLayout panelShadow1Layout = new javax.swing.GroupLayout(panelShadow1);
        panelShadow1.setLayout(panelShadow1Layout);
        panelShadow1Layout.setHorizontalGroup(
            panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(gaugeChart1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelShadow1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(45, 45, 45))
        );
        panelShadow1Layout.setVerticalGroup(
            panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelShadow1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gaugeChart1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        panelShadow2.setPreferredSize(new java.awt.Dimension(136, 222));

        gaugeChart2.setColor1(new java.awt.Color(0, 173, 240));
        gaugeChart2.setColor2(new java.awt.Color(0, 139, 190));
        gaugeChart2.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        gaugeChart2.setPreferredSize(new java.awt.Dimension(80, 80));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel6.setText("NO URGENTE");

        javax.swing.GroupLayout panelShadow2Layout = new javax.swing.GroupLayout(panelShadow2);
        panelShadow2.setLayout(panelShadow2Layout);
        panelShadow2Layout.setHorizontalGroup(
            panelShadow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(panelShadow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gaugeChart2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelShadow2Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel6)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        panelShadow2Layout.setVerticalGroup(
            panelShadow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelShadow2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(gaugeChart2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        panelShadow3.setPreferredSize(new java.awt.Dimension(136, 222));

        gaugeChart3.setColor1(new java.awt.Color(0, 143, 86));
        gaugeChart3.setColor2(new java.awt.Color(1, 116, 76));
        gaugeChart3.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        gaugeChart3.setPreferredSize(new java.awt.Dimension(110, 110));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel7.setText("IMPORTANTE");

        javax.swing.GroupLayout panelShadow3Layout = new javax.swing.GroupLayout(panelShadow3);
        panelShadow3.setLayout(panelShadow3Layout);
        panelShadow3Layout.setHorizontalGroup(
            panelShadow3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(panelShadow3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gaugeChart3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        panelShadow3Layout.setVerticalGroup(
            panelShadow3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelShadow3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gaugeChart3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelShadow4.setPreferredSize(new java.awt.Dimension(136, 222));

        gaugeChart4.setColor1(new java.awt.Color(248, 155, 10));
        gaugeChart4.setColor2(new java.awt.Color(201, 125, 12));
        gaugeChart4.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        gaugeChart4.setPreferredSize(new java.awt.Dimension(110, 110));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel9.setText("NO IMPORTANTE");

        javax.swing.GroupLayout panelShadow4Layout = new javax.swing.GroupLayout(panelShadow4);
        panelShadow4.setLayout(panelShadow4Layout);
        panelShadow4Layout.setHorizontalGroup(
            panelShadow4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(panelShadow4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(gaugeChart4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelShadow4Layout.setVerticalGroup(
            panelShadow4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelShadow4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gaugeChart4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelShadow1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelShadow2, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelShadow3, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                    .addComponent(panelShadow4, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))
                .addGap(51, 51, 51))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelShadow1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelShadow3, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelShadow2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelShadow4, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        jPanel1.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 340, 280));

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));

        barChart.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N

        javax.swing.GroupLayout panelShadow5Layout = new javax.swing.GroupLayout(panelShadow5);
        panelShadow5.setLayout(panelShadow5Layout);
        panelShadow5Layout.setHorizontalGroup(
            panelShadow5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow5Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(barChart, javax.swing.GroupLayout.PREFERRED_SIZE, 673, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelShadow5Layout.setVerticalGroup(
            panelShadow5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelShadow5Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(barChart, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelShadow5, javax.swing.GroupLayout.PREFERRED_SIZE, 624, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelShadow5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, 630, 280));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 519));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Componete_grafico.Chart barChart;
    private Componete_grafico.GaugeChart gaugeChart1;
    private Componete_grafico.GaugeChart gaugeChart2;
    private Componete_grafico.GaugeChart gaugeChart3;
    private Componete_grafico.GaugeChart gaugeChart4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel jnum_imp;
    private javax.swing.JLabel jnum_no_imp;
    private javax.swing.JLabel jnum_no_urg;
    private javax.swing.JLabel jnum_total;
    private javax.swing.JLabel jnum_urg;
    private javax.swing.JLabel jpor_imp;
    private javax.swing.JLabel jpor_no_imp;
    private javax.swing.JLabel jpor_no_urg;
    private javax.swing.JLabel jpor_urg;
    private Componete_grafico.PanelShadow panelShadow1;
    private Componete_grafico.PanelShadow panelShadow2;
    private Componete_grafico.PanelShadow panelShadow3;
    private Componete_grafico.PanelShadow panelShadow4;
    private Componete_grafico.PanelShadow panelShadow5;
    // End of variables declaration//GEN-END:variables

    private void obtener_numero_prioridades() {
        int total = urgente + no_urgente + importante + no_importante;

        this.jnum_total.setText("" + total);
        this.jnum_urg.setText("" + urgente);
        this.jnum_no_urg.setText("" + no_urgente);
        this.jnum_imp.setText("" + importante);
        this.jnum_no_imp.setText("" + no_importante);

    }

    private void obtener_numero() {

        try {
            TablaDao obt = new TablaDao();
            obt.contador_prioridad();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void obtener_porcentaje() {
        int total = urgente + no_urgente + importante + no_importante;
        double por_ur = 0, por_nour = 0, por_im = 0, por_noim = 0;

        por_ur = (double) urgente / total;
        por_nour = (double) no_urgente / total;
        por_im = (double) importante / total;
        por_noim = (double) no_importante / total;

        int re_ur = 0, re_nour = 0, re_im = 0, re_noim = 0;
        re_ur = (int) redondear(por_ur);
        re_nour = (int) redondear(por_nour);
        re_im = (int) redondear(por_im);
        re_noim = (int) redondear(por_noim);

        this.jpor_urg.setText(re_ur + "%");
        this.jpor_no_urg.setText(re_nour + "%");
        this.jpor_imp.setText(re_im + "%");
        this.jpor_no_imp.setText(re_noim + "%");

        gaugeChart1.setValueWithAnimation(re_ur);
        gaugeChart2.setValueWithAnimation(re_nour);
        gaugeChart3.setValueWithAnimation(re_im);
        gaugeChart4.setValueWithAnimation(re_noim);

        barChart.addLegend("Urgente", new Color(12, 84, 175), new Color(0, 108, 247));
        barChart.addLegend("No urgente", new Color(54, 4, 143), new Color(104, 49, 200));
        barChart.addLegend("Importante", new Color(5, 125, 0), new Color(95, 209, 69));
        barChart.addLegend("no importante", new Color(186, 37, 37), new Color(241, 100, 120));
        barChart.addData(new ModelChart("", new double[]{600, 750, 90, 150}));
        barChart.addData(new ModelChart("", new double[]{600, 750, 90, 150}));

        barChart.start();

    }

    private double redondear(double num) {
        return Math.round(num * 100);
    }
}
