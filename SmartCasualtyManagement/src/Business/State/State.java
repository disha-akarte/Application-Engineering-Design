/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.State;

import Business.City.CityDirectory;
import Business.Country.Country;
import Business.Organization.Organization;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author SONY
 */
public class State extends Organization{

    private String name;
    private CityDirectory cityList;
    private Country country;
    
    //private EnterpriseDirectory enterpriseDirectory;
    
    public State(String name) {
        super(name);
        cityList = new CityDirectory();
       // enterpriseDirectory = new EnterpriseDirectory();
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
     
//    public EnterpriseDirectory getEnterpriseDirectory() {
//        return enterpriseDirectory;
//    }

    public CityDirectory getCityList() {
        return cityList;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

}
