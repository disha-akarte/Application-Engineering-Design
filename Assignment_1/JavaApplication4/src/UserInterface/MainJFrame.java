/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.Person;

/**
 *
 * @author SONY
 */
public class MainJFrame extends javax.swing.JFrame {

    private Person p1 = new Person();
    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
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

        jSplitPane1 = new javax.swing.JSplitPane();
        LeftjPanel = new javax.swing.JPanel();
        BtnCreateProfile = new javax.swing.JButton();
        BtnViewProfile = new javax.swing.JButton();
        RightjPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BtnCreateProfile.setText("Create a new profile");
        BtnCreateProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCreateProfileActionPerformed(evt);
            }
        });

        BtnViewProfile.setText("View the profile");
        BtnViewProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnViewProfileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LeftjPanelLayout = new javax.swing.GroupLayout(LeftjPanel);
        LeftjPanel.setLayout(LeftjPanelLayout);
        LeftjPanelLayout.setHorizontalGroup(
            LeftjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftjPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LeftjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnViewProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnCreateProfile))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        LeftjPanelLayout.setVerticalGroup(
            LeftjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftjPanelLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(BtnCreateProfile)
                .addGap(34, 34, 34)
                .addComponent(BtnViewProfile)
                .addContainerGap(131, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(LeftjPanel);

        javax.swing.GroupLayout RightjPanelLayout = new javax.swing.GroupLayout(RightjPanel);
        RightjPanel.setLayout(RightjPanelLayout);
        RightjPanelLayout.setHorizontalGroup(
            RightjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 293, Short.MAX_VALUE)
        );
        RightjPanelLayout.setVerticalGroup(
            RightjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 298, Short.MAX_VALUE)
        );

        jSplitPane1.setRightComponent(RightjPanel);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnViewProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnViewProfileActionPerformed
    ViewJPanel createPanel = new ViewJPanel(p1);
    jSplitPane1.setRightComponent(createPanel);   // TODO add your handling code here:
    }//GEN-LAST:event_BtnViewProfileActionPerformed

    private void BtnCreateProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCreateProfileActionPerformed
    CreateJPanel createPanel = new CreateJPanel(p1);
    jSplitPane1.setRightComponent(createPanel);        // TODO add your handling code here:
    }//GEN-LAST:event_BtnCreateProfileActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCreateProfile;
    private javax.swing.JButton BtnViewProfile;
    private javax.swing.JPanel LeftjPanel;
    private javax.swing.JPanel RightjPanel;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}
