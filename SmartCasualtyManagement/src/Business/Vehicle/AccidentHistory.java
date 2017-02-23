/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Vehicle;

import java.util.ArrayList;

/**
 *
 * @author SONY
 */
public class AccidentHistory {

    private ArrayList<Accident> accHistory;

    public AccidentHistory() {
        accHistory = new ArrayList <>();
    }

    public ArrayList<Accident> getAccHistory() {
        return accHistory;
    }

    public Accident createAddAccident() {
        Accident a = new Accident();
        accHistory.add(a);
        return a;
    }

}
