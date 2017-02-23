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
public class OrderItem {
    private Product product;
    private int quantity;
    private int salesprice;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getSalesprice() {
        return salesprice;
    }

    public void setSalesprice(int salesprice) {
        this.salesprice = salesprice;
    }

    @Override
    public String toString() {
        return product.getProdName();
    }
    
    
}
