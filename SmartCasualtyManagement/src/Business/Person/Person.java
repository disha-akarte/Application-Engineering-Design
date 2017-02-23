/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

import Business.MedicalDocs.MedicalReports;
import Business.VitalSign.VitalSignHistory;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

/**
 *
 * @author SONY
 */
public class Person {

    private double phone;
    private String address;
    private String insurance_no;
    private int age;
    private String emergencyContactName;
    private String emergencyContactPhone;
    private VitalSignHistory vsh;
    private String dob;
    private MedicalReports reportList;


    public MedicalReports getReportList() {
        return reportList;
    }

    public void setReportList(MedicalReports reportList) {
        this.reportList = reportList;
    }
    
    public String getEmergencyContactName() {
        return emergencyContactName;
    }

    public void setEmergencyContactName(String emergencyContactName) {
        this.emergencyContactName = emergencyContactName;
    }


    public double getPhone() {
        return phone;
    }

    public void setPhone(double phone) {
        this.phone = phone;
    }

    public String getEmergencyContactID() {
        return emergencyContactName;
    }

    public void setEmergencyContactID(String emergencyContactID) {
        this.emergencyContactName = emergencyContactID;
    }

    public String getEmergencyContactPhone() {
        return emergencyContactPhone;
    }

    public void setEmergencyContactPhone(String emergencyContactPhone) {
        this.emergencyContactPhone = emergencyContactPhone;
    }

    public int getAge() {

        String datetext = getDob(); // Date in text
        try {
            Calendar birth = new GregorianCalendar();
            Calendar today = new GregorianCalendar();
            age = 0;
            int factor = 0; //to correctly calculate age when birthday has not been yet celebrated
            Date birthDate = new SimpleDateFormat("MM-dd-yyyy").parse(datetext);
            Date currentDate = new Date(); //current date

            birth.setTime(birthDate);
            today.setTime(currentDate);

            // check if birthday has been celebrated this year
            if (today.get(Calendar.DAY_OF_YEAR) < birth.get(Calendar.DAY_OF_YEAR)) {
                factor = -1; //birthday not celebrated
            }
            age = today.get(Calendar.YEAR) - birth.get(Calendar.YEAR) + factor;

        } catch (ParseException e) {
            JOptionPane.showMessageDialog(null, "Given date: " + datetext + " not in expected format (Please enter a MM-DD-YYYY date)");
        }

        return age;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public Person() {
        vsh = new VitalSignHistory();
        reportList = new MedicalReports();
        
        
    }

    public VitalSignHistory getVsh() {
        return vsh;
    }

    public void setVsh(VitalSignHistory vsh) {
        this.vsh = vsh;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getInsurance_no() {
        return insurance_no;
    }

    public void setInsurance_no(String insurance_no) {
        this.insurance_no = insurance_no;
    }

}
