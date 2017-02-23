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
public class Product {
    
    private String prodName;
    private int price;
    private int productID;
    private int availability;  
    private static int count =0;
    private int floor;
    private int ceil;
    private int totSale;

    public int getTotSale() {
        return totSale;
    }

    public void setTotSale(int ts) {
        this.totSale = ts;
    }   

    @Override
    public String toString() {
        return prodName; //To change body of generated methods, choose Tools | Templates.
    }

    
    public Product() {
    count++;
    productID = count;
    }

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }
    
    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public int getFloor() {
        floor = price-((int)(price*(10.0f/100.0f)));
        return floor;
    }

    public void setCeil(int price) {
        this.ceil = price+((int)(price*(20.0f/100.0f)));
    }

    public void setFloor(int price) {
        this.floor = price-((int)(price*(10.0f/100.0f)));
    }

    public int getCeil() {
        ceil = price+((int)(price*(20.0f/100.0f)));
        return ceil;
    }
 
}
