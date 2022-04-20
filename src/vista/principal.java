/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.*;
import static java.awt.Color.red;
public class principal extends javax.swing.JFrame {

    /**
     * Creates new form principal
     */
    public principal() {
        initComponents();
    }

    int xmouse,ymouse;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        panelPrincipal = new javax.swing.JPanel();
        panelDiseñoEstatico = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        PANELGENERAL = new javax.swing.JTabbedPane();
        TPpanelPrincipal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        tpPanelCatalogo = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        panelCatalogo = new javax.swing.JPanel();
        btnActualizar = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        TPpanelDevoluciones = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        PanelPublicaciones = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        prueba = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        txtCilindrage = new javax.swing.JTextField();
        txtMatricula = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        txtKilometrage = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        txtFoto = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        panelColorSubirFoto = new javax.swing.JPanel();
        btnSubirFoto = new javax.swing.JLabel();
        panelColorREGISTROAUTO = new javax.swing.JPanel();
        btnRegistrarAuto = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TPpanelVender = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtRequisitos = new javax.swing.JTextArea();
        jPanel11 = new javax.swing.JPanel();
        btnRegistroVendedor = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        BtnAccederVendedor = new javax.swing.JLabel();
        panelVendedores2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        panelVendedor3 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        panelDiseño = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        CorreoVendedor = new javax.swing.JLabel();
        FotoPerfil = new javax.swing.JLabel();
        nombreVendedor = new javax.swing.JLabel();
        btnActualizar1 = new javax.swing.JLabel();
        tabConfig = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        TxtCorreo = new javax.swing.JTextField();
        txtDni = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        editarNombre = new javax.swing.JLabel();
        editarApellido = new javax.swing.JLabel();
        editarCorreo = new javax.swing.JLabel();
        editardni = new javax.swing.JLabel();
        editarTelefono = new javax.swing.JLabel();
        editarDireccion = new javax.swing.JLabel();
        editarContraseña = new javax.swing.JLabel();
        txtContrasñea = new javax.swing.JPasswordField();
        jPanel3 = new javax.swing.JPanel();
        BtnAceptarActualizar = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        BtnEliminarCuenta = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tablaventas = new javax.swing.JTable();
        panelBotonesPirncipales = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        lbltextoMARCA = new javax.swing.JLabel();
        panelColorPrincipal = new javax.swing.JPanel();
        btnPrincipal = new javax.swing.JLabel();
        panelColorCatalogo = new javax.swing.JPanel();
        btnCatalogo = new javax.swing.JLabel();
        panelColorDevoluciones = new javax.swing.JPanel();
        btnDevoluciones = new javax.swing.JLabel();
        panelColorvender = new javax.swing.JPanel();
        btnVender = new javax.swing.JLabel();
        panelColorVendedores = new javax.swing.JPanel();
        btnVendedores = new javax.swing.JLabel();
        panelColorConfiguracion = new javax.swing.JPanel();
        btnConfiguracion = new javax.swing.JLabel();
        PanelColorverVentas = new javax.swing.JPanel();
        btnVerMisVentas = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        PANELpanel = new javax.swing.JPanel();
        panelexit = new javax.swing.JPanel();
        lblExitr = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        panelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelDiseñoEstatico.setBackground(new java.awt.Color(24, 118, 208));
        panelDiseñoEstatico.setForeground(new java.awt.Color(24, 118, 208));

        jLabel7.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Sistema de gestion concecionario venta/Compra");

        javax.swing.GroupLayout panelDiseñoEstaticoLayout = new javax.swing.GroupLayout(panelDiseñoEstatico);
        panelDiseñoEstatico.setLayout(panelDiseñoEstaticoLayout);
        panelDiseñoEstaticoLayout.setHorizontalGroup(
            panelDiseñoEstaticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDiseñoEstaticoLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel7)
                .addContainerGap(608, Short.MAX_VALUE))
        );
        panelDiseñoEstaticoLayout.setVerticalGroup(
            panelDiseñoEstaticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDiseñoEstaticoLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel7)
                .addContainerGap(93, Short.MAX_VALUE))
        );

        panelPrincipal.add(panelDiseñoEstatico, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 980, 140));

        TPpanelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        TPpanelPrincipal.setPreferredSize(new java.awt.Dimension(885, 482));
        TPpanelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(153, 153, 153));
        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("¿Por que elegirnos?");
        TPpanelPrincipal.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPrincipal/Cris-Urzua-Apps-Para-Vendedores-Ventas-2.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        TPpanelPrincipal.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 270, 190));

        jLabel3.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Nuestros mejores vendedores");
        TPpanelPrincipal.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPrincipal/concesionario-marcali-700x525.png"))); // NOI18N
        TPpanelPrincipal.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, 270, 200));

        jLabel5.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("Ultimos modelos");
        TPpanelPrincipal.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 230, -1, -1));

        jPanel9.setBackground(new java.awt.Color(51, 102, 255));
        jPanel9.setPreferredSize(new java.awt.Dimension(90, 30));

        jLabel16.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("ver mas...");
        jLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        TPpanelPrincipal.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 400, 80, 30));

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));

        jLabel13.setBackground(new java.awt.Color(0, 102, 255));
        jLabel13.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("ver mas..");
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        TPpanelPrincipal.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, 90, 30));

        jPanel8.setBackground(new java.awt.Color(0, 102, 255));

        jLabel15.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("ver mas...");
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        TPpanelPrincipal.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 400, 90, 30));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPrincipal/coche-concesionario-bbva-recurso-1024x595-1.png"))); // NOI18N
        TPpanelPrincipal.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 260, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPrincipal/Screenshot_7.png"))); // NOI18N
        TPpanelPrincipal.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 20, 290, 440));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPrincipal/Screenshot_7.png"))); // NOI18N
        TPpanelPrincipal.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 440));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPrincipal/Screenshot_7.png"))); // NOI18N
        TPpanelPrincipal.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 305, 440));

        jPanel2.setBackground(new java.awt.Color(0, 102, 255));

        jLabel14.setBackground(new java.awt.Color(0, 102, 255));
        jLabel14.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("ver mas..");
        jLabel14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        TPpanelPrincipal.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, 90, 30));

        PANELGENERAL.addTab("tab1", TPpanelPrincipal);

        tpPanelCatalogo.setBackground(new java.awt.Color(255, 255, 255));
        tpPanelCatalogo.setPreferredSize(new Dimension(2000,2000));
        tpPanelCatalogo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelCatalogo.setBackground(new java.awt.Color(255, 255, 255));

        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPrincipal/Daco_5669101 (1).png"))); // NOI18N
        btnActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jButton1.setText("Buscar");

        javax.swing.GroupLayout panelCatalogoLayout = new javax.swing.GroupLayout(panelCatalogo);
        panelCatalogo.setLayout(panelCatalogoLayout);
        panelCatalogoLayout.setHorizontalGroup(
            panelCatalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCatalogoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnActualizar)
                .addGap(162, 162, 162)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jButton1)
                .addContainerGap(395, Short.MAX_VALUE))
        );
        panelCatalogoLayout.setVerticalGroup(
            panelCatalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCatalogoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCatalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCatalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1))
                    .addComponent(btnActualizar))
                .addContainerGap(472, Short.MAX_VALUE))
        );

        jScrollPane3.setViewportView(panelCatalogo);

        tpPanelCatalogo.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 510));

        PANELGENERAL.addTab("tab3", tpPanelCatalogo);

        TPpanelDevoluciones.setBackground(new java.awt.Color(255, 255, 255));
        TPpanelDevoluciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelPublicaciones.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout PanelPublicacionesLayout = new javax.swing.GroupLayout(PanelPublicaciones);
        PanelPublicaciones.setLayout(PanelPublicacionesLayout);
        PanelPublicacionesLayout.setHorizontalGroup(
            PanelPublicacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 968, Short.MAX_VALUE)
        );
        PanelPublicacionesLayout.setVerticalGroup(
            PanelPublicacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 498, Short.MAX_VALUE)
        );

        jScrollPane2.setViewportView(PanelPublicaciones);

        TPpanelDevoluciones.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 500));

        PANELGENERAL.addTab("tab4", TPpanelDevoluciones);

        prueba.setBackground(new java.awt.Color(255, 255, 255));
        prueba.setPreferredSize(new Dimension(2000,2000));
        prueba.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("Marca");
        prueba.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 80, 20));

        jLabel22.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel22.setText("Modelo");
        prueba.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 60, 60, -1));

        jLabel23.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel23.setText("Cilindrage");
        prueba.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 70, -1));

        jLabel24.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel24.setText("Descripcion");
        prueba.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, 90, -1));

        jLabel25.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel25.setText("Matricula");
        prueba.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, 70, -1));

        txtMarca.setFont(new java.awt.Font("Roboto Medium", 1, 12)); // NOI18N
        txtMarca.setBorder(null);
        prueba.add(txtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, 110, 20));

        txtModelo.setFont(new java.awt.Font("Roboto Medium", 1, 12)); // NOI18N
        txtModelo.setBorder(null);
        prueba.add(txtModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 60, 120, 20));

        txtCilindrage.setFont(new java.awt.Font("Roboto Medium", 1, 12)); // NOI18N
        txtCilindrage.setBorder(null);
        prueba.add(txtCilindrage, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 290, 20));

        txtMatricula.setFont(new java.awt.Font("Roboto Medium", 1, 12)); // NOI18N
        txtMatricula.setBorder(null);
        prueba.add(txtMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, 300, 20));

        jLabel26.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel26.setText("Precio");
        prueba.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, 70, -1));

        jLabel27.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel27.setText("Kilometrage");
        prueba.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, 90, -1));

        txtPrecio.setFont(new java.awt.Font("Roboto Medium", 1, 12)); // NOI18N
        txtPrecio.setBorder(null);
        prueba.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 290, 300, 20));

        txtKilometrage.setFont(new java.awt.Font("Roboto Medium", 1, 12)); // NOI18N
        txtKilometrage.setBorder(null);
        prueba.add(txtKilometrage, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 330, 300, 20));

        jLabel28.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel28.setText("Foto");
        prueba.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 370, 90, -1));

        txtDescripcion.setColumns(20);
        txtDescripcion.setFont(new java.awt.Font("Roboto Medium", 1, 12)); // NOI18N
        txtDescripcion.setRows(5);
        jScrollPane6.setViewportView(txtDescripcion);

        prueba.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, 300, -1));

        txtFoto.setFont(new java.awt.Font("Roboto Medium", 1, 12)); // NOI18N
        txtFoto.setBorder(null);
        txtFoto.setEnabled(false);
        prueba.add(txtFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 370, 300, 20));
        prueba.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 390, 300, 10));
        prueba.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, 120, 10));
        prueba.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 80, 120, 10));
        prueba.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, 300, 10));
        prueba.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 270, 300, 10));
        prueba.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 310, 300, 10));
        prueba.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 350, 300, 10));

        panelColorSubirFoto.setBackground(new java.awt.Color(0, 102, 255));

        btnSubirFoto.setFont(new java.awt.Font("Roboto Medium", 1, 10)); // NOI18N
        btnSubirFoto.setForeground(new java.awt.Color(255, 255, 255));
        btnSubirFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSubirFoto.setText("SUBIR FOTO");
        btnSubirFoto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panelColorSubirFotoLayout = new javax.swing.GroupLayout(panelColorSubirFoto);
        panelColorSubirFoto.setLayout(panelColorSubirFotoLayout);
        panelColorSubirFotoLayout.setHorizontalGroup(
            panelColorSubirFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnSubirFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelColorSubirFotoLayout.setVerticalGroup(
            panelColorSubirFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelColorSubirFotoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnSubirFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        prueba.add(panelColorSubirFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 380, 70, 20));

        panelColorREGISTROAUTO.setBackground(new java.awt.Color(0, 102, 255));

        btnRegistrarAuto.setFont(new java.awt.Font("Roboto Medium", 1, 12)); // NOI18N
        btnRegistrarAuto.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarAuto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnRegistrarAuto.setText("REGISTRAR AUTO");
        btnRegistrarAuto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panelColorREGISTROAUTOLayout = new javax.swing.GroupLayout(panelColorREGISTROAUTO);
        panelColorREGISTROAUTO.setLayout(panelColorREGISTROAUTOLayout);
        panelColorREGISTROAUTOLayout.setHorizontalGroup(
            panelColorREGISTROAUTOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnRegistrarAuto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelColorREGISTROAUTOLayout.setVerticalGroup(
            panelColorREGISTROAUTOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnRegistrarAuto, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        prueba.add(panelColorREGISTROAUTO, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 420, 110, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPrincipal/—Pngtree—car seller deals buying and_5426831 (1).png"))); // NOI18N
        prueba.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 290, 500));

        jScrollPane5.setViewportView(prueba);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5)
        );

        PANELGENERAL.addTab("tab6", jPanel12);

        TPpanelVender.setBackground(new java.awt.Color(255, 255, 255));
        TPpanelVender.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jLabel17.setText("Convertirse en vendedor");
        TPpanelVender.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 290, 30));

        jLabel18.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel18.setText("en caso de ser vendedor");
        TPpanelVender.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 640, 20));

        txtRequisitos.setColumns(20);
        txtRequisitos.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtRequisitos.setRows(5);
        txtRequisitos.setText("\n1 - ser mayor de edad.\n\n2 - manejo de la plataforma\n\n3 - tener autorizacion\n\n4 - ser trabajador de la empresa\n\n");
        jScrollPane4.setViewportView(txtRequisitos);

        TPpanelVender.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 860, 170));

        jPanel11.setBackground(new java.awt.Color(0, 102, 255));

        btnRegistroVendedor.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btnRegistroVendedor.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistroVendedor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnRegistroVendedor.setText("registro-vendedor");
        btnRegistroVendedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnRegistroVendedor, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnRegistroVendedor, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        TPpanelVender.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 120, 30));

        jLabel19.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel19.setText("requisitos:");
        TPpanelVender.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 100, 20));

        jLabel21.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel21.setText("una vez estes seguro de cumplir los requerimientos, pulsa el boton registro-vendedor ");
        TPpanelVender.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 640, 20));

        jPanel13.setBackground(new java.awt.Color(0, 102, 255));

        BtnAccederVendedor.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        BtnAccederVendedor.setForeground(new java.awt.Color(255, 255, 255));
        BtnAccederVendedor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnAccederVendedor.setText("Acceder");
        BtnAccederVendedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BtnAccederVendedor, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BtnAccederVendedor, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        TPpanelVender.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 120, 30));

        PANELGENERAL.addTab("tab2", TPpanelVender);

        panelVendedor3.setBackground(new java.awt.Color(255, 255, 255));
        panelVendedor3.setPreferredSize(new Dimension(2000,2000));

        jLabel38.setFont(new java.awt.Font("Roboto Medium", 1, 12)); // NOI18N
        jLabel38.setText("tel: 3124515613");

        panelDiseño.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgDesignVendedor/640 162.png"))); // NOI18N

        jPanel7.setBackground(new java.awt.Color(0, 102, 255));

        jLabel39.setFont(new java.awt.Font("Roboto Medium", 1, 11)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("ver publicaciones");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        CorreoVendedor.setFont(new java.awt.Font("Roboto Medium", 1, 12)); // NOI18N
        CorreoVendedor.setText("correo: starblum123@gmail.com");

        FotoPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgDesignVendedor/descarga.png"))); // NOI18N

        nombreVendedor.setFont(new java.awt.Font("Roboto Medium", 1, 12)); // NOI18N
        nombreVendedor.setText("raul martinez figueroa");

        btnActualizar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPrincipal/Daco_5669101 (1).png"))); // NOI18N
        btnActualizar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panelVendedor3Layout = new javax.swing.GroupLayout(panelVendedor3);
        panelVendedor3.setLayout(panelVendedor3Layout);
        panelVendedor3Layout.setHorizontalGroup(
            panelVendedor3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVendedor3Layout.createSequentialGroup()
                .addGroup(panelVendedor3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelVendedor3Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addGroup(panelVendedor3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelVendedor3Layout.createSequentialGroup()
                                .addGap(290, 290, 290)
                                .addComponent(CorreoVendedor))
                            .addGroup(panelVendedor3Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(FotoPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelVendedor3Layout.createSequentialGroup()
                                .addGap(290, 290, 290)
                                .addComponent(nombreVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelVendedor3Layout.createSequentialGroup()
                                .addGap(490, 490, 490)
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(panelDiseño)
                            .addGroup(panelVendedor3Layout.createSequentialGroup()
                                .addGap(290, 290, 290)
                                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelVendedor3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnActualizar1)))
                .addContainerGap(183, Short.MAX_VALUE))
        );
        panelVendedor3Layout.setVerticalGroup(
            panelVendedor3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVendedor3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnActualizar1)
                .addGap(18, 18, 18)
                .addGroup(panelVendedor3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelVendedor3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(FotoPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelVendedor3Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(nombreVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelDiseño, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelVendedor3Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panelVendedor3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelVendedor3Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(CorreoVendedor))
                            .addGroup(panelVendedor3Layout.createSequentialGroup()
                                .addGap(107, 107, 107)
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(174, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(panelVendedor3);

        javax.swing.GroupLayout panelVendedores2Layout = new javax.swing.GroupLayout(panelVendedores2);
        panelVendedores2.setLayout(panelVendedores2Layout);
        panelVendedores2Layout.setHorizontalGroup(
            panelVendedores2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        panelVendedores2Layout.setVerticalGroup(
            panelVendedores2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );

        PANELGENERAL.addTab("tab5", panelVendedores2);

        tabConfig.setBackground(new java.awt.Color(255, 255, 255));
        tabConfig.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel34.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        jLabel34.setText("Configuracion general ");
        tabConfig.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 270, 20));

        jLabel35.setFont(new java.awt.Font("Roboto Medium", 1, 12)); // NOI18N
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel35.setText("Nombre");
        tabConfig.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, -1, -1));

        jLabel37.setFont(new java.awt.Font("Roboto Medium", 1, 12)); // NOI18N
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel37.setText("Apellido");
        tabConfig.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, -1, -1));

        jLabel40.setFont(new java.awt.Font("Roboto Medium", 1, 12)); // NOI18N
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel40.setText("Correo");
        tabConfig.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, -1, -1));

        jLabel41.setFont(new java.awt.Font("Roboto Medium", 1, 12)); // NOI18N
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel41.setText("Dni");
        tabConfig.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 30, -1));

        jLabel42.setFont(new java.awt.Font("Roboto Medium", 1, 12)); // NOI18N
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel42.setText("Telefono");
        tabConfig.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 70, -1));

        jLabel43.setFont(new java.awt.Font("Roboto Medium", 1, 12)); // NOI18N
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel43.setText("Direccion");
        tabConfig.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 60, -1));

        jLabel44.setFont(new java.awt.Font("Roboto Medium", 1, 12)); // NOI18N
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel44.setText("Contraseña");
        tabConfig.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 70, -1));
        tabConfig.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 310, -1));
        tabConfig.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 310, -1));
        tabConfig.add(TxtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 310, -1));
        tabConfig.add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 310, -1));
        tabConfig.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 310, -1));
        tabConfig.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 310, -1));

        editarNombre.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        editarNombre.setForeground(new java.awt.Color(51, 102, 255));
        editarNombre.setText("Editar");
        editarNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabConfig.add(editarNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 100, -1, -1));

        editarApellido.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        editarApellido.setForeground(new java.awt.Color(51, 102, 255));
        editarApellido.setText("Editar");
        editarApellido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabConfig.add(editarApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 140, -1, -1));

        editarCorreo.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        editarCorreo.setForeground(new java.awt.Color(51, 102, 255));
        editarCorreo.setText("Editar");
        editarCorreo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabConfig.add(editarCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 180, -1, -1));

        editardni.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        editardni.setForeground(new java.awt.Color(51, 102, 255));
        editardni.setText("Editar");
        editardni.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabConfig.add(editardni, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 220, -1, -1));

        editarTelefono.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        editarTelefono.setForeground(new java.awt.Color(51, 102, 255));
        editarTelefono.setText("Editar");
        editarTelefono.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabConfig.add(editarTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 260, -1, -1));

        editarDireccion.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        editarDireccion.setForeground(new java.awt.Color(51, 102, 255));
        editarDireccion.setText("Editar");
        editarDireccion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabConfig.add(editarDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 300, -1, -1));

        editarContraseña.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        editarContraseña.setForeground(new java.awt.Color(51, 102, 255));
        editarContraseña.setText("Editar");
        editarContraseña.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabConfig.add(editarContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 340, -1, -1));
        tabConfig.add(txtContrasñea, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 310, -1));

        jPanel3.setBackground(new java.awt.Color(0, 102, 255));

        BtnAceptarActualizar.setFont(new java.awt.Font("Roboto Medium", 1, 12)); // NOI18N
        BtnAceptarActualizar.setForeground(new java.awt.Color(255, 255, 255));
        BtnAceptarActualizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnAceptarActualizar.setText("ACEPTAR");
        BtnAceptarActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BtnAceptarActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BtnAceptarActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        tabConfig.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 390, -1, 30));

        jPanel4.setBackground(new java.awt.Color(0, 102, 255));

        BtnEliminarCuenta.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        BtnEliminarCuenta.setForeground(new java.awt.Color(255, 255, 255));
        BtnEliminarCuenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnEliminarCuenta.setText("ELIMINAR CUENTA");
        BtnEliminarCuenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BtnEliminarCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BtnEliminarCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        tabConfig.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 440, 130, 30));

        PANELGENERAL.addTab("tab7", tabConfig);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setPreferredSize(new Dimension(2000,2000));

        tablaventas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "idVentas", "IdCliente", "Nombre cliente", "Apellido cliente", "Correo cliente", "IdVendedor", "IdCatalogo", "Marca", "Modelo", "Precio"
            }
        ));
        jScrollPane8.setViewportView(tablaventas);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 886, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jScrollPane7.setViewportView(jPanel6);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7)
        );

        PANELGENERAL.addTab("tab8", jPanel5);

        panelPrincipal.add(PANELGENERAL, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 980, 530));

        panelBotonesPirncipales.setBackground(new java.awt.Color(13, 73, 161));
        panelBotonesPirncipales.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panelBotonesPirncipales.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 179, 10));

        lbltextoMARCA.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        lbltextoMARCA.setForeground(new java.awt.Color(255, 255, 255));
        lbltextoMARCA.setText("AutoCar Service");
        panelBotonesPirncipales.add(lbltextoMARCA, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        panelColorPrincipal.setBackground(new java.awt.Color(17, 92, 172));

        btnPrincipal.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btnPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        btnPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPrincipal/outline_home_white_24dp.png"))); // NOI18N
        btnPrincipal.setText("    Principal");
        btnPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPrincipalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPrincipalMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelColorPrincipalLayout = new javax.swing.GroupLayout(panelColorPrincipal);
        panelColorPrincipal.setLayout(panelColorPrincipalLayout);
        panelColorPrincipalLayout.setHorizontalGroup(
            panelColorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelColorPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelColorPrincipalLayout.setVerticalGroup(
            panelColorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        panelBotonesPirncipales.add(panelColorPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 280, 50));

        panelColorCatalogo.setBackground(new java.awt.Color(17, 92, 172));

        btnCatalogo.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btnCatalogo.setForeground(new java.awt.Color(255, 255, 255));
        btnCatalogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPrincipal/outline_list_white_24dp.png"))); // NOI18N
        btnCatalogo.setText("    Catalogo");
        btnCatalogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCatalogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCatalogoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCatalogoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelColorCatalogoLayout = new javax.swing.GroupLayout(panelColorCatalogo);
        panelColorCatalogo.setLayout(panelColorCatalogoLayout);
        panelColorCatalogoLayout.setHorizontalGroup(
            panelColorCatalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelColorCatalogoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCatalogo, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE))
        );
        panelColorCatalogoLayout.setVerticalGroup(
            panelColorCatalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCatalogo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        panelBotonesPirncipales.add(panelColorCatalogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 280, 50));

        panelColorDevoluciones.setBackground(new java.awt.Color(17, 92, 172));

        btnDevoluciones.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btnDevoluciones.setForeground(new java.awt.Color(255, 255, 255));
        btnDevoluciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPrincipal/outline_autorenew_white_24dp.png"))); // NOI18N
        btnDevoluciones.setText("    Mis publicaciones");
        btnDevoluciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDevoluciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDevolucionesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDevolucionesMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelColorDevolucionesLayout = new javax.swing.GroupLayout(panelColorDevoluciones);
        panelColorDevoluciones.setLayout(panelColorDevolucionesLayout);
        panelColorDevolucionesLayout.setHorizontalGroup(
            panelColorDevolucionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelColorDevolucionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnDevoluciones, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE))
        );
        panelColorDevolucionesLayout.setVerticalGroup(
            panelColorDevolucionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnDevoluciones, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        panelBotonesPirncipales.add(panelColorDevoluciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 280, 50));

        panelColorvender.setBackground(new java.awt.Color(17, 92, 172));

        btnVender.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btnVender.setForeground(new java.awt.Color(255, 255, 255));
        btnVender.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPrincipal/outline_shopping_cart_white_24dp.png"))); // NOI18N
        btnVender.setText("     Vender");
        btnVender.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVender.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVenderMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVenderMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelColorvenderLayout = new javax.swing.GroupLayout(panelColorvender);
        panelColorvender.setLayout(panelColorvenderLayout);
        panelColorvenderLayout.setHorizontalGroup(
            panelColorvenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelColorvenderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVender, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE))
        );
        panelColorvenderLayout.setVerticalGroup(
            panelColorvenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnVender, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        panelBotonesPirncipales.add(panelColorvender, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 280, 50));

        panelColorVendedores.setBackground(new java.awt.Color(17, 92, 172));

        btnVendedores.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btnVendedores.setForeground(new java.awt.Color(255, 255, 255));
        btnVendedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPrincipal/outline_account_box_white_24dp.png"))); // NOI18N
        btnVendedores.setText("    Vendedores");
        btnVendedores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVendedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVendedoresMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVendedoresMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelColorVendedoresLayout = new javax.swing.GroupLayout(panelColorVendedores);
        panelColorVendedores.setLayout(panelColorVendedoresLayout);
        panelColorVendedoresLayout.setHorizontalGroup(
            panelColorVendedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelColorVendedoresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVendedores, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE))
        );
        panelColorVendedoresLayout.setVerticalGroup(
            panelColorVendedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnVendedores, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        panelBotonesPirncipales.add(panelColorVendedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 280, 50));

        panelColorConfiguracion.setBackground(new java.awt.Color(17, 92, 172));

        btnConfiguracion.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btnConfiguracion.setForeground(new java.awt.Color(255, 255, 255));
        btnConfiguracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPrincipal/outline_settings_white_24dp.png"))); // NOI18N
        btnConfiguracion.setText("     Configuracion");
        btnConfiguracion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConfiguracion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnConfiguracionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnConfiguracionMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelColorConfiguracionLayout = new javax.swing.GroupLayout(panelColorConfiguracion);
        panelColorConfiguracion.setLayout(panelColorConfiguracionLayout);
        panelColorConfiguracionLayout.setHorizontalGroup(
            panelColorConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelColorConfiguracionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnConfiguracion, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE))
        );
        panelColorConfiguracionLayout.setVerticalGroup(
            panelColorConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnConfiguracion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        panelBotonesPirncipales.add(panelColorConfiguracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 280, 50));

        PanelColorverVentas.setBackground(new java.awt.Color(17, 92, 172));

        btnVerMisVentas.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btnVerMisVentas.setForeground(new java.awt.Color(255, 255, 255));
        btnVerMisVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPrincipal/outline_settings_white_24dp.png"))); // NOI18N
        btnVerMisVentas.setText("     Ver ventas");
        btnVerMisVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVerMisVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVerMisVentasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVerMisVentasMouseExited(evt);
            }
        });

        javax.swing.GroupLayout PanelColorverVentasLayout = new javax.swing.GroupLayout(PanelColorverVentas);
        PanelColorverVentas.setLayout(PanelColorverVentasLayout);
        PanelColorverVentasLayout.setHorizontalGroup(
            PanelColorverVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelColorverVentasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVerMisVentas, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE))
        );
        PanelColorverVentasLayout.setVerticalGroup(
            PanelColorverVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnVerMisVentas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        panelBotonesPirncipales.add(PanelColorverVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 280, 50));

        panelPrincipal.add(panelBotonesPirncipales, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 710));

        jLabel6.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel6.setText("Derechos reservados ©");
        panelPrincipal.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, -1, -1));

        PANELpanel.setBackground(new java.awt.Color(255, 255, 255));
        PANELpanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                PANELpanelMouseDragged(evt);
            }
        });
        PANELpanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PANELpanelMousePressed(evt);
            }
        });
        PANELpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelexit.setBackground(new java.awt.Color(255, 255, 255));

        lblExitr.setBackground(new java.awt.Color(255, 255, 255));
        lblExitr.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        lblExitr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblExitr.setText("X");
        lblExitr.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblExitr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblExitrMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblExitrMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblExitrMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblExitrMousePressed(evt);
            }
        });

        javax.swing.GroupLayout panelexitLayout = new javax.swing.GroupLayout(panelexit);
        panelexit.setLayout(panelexitLayout);
        panelexitLayout.setHorizontalGroup(
            panelexitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblExitr, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        panelexitLayout.setVerticalGroup(
            panelexitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblExitr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        PANELpanel.add(panelexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 0, 40, 40));

        panelPrincipal.add(PANELpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1260, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrincipalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrincipalMouseEntered
         panelColorPrincipal.setBackground(new Color(18,102,192));
    }//GEN-LAST:event_btnPrincipalMouseEntered

    private void btnPrincipalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrincipalMouseExited
        panelColorPrincipal.setBackground(new Color(17,92,172));
    }//GEN-LAST:event_btnPrincipalMouseExited

    private void btnCatalogoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCatalogoMouseEntered
       panelColorCatalogo.setBackground(new Color(18,102,192));
    }//GEN-LAST:event_btnCatalogoMouseEntered

    private void btnCatalogoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCatalogoMouseExited
       panelColorCatalogo.setBackground(new Color(17,92,172));
    }//GEN-LAST:event_btnCatalogoMouseExited

    private void btnDevolucionesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDevolucionesMouseEntered
        panelColorDevoluciones.setBackground(new Color(18,102,192));
    }//GEN-LAST:event_btnDevolucionesMouseEntered

    private void btnDevolucionesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDevolucionesMouseExited
        panelColorDevoluciones.setBackground(new Color(17,92,172));
    }//GEN-LAST:event_btnDevolucionesMouseExited

    private void btnVendedoresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVendedoresMouseEntered
        panelColorVendedores.setBackground(new Color(18,102,192));
    }//GEN-LAST:event_btnVendedoresMouseEntered

    private void btnVendedoresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVendedoresMouseExited
       panelColorVendedores.setBackground(new Color(17,92,172));
    }//GEN-LAST:event_btnVendedoresMouseExited

    private void btnVenderMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVenderMouseEntered
         panelColorvender.setBackground(new Color(18,102,192));
    }//GEN-LAST:event_btnVenderMouseEntered

    private void btnVenderMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVenderMouseExited
        panelColorvender.setBackground(new Color(17,92,172));
    }//GEN-LAST:event_btnVenderMouseExited

    private void btnConfiguracionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfiguracionMouseEntered
        panelColorConfiguracion.setBackground(new Color(18,102,192));
    }//GEN-LAST:event_btnConfiguracionMouseEntered

    private void btnConfiguracionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfiguracionMouseExited
        panelColorConfiguracion.setBackground(new Color(17,92,172));
    }//GEN-LAST:event_btnConfiguracionMouseExited

    private void lblExitrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitrMouseClicked
        System.exit(0);
        
    }//GEN-LAST:event_lblExitrMouseClicked

    private void lblExitrMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitrMouseEntered
        panelexit.setBackground(red);
        lblExitr.setForeground(Color.white);
    }//GEN-LAST:event_lblExitrMouseEntered

    private void lblExitrMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitrMouseExited
        panelexit.setBackground(Color.white);
        lblExitr.setForeground(Color.black);
    }//GEN-LAST:event_lblExitrMouseExited

    private void lblExitrMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitrMousePressed

    }//GEN-LAST:event_lblExitrMousePressed

    private void PANELpanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PANELpanelMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xmouse  , y - ymouse);
    }//GEN-LAST:event_PANELpanelMouseDragged

    private void PANELpanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PANELpanelMousePressed

        xmouse = evt.getX();
        ymouse = evt.getY();
    }//GEN-LAST:event_PANELpanelMousePressed

    private void btnVerMisVentasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerMisVentasMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVerMisVentasMouseEntered

    private void btnVerMisVentasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerMisVentasMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVerMisVentasMouseExited

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
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel BtnAccederVendedor;
    public javax.swing.JLabel BtnAceptarActualizar;
    public javax.swing.JLabel BtnEliminarCuenta;
    public javax.swing.JLabel CorreoVendedor;
    public javax.swing.JLabel FotoPerfil;
    public javax.swing.JTabbedPane PANELGENERAL;
    private javax.swing.JPanel PANELpanel;
    public javax.swing.JPanel PanelColorverVentas;
    public javax.swing.JPanel PanelPublicaciones;
    public javax.swing.JPanel TPpanelDevoluciones;
    private javax.swing.JPanel TPpanelPrincipal;
    public javax.swing.JPanel TPpanelVender;
    public javax.swing.JTextField TxtCorreo;
    public javax.swing.JLabel btnActualizar;
    public javax.swing.JLabel btnActualizar1;
    public javax.swing.JLabel btnCatalogo;
    public javax.swing.JLabel btnConfiguracion;
    public javax.swing.JLabel btnDevoluciones;
    public javax.swing.JLabel btnPrincipal;
    public javax.swing.JLabel btnRegistrarAuto;
    public javax.swing.JLabel btnRegistroVendedor;
    public javax.swing.JLabel btnSubirFoto;
    public javax.swing.JLabel btnVendedores;
    public javax.swing.JLabel btnVender;
    public javax.swing.JLabel btnVerMisVentas;
    public javax.swing.JLabel editarApellido;
    public javax.swing.JLabel editarContraseña;
    public javax.swing.JLabel editarCorreo;
    public javax.swing.JLabel editarDireccion;
    public javax.swing.JLabel editarNombre;
    public javax.swing.JLabel editarTelefono;
    public javax.swing.JLabel editardni;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    public javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    public javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField jTextField1;
    public javax.swing.JLabel lblExitr;
    private javax.swing.JLabel lbltextoMARCA;
    public javax.swing.JLabel nombreVendedor;
    private javax.swing.JPanel panelBotonesPirncipales;
    public javax.swing.JPanel panelCatalogo;
    public javax.swing.JPanel panelColorCatalogo;
    private javax.swing.JPanel panelColorConfiguracion;
    public javax.swing.JPanel panelColorDevoluciones;
    public javax.swing.JPanel panelColorPrincipal;
    private javax.swing.JPanel panelColorREGISTROAUTO;
    private javax.swing.JPanel panelColorSubirFoto;
    public javax.swing.JPanel panelColorVendedores;
    public javax.swing.JPanel panelColorvender;
    public javax.swing.JLabel panelDiseño;
    private javax.swing.JPanel panelDiseñoEstatico;
    private javax.swing.JPanel panelPrincipal;
    public javax.swing.JPanel panelVendedor3;
    private javax.swing.JPanel panelVendedores2;
    private javax.swing.JPanel panelexit;
    public javax.swing.JPanel prueba;
    public javax.swing.JPanel tabConfig;
    public javax.swing.JTable tablaventas;
    public javax.swing.JPanel tpPanelCatalogo;
    public javax.swing.JTextField txtApellido;
    public javax.swing.JTextField txtCilindrage;
    public javax.swing.JPasswordField txtContrasñea;
    public javax.swing.JTextArea txtDescripcion;
    public javax.swing.JTextField txtDireccion;
    public javax.swing.JTextField txtDni;
    public javax.swing.JTextField txtFoto;
    public javax.swing.JTextField txtKilometrage;
    public javax.swing.JTextField txtMarca;
    public javax.swing.JTextField txtMatricula;
    public javax.swing.JTextField txtModelo;
    public javax.swing.JTextField txtNombre;
    public javax.swing.JTextField txtPrecio;
    public javax.swing.JTextArea txtRequisitos;
    public javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
