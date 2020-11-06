/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

/**
 *
 * @author harold
 */
public class DeliveryMan {
    
    private static int ManCount = 0;

    private int ID;

    private String firstName, lastName;

    private int orderSend;

    // constructors
    public DeliveryMan() {
        this.ID = ++ManCount;
    }

    public DeliveryMan(String fname, String lname) {
        this();
        this.firstName = fname;
        this.lastName = lname;
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

}
