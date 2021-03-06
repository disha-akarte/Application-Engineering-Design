/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.VehicleRole;
import Business.City.City;
import Business.Country.Country;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organization.AmbulanceOrganization;
import Business.Organization.Organization;
import Business.Organization.PoliceOrganization;
import Business.Organization.VehicleOrganization;
import Business.State.State;
import Business.UserAccount.UserAccount;
import Business.Vehicle.Accident;
import Business.Vehicle.Vehicle;
import Business.WorkQueue.AmbulanceReportWorkRequest;
import Business.WorkQueue.PoliceReportWorkRequest;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author SONY
 */
public class VehicleWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private VehicleOrganization vehOrganization;

    /**
     * Creates new form VehicleRequestWorkAreaJPanel
     */
    public VehicleWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        this.vehOrganization = (VehicleOrganization) organization;
        countryCombo.removeAllItems();
        for (Country c : business.getCountryList()) {
            countryCombo.addItem(c);
        }
        lblText.setText(account.getUsername() + "'s");
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtZip = new javax.swing.JTextField();
        lblCity = new javax.swing.JLabel();
        cityCombo = new javax.swing.JComboBox();
        sendRequestJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblText = new javax.swing.JLabel();
        impactCombo = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        stateCombo = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        countryCombo = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();

        jLabel2.setText("Zip Code");

        jLabel3.setText("Impact level");

        lblCity.setText("City");

        sendRequestJButton.setText("Send Request");
        sendRequestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendRequestJButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel1.setText("Work Area");

        lblText.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        lblText.setText("<userAccount>");

        impactCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "High", "Mediun", "Low" }));

        jLabel4.setText("State");

        stateCombo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stateComboMouseClicked(evt);
            }
        });
        stateCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stateComboActionPerformed(evt);
            }
        });

        jLabel5.setText("Country");

        countryCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countryComboActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jButton1.setText("View Accident History");
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
                        .addGap(155, 155, 155)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(84, 84, 84)
                                    .addComponent(stateCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblCity)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cityCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(68, 68, 68)
                                        .addComponent(txtZip, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5))
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(impactCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(countryCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(sendRequestJButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lblText)
                                .addGap(21, 21, 21)
                                .addComponent(jLabel1)))))
                .addContainerGap(131, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblText)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(impactCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(countryCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stateCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCity)
                    .addComponent(cityCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtZip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(sendRequestJButton)
                .addGap(105, 105, 105))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void sendRequestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendRequestJButtonActionPerformed

        Organization org = null;
        Organization org1 = null;
        AmbulanceReportWorkRequest req = null;
        PoliceReportWorkRequest req1= null;

        String level = (String) impactCombo.getSelectedItem();
        City city = (City) cityCombo.getSelectedItem();
        try {
            String zip = txtZip.getText();
            req = new AmbulanceReportWorkRequest();
            req.setZip(zip);
            req.setImpact(level);
            req.setSender(userAccount);
            req.setMessage(String.valueOf(zip));
            req.setStatus("Pending");
            
            req1 = new PoliceReportWorkRequest();
            req1.setImpact(level);
            req1.setSender(userAccount);
            req1.setMessage(level);
            req1.setStatus("Pending");
            req1.setRequestDate(new Date());
            
            

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Enter valid number");
        }

        for (Enterprise e : city.getEnterpriseDirectory().getEnterpriseList()) {
            for (Organization organization : e.getOrganizationDirectory().getOrganizationList()) {
                if (organization instanceof AmbulanceOrganization && (req.getZip().equals(organization.getZipCode()))) {
                    org = organization;
                    break;
                }
            }
        }

        if (org != null) {
            org.getWorkQueue().getWorkRequestList().add(req);
            
            JOptionPane.showMessageDialog(this, "Ambulance Work request created with an impact : " + req.getImpact());
            Employee e = userAccount.getEmployee();
            Vehicle v = e.getVehicle();
            v.setNumberOfAccidents();
            v.setAccidentCity(city);
            Accident a = v.getAccHistory().createAddAccident();
            a.setAccidentCity(city);
            a.setAccidentImpact(level);

        } else {
            JOptionPane.showMessageDialog(this, "This location has no Ambulance Organization ");
        }

        org1 = null;

        for (Enterprise e : city.getEnterpriseDirectory().getEnterpriseList()) {
            for (Organization organization : e.getOrganizationDirectory().getOrganizationList()) {
                if (organization instanceof PoliceOrganization && (req.getZip().equals(organization.getZipCode()))) {
                    org1 = organization;
                    break;
                }
            }
        }

        if (org1 != null) {
            org1.getWorkQueue().getWorkRequestList().add(req1);
            JOptionPane.showMessageDialog(this, "Police Work request created with an impact " + req1.getImpact());
        } else {
            JOptionPane.showMessageDialog(this, "Sorry, This location has no Police Organization ");
        }
    }//GEN-LAST:event_sendRequestJButtonActionPerformed

    private void countryComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countryComboActionPerformed
        // TODO add your handling code here:       
        stateCombo.removeAllItems(); 
        Country country = (Country) countryCombo.getSelectedItem();
       
        for (State s : country.getStateList().getStateList()) {
            stateCombo.addItem(s);
        }
        
        
        
    }//GEN-LAST:event_countryComboActionPerformed

    private void stateComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stateComboActionPerformed
        // TODO add your handling code here:
       
        cityCombo.removeAllItems();
        State state = (State) stateCombo.getSelectedItem();
        if(state!=null){
    
        for (City city : state.getCityList().getCityList()) {
            cityCombo.addItem(city);
        }
        }
        else{
        }

     
    }//GEN-LAST:event_stateComboActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jButton1ActionPerformed

    private void stateComboMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stateComboMouseClicked
        // TODO add your handling code here:
       
    }//GEN-LAST:event_stateComboMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cityCombo;
    private javax.swing.JComboBox countryCombo;
    private javax.swing.JComboBox impactCombo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblText;
    private javax.swing.JButton sendRequestJButton;
    private javax.swing.JComboBox stateCombo;
    private javax.swing.JTextField txtZip;
    // End of variables declaration//GEN-END:variables
}
