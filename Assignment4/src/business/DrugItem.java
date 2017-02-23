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
public class DrugItem {

    private String expiration_date;
    private String quantity;
    private String serialNumber;
    private Drug drug;
    static int count = 1001;

    public DrugItem() {
        this.drug = new Drug();
       
        
    }

    public String getSerialNumber() {
        serialNumber = String.valueOf(count);
        count++;
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getExpiration_date() {
        return expiration_date;
    }

    public void setExpiration_date(String expiration_date) {
        this.expiration_date = expiration_date;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public Drug getDrug() {
        return drug;
    }

    public void setDrug(Drug drug) {
        this.drug = drug;
    }

    @Override
    public String toString() {
        return serialNumber;
    }
    
     public void refreshSerialNumber() {
         count--;
    }
    

}
