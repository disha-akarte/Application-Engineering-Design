/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.City;

import Business.Enterprise.EnterpriseDirectory;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.State.State;
import Business.Vehicle.VehicleDirectory;
import java.util.ArrayList;

/**
 *
 * @author SONY
 */
public class City extends Organization {
   
  private EnterpriseDirectory enterpriseDirectory;
  private VehicleDirectory vDir;
  
    
  private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
  
   public City(String name) {
      super(name);
             
      vDir = new VehicleDirectory();
      enterpriseDirectory = new EnterpriseDirectory();
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public VehicleDirectory getvDir() {
        return vDir;
    }     
    
   
    @Override
    public String toString() {
        return getName();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
    
    
}
