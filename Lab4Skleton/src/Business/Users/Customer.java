/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Users;

import Business.Abstract.User;
import java.util.Date;

/**
 *
 * @author AEDSpring2019
 */
public class Customer extends User {

    public Date createDate;
    
    public Customer(String password, String userName){
        super(password,userName,"CUSTOMER");
        createDate = new Date();
    }

    @Override
    public boolean verify(String password) {
        return password.equals(this.getPassword());
    }

    @Override
    public String toString() {
        return this.getUserName();
    }
}
