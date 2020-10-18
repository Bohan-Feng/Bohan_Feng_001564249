/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Bohan Feng
 */
public class OrderItem {
     private int quanity;
     private double SealsPrice;
     private Product product;

    public int getQuanity() {
        return quanity;
    }

    public void setQuanity(int quanity) {
        this.quanity = quanity;
    }

    public double getSealsPrice() {
        return SealsPrice;
    }

    public void setSealsPrice(double SealsPrice) {
        this.SealsPrice = SealsPrice;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "OrderItem{" + "quanity=" + quanity + ", SealsPrice=" + SealsPrice + ", product=" + product + '}';
    }
     
     
}
