package Business;

import Business.Country.Country;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Person.Person;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author SONY
 */
public class EcoSystem extends Organization {

    private static EcoSystem business;
    private ArrayList<Country> countryList;
  
    public static EcoSystem getInstance() {
        if (business == null) {
            business = new EcoSystem();
        }
        return business;
    }
    
     public boolean checkIfCountryNameIsUnique(String cname){
        for (Country c : countryList){
            if (c.getName().equals(cname))
                return false;
        }
        return true;
    }

    private EcoSystem() {
        super(null);
        countryList = new ArrayList<>();
        
    }

    public ArrayList<Country> getCountryList() {
        return countryList;
    }

    public Country createAndAddCountry(String name) {
        Country country = new Country(name) ;

        countryList.add(country);
        return country;
    }


    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }

    public boolean checkIfUsernameIsUnique(String username) {

        if (!this.getUserAccountDirectory().checkIfUsernameIsUnique(username)) {
            return false;
        }
        return true;
    }
}