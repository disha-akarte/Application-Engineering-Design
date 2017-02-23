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
public class Drug {
    
    private String drugType;
    private String drugName;
    private String drugContents;
    private String drugDescription;
    private String genericName;
    private String dosage;
    private String precautions;
    private String overdose;
    private String manufactureBy;
    private String warning;
    private float druglistPrice;
    
    @Override
    public String toString() {
        return drugName;
    }

    public float getDruglistPrice() {
        return druglistPrice;
    }

    public void setDruglistPrice(float druglistPrice) {
        this.druglistPrice = druglistPrice;
    }

    
    public String getDrugType() {
        return drugType;
    }

    public void setDrugType(String drugType) {
        this.drugType = drugType;
    }

    public String getDrugContents() {
        return drugContents;
    }

    public void setDrugContents(String drugContents) {
        this.drugContents = drugContents;
    }

    public String getDrugDescription() {
        return drugDescription;
    }

    public void setDrugDescription(String drugDescription) {
        this.drugDescription = drugDescription;
    }

    public String getGenericName() {
        return genericName;
    }

    public void setGenericName(String genericName) {
        this.genericName = genericName;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public String getPrecautions() {
        return precautions;
    }

    public void setPrecautions(String precautions) {
        this.precautions = precautions;
    }

    public String getOverdose() {
        return overdose;
    }

    public void setOverdose(String overdose) {
        this.overdose = overdose;
    }

    public String getManufactureBy() {
        return manufactureBy;
    }

    public void setManufactureBy(String manufactureBy) {
        this.manufactureBy = manufactureBy;
    }

    public String getWarning() {
        return warning;
    }

    public void setWarning(String warning) {
        this.warning = warning;
    }

    
    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }  
    
}
