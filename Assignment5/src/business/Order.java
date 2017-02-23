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
public class Order {
    private static int count=0;
    private ArrayList<OrderItem> orderItemList;
    private int orderNumber;
    private Salesperson salesperson;
    private int custID;

    public Salesperson getSalesperson() {
        return salesperson;
    }

    public void setSalesperson(Salesperson salesperson) {
        this.salesperson = salesperson;
    }

    public int getCustID() {
        return custID;
    }

    public void setCustID(int custID) {
        this.custID = custID;
    }
    
    
    public Order(){
        count++;
        orderNumber = count;
        orderItemList = new ArrayList<OrderItem>();
    }

    public ArrayList<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(ArrayList<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }
    
    public OrderItem addItem(Product p, int qty,int sp){
      OrderItem ordItem = new OrderItem();
      ordItem.setProduct(p);
      ordItem.setQuantity(qty);
      ordItem.setSalesprice(sp);
      
      orderItemList.add(ordItem);
      return ordItem;
    }
    
    public void removeItem(OrderItem ordItem){
        orderItemList.remove(ordItem);
    }
}
