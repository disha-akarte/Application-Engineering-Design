/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3_q1;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author SONY
 */
public class ProductCatalogue {
  
private List<Product> productList;

    public ProductCatalogue()
    {
        this.productList = new ArrayList<>();
    }
    
    void addProduct(String sname)
    {
             
        int num = (int)(Math.random()*200);
        
        for(int i=1;i<=10;i++)
            
            productList.add(new Product((sname+i),num+i));
           
    }
    
    void displayProduct()
    {
        System.out.printf("\n%-20s %10s","Product Name ", "Product ID ");

        for(Product p : getProductList())
            System.out.printf("\n%-20.20s %10d",p.getProductName(),p.getProductID());
        
        System.out.println("\n"+"-----------------------------------");
        
    }
    
    public List<Product> getProductList() 
    {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
    
}
