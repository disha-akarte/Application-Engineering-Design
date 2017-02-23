/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Vehicle;

import Business.City.City;
import Business.Employee.Employee;

/**
 *
 * @author SONY
 */
public class Vehicle extends Employee implements Comparable<Vehicle> {

    private int numberOfAccidents = 0;
    private String ID;
    private City accidentCity;
    private AccidentHistory accHistory;

    public Vehicle() {
        ID = String.valueOf(1);
        accHistory = new AccidentHistory();
    }

    public AccidentHistory getAccHistory() {
        return accHistory;
    }
    
    

    public int getNumberOfAccidents() {
        return numberOfAccidents;
    }

    public void setNumberOfAccidents() {

        this.numberOfAccidents = numberOfAccidents + 1;
    }

    public City getAccidentCity() {
        return accidentCity;
    }

    public void setAccidentCity(City accidentCity) {
        this.accidentCity = accidentCity;
    }

    @Override
    public int compareTo(Vehicle o) {
        int compareNA = ((Vehicle) o).getNumberOfAccidents();
        
        /* For Ascending order*/
        //return this.getNumberOfAccidents()-compareNA;

        /* For Descending order do like this */
        return compareNA - this.getNumberOfAccidents();
    }

}
