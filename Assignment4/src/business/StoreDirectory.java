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
public class StoreDirectory {

    private ArrayList<Store> storeList;

    public ArrayList<Store> getStoreList() {
        return storeList;
    }

    public void setStoreList(ArrayList<Store> storeList) {
        this.storeList = storeList;
    }

    public StoreDirectory() {
        this.storeList = new ArrayList<>();
    }

    public Store addStore() {
        Store s = new Store();
        storeList.add(s);
        return s;
    }

    public void removeStore(Store s) {
        storeList.remove(s);
    }

    public Store searchStore(String key) {
        for (Store s : storeList) {
            if (s.getStoreID().equals(key)) {
                return s;
            }

        }
        return null;
    }
}
