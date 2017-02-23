/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Employee.Employee;
import Business.Person.Person;
import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author SONY
 */
public abstract class WorkRequest {

    private String message;
    private UserAccount sender;
    private UserAccount receiver;
    private String status;
    private Date requestDate;
    private Date resolveDate;
    private Employee person;

    public Employee getPerson() {
        return person;
    }

    public void setPerson(Employee person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return message;
    } 
     
    public WorkRequest(){
        requestDate = new Date();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }
}
