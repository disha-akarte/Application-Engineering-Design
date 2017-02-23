/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.PersonRole;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organization.PersonOrganization;
import Business.PatternMatcher;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.LabTestWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SONY
 */
public class PersonWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private PersonOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private Employee person;
    private EcoSystem business;
    private PatternMatcher pm;

    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    public PersonWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, PersonOrganization organization, Enterprise enterprise, EcoSystem business) throws ParseException {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.business = business;
        pm = new PatternMatcher();
        person = account.getEmployee();

        GregorianCalendar cal = (GregorianCalendar) GregorianCalendar.getInstance();
        // set the min date
        cal.set(1915, 10, 10);

        GregorianCalendar cal2 = (GregorianCalendar) GregorianCalendar.getInstance();
        // set the max date
        cal2.set(2014, 10, 10);

        valueLabel.setText(enterprise.getName());
        txtDOB.getDateEditor().setEnabled(false);
        txtDOB.setSelectableDateRange(cal.getTime(), cal2.getTime());

        if (person != null) {
            
            txtPersonName.setText(person.getName());
            txtPersonName.setEditable(false);
            txtCity.setText(person.getCity().getName());
            txtCity.setEditable(false);

            if (!person.getEmergencyContactName().equals("")) {
                phoneField.setText(person.getEmergencyContactPhone());
                txtBillAddress.setEditable(false);
            }

            if (!person.getAddress().equals("")) {
                txtBillAddress.setText(person.getAddress());
                txtBillAddress.setEditable(false);
            }

            if (!person.getDob().equals("")) {
                String string = person.getDob();
                DateFormat format = new SimpleDateFormat("MM-dd-yyyy", Locale.ENGLISH);
                Date date = format.parse(string);
                System.out.println(date);
                txtDOB.setDate(date);
                System.out.println("Date of Birth :" + string);
            }

            if (!person.getEmergencyContactName().equals("")) {
                txtEmergencyContactName.setText(person.getEmergencyContactName());
                txtEmergencyContactName.setEditable(false);
            }

            if (!person.getEmergencyContactPhone().equals("")) {
                phoneField.setText(person.getEmergencyContactPhone());
                phoneField.setEditable(false);
            }

            if (!person.getInsurance_no().equals("")) {
                txtInsurance.setText(person.getInsurance_no());
                txtInsurance.setEditable(false);
            }

//            if (person.getAddress().equals("") && person.getDob().equals("") && person.getEmergencyContactName().equals("")
//                    && person.getEmergencyContactPhone().equals("") && person.getInsurance_no().equals("")) {
//                
//                
//                txtBillAddress.setEditable(true);
//                txtEmergencyContactName.setEditable(true);
//                txtInsurance.setEditable(true);
//                phoneField.setEditable(true);
//
//            }

        }

        // populateRequestTable();
    }

    public void populateRequestTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();

        model.setRowCount(0);
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()) {
            Object[] row = new Object[4];
            row[0] = request.getMessage();
            row[1] = request.getReceiver();
            row[2] = request.getStatus();
            String result = ((LabTestWorkRequest) request).getTestResult();
            row[3] = result == null ? "Waiting" : result;

            model.addRow(row);
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
        workRequestJTable = new javax.swing.JTable();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        txtPersonName = new javax.swing.JTextField();
        txtBillAddress = new javax.swing.JTextField();
        txtInsurance = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lnlTel = new javax.swing.JLabel();
        txtEmergencyContactName = new javax.swing.JTextField();
        txtDOB = new com.toedter.calendar.JDateChooser();
        phoneField = new javax.swing.JFormattedTextField();
        btnUpdate = new javax.swing.JButton();

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Message", "Receiver", "Status", "Result"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);
        if (workRequestJTable.getColumnModel().getColumnCount() > 0) {
            workRequestJTable.getColumnModel().getColumn(0).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(1).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(2).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(3).setResizable(false);
        }

        enterpriseLabel.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        enterpriseLabel.setText("Enterprise :");

        valueLabel.setText("<value>");

        txtPersonName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPersonNameActionPerformed(evt);
            }
        });

        txtCity.setEditable(false);

        jLabel6.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel6.setText("Add Person");

        jLabel7.setText("Date of Birth");

        jLabel1.setText("Person Name");

        btnBack.setText("<<BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel3.setText("Billing Address");

        btnSubmit.setText("SUBMIT");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        jLabel4.setText("Insurance Number");

        jLabel5.setText("City");

        jLabel2.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Emergency Contact Information");

        lblName.setText("Name");

        lnlTel.setText("Telephone");

        txtDOB.setDateFormatString("MM-dd-yyyy"); // NOI18N

        try {
            phoneField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        phoneField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneFieldActionPerformed(evt);
            }
        });

        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel1))
                                .addGap(89, 89, 89)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCity)
                                    .addComponent(txtInsurance)
                                    .addComponent(txtBillAddress)
                                    .addComponent(txtPersonName, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                                    .addComponent(txtDOB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(jLabel6))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(btnBack)
                                    .addGap(44, 44, 44)
                                    .addComponent(btnSubmit)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                                    .addComponent(btnUpdate))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblName)
                                        .addComponent(lnlTel))
                                    .addGap(128, 128, 128)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtEmergencyContactName, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                                        .addComponent(phoneField))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jLabel2)))
                .addContainerGap(214, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtPersonName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtBillAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtInsurance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtEmergencyContactName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lnlTel)
                    .addComponent(phoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnSubmit)
                    .addComponent(btnUpdate))
                .addContainerGap(56, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtPersonNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPersonNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPersonNameActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:       

        PatternMatcher pattern=new PatternMatcher();
        try {

            DateFormat fmt = new SimpleDateFormat("MM-dd-yyyy");
            String date = fmt.format(this.txtDOB.getDate()); //jdatechooser
            txtDOB.setDateFormatString(date);

            if (date.equals("")) {
                JOptionPane.showMessageDialog(null, "Please type birthday", "Warning!", JOptionPane.ERROR_MESSAGE);
            } else {
                
                if(!txtBillAddress.getText().isEmpty() && !txtInsurance.getText().isEmpty() && 
                        !txtEmergencyContactName.getText().isEmpty() && !phoneField.getText().isEmpty())
                {
                person.setAddress(txtBillAddress.getText());
                person.setInsurance_no(txtInsurance.getText());
                person.setEmergencyContactName(txtEmergencyContactName.getText());
                person.setEmergencyContactPhone(phoneField.getText());
                person.setDob(date);

                JOptionPane.showMessageDialog(this, "Details successfully added for person ID : " + person.getId());

                txtBillAddress.setText("");
                txtDOB.setCalendar(null);
                txtInsurance.setText("");
                txtEmergencyContactName.setText("");
                txtInsurance.setText("");
                phoneField.setText("");
                }
                else{
                    JOptionPane.showMessageDialog(this, "Fields cannot be empty");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Please enter date!");

        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void phoneFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneFieldActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        
        txtBillAddress.setEditable(true);
        txtEmergencyContactName.setEditable(true);
        phoneField.setEditable(true);
        txtInsurance.setEditable(true);      
    }//GEN-LAST:event_btnUpdateActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lnlTel;
    private javax.swing.JFormattedTextField phoneField;
    private javax.swing.JTextField txtBillAddress;
    private javax.swing.JTextField txtCity;
    private com.toedter.calendar.JDateChooser txtDOB;
    private javax.swing.JTextField txtEmergencyContactName;
    private javax.swing.JTextField txtInsurance;
    private javax.swing.JTextField txtPersonName;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
