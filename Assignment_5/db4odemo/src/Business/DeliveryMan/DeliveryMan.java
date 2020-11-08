/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import Business.IDgenerator;
import Business.Order.Order;
import Business.UserAccount.UserAccount;

/**
 *
 * @author harold
 */
public class DeliveryMan {
    
    private static int ManCount = 0;

    private int ID;

    private String firstName, lastName;

    private int orderSend;
    
     private UserAccount account;

    // constructors
    public DeliveryMan() {
        this.ID = IDgenerator.generateUniqueId();
        orderSend = 0;
    }

    public DeliveryMan(String fname, String lname, UserAccount ua) {
        this();
        this.firstName = fname;
        this.lastName = lname;
        this.account = ua;
    }

    // getter and setters
    public int getID() {
        return this.ID;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getOrderSend() {
        return this.orderSend;
    }

    public void setOrderSend(int orderSend) {
        this.orderSend = orderSend;
    }
    
    public void completeOrder(Order o){
        this.orderSend ++;
        o.setStatus("Complete");
    }

    public UserAccount getAccount() {
        return account;
    }

    public void setAccount(UserAccount account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
    
    

}
