/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.RoleNew;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.DonorOrganization;

import Business.Organization.Organization;
import Business.Organization.ReceptionistOrganization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import Business.extra.Donor;
import javax.swing.JPanel;
import userInterface.ReceptionistRole.ReceptionistWorkAreaJPanel;

/**
 *
 * @author SONY
 */
public class ReceptionstRole extends Role {

 //  private DonorOrganization donorOrg;
    
       
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {

       return new ReceptionistWorkAreaJPanel(userProcessContainer,account, (ReceptionistOrganization)organization, enterprise);
    }

    @Override
    public String toString() {
        return "Receptionst";
    }

    
    
}

