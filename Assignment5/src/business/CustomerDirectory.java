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
public class CustomerDirectory {
    private ArrayList<Customer> customerDirectory;
    
    public CustomerDirectory(){
        customerDirectory = new ArrayList<>();
    }
    
    public Customer addCustomer(){
        Customer customer = new Customer();
        customerDirectory.add(customer);
        return customer;
    }

    public ArrayList<Customer> getCustomerDirectory() {
        return customerDirectory;
    }    
    
}
