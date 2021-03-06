/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface;

import business.Business;
import business.ConfigureBusiness;
import business.ProductCatalog;
import business.SalesPersonDirectory;
import userInterface.AdminWorkArea.AdminWorkAreaJPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;
import userInterface.BusinessIntelligence.BusinessIntelligenceWorkAreaJPanel;
import userInterface.BusinessIntelligence.SalesCommisionJPanel;
import userInterface.SalesPersonRole.SalesPersonSelection;
import userInterface.SalesPersonRole.SalesPersonworkArea;



/**
 *
 * @author SONY
 */
public class MainJFrame extends javax.swing.JFrame {

    
    /**
     * Creates new form MainJFrame
     */
    
    
    private Business business;
    private SalesPersonDirectory salesPersonDirectory;
    private ProductCatalog productCatalog;
    
    public MainJFrame() {
        initComponents();
        setSize(800,400);
        this.business = ConfigureBusiness.initializeBusiness();
        salesPersonDirectory = business.getSalesPersonDirectory();
        productCatalog = business.getProductCatalog();
        
        
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
        jSplitPane2 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        btnSalesLogin = new javax.swing.JButton();
        btnBI = new javax.swing.JButton();
        btnAdmin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        userProcessContainer = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnSalesLogin.setText("Salesperson login");
        btnSalesLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalesLoginActionPerformed(evt);
            }
        });

        btnBI.setText("Business Intelligence");
        btnBI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBIActionPerformed(evt);
            }
        });

        btnAdmin.setText("Administrator");
        btnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userInterface/xeroxLogo.gif"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalesLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(59, 59, 59))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAdmin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalesLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBI)
                .addContainerGap(117, Short.MAX_VALUE))
        );

        jSplitPane2.setLeftComponent(jPanel1);

        userProcessContainer.setLayout(new java.awt.CardLayout());
        jSplitPane2.setRightComponent(userProcessContainer);

        getContentPane().add(jSplitPane2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalesLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalesLoginActionPerformed
        // TODO add your handling code here:
        SalesPersonworkArea spwajp = new SalesPersonworkArea(userProcessContainer, business);
        userProcessContainer.add(spwajp);
        CardLayout cl = (CardLayout)userProcessContainer.getLayout();
        cl.next(userProcessContainer);
    }//GEN-LAST:event_btnSalesLoginActionPerformed

    private void btnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminActionPerformed
        // TODO add your handling code here:
        AdminWorkAreaJPanel awjp = new AdminWorkAreaJPanel(userProcessContainer, salesPersonDirectory,productCatalog);
        userProcessContainer.add("Admin Work Area",awjp);
        CardLayout cl = (CardLayout)userProcessContainer.getLayout();
        cl.next(userProcessContainer);
    }//GEN-LAST:event_btnAdminActionPerformed

    private void btnBIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBIActionPerformed
        // TODO add your handling code here:
        BusinessIntelligenceWorkAreaJPanel bijp = new BusinessIntelligenceWorkAreaJPanel(userProcessContainer, business);
        userProcessContainer.add("Admin Work Area",bijp);
        CardLayout cl = (CardLayout)userProcessContainer.getLayout();
        cl.next(userProcessContainer);
    }//GEN-LAST:event_btnBIActionPerformed

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
    private javax.swing.JButton btnAdmin;
    private javax.swing.JButton btnBI;
    private javax.swing.JButton btnSalesLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JPanel userProcessContainer;
    // End of variables declaration//GEN-END:variables
}
