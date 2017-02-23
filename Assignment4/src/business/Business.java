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
public class Business {
    private DrugCatalog drugCatalog;
    private StoreDirectory storeDirectory;

    
    public Business(){
        drugCatalog = new DrugCatalog();
        storeDirectory = new StoreDirectory();
    }
    
    public DrugCatalog getDrugCatalog() {
        return drugCatalog;
    }

    public void setDrugCatalog(DrugCatalog drugCatalog) {
        this.drugCatalog = drugCatalog;
    }

    public StoreDirectory getStoreDirectory() {
        return storeDirectory;
    }

    public void setStoreDirectory(StoreDirectory storeDirectory) {
        this.storeDirectory = storeDirectory;
    }
    
    
}
