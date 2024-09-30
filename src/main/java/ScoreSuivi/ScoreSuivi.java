/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ScoreSuivi;

import MonProfil.*;
import Accueil.Accueil;
import Bibliotheque.Bibliotheque;
import Cours.Cours;
import LesDefits.LesDefits;
import Messages.Messages;
import Reunion.Reunion;
import ScoreSuivi.ScoreSuivi;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


/**
 *
 * @author Lenovo IdeaPad L340
 */
public class ScoreSuivi extends javax.swing.JFrame {

    /**
     * Creates new form Principale
     */
    public ScoreSuivi() {
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

        jPopupMenu = new javax.swing.JPopupMenu();
        Acceuil = new javax.swing.JMenuItem();
        Cours = new javax.swing.JMenuItem();
        MonProfil = new javax.swing.JMenuItem();
        Messages = new javax.swing.JMenuItem();
        Reunion = new javax.swing.JMenuItem();
        Bibliotheque = new javax.swing.JMenuItem();
        LesDefits = new javax.swing.JMenuItem();
        ScoreSuivi = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        Acceuil.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        Acceuil.setText("Accceuil");
        Acceuil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcceuilActionPerformed(evt);
            }
        });
        jPopupMenu.add(Acceuil);

        Cours.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        Cours.setText("Cours");
        Cours.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CoursActionPerformed(evt);
            }
        });
        jPopupMenu.add(Cours);

        MonProfil.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        MonProfil.setText("Profile");
        MonProfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MonProfilActionPerformed(evt);
            }
        });
        jPopupMenu.add(MonProfil);

        Messages.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        Messages.setText("Messages");
        Messages.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MessagesActionPerformed(evt);
            }
        });
        jPopupMenu.add(Messages);

        Reunion.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        Reunion.setText("Reunion");
        Reunion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReunionActionPerformed(evt);
            }
        });
        jPopupMenu.add(Reunion);

        Bibliotheque.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        Bibliotheque.setText("Bibliothèque");
        Bibliotheque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BibliothequeActionPerformed(evt);
            }
        });
        jPopupMenu.add(Bibliotheque);

        LesDefits.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        LesDefits.setText("Les Défits");
        LesDefits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LesDefitsActionPerformed(evt);
            }
        });
        jPopupMenu.add(LesDefits);

        ScoreSuivi.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        ScoreSuivi.setText("Score / Suivi");
        ScoreSuivi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ScoreSuiviActionPerformed(evt);
            }
        });
        jPopupMenu.add(ScoreSuivi);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(640, 480));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon("D:\\ETUDE\\SEMESTRE 05\\IHM\\FrançaisFacile\\FrancaisFacile\\src\\main\\java\\Images\\ScoreSuivi.png")); // NOI18N
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setIcon(new javax.swing.ImageIcon("D:\\ETUDE\\SEMESTRE 05\\IHM\\FrançaisFacile\\FrancaisFacile\\src\\main\\java\\Images\\Menu.png")); // NOI18N
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.setBorderPainted(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("  Menu");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 624, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 394, Short.MAX_VALUE)
        );

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setIcon(new javax.swing.ImageIcon("D:\\ETUDE\\SEMESTRE 05\\IHM\\FrançaisFacile\\FrancaisFacile\\src\\main\\java\\Images\\Retour.png")); // NOI18N
        jButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.setBorderPainted(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("  Retour");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(243, 243, 243)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(1, 1, 1)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(1, 1, 1)
                        .addComponent(jButton2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton2.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                jPopupMenu.show(e.getComponent(), e.getX(), e.getY());
            }
        });

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        Accueil nextInterface = new Accueil();
        nextInterface.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void AcceuilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcceuilActionPerformed
        // TODO add your handling code here:
        Accueil nextInterface = new Accueil();
        nextInterface.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_AcceuilActionPerformed

    private void CoursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CoursActionPerformed
        // TODO add your handling code here:
        Cours nextInterface = new Cours();
        nextInterface.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_CoursActionPerformed

    private void MonProfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MonProfilActionPerformed
        // TODO add your handling code here:
        ScoreSuivi nextInterface = new ScoreSuivi();
        nextInterface.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_MonProfilActionPerformed

    private void MessagesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MessagesActionPerformed
        // TODO add your handling code here:
        Messages nextInterface = new Messages();
        nextInterface.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_MessagesActionPerformed

    private void ReunionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReunionActionPerformed
        // TODO add your handling code here:
        Reunion nextInterface = new Reunion();
        nextInterface.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_ReunionActionPerformed

    private void BibliothequeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BibliothequeActionPerformed
        // TODO add your handling code here:
        Bibliotheque nextInterface = new Bibliotheque();
        nextInterface.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_BibliothequeActionPerformed

    private void LesDefitsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LesDefitsActionPerformed
        // TODO add your handling code here:
        LesDefits nextInterface = new LesDefits();
        nextInterface.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_LesDefitsActionPerformed

    private void ScoreSuiviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ScoreSuiviActionPerformed
        // TODO add your handling code here:
        ScoreSuivi nextInterface = new ScoreSuivi();
        nextInterface.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_ScoreSuiviActionPerformed

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
            java.util.logging.Logger.getLogger(ScoreSuivi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ScoreSuivi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ScoreSuivi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ScoreSuivi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ScoreSuivi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Acceuil;
    private javax.swing.JMenuItem Bibliotheque;
    private javax.swing.JMenuItem Cours;
    private javax.swing.JMenuItem LesDefits;
    private javax.swing.JMenuItem Messages;
    private javax.swing.JMenuItem MonProfil;
    private javax.swing.JMenuItem Reunion;
    private javax.swing.JMenuItem ScoreSuivi;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    public javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu;
    // End of variables declaration//GEN-END:variables
}
