/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Enterprise.Enterprise.EnterpriseType;
import java.util.ArrayList;

/**
 *
 * @author SONY
 */
public class EnterpriseDirectory {

    private ArrayList<Enterprise> enterpriseList;

    public EnterpriseDirectory() {
        enterpriseList = new ArrayList<>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type) {
        Enterprise enterprise = null;
        if (type == Enterprise.EnterpriseType.Ambulance) {
            enterprise = new AmbulanceEnterprise(name);
            enterpriseList.add(enterprise);
        } else if (type == Enterprise.EnterpriseType.Hospital) {
            enterprise = new HospitalEnterprise(name);
            enterpriseList.add(enterprise);
        } else if (type == Enterprise.EnterpriseType.Police) {
            enterprise = new PoliceEnterprise(name);
            enterpriseList.add(enterprise);
        } else if (type == Enterprise.EnterpriseType.Government) {
            enterprise = new GovernmentEnterprise(name);
            enterpriseList.add(enterprise);
        }

        return enterprise;
    }

    
      public boolean checkIfEnterpriseNameIsUnique(String username){
        for (Enterprise e : enterpriseList){
            if (e.getName().equals(username))
                return false;
        }
        return true;
    }
      
      
      public boolean checkIfEnterpriseTypeIsUnique(EnterpriseType type){
        for (Enterprise e : enterpriseList){
            if (e.getEnterpriseType().getValue().equals(type.getValue())){
                return false;
            }
        }
        return true;
    }
}
