/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author SONY
 */
public class SalesPersonDirectory {

    private ArrayList<Salesperson> salesPersonDirectory;

    public ArrayList<Salesperson> getSalesPersonDirectory() {
        return salesPersonDirectory;
    }

    public SalesPersonDirectory() {
        salesPersonDirectory = new ArrayList<>();
    }

    public Salesperson addSalesperson() {
        Salesperson s = new Salesperson();
        salesPersonDirectory.add(s);
        return s;
    }

    public void removeSalesperson(Salesperson s) {
        salesPersonDirectory.remove(s);
    }

    public Salesperson searchSalesperson(int key) {
        for (Salesperson s : salesPersonDirectory) {
            if (s.getSalesID() == key) {
                System.out.println("Key is :"+key+"\n"+"Sales ID is : "+s.getSalesID()+"\n");
                
                return s;
                
            }
        }
       return null;
    }

}
