/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.VehicleOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.VehicleRole.VehicleWorkAreaJPanel;


/**
 *
 * @author SONY
 * 
 */
public class VehicleRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new VehicleWorkAreaJPanel(userProcessContainer, account, (VehicleOrganization)organization, business);
    }
    
    
}
