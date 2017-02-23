/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package initialization;

/**
 *
 * @author SONY
 */
public class Product {
    private String productName;
    private SupplierDirectory sd;
    
    private String prodType;
    private String prodContents;
    private String prodDescription;
    private String prodGenericName;
    private String prodDosage;
    private String prodPrecautions;
    private String prodOoverdose;
    private String prodManufactureBy;
    private String prodWarning;
    private float listPrice;

    public float getListPrice() {
        return listPrice;
    }

    public void setListPrice(float listPrice) {
        this.listPrice = listPrice;
    }

    @Override
    public String toString() {
        return productName;
    }

    public String getProdType() {
        return prodType;
    }

    public void setProdType(String prodType) {
        this.prodType = prodType;
    }

    public String getProdContents() {
        return prodContents;
    }

    public void setProdContents(String prodContents) {
        this.prodContents = prodContents;
    }

    public String getProdDescription() {
        return prodDescription;
    }

    public void setProdDescription(String prodDescription) {
        this.prodDescription = prodDescription;
    }

    public String getProdGenericName() {
        return prodGenericName;
    }

    public void setProdGenericName(String prodGenericName) {
        this.prodGenericName = prodGenericName;
    }

    public String getProdDosage() {
        return prodDosage;
    }

    public void setProdDosage(String prodDosage) {
        this.prodDosage = prodDosage;
    }

    public String getProdPrecautions() {
        return prodPrecautions;
    }

    public void setProdPrecautions(String prodPrecautions) {
        this.prodPrecautions = prodPrecautions;
    }

    public String getProdOoverdose() {
        return prodOoverdose;
    }

    public void setProdOoverdose(String prodOoverdose) {
        this.prodOoverdose = prodOoverdose;
    }

    public String getProdManufactureBy() {
        return prodManufactureBy;
    }

    public void setProdManufactureBy(String prodManufactureBy) {
        this.prodManufactureBy = prodManufactureBy;
    }

    public String getProdWarning() {
        return prodWarning;
    }

    public void setProdWarning(String prodWarning) {
        this.prodWarning = prodWarning;
    }
          
    public Product(String pname, String type, String Cont, String desc,
            String dose,String genName, String manu, String over,String prec, String warn,float listPrice) 
    {
        setProductName(pname);
        setProdContents(Cont);
        setProdDescription(desc);
        setProdDosage(dose);
        setProdGenericName(genName);
        setProdManufactureBy(manu);
        setProdOoverdose(over);
        setProdPrecautions(prec);
        setProdType(type);
        setProdWarning(warn);
        setListPrice(listPrice);
       
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

   
}
