/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Vehicle;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author SONY
 */
public class VehicleDirectory {
    
    private ArrayList<Vehicle> vList;

    public VehicleDirectory() {
        vList = new ArrayList<>();
    }

    public ArrayList<Vehicle> getvList() {
        return vList;
    }

    public void addVehicle(Vehicle v){
        vList.add(v);
    
    }
    
    public Vehicle searchVehicle(String key){
    
    Vehicle e1 = null;
        for (Vehicle e : vList) {
            if (e.getId().equals(key)) {
                e1 = e;
            }
        }
        if (e1 == null) {
            JOptionPane.showMessageDialog(null, "Vehicle not found!");
        }
        return e1;
    }
    
}
