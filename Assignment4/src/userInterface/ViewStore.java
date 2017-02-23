package userInterface;

//import addStoreUserInterface.Pharma;
import business.Store;
import business.Drug;
import business.DrugItem;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class ViewStore extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Store store;
    private DrugItem drugI;

    public ViewStore(JPanel upc, Store s) {
        initComponents();
        this.userProcessContainer = upc;
        this.store = s;
        storeName.setText(s.getStoreID());
        refreshTable();

    }

    public void refreshTable() {
        int rowCount = storeCatalog.getRowCount();
        DefaultTableModel model = (DefaultTableModel) storeCatalog.getModel();
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        for (DrugItem drugItem : store.getDrugInventory().getDrugInventory()) {
            Object row[] = new Object[5];
            row[0] = drugItem;
            row[1] = drugItem.getDrug().getDrugName();
            row[2] = drugItem.getExpiration_date();
            row[3] = drugItem.getQuantity();

            int quant = Integer.parseInt(drugItem.getQuantity());
            if (quant <= 5) {
                row[4] = "Below Threshold";
            } else {
                row[4] = "In Stock";
            }
            model.addRow(row);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        storeName = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        storeCatalog = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        btnViewMoreDetails = new javax.swing.JButton();

        storeName.setText("jLabel1");

        storeCatalog.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Drug Serial Number", "Drug Name", "Drug Expiry", "Quantity", "Threshold"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(storeCatalog);

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnViewMoreDetails.setText("View More Details >>");
        btnViewMoreDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewMoreDetailsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(storeName, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(btnViewMoreDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(148, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(storeName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnViewMoreDetails))
                .addContainerGap(209, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnViewMoreDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewMoreDetailsActionPerformed
        // TODO add your handling code here:
        int selectedRow = storeCatalog.getSelectedRow();
          
        if (selectedRow >= 0) {
            drugI = (DrugItem) storeCatalog.getValueAt(selectedRow, 0);
            DetailedDrugReport ddjp = new DetailedDrugReport(userProcessContainer, drugI);
            userProcessContainer.add("AdminWorkAreaJPanel", ddjp);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
            
        }
        else{
            JOptionPane.showMessageDialog(this, "No items to display");
            return;
        }
    }//GEN-LAST:event_btnViewMoreDetailsActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnViewMoreDetails;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable storeCatalog;
    private javax.swing.JLabel storeName;
    // End of variables declaration//GEN-END:variables
}
