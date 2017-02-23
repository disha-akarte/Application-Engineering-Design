/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.AmbulanceOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.AmbulanceRole.AmbulanceWorkAreaJPanel;


/**
 *
 * @author SONY
 * 
 */
public class AmbulanceRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new AmbulanceWorkAreaJPanel(userProcessContainer, account, (AmbulanceOrganization)organization, enterprise);
    }
    
    
}
