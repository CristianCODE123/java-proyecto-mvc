/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Color;
import static java.awt.Color.red;

/**
 *
 * @author 57321
 */
public class verPublicacionesCatalogo extends javax.swing.JFrame {

    /**
     * Creates new form verPublicacionesCatalogo
     */
    public verPublicacionesCatalogo() {
        initComponents();
        this.dispose();
        
    }
int xmouse,ymouse;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        panelVermas1 = new javax.swing.JPanel();
        PANELpanel = new javax.swing.JPanel();
        panelExit = new javax.swing.JPanel();
        lblExitr1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelVermas1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelVermas1Layout = new javax.swing.GroupLayout(panelVermas1);
        panelVermas1.setLayout(panelVermas1Layout);
        panelVermas1Layout.setHorizontalGroup(
            panelVermas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 998, Short.MAX_VALUE)
        );
        panelVermas1Layout.setVerticalGroup(
            panelVermas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 608, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(panelVermas1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 37, 1000, 610));

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

        panelExit.setBackground(new java.awt.Color(255, 255, 255));
        panelExit.setForeground(new java.awt.Color(255, 255, 255));
        panelExit.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblExitr1.setBackground(new java.awt.Color(255, 255, 255));
        lblExitr1.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        lblExitr1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblExitr1.setText("X");
        lblExitr1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblExitr1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblExitr1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblExitr1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblExitr1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblExitr1MousePressed(evt);
            }
        });
        panelExit.add(lblExitr1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 34, 40));

        javax.swing.GroupLayout PANELpanelLayout = new javax.swing.GroupLayout(PANELpanel);
        PANELpanel.setLayout(PANELpanelLayout);
        PANELpanelLayout.setHorizontalGroup(
            PANELpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANELpanelLayout.createSequentialGroup()
                .addComponent(panelExit, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 962, Short.MAX_VALUE))
        );
        PANELpanelLayout.setVerticalGroup(
            PANELpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PANELpanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelExit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(PANELpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblExitr1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitr1MouseClicked

    }//GEN-LAST:event_lblExitr1MouseClicked

    private void lblExitr1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitr1MouseEntered
        panelExit.setBackground(red);
        lblExitr1.setForeground(Color.white);
    }//GEN-LAST:event_lblExitr1MouseEntered

    private void lblExitr1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitr1MouseExited
        panelExit.setBackground(Color.white);
        lblExitr1.setForeground(Color.black);
    }//GEN-LAST:event_lblExitr1MouseExited

    private void lblExitr1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitr1MousePressed
        panelExit.setBackground(Color.WHITE);
        lblExitr1.setForeground(Color.BLACK);
        dispose();
        limpia();
    }//GEN-LAST:event_lblExitr1MousePressed

    private void PANELpanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PANELpanelMouseDragged
                int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xmouse  , y - ymouse);
    }//GEN-LAST:event_PANELpanelMouseDragged

    private void PANELpanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PANELpanelMousePressed
              xmouse = evt.getX();
        ymouse = evt.getY();
    }//GEN-LAST:event_PANELpanelMousePressed
    public void limpia() {
        panelVermas1.removeAll();
        //jpActivitiesAll.validate();
        panelVermas1.revalidate(); //Parece ser que esto recarga la ventana
    }
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
            java.util.logging.Logger.getLogger(verPublicacionesCatalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(verPublicacionesCatalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(verPublicacionesCatalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(verPublicacionesCatalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new verPublicacionesCatalogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PANELpanel;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblExitr1;
    private javax.swing.JPanel panelExit;
    public javax.swing.JPanel panelVermas1;
    // End of variables declaration//GEN-END:variables
}
