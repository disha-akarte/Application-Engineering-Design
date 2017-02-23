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
public class DrugCatalog {

    private ArrayList<Drug> drugList;

    public ArrayList<Drug> getDrugList() {
        return drugList;
    }

    public void setDrugList(ArrayList<Drug> drugList) {
        this.drugList = drugList;
    }

    public DrugCatalog() {
        this.drugList = new ArrayList<>();
    }

    public void addDrug(Drug d) {
        drugList.add(d);
    }

    public void removeDrug(Drug drug) {
        drugList.remove(drug);
    }
/*
    public Drug searchDrug(String drugID) {
        for (Drug drug : drugList) {
            if (drug.getDrugSerialNumber().matches(drugID)) {
                return drug;
            }
        }
        return null;
    }
*/
}
