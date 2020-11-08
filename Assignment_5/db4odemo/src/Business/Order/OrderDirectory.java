package Business.Order;

import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 * 
 * @author Bohan Feng
 */
public class OrderDirectory extends ArrayList<Order>{

    /**
     *
     */
    private static final long serialVersionUID = 1L;


    /**
     * 
     * @param rID
     * @return
     */
    public OrderDirectory getOrdersByReceiverID(int rID){
        return this.stream()
        .filter(o -> o.getReceiverID() == rID)
        .collect(Collectors
        .toCollection(OrderDirectory::new));
    }

    /**
     * 
     * @param sID
     * @return
     */
    public OrderDirectory getOrdersBySenderID(int sID){
        return this.stream()
        .filter(o -> o.getSenderID() == sID)
        .collect(Collectors
        .toCollection(OrderDirectory::new));
    }

    /**
     * 
     * @param rID
     * @return
     */
    public OrderDirectory getOrdersByRestaurnatID(int rID){
        OrderDirectory re = new OrderDirectory();
        for(Order o : this){
            if(o.getRestaurnatID() == rID){
                re.add(o);
            }
        }
        return re;
    }

    /**
     * 
     * @param o
     */
    public void update(Order o){
        for(int i = 0; i < this.size(); i++){
            if(o.getID() == this.get(i).getID()){
                this.set(i, o);
                break;
            }
        }
    }
    
    
}
