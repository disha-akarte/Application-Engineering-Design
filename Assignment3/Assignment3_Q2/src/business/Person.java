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
public class Person {

    private String personName;
    private String personAddress;
    private Patient patient;
    private int age;
    private String personID;
    //private static int count = 10;
    private VitalSignHistory vitalSignHistory;

    public VitalSignHistory getVitalSignHistory() {
        return vitalSignHistory;
    }

    public void setVitalSignHistory(VitalSignHistory vitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
    }

    public Person() {
        this.patient = new Patient();
        this.vitalSignHistory = new VitalSignHistory();

    }

    public String getPersonID() {
       // count++;
        // personID = String.valueOf(count);
        return personID;
    }

    public void setPersonID(String personID) {
        this.personID = personID;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonAddress() {
        return personAddress;
    }

    public void setPersonAddress(String personAddress) {
        this.personAddress = personAddress;
    }

    @Override
    public String toString() {
        return personID;
    }

}
