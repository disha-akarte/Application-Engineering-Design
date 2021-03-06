/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.BusinessIntelligence;

import business.Product;
import business.SalesPersonDirectory;
import business.Salesperson;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SONY
 */
public class SalesCommisionJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SalesCommisionJPanel
     */
    private JPanel userProcessContainer;
    private SalesPersonDirectory salesPersonDirectory;
    
    public SalesCommisionJPanel(JPanel userProcessContainer,SalesPersonDirectory salesPersonDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.salesPersonDirectory = salesPersonDirectory;
        populateTable();  
    }

    public void populateTable(){
        
        DefaultTableModel dtm = (DefaultTableModel)commisionTable.getModel();
        dtm.setRowCount(0);

        for (Salesperson salesperson : salesPersonDirectory.getSalesPersonDirectory()) {
            Object row[] = new Object[2];
            row[0] = salesperson;
            row[1] = salesperson.getCommision();
            
            dtm.addRow(row);

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

        jScrollPane1 = new javax.swing.JScrollPane();
        commisionTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        commisionTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SalesID", "Total Commision"
            }
        ));
        jScrollPane1.setViewportView(commisionTable);

        jLabel2.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel2.setText("Total Commision");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable commisionTable;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
