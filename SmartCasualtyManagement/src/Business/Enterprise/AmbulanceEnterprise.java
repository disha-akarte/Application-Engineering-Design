/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author SONY
 */
public class AmbulanceEnterprise extends Enterprise{

    public AmbulanceEnterprise(String name) {
        super(name, EnterpriseType.Ambulance);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
    
    
}
