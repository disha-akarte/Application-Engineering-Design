/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.PersonRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author SONY
 */
public class PersonOrganization extends Organization{

    public PersonOrganization() {
        super(Organization.Type.Person.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new PersonRole());
        return roles;
    }
     
}