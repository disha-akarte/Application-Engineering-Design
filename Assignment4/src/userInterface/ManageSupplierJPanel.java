/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface;

import business.Drug;
import business.DrugCatalog;
import business.StoreDirectory;
import initialization.Product;
import initialization.Supplier;
import initialization.SupplierDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SONY
 */
public class ManageSupplierJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageSupplierJPanel
     */
    private JPanel userProcessContainer;
    private SupplierDirectory supplierDirectory;
    private DrugCatalog drugCatalog;
    private StoreDirectory storeDirectory;

    public ManageSupplierJPanel(JPanel userProcessContainer, SupplierDirectory supplierDirectory,DrugCatalog drugCatalog) {

        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.supplierDirectory = supplierDirectory;
        this.drugCatalog = drugCatalog;

        for (Supplier s : supplierDirectory.getSupplierList()) {
            supplierComboBox.addItem(s);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        supplierComboBox = new javax.swing.JComboBox();
        btnAddCat = new javax.swing.JButton();
        lblAddSupp = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jDrugTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        supplierComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Supplier" }));
        supplierComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplierComboBoxActionPerformed(evt);
            }
        });

        btnAddCat.setText("ADD TO CVS CATALOG");
        btnAddCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCatActionPerformed(evt);
            }
        });

        lblAddSupp.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        lblAddSupp.setText("Add Supplier");
        lblAddSupp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jDrugTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Drug Name", "Drug Type", "Drug Contents", "Generic Name", "Dosage", "List Price"
            }
        ));
        jDrugTable.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        jScrollPane2.setViewportView(jDrugTable);

        jButton1.setText("<< BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblAddSupp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(supplierComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAddCat))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 273, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblAddSupp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(supplierComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btnAddCat))
                .addContainerGap(159, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void populateTable() {
        Supplier s = (Supplier) supplierComboBox.getSelectedItem();

        DefaultTableModel dtm = (DefaultTableModel) jDrugTable.getModel();
        int rowCount = dtm.getRowCount();

        for (int i = rowCount - 1; i >= 0; i--) {
            dtm.removeRow(i);
        }

        for (Product p : s.getPcatalog().getProductList()) {
            Object[] row = new Object[6];
            row[0] = p;
            row[1] = p.getProdType();
            row[2] = p.getProdContents();
            row[3] = p.getProdGenericName();
            row[4] = p.getProdDescription();
            row[5] = p.getListPrice();
            
            dtm.addRow(row);
        }

    }
    private void btnAddCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCatActionPerformed

        int index = supplierComboBox.getSelectedIndex();
        if(index <=0){
            JOptionPane.showMessageDialog(this,"Select Supplier First!");
            return;
        }
        
        int[] selectedRows = null;
        selectedRows = jDrugTable.getSelectedRows();
        //System.out.print(selectedRows);
        if (selectedRows.length == 0) {
            JOptionPane.showMessageDialog(this, "Row not selected");
        } 
        else {
           // System.out.print(selectedRows);

            for (int j = 0; j < selectedRows.length; j++) {

                Product p = (Product) jDrugTable.getValueAt(selectedRows[j], 0);
                Drug d = new Drug();
                d.setDrugName(p.getProductName());
                d.setDrugType(p.getProdType());
                d.setDosage(p.getProdDosage());
                d.setDrugContents(p.getProdContents());
                d.setDrugDescription(p.getProdDescription());
                d.setDruglistPrice(p.getListPrice());
                d.setWarning(p.getProdWarning());
                d.setGenericName(p.getProdGenericName());
                d.setPrecautions(p.getProdPrecautions());
                d.setManufactureBy(p.getProdManufactureBy());
                d.setOverdose(p.getProdOoverdose());
                drugCatalog.addDrug(d);
            }
            
            
            DefaultTableModel dtm = (DefaultTableModel) jDrugTable.getModel();
            int rowCount = dtm.getRowCount();

            for (int i = rowCount - 1; i >= 0; i--) {
                dtm.removeRow(i);
            }
            selectedRows = null;
            JOptionPane.showMessageDialog(this,"CVS Catalog Updated!!");

        }

    }//GEN-LAST:event_btnAddCatActionPerformed

    private void supplierComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplierComboBoxActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_supplierComboBoxActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCat;
    private javax.swing.JButton jButton1;
    private javax.swing.JTable jDrugTable;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAddSupp;
    private javax.swing.JComboBox supplierComboBox;
    // End of variables declaration//GEN-END:variables
}
