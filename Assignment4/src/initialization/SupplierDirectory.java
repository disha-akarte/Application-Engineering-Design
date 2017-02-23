/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package initialization;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SONY
 */
public class SupplierDirectory {
    
    private List<Supplier> supplierList;
    private Supplier supplier;
    private String suppName[] = {"A Pharmacy", "B Pharmacy", "C Pharmacy","D Pharmacy","E Pharmacy"};

    public SupplierDirectory()
    {
        this.supplierList = new ArrayList<>();
        setSupplierList(supplierList);
          
    }
       
    public List<Supplier> getSupplierList() {
        return supplierList;
    }

    public void setSupplierList(List<Supplier> supplierList) {
        this.supplierList = supplierList;
        addSupplierList();
    }    
    
    public void addSupplierList()
    {
        int num = (int)(Math.random()*200);
        for(int i=0; i<suppName.length; i++)
        supplierList.add(new Supplier(suppName[i],num+i));
    
    }
 
    void displaySupplier()
    {
         for(Supplier s : getSupplierList())
         {
            System.out.println("Supplier name: "+ s.getSupplierName()+"\n"+"Supplier ID: "+s.getSupplierID());
            System.out.println("-----------------------------------");
            s.getPcatalog().displayProduct();
         }
    }
} 
