/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author SONY
 */
public class Patient {
    private String patientName;
    private String patientID;
    private int patientAge;
    private String primaryDoctor;
    private String prefPharmacy;
    private VitalSignHistory vSHistory;
    
    public Patient(){
    
        this.vSHistory = new VitalSignHistory();
    }

    public VitalSignHistory getvSHistory() {
        return vSHistory;
    }

    public void setvSHistory(VitalSignHistory vSHistory) {
        this.vSHistory = vSHistory;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientID() {
        return patientID;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    public int getPatientAge() {
        return patientAge;
    }

    public void setPatientAge(int patientAge) {
        this.patientAge = patientAge;
    }

    public String getPrimaryDoctor() {
        return primaryDoctor;
    }

    public void setPrimaryDoctor(String primaryDoctor) {
        this.primaryDoctor = primaryDoctor;
    }

    public String getPrefPharmacy() {
        return prefPharmacy;
    }

    public void setPrefPharmacy(String prefPharmacy) {
        this.prefPharmacy = prefPharmacy;
    }
    
    
}
