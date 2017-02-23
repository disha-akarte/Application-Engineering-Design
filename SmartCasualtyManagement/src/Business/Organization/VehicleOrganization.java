/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.VehicleRole;
import java.util.ArrayList;

/**
 *
 * @author SONY
 */
public class VehicleOrganization extends Organization{

    
    public VehicleOrganization() {
        super(Organization.Type.Vehicle.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new VehicleRole());
        return roles;
    }
     
}