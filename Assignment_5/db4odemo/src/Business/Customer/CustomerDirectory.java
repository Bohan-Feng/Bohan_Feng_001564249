/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class CustomerDirectory extends ArrayList<Customer>{

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * find customer by id
     * @param ID
     * @return
     */
    public Customer getCustomerByID(int ID){
                
        try{
            return (Customer) this.stream()
            .filter(c -> c.getID() == ID)
            .toArray()[0];
        }catch(java.lang.ArrayIndexOutOfBoundsException e){

        }
        return null;
    }

    /**
     * update one of customer
     * @param c
     */
    public void update(Customer c){
        for(int i = 0; i < this.size(); i++){
            if(c.getID() == this.get(i).getID()){
                this.set(i, c);
                break;
            }
        }
    }
    
}
