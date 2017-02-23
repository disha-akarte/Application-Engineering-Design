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
public class Customer implements Comparable<Customer>{
    private String customerName;
    private int customerID;
    private int totalPurchases;

    public int getTotalPurchases() {
        return totalPurchases;
    }

    public void setTotalPurchases(int tP) {
        this.totalPurchases = totalPurchases+tP;
    } 
    
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    @Override
    public String toString() {
        return String.valueOf(customerID);
    }
    
    @Override
    public int compareTo(Customer c) {
        int compareSV=((Customer)c).getTotalPurchases();
        /* For Ascending order*/
        //return this.studentage-compareage;

        /* For Descending order do like this */
        return compareSV-this.getTotalPurchases();

    }
    
}
