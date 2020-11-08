package Business.Restaurant;

import Business.IDgenerator;

/**
 * @author Bohan Feng
 */
public class MenuItem {
    
    private int ID;

    private String name;

    private String Description;


    public MenuItem() {
        this.ID = IDgenerator.generateUniqueId();
    }

    public MenuItem(String n){
        this.name = n;
        this.Description = "";
    }

    @Override
    public String toString() {
        return this.name;
    }

    public int getID() {
        return this.ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }


}
