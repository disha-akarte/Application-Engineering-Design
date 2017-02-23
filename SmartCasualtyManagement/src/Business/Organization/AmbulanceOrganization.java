/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.AmbulanceRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author SONY
 */
public class AmbulanceOrganization extends Organization{

    public AmbulanceOrganization() {
        super(Organization.Type.Ambulance.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new AmbulanceRole());
        return roles;
    }
     
}