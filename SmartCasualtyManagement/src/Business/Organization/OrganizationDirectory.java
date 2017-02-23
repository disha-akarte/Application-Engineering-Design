/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.City.City;
import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author SONY
 */
public class OrganizationDirectory {

    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public Organization createOrganization(Type type) {
        Organization organization = null;
        if (type.getValue().equals(Type.Ambulance.getValue())) {
            organization = new AmbulanceOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Receptionist.getValue())) {
            organization = new ReceptionistOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Police.getValue())) {
            organization = new PoliceOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Vehicle.getValue())) {
            organization = new VehicleOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Person.getValue())) {
            organization = new PersonOrganization();
            organizationList.add(organization);
        }

        return organization;
    }

    public boolean isOrgZipCodeUnique(Type type, String Zip) {
        for (Organization org : organizationList) {
            
            

            if (org.getZipCode().equals(Zip)) {
                return false;
            }
        }
        return true;

    }
}
