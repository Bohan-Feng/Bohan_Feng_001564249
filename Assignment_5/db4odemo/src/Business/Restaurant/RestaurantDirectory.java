/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class RestaurantDirectory extends ArrayList<Restaurant>{

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * 
     * @param id
     * @return
     */
    public Restaurant getRestaurantByID(int id){
        try{
            return (Restaurant) this.stream()
            .filter(c -> c.getID() == id)
            .toArray()[0];
        }catch(java.lang.ArrayIndexOutOfBoundsException e){

        }
        return null;
    }


    /**
     * 
     * @param dm
     */
    public void update(Restaurant dm){
        for(int i = 0; i < this.size(); i++){
            if(dm.getID() == this.get(i).getID()){
                this.set(i, dm);
                break;
            }
        }
    } 
}
