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

    private static Business business;
    private SalesPersonDirectory salesPersonDirectory;
    private ProductCatalog productCatalog;
    private MasterOrderCatalog masterOrderCatalog;
    private CustomerDirectory customerDirectory;

    private Business() {
        salesPersonDirectory = new SalesPersonDirectory();
        masterOrderCatalog = new MasterOrderCatalog();
        productCatalog = new ProductCatalog();
        customerDirectory = new CustomerDirectory();

    }

    public static Business getInstance() {
        if (business == null) {
            business = new Business();
        }
        return business;
    }

    public SalesPersonDirectory getSalesPersonDirectory() {
        return salesPersonDirectory;
    }

    public void setSalesPersonDirectory(SalesPersonDirectory salesPersonDirectory) {
        this.salesPersonDirectory = salesPersonDirectory;
    }

    public ProductCatalog getProductCatalog() {
        return productCatalog;
    }

    public void setProductCatalog(ProductCatalog productCatalog) {
        this.productCatalog = productCatalog;
    }

    public MasterOrderCatalog getMasterOrderCatalog() {
        return masterOrderCatalog;
    }

    public void setMasterOrderCatalog(MasterOrderCatalog masterOrderCatalog) {
        this.masterOrderCatalog = masterOrderCatalog;
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }

}
