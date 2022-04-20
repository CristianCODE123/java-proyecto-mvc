
package vista;

import java.awt.Color;
import static java.awt.Color.red;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class inicioSesion extends javax.swing.JFrame {
    int xmouse,ymouse;
    FondoPanel fondo = new FondoPanel();
    public inicioSesion() {
        this.setContentPane(fondo);
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        lblNombreCompañia = new javax.swing.JLabel();
        lblImagen = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        lbltextIniciarSesion = new javax.swing.JLabel();
        lblTextContraseña = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtUsuario = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        txtContraseña = new javax.swing.JPasswordField();
        lbltextUsuario = new javax.swing.JLabel();
        panelRegistrarse = new javax.swing.JPanel();
        btnRegistrarse = new javax.swing.JLabel();
        panelEntrar = new javax.swing.JPanel();
        btnEntrar = new javax.swing.JLabel();
        panelexit = new javax.swing.JPanel();
        lblExitr = new javax.swing.JLabel();
        PANELpanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombreCompañia.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        lblNombreCompañia.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreCompañia.setText("AUTOCAR SERVICE");
        bg.add(lblNombreCompañia, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 450, 170, -1));

        lblImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bvnvbnvbnvbn - copia.png"))); // NOI18N
        bg.add(lblImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, 370, 550));

        lblLogo.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPrincipal/pngegg (1) (1).png"))); // NOI18N
        lblLogo.setText("LOGO");
        bg.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 240, 90));

        lbltextIniciarSesion.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        lbltextIniciarSesion.setText("INICIAR SESION");
        bg.add(lbltextIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 200, 30));

        lblTextContraseña.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        lblTextContraseña.setText("CONTRASEÑA");
        bg.add(lblTextContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 110, 40));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 420, 10));

        txtUsuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(204, 204, 204));
        txtUsuario.setText("Ingrese su nombre");
        txtUsuario.setBorder(null);
        txtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtUsuarioMousePressed(evt);
            }
        });
        bg.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 350, 30));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, 420, 30));

        txtContraseña.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtContraseña.setForeground(new java.awt.Color(204, 204, 204));
        txtContraseña.setText("********");
        txtContraseña.setBorder(null);
        txtContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtContraseñaMousePressed(evt);
            }
        });
        txtContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraseñaActionPerformed(evt);
            }
        });
        bg.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, 380, -1));

        lbltextUsuario.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        lbltextUsuario.setText("CORREO");
        bg.add(lbltextUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 80, 40));

        panelRegistrarse.setBackground(new java.awt.Color(59, 163, 225));
        panelRegistrarse.setForeground(new java.awt.Color(59, 163, 225));

        btnRegistrarse.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnRegistrarse.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarse.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnRegistrarse.setText("REGISTRARSE");
        btnRegistrarse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrarse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegistrarseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegistrarseMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelRegistrarseLayout = new javax.swing.GroupLayout(panelRegistrarse);
        panelRegistrarse.setLayout(panelRegistrarseLayout);
        panelRegistrarseLayout.setHorizontalGroup(
            panelRegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnRegistrarse, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        panelRegistrarseLayout.setVerticalGroup(
            panelRegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRegistrarseLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnRegistrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bg.add(panelRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 430, 100, 40));

        panelEntrar.setBackground(new java.awt.Color(59, 163, 225));
        panelEntrar.setForeground(new java.awt.Color(59, 163, 225));

        btnEntrar.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnEntrar.setForeground(new java.awt.Color(255, 255, 255));
        btnEntrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEntrar.setText("ENTRAR");
        btnEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEntrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEntrarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelEntrarLayout = new javax.swing.GroupLayout(panelEntrar);
        panelEntrar.setLayout(panelEntrarLayout);
        panelEntrarLayout.setHorizontalGroup(
            panelEntrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEntrarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelEntrarLayout.setVerticalGroup(
            panelEntrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEntrarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bg.add(panelEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 430, 90, 40));

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
            .addComponent(lblExitr, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        bg.add(panelexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

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

        javax.swing.GroupLayout PANELpanelLayout = new javax.swing.GroupLayout(PANELpanel);
        PANELpanel.setLayout(PANELpanelLayout);
        PANELpanelLayout.setHorizontalGroup(
            PANELpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1010, Short.MAX_VALUE)
        );
        PANELpanelLayout.setVerticalGroup(
            PANELpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        bg.add(PANELpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 970, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraseñaActionPerformed

    private void PANELpanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PANELpanelMousePressed
      
        xmouse = evt.getX();
       ymouse = evt.getY();
       
    }//GEN-LAST:event_PANELpanelMousePressed

    private void PANELpanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PANELpanelMouseDragged
         int x = evt.getXOnScreen();
       int y = evt.getYOnScreen();
        this.setLocation(x - xmouse  , y - ymouse);
    }//GEN-LAST:event_PANELpanelMouseDragged

    private void lblExitrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitrMouseClicked
       System.exit(0);
    }//GEN-LAST:event_lblExitrMouseClicked

    private void lblExitrMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitrMousePressed
       
    }//GEN-LAST:event_lblExitrMousePressed

    private void lblExitrMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitrMouseEntered
        panelexit.setBackground(red);
        lblExitr.setForeground(Color.white);
    }//GEN-LAST:event_lblExitrMouseEntered

    private void lblExitrMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitrMouseExited
        panelexit.setBackground(Color.white);
        lblExitr.setForeground(Color.black);
    }//GEN-LAST:event_lblExitrMouseExited

    private void btnEntrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntrarMouseEntered
       panelEntrar.setBackground(new Color(173,225,224));
    }//GEN-LAST:event_btnEntrarMouseEntered

    private void btnEntrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntrarMouseExited
        panelEntrar.setBackground(new Color(59,163,225));
    }//GEN-LAST:event_btnEntrarMouseExited

    private void btnRegistrarseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarseMouseEntered
       panelRegistrarse.setBackground(new Color(173,225,224));
    }//GEN-LAST:event_btnRegistrarseMouseEntered

    private void btnRegistrarseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarseMouseExited
        panelRegistrarse.setBackground(new Color(59,163,225));
    }//GEN-LAST:event_btnRegistrarseMouseExited

    private void txtUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuarioMousePressed
      if(txtUsuario.getText().equals("Ingrese su nombre")){
        txtUsuario.setText("");
       txtUsuario.setForeground(Color.black);
      }
    }//GEN-LAST:event_txtUsuarioMousePressed

    private void txtContraseñaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContraseñaMousePressed
        if(txtContraseña.getText().equals("********")){
            txtContraseña.setText("");
        txtContraseña.setForeground(Color.black);
        }
        
    }//GEN-LAST:event_txtContraseñaMousePressed

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
            java.util.logging.Logger.getLogger(inicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inicioSesion().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PANELpanel;
    private javax.swing.JPanel bg;
    public javax.swing.JLabel btnEntrar;
    public javax.swing.JLabel btnRegistrarse;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblExitr;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblNombreCompañia;
    private javax.swing.JLabel lblTextContraseña;
    private javax.swing.JLabel lbltextIniciarSesion;
    private javax.swing.JLabel lbltextUsuario;
    private javax.swing.JPanel panelEntrar;
    private javax.swing.JPanel panelRegistrarse;
    private javax.swing.JPanel panelexit;
    public javax.swing.JPasswordField txtContraseña;
    public javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
class FondoPanel extends JPanel{
    private Image imagen;
    
    @Override
    public void paint(Graphics g){
        imagen = new ImageIcon(getClass().getResource("/imagenes/fondoinicio.jpg")).getImage();
        g.drawImage(imagen, 0, 0, getWidth(),getHeight(),this);
        
        setOpaque(false);
        
        super.paint(g);
    }
}

}
