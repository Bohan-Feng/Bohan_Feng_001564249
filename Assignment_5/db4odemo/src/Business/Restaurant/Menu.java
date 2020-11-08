package Business.Restaurant;

import java.util.*;

/**
 * @author Bohan Feng
 */
public class Menu extends ArrayList<MenuItem>{

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    

    /**
     * 
     * @param mi
     * @return
     */
    public boolean update(MenuItem mi){
        for(int i = 0; i < this.size(); i++){
            if(mi.getID() == this.get(i).getID()){
                this.set(i,mi);
                return true;
            }
        }
        return false;
    }
}
