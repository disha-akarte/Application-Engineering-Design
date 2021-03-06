/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.SalesPersonRole;

import business.Business;
import business.CustomerDirectory;
import business.MasterOrderCatalog;
import business.ProductCatalog;
import business.SalesPersonDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author SONY
 */
public class SalesPersonworkArea extends javax.swing.JPanel {

    /**
     * Creates new form ManageCustomerJPanel
     */
    private SalesPersonDirectory salesPersonDirectory;
    private ProductCatalog productCatalog;
    private CustomerDirectory customerDirectory;
    private MasterOrderCatalog masterOrderCatalog;
    private JPanel userProcessContainer;
    private Business business;
    
    public SalesPersonworkArea(JPanel userProcessContainer, Business business) {
        initComponents();
        this.business = business;
        this.userProcessContainer = userProcessContainer;
        this.salesPersonDirectory = business.getSalesPersonDirectory();
        this.productCatalog = business.getProductCatalog();
        this.masterOrderCatalog = business.getMasterOrderCatalog();
        this.customerDirectory = business.getCustomerDirectory();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnManageCustomer = new javax.swing.JButton();
        btnPlaceOrder = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        btnManageCustomer.setText("Manage Customer");
        btnManageCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageCustomerActionPerformed(evt);
            }
        });

        btnPlaceOrder.setText("Place Order");
        btnPlaceOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlaceOrderActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel1.setText("SalesPerson Work Area");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnManageCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnPlaceOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1))
                .addContainerGap(215, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(btnManageCustomer)
                .addGap(18, 18, 18)
                .addComponent(btnPlaceOrder)
                .addContainerGap(182, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageCustomerActionPerformed
         //TODO add your handling code here:
        
        SelectCustomerJPanel spwajp = new SelectCustomerJPanel(userProcessContainer, business);
        userProcessContainer.add(spwajp);
        CardLayout cl = (CardLayout)userProcessContainer.getLayout();
        cl.next(userProcessContainer);
    }//GEN-LAST:event_btnManageCustomerActionPerformed

    private void btnPlaceOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlaceOrderActionPerformed
        // TODO add your handling code here:
        SalesPersonSelection spsjp = new SalesPersonSelection(userProcessContainer,business);
        userProcessContainer.add(spsjp);
        CardLayout cl = (CardLayout)userProcessContainer.getLayout();
        cl.next(userProcessContainer);
    }//GEN-LAST:event_btnPlaceOrderActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageCustomer;
    private javax.swing.JButton btnPlaceOrder;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
