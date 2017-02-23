/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3_q1;

/**
 *
 * @author SONY
 */
public class Supplier {
    
    private String supplierName;
    private int supplierID;
    private ProductCatalogue pcatalog;
      

    public ProductCatalogue getPcatalog() {
        return pcatalog;
    }

    public void setPcatalog(ProductCatalogue pcat) {
        this.pcatalog = pcat;
    }   
    
    public Supplier(String sname, int sID) 
    {    
        setSupplierName(sname);
        setSupplierID(sID);
      
        pcatalog = new ProductCatalogue();
        pcatalog.addProduct(sname);
      
        
    }

    public String getSupplierName() {
        return supplierName;
    }

    public int getSupplierID() {
        return supplierID;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public void setSupplierID(int supplierID) {
        this.supplierID = supplierID;
    }
    
    
    
}
