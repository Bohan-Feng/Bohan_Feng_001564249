/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

/**
 *
 * @author harold
 */
public class Restaurant {
    public static int restCount = 0;

    private int ID;
    private String restaruantName;


    public Restaurant() {
        this.ID = ++ restCount;
    }

    public Restaurant(String name){
        this();
        this.restaruantName = name;
    }

    public int getID() {
        return this.ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getRestaruantName() {
        return this.restaruantName;
    }

    public void setRestaruantName(String restaruantName) {
        this.restaruantName = restaruantName;
    }

    @Override
    public String toString() {
        return "{" +
            " restaruantName='" + restaruantName + "'" +
            "}";
    }

    
}
