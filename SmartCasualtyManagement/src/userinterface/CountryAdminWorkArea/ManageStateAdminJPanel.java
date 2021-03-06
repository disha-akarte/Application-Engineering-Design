/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CountryAdminWorkArea;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Country.Country;
import Business.PatternMatcher;
import Business.Role.StateAdminRole;
import Business.State.State;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import net.java.balloontip.BalloonTip;

/**
 *
 * @author raunak
 */
public class ManageStateAdminJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;
    private UserAccount account;
    private Country country;
    private PatternMatcher pm;

    /**
     * Creates new form ManageEnterpriseJPanel
     */
    public ManageStateAdminJPanel(JPanel userProcessContainer, Country country, UserAccount account) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.country = country;
        this.account = account;
        pm = new PatternMatcher();
        populateTable();
        populateNetworkComboBox();
    }

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) enterpriseJTable.getModel();

        model.setRowCount(0);

        for (State state : country.getStateList().getStateList()) {

            for (UserAccount userAccount : state.getUserAccountDirectory().getUserAccountList()) {
                Object[] row = new Object[2];
                row[0] = state.getName();
                row[1] = userAccount.getUsername();

                model.addRow(row);
            }
        }

    }

    private void populateNetworkComboBox() {
        networkJComboBox.removeAllItems();

        for (State state : country.getStateList().getStateList()) {
            networkJComboBox.addItem(state);
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
        enterpriseJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        networkJComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        usernameJTextField = new javax.swing.JTextField();
        submitJButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        passwordJPasswordField = new javax.swing.JPasswordField();
        backJButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();

        enterpriseJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "State", "Username"
            }
        ));
        jScrollPane1.setViewportView(enterpriseJTable);

        jLabel1.setText("State");

        networkJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        networkJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkJComboBoxActionPerformed(evt);
            }
        });

        jLabel2.setText("Username");

        usernameJTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usernameJTextFieldFocusGained(evt);
            }
        });

        submitJButton.setText("Submit");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("Password");

        passwordJPasswordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordJPasswordFieldFocusGained(evt);
            }
        });

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("Admin Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(networkJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel3))
                                    .addGap(41, 41, 41)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(passwordJPasswordField)
                                        .addComponent(nameJTextField)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(52, 52, 52)
                                    .addComponent(usernameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(backJButton)
                                .addGap(55, 55, 55)
                                .addComponent(submitJButton)))))
                .addContainerGap(203, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(networkJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordJPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backJButton)
                    .addComponent(submitJButton))
                .addContainerGap(147, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void networkJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkJComboBoxActionPerformed


    }//GEN-LAST:event_networkJComboBoxActionPerformed

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed

        if (!pm.getUsername_pattern().matcher(usernameJTextField.getText()).matches()) {
            JOptionPane.showMessageDialog(this, "Enter valid username. Allows username with length at least 3 to max 16 and there "
                    + "should be only lowercase letters, numbers or underscore in the username.", "Caution", JOptionPane.ERROR_MESSAGE);

        } else if (!pm.getPassword_pattern().matcher(String.valueOf(passwordJPasswordField.getPassword())).matches()) {
            JOptionPane.showMessageDialog(this, "Enter valid password. Password must be at least 4 characters,"
                    + " and must include at least one upper case letter, one lower case letter, and one numeric digit.", "Caution", JOptionPane.ERROR_MESSAGE);

        } else if (!pm.getPattern().matcher(String.valueOf(nameJTextField.getText())).matches()) {
            JOptionPane.showMessageDialog(this, "Enter valid name", "Caution", JOptionPane.ERROR_MESSAGE);

        } else {

            State state = (State) networkJComboBox.getSelectedItem();
            String username = usernameJTextField.getText();
            String password = String.valueOf(passwordJPasswordField.getPassword());
            String name = nameJTextField.getText();

            Boolean unique = state.getUserAccountDirectory().checkIfUsernameIsUnique(username);
            if (unique == false) {
                JOptionPane.showMessageDialog(this, "Username already registered.Select another username");
            } else {
                Employee employee = state.getEmployeeDirectory().createEmployee(name);
                state.getUserAccountDirectory().createUserAccount(username, password, employee, new StateAdminRole());
                populateTable();
            }
            usernameJTextField.setText("");
            passwordJPasswordField.setText("");
            nameJTextField.setText("");
        }
    }//GEN-LAST:event_submitJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void usernameJTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameJTextFieldFocusGained
        // TODO add your handling code here:
         BalloonTip balloonTip = new BalloonTip(usernameJTextField, "Allows username with length at least 3 to max 16 and there "
                    + "should be only lowercase letters, numbers or underscore in the username");
    }//GEN-LAST:event_usernameJTextFieldFocusGained

    private void passwordJPasswordFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordJPasswordFieldFocusGained
        // TODO add your handling code here:
         BalloonTip balloonTip2 = new BalloonTip(passwordJPasswordField, "Password must be at least 4 characters,"
                + " and must include at least one upper case letter, one lower case letter, and one numeric digit.");
    }//GEN-LAST:event_passwordJPasswordFieldFocusGained

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JTable enterpriseJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JComboBox networkJComboBox;
    private javax.swing.JPasswordField passwordJPasswordField;
    private javax.swing.JButton submitJButton;
    private javax.swing.JTextField usernameJTextField;
    // End of variables declaration//GEN-END:variables
}
