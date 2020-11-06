/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class DeliveryManDirectory extends ArrayList<DeliveryMan> {

    private static final long serialVersionUID = 1L;

    /**
     * 
     * @param id
     * @return
     */
    public DeliveryMan getDeliveryManByID(int id){
        try{
            return (DeliveryMan) this.stream()
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
    public void update(DeliveryMan dm){
        for(int i = 0; i < this.size(); i++){
            if(dm.getID() == this.get(i).getID()){
                this.set(i, dm);
                break;
            }
        }
    } 

}
