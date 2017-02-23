/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import Business.City.City;
import Business.Person.Person;
import Business.Vehicle.Vehicle;

/**
 *
 * @author SONY
 */
public class Employee extends Person{
    
  
    private String name;
    private String id;
    private static int count = 1;
    private Vehicle vehicle;
    private City city;

    public Employee() {
        id = String.valueOf(count);
        count++;
        
        setAddress("");
        setDob("");
        setEmergencyContactID("");
        setEmergencyContactName("");
        setEmergencyContactPhone("");
        setInsurance_no("");
        
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return String.valueOf(id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    
      
    
}
