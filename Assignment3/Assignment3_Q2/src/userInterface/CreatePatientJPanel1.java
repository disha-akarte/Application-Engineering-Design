/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import business.PersonList;
import business.Person;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author SONY
 */
public class CreatePatientJPanel1 extends javax.swing.JPanel {

    private PersonList personList;
    private JPanel userProcessContainer;

    /**
     * Creates new form CreatePaientJPanel
     */
    public CreatePatientJPanel1(JPanel userProcessContainer, PersonList pList) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.personList = pList;

        for (Person p : personList.getPersonList()) {
            PersonNameComboBox.addItem(p);
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

        lblName = new javax.swing.JLabel();
        lblphone = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtDoc = new javax.swing.JTextField();
        txtPharm = new javax.swing.JTextField();
        btncreate = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        PersonNameComboBox = new javax.swing.JComboBox();
        txtpersonAge = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPatID = new javax.swing.JTextField();
        lblPatID = new javax.swing.JLabel();

        lblName.setText("Preferred Doctor");

        lblphone.setText("Preferred Pharmacy");

        jLabel4.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jLabel4.setText("Patient Details");

        txtDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDocActionPerformed(evt);
            }
        });

        txtPharm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPharmActionPerformed(evt);
            }
        });

        btncreate.setText("SUBMIT");
        btncreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncreateActionPerformed(evt);
            }
        });

        btnBack.setText("<< BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel1.setText("Person ID");

        PersonNameComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Person" }));
        PersonNameComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PersonNameComboBoxActionPerformed(evt);
            }
        });

        txtpersonAge.setEditable(false);

        jLabel3.setText("Person Age");

        txtPatID.setEditable(false);

        lblPatID.setText("Patient ID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(btnBack)
                                .addGap(42, 42, 42)
                                .addComponent(btncreate))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblphone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel3)
                                    .addComponent(lblPatID))
                                .addGap(53, 53, 53)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPatID)
                                    .addComponent(txtDoc)
                                    .addComponent(txtPharm, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                                    .addComponent(PersonNameComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtpersonAge)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel4)))
                .addContainerGap(281, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PersonNameComboBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPatID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPatID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtpersonAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblphone)
                    .addComponent(txtPharm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncreate)
                    .addComponent(btnBack))
                .addContainerGap(224, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDocActionPerformed

    private void txtPharmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPharmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPharmActionPerformed

    private void btncreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncreateActionPerformed
        // TODO add your handling code here:

        Person person = (Person) PersonNameComboBox.getSelectedItem();

        String pdoc = txtDoc.getText();
        String ppharm = txtPharm.getText();
        String pid = person.getPersonID();

        if (!pdoc.isEmpty() && !ppharm.isEmpty() && !pid.isEmpty()) {
            txtpersonAge.setEditable(false);
            person.setAge(Integer.parseInt(txtpersonAge.getText()));

            if (pdoc.matches("[A-Za-z]+[\\s]([A-Za-z])+|[A-Za-z]+")) {
                person.getPatient().setPrefDoc(pdoc);
            } else {
                JOptionPane.showMessageDialog(null, "Please enter correct Doctor Name", "Error", JOptionPane.PLAIN_MESSAGE);
                return;
            }

            if (ppharm.matches("[A-Za-z]+[\\s]([A-Za-z])+|[A-Za-z]+")) {
                person.getPatient().setPrefPharm(ppharm);
            } else {
                JOptionPane.showMessageDialog(null, "Please enter correct prefered pharmacy", "Error", JOptionPane.PLAIN_MESSAGE);
                return;
            }

            if (pid.matches("[A-Za-z0-9]+")) {
                person.getPatient().setPatientID(pid);
            } else {
                JOptionPane.showMessageDialog(null, "Please enter correct patient ID", "Error", JOptionPane.PLAIN_MESSAGE);
                return;
            }
            // JOptionPane.showMessageDialog(null, "Patient ID generated is: "+pid, "Information message",JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null, "Patient successfully added");
            resetFields();

        } else {

            JOptionPane.showMessageDialog(null, "Patient not added");
        }


    }//GEN-LAST:event_btncreateActionPerformed

    private void resetFields() {
        txtDoc.setText("");
        txtPatID.setText("");
        txtPharm.setText("");
        txtpersonAge.setText("");
    }
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void PersonNameComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PersonNameComboBoxActionPerformed

        Person p1 = (Person) PersonNameComboBox.getSelectedItem();
        //.setText(p1.getPersonName());
        txtpersonAge.setText(String.valueOf(p1.getAge()));
        txtPatID.setText(p1.getPersonID());
        // TODO add your handling code here:

    }//GEN-LAST:event_PersonNameComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox PersonNameComboBox;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btncreate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPatID;
    private javax.swing.JLabel lblphone;
    private javax.swing.JTextField txtDoc;
    private javax.swing.JTextField txtPatID;
    private javax.swing.JTextField txtPharm;
    private javax.swing.JTextField txtpersonAge;
    // End of variables declaration//GEN-END:variables
}
