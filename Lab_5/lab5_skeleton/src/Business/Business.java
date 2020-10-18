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
public class Business {
    private SupplierDirectory suppliers;
    private MasterOrderCatalog orders;

    public Business() {
        suppliers = new SupplierDirectory();
        orders = new MasterOrderCatalog();
    }

    public SupplierDirectory getSuppliers() {
        return suppliers;
    }

    public void setSuppliers(SupplierDirectory suppliers) {
        this.suppliers = suppliers;
    }

    public MasterOrderCatalog getOrders() {
        return orders;
    }

    public void setOrders(MasterOrderCatalog orders) {
        this.orders = orders;
    }   
}
