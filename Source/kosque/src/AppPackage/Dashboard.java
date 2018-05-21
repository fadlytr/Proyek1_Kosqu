/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppPackage;

import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author Imanda Syahrul R
 */
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BG = new javax.swing.JPanel();
        sidePanel = new javax.swing.JPanel();
        judulApp = new javax.swing.JLabel();
        PanelSignUP = new javax.swing.JPanel();
        iconLabel1 = new javax.swing.JLabel();
        Loggin1 = new javax.swing.JLabel();
        PanelStatistic = new javax.swing.JPanel();
        iconAbout1 = new javax.swing.JLabel();
        about1 = new javax.swing.JLabel();
        PanelLogout = new javax.swing.JPanel();
        iconLogout = new javax.swing.JLabel();
        Logout = new javax.swing.JLabel();
        PanelAbout = new javax.swing.JPanel();
        iconAbout = new javax.swing.JLabel();
        about = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1119, 685));

        BG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sidePanel.setBackground(new java.awt.Color(255, 255, 255));
        sidePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        judulApp.setBackground(new java.awt.Color(0, 51, 102));
        judulApp.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        judulApp.setForeground(new java.awt.Color(0, 51, 102));
        judulApp.setText("KosQu");
        sidePanel.add(judulApp, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        PanelSignUP.setBackground(new java.awt.Color(165, 178, 243));
        PanelSignUP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PanelSignUPMousePressed(evt);
            }
        });

        iconLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/icons/icons8_Add_User_Male_32px.png"))); // NOI18N
        iconLabel1.setToolTipText("");

        Loggin1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Loggin1.setForeground(new java.awt.Color(255, 255, 255));
        Loggin1.setText("Sign Up");

        javax.swing.GroupLayout PanelSignUPLayout = new javax.swing.GroupLayout(PanelSignUP);
        PanelSignUP.setLayout(PanelSignUPLayout);
        PanelSignUPLayout.setHorizontalGroup(
            PanelSignUPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSignUPLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(iconLabel1)
                .addGap(6, 6, 6)
                .addComponent(Loggin1))
        );
        PanelSignUPLayout.setVerticalGroup(
            PanelSignUPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSignUPLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(iconLabel1))
            .addGroup(PanelSignUPLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(Loggin1))
        );

        sidePanel.add(PanelSignUP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 330, 60));

        PanelStatistic.setBackground(new java.awt.Color(165, 178, 243));
        PanelStatistic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PanelStatisticMousePressed(evt);
            }
        });

        iconAbout1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/icons/icons8_Statistics_32px_2.png"))); // NOI18N
        iconAbout1.setToolTipText("");

        about1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        about1.setForeground(new java.awt.Color(255, 255, 255));
        about1.setText("Statistic");

        javax.swing.GroupLayout PanelStatisticLayout = new javax.swing.GroupLayout(PanelStatistic);
        PanelStatistic.setLayout(PanelStatisticLayout);
        PanelStatisticLayout.setHorizontalGroup(
            PanelStatisticLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelStatisticLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(iconAbout1)
                .addGap(6, 6, 6)
                .addComponent(about1))
        );
        PanelStatisticLayout.setVerticalGroup(
            PanelStatisticLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelStatisticLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(iconAbout1))
            .addGroup(PanelStatisticLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(about1))
        );

        sidePanel.add(PanelStatistic, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 330, 60));

        PanelLogout.setBackground(new java.awt.Color(165, 178, 243));
        PanelLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PanelLogoutMousePressed(evt);
            }
        });

        iconLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/icons/icons8_Logout_Rounded_Up_32px_1.png"))); // NOI18N
        iconLogout.setToolTipText("");

        Logout.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Logout.setForeground(new java.awt.Color(255, 255, 255));
        Logout.setText("Sign Out");

        javax.swing.GroupLayout PanelLogoutLayout = new javax.swing.GroupLayout(PanelLogout);
        PanelLogout.setLayout(PanelLogoutLayout);
        PanelLogoutLayout.setHorizontalGroup(
            PanelLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLogoutLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(iconLogout)
                .addGap(6, 6, 6)
                .addComponent(Logout))
        );
        PanelLogoutLayout.setVerticalGroup(
            PanelLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLogoutLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(iconLogout))
            .addGroup(PanelLogoutLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(Logout))
        );

        sidePanel.add(PanelLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 330, 60));

        PanelAbout.setBackground(new java.awt.Color(165, 178, 243));
        PanelAbout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PanelAboutMousePressed(evt);
            }
        });

        iconAbout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/icons/icons8_Info_32px.png"))); // NOI18N
        iconAbout.setToolTipText("");

        about.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        about.setForeground(new java.awt.Color(255, 255, 255));
        about.setText("About");

        javax.swing.GroupLayout PanelAboutLayout = new javax.swing.GroupLayout(PanelAbout);
        PanelAbout.setLayout(PanelAboutLayout);
        PanelAboutLayout.setHorizontalGroup(
            PanelAboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAboutLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(iconAbout)
                .addGap(6, 6, 6)
                .addComponent(about))
        );
        PanelAboutLayout.setVerticalGroup(
            PanelAboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAboutLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(iconAbout))
            .addGroup(PanelAboutLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(about))
        );

        sidePanel.add(PanelAbout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 330, 60));

        BG.add(sidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 683));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 790, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
        );

        BG.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 790, 680));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PanelSignUPMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelSignUPMousePressed
        //@author Imanda_Syahrul_Ramadhan
        // TODO add your handling code here:
        setColor(PanelSignUP);
        
        resetColor(PanelAbout);
        resetColor(PanelStatistic);
        new FormSignUp().setVisible(true);
    }//GEN-LAST:event_PanelSignUPMousePressed

    private void PanelStatisticMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelStatisticMousePressed
        // TODO add your handling code here:
        setColor(PanelStatistic);
        resetColor(PanelSignUP);
        resetColor(PanelAbout);
        
    }//GEN-LAST:event_PanelStatisticMousePressed

    private void PanelAboutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelAboutMousePressed
        //@author Imanda_Syahrul_Ramadhan
        // TODO add your handling code here:
        setColor(PanelAbout);
        
        resetColor(PanelSignUP);
        resetColor(PanelStatistic);
    }//GEN-LAST:event_PanelAboutMousePressed

    private void PanelLogoutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelLogoutMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_PanelLogoutMousePressed

    //@author Imanda_Syahrul_Ramadhan
    
    void setColor(JPanel panel){
        panel.setBackground(new Color(140,158,243));
    }
    void resetColor(JPanel panel){
        panel.setBackground(new Color(165,178,243));
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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG;
    private javax.swing.JLabel Loggin1;
    private javax.swing.JLabel Logout;
    private javax.swing.JPanel PanelAbout;
    private javax.swing.JPanel PanelLogout;
    private javax.swing.JPanel PanelSignUP;
    private javax.swing.JPanel PanelStatistic;
    private javax.swing.JLabel about;
    private javax.swing.JLabel about1;
    private javax.swing.JLabel iconAbout;
    private javax.swing.JLabel iconAbout1;
    private javax.swing.JLabel iconLabel1;
    private javax.swing.JLabel iconLogout;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel judulApp;
    private javax.swing.JPanel sidePanel;
    // End of variables declaration//GEN-END:variables
}
