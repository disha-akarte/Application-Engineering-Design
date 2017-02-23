/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.extra;

import Business.Employee.Employee;
import java.util.ArrayList;

/**
 *
 * @author SONY
 */
public class Donor extends Employee{
    String bloodType;
    String donorID;
   
    
    ArrayList<DonationHistory> donationHistory;
    
    public Donor(){
        
        donationHistory = new ArrayList<>();
        
        donorID = "D"+(int)(Math.random()*1000);
        
    }

    public ArrayList<DonationHistory> getDonationHistory() {
        return donationHistory;
    }

    public void addNewDonation(DonationHistory dh){
        donationHistory.add(dh);
    }
   
    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getDonorID() {
        return donorID;
    }
   
   
    @Override
    public String toString() {
        return String.valueOf(getDonorID());
    }
    
    
}
