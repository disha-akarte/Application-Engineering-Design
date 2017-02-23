/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.extra;

import java.util.Date;

/**
 *
 * @author SONY
 */
public class DonationHistory {
    
    private Date date;
    private String barCode;
    private static int counter = (int)(Math.random()*1000);
    
        
     public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getBarCode() {
        counter++;
        barCode = "B"+counter;
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }
        
    @Override
    public String toString() {
        return barCode;
    }

    
  
}
