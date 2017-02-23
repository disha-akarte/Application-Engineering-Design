/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Vehicle;

import Business.City.City;

/**
 *
 * @author SONY
 */
public class Accident {
   
    private City accidentCity;
    private String accidentImpact;
    private String accidentZip;

    public City getAccidentCity() {
        return accidentCity;
    }

    public void setAccidentCity(City accidentCity) {
        this.accidentCity = accidentCity;
    }

    public String getAccidentImpact() {
        return accidentImpact;
    }

    public void setAccidentImpact(String accidentImpact) {
        this.accidentImpact = accidentImpact;
    }

    public String getAccidentZip() {
        return accidentZip;
    }

    public void setAccidentZip(String accidentZip) {
        this.accidentZip = accidentZip;
    }

    @Override
    public String toString() {
        return accidentImpact;
    }
    
    
}
