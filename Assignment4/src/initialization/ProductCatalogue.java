/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package initialization;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author SONY
 */
public class ProductCatalogue {

    private List<Product> productList;

    public ProductCatalogue() {
        this.productList = new ArrayList<>();
    }

    void addProduct() {

        productList.add(new Product("ConZip", "Analgesic", "Tamadol", "PainKiller", "As directed by physician", "TRAMADOL HCL", "Ranbaxy", "Contact  1-800-222-1222", "use only if prescribed", "May cause withdrawal reactions",100));
        productList.add(new Product("Ryzolt", "Analgesic", "Tamadol", "PainKiller", "As directed by physician", "TRAMADOL HCL", "Bayer", "Contact  1-800-222-1223", "use only if prescribed", "May cause withdrawal reactions",90));
        productList.add(new Product("Ultram", "Analgesic", "Tamadol", "PainKiller", "As directed by physician", "TRAMADOL HCL", "Novartis", "Contact  1-800-222-1224", "use only if prescribed", "May cause withdrawal reactions",75));
        productList.add(new Product("Bendryl", "Antihistamine", "Diphenhydramine ", "Cough/cold", "As directed by physician", "DIPHENHYDRAMINE", "GlaxoSmith", "Contact  1-800-222-1225", "use only if prescribed", "May cause withdrawal reactions",50));
        productList.add(new Product("Advil", "Anti-inflammatory", "Ibuprofen", "Pain relief", "As directed by physician", "IBUPROFEN", "Zydus", "Contact  1-800-222-1226", "use only if prescribed", "May cause withdrawal reactions",60));
        productList.add(new Product("Lexapro", "Anti-depressant", "ESCITALOPRAM OXALATE", "Treat Depression", "As directed by physician", "ESCITALOPRAM OXALATE", "Dr. Reddy's", "Contact  1-800-222-1227", "use only if prescribed", "May cause withdrawal reactions",44));
        productList.add(new Product("Nexium", "Antacid", "ESOMEPRAZOLE MAGNESIUM", "Treat certain stomach problems", "As directed by physician", "ESOMEPRAZOLE MAGNESIUM", "Pfizer", "Contact  1-800-222-1228", "use only if prescribed", "May cause withdrawal reactions",31));
        productList.add(new Product("Pradaxa", "Anticoagulant ", "Dabigatran ", "Prevent stroke", "As directed by physician", "Dabigatran ", "BioGen", "Contact  1-800-222-1229", "use only if prescribed", "May cause withdrawal reactions",20));
        productList.add(new Product("Elavil", "Anti-depressant", "AMITRIPTYLINE HCL", "Treat mental/mood problems ", "As directed by physician", "AMITRIPTYLINE HCL", "Baxter", "Contact  1-800-222-1230", "use only if prescribed", "May cause withdrawal reactions",10));
        productList.add(new Product("Celexa", "Anti-depressant", "CITALOPRAM HYDROBROMIDE", "Treat mental/mood problems ", "As directed by physician", "CITALOPRAM HYDROBROMIDE", "Macleods", "Contact  1-800-222-1231", "use only if prescribed", "May cause withdrawal reactions",5));

    }

    void displayProduct() {
        System.out.printf("\n%-20s %10s", "Product Name ", "Product ID ");

        for (Product p : getProductList()) {
            System.out.printf("\n%-20.20s %10d", p.getProductName());
        }

        System.out.println("\n" + "-----------------------------------");

    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

}
