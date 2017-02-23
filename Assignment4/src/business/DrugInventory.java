/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.util.ArrayList;

/**
 *
 * @author SONY
 */
public class DrugInventory {
    
    private ArrayList<DrugItem> drugInventory;
    private DrugItem drugItem;

    public DrugItem getDrugItem() {
        return drugItem;
    }

    public void setDrugItem(DrugItem drugItem) {
        this.drugItem = drugItem;
    }
    
    public ArrayList<DrugItem> getDrugInventory() {
        return drugInventory;
    }

    public void setDrugInventory(ArrayList<DrugItem> drugInventory) {
        this.drugInventory = drugInventory;
    }
    
    public DrugInventory() {
        this.drugInventory = new ArrayList<>();
       
    }

    public DrugItem addDrugItem() {
        drugItem = new DrugItem();
        drugInventory.add(drugItem);
        return drugItem;
        
    }

    public void removeDrug(DrugItem dItem) {
        drugInventory.remove(dItem);
    }

   /* public DrugItem searchDrug(String drugID) {
        for (DrugItem drugItem : drugInventory) {
            if (drugItem.getDrug().getDrugSerialNumber().matches(drugID)) {
                return drugItem;
            }
        }
        return null;
    }*/
    
}
