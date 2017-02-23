/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3_q1;

import java.io.DataOutputStream;
import javax.swing.JOptionPane;

/**
 *
 * @author SONY
 */
public class Assignment3_Q1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        SupplierDirectory sd = new SupplierDirectory();
        sd.addSupplierList();
        sd.displaySupplier();
        
    }
    
}
