/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.RoleNew;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import userInterface.NurseRole.NurseWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author SONY
 */
public class NurseRole extends Role {

    public NurseRole() {
        
    }

    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new NurseWorkAreaJPanel(userProcessContainer, account, organization, business);
    }

    @Override
    public String toString() {
        return "Nurse";
    }
    
    
    
    
}

