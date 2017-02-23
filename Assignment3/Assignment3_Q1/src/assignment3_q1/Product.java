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
public class Product {
    private String productName;
    private int productID;
    private SupplierDirectory sd;
      
    public Product(String pname, int pID) 
    {
        setProductName(pname);
        setProductID(pID);
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }   
}
