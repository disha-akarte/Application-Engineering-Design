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
public class Patient {

    private String patientID;
    private String prefPharm;
    private String prefDoc;
    //private static int countID = 100;

    public String getPatientID() {

        return patientID;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    public String getPrefPharm() {
        return prefPharm;
    }

    public void setPrefPharm(String prefPharm) {
        this.prefPharm = prefPharm;
    }

    public String getPrefDoc() {
        return prefDoc;
    }

    public void setPrefDoc(String prefDoc) {
        this.prefDoc = prefDoc;
    }

}
