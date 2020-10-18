/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.*;

/**
 *
 * @author Bohan Feng
 */
public class MasterOrderCatalog extends ArrayList<Order> {
    
    public Order addOrder(Order o){
        this.add(o);
        return o;
    }
}
