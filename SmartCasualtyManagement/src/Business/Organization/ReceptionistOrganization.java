/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.ReceptionistRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author SONY
 */
public class ReceptionistOrganization extends Organization{

//   private String zipCode;
    
    public ReceptionistOrganization() {
        super(Organization.Type.Receptionist.getValue());
    }
//
//    public String getZipCode() {
//        return zipCode;
//    }
//
//    public void setZipCode(String zipCode) {
//        this.zipCode = zipCode;
//    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ReceptionistRole());
        return roles;
    }
     
   
    
    
}
