/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import business.Person;
import business.VitalSign;
import business.VitalSignHistory;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SONY
 */
public class ViewChartJPanel extends javax.swing.JPanel {
    private  JPanel userProcessContainer;
    private  VitalSignHistory vitalSignHistory;
    private Chart chart;
    private Person p;
    /**
     * Creates new form ViewChartJPanel
     */
    public ViewChartJPanel(JPanel userProcessContainer, VitalSignHistory vitalSignHistory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.vitalSignHistory = vitalSignHistory;
    //jInternalChartFrame = new javax.swing.JInternalFrame();

        populateVitalTable();

        populateChart();

    }

    

    private void populateVitalTable() {
       // p = (Person)jTable1.getSelectedRow();

        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        int rowCount = dtm.getRowCount();

        for (int i = rowCount - 1; i >= 0; i--) {
            dtm.removeRow(i);
        }

        for (VitalSign vs : vitalSignHistory.getVSHistory()) {
            Object[] row = new Object[5];
            row[0] = vs;
            row[1] = vs.getRespRate();
            row[2] = vs.getHeartRate();
            row[3]= vs.getBloodPressure();
            row[4] = vs.getWeight();
            dtm.addRow(row);
        }
        
    }
    

    public void populateChart()
    {
        chart= new Chart(vitalSignHistory);
        chart.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        jTable1.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Timestamp", "Respiratory Rate", "Heart Rate", "Blood Pressure", "Weight(in pounds)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jLabel1.setText("Graphical Vital Sign Details ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jLabel1)))
                .addContainerGap(172, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(337, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
