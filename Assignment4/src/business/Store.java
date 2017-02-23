/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

//import addStoreUserInterface.PharmaList;

/**
 *
 * @author SONY
 */
public class Store {
    
   private String storeArea;
   private String zipCode;
   private String storeID;
   private DrugInventory drugInventory;
  // private static int storeCount = 100;

    @Override
    public String toString() {
        return storeID;
    }

    public DrugInventory getDrugInventory() {
        return drugInventory;
    }
   
    public Store(){
    drugInventory = new DrugInventory();
    }

    public void setDrugInventory(DrugInventory drugInventory) {
        this.drugInventory = drugInventory;
    }

    public String getStoreArea() {
        return storeArea;
    }

    public void setStoreArea(String storeArea) {
        this.storeArea = storeArea;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getStoreID() {
       //  storeCount++;
       // storeID = String.valueOf(storeCount) ;
        return storeID;
    }

    public void setStoreID(String storeID) {
        this.storeID = storeID;
    }
      
}
