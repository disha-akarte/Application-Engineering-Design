/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.City;

import Business.Country.Country;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * @author SONY
 */
public class CityDirectory {

    private ArrayList<City> cityList;

    public CityDirectory() {
        cityList = new ArrayList<>();
    }

    public ArrayList<City> getCityList() {
        return cityList;
    }

    public City createAndAddCity(String name) {
        City city = new City(name);
        cityList.add(city);
        return city;
    }

    public void removeCity(City city) {
        cityList.remove(city);
    }

    
     public boolean checkIfCityeNameIsUnique(String cname){
        for (City cty : cityList){
            if (cty.getName().equals(cname))
                return false;
        }
        return true;
    }
     
     
    public City searchCity(String key) {
        City c1 = null;
        for (City c : cityList) {
            if (c.getName().equals(key)) {
                c1 = c;
                break;
            }
        }
        if(c1 == null){
            JOptionPane.showMessageDialog(null,"City not found!");
        }
        return c1;
    }

}
