/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.PersonOrganization;
import Business.UserAccount.UserAccount;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import userinterface.PersonRole.PersonWorkAreaJPanel;


/**
 *
 * @author SONY
 * 
 */
public class PersonRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        try {
            return new PersonWorkAreaJPanel(userProcessContainer, account, (PersonOrganization)organization, enterprise,business);
        } catch (ParseException ex) {
            Logger.getLogger(PersonRole.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    
}
