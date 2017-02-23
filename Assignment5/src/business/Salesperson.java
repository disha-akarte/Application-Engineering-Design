/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

/**
 *
 * @author SONY
 */
public class Salesperson implements Comparable<Salesperson>{
    private int salesID;
    private String personName;
    private int commision;
    private int salesVolume;
    private int aboveTarget;
    private int belowTarget;

    public int getAboveTarget() {
        return aboveTarget;
    }

    public void setAboveTarget(int aT) {
        this.aboveTarget = aT;
    }

    public int getBelowTarget() {
        return belowTarget;
    }

    public void setBelowTarget(int bT) {
        this.belowTarget = bT;
    }
       
    public int getSalesVolume() {
        return salesVolume;
    }

    public void setSalesVolume(int sV) {
        this.salesVolume = salesVolume + sV;
    }

    public int getCommision() {
        return commision;
    }

    public void setCommision(int c) {
        this.commision = commision + c ;
    }
    
    public int getSalesID() {
        return salesID;
    }

    public void setSalesID(int salesID) {
        this.salesID = salesID;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    @Override
    public String toString() {
        return String.valueOf(salesID);
    }

    @Override
    public int compareTo(Salesperson o) {
        int compareSV=((Salesperson)o).getSalesVolume();
        /* For Ascending order*/
        //return this.studentage-compareage;

        /* For Descending order do like this */
        return compareSV-this.getSalesVolume();

    }
    
    
    
    
}
