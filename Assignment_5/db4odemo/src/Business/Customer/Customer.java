/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.IDgenerator;
import Business.DB4OUtil.DB4OUtil;
import Business.UserAccount.UserAccount;

/**
 *
 * @author harold
 */
public class Customer {

    public static int CustCount = 0;

    private int ID;

    private String firstName, lastName;
    
    private UserAccount account;

    // constructors
    public Customer() {
        this.ID = IDgenerator.generateUniqueId();
    }

    public Customer(String fname, String lname, UserAccount useracc) {
        this();
        this.firstName = fname;
        this.lastName = lname;
        this.account = useracc;
    }
    
    // getter and setters

    public UserAccount getAccount() {
        return account;
    }

    public void setAccount(UserAccount account) {
        this.account = account;
    }
    
    public int getID() {
        return ID;
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


    @Override
    public String toString() {
        return this.firstName + " " + this.lastName;
    }

}
