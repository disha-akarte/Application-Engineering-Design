/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface;

import business.Drug;
import business.DrugCatalog;
import business.StoreDirectory;
import initialization.SupplierDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author SONY
 */
public class ManageDrugWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageDrugWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private StoreDirectory storeDirectory;
    private SupplierDirectory supplierDirectory;
    private DrugCatalog drugCatalog;

    public ManageDrugWorkAreaJPanel(JPanel userProcessContainer, StoreDirectory storeDirectory, DrugCatalog drugCatalog) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.storeDirectory = storeDirectory;
        this.supplierDirectory = new SupplierDirectory();
        this.drugCatalog = drugCatalog;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnManageStore = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnManageSupp = new javax.swing.JButton();
        btnManageInv = new javax.swing.JButton();

        btnManageStore.setText("MANAGE STORE >>");
        btnManageStore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageStoreActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jLabel1.setText("My Work Area -CVS Admin Role");

        btnManageSupp.setText("MANAGE SUPPLIER >>");
        btnManageSupp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageSuppActionPerformed(evt);
            }
        });

        btnManageInv.setText("MANAGE INVENTORY");
        btnManageInv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageInvActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnManageStore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnManageSupp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnManageInv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(52, 52, 52)
                .addComponent(btnManageSupp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnManageStore)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnManageInv)
                .addContainerGap(120, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageStoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageStoreActionPerformed
        // TODO add your handling code here:
        ManageStoreJPanel mswajp = new ManageStoreJPanel(userProcessContainer, storeDirectory);
        userProcessContainer.add("StoreWorkAreaJPanel", mswajp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_btnManageStoreActionPerformed

    private void btnManageSuppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageSuppActionPerformed
        // TODO add your handling code here:
        ManageSupplierJPanel msjp = new ManageSupplierJPanel(userProcessContainer, supplierDirectory, drugCatalog);
        userProcessContainer.add("SupplierWorkAreaJPanel", msjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageSuppActionPerformed

    private void btnManageInvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageInvActionPerformed
        // TODO add your handling code here:
       
        for(Drug drug: drugCatalog.getDrugList())
            System.out.println("List:"+drug.getDrugName());
        ManageInventory mijp = new ManageInventory(userProcessContainer, drugCatalog,storeDirectory);
        userProcessContainer.add("ManageInventoryJPanel", mijp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageInvActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageInv;
    private javax.swing.JButton btnManageStore;
    private javax.swing.JButton btnManageSupp;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
