/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import Business.IDgenerator;
import Business.DB4OUtil.DB4OUtil;
import java.util.ArrayList;

import Business.Employee.Employee;
import Business.UserAccount.UserAccount;

/**
 *
 * @author harold
 */
public class Restaurant {
    public static int restCount = 0;

    private int ID;
    private String restaruantName;
    private ArrayList<UserAccount> admins;
    private Menu menu;


    public Restaurant() {
        this.ID = IDgenerator.generateUniqueId();
        admins = new ArrayList<UserAccount>();
        menu = new Menu();
    }

    public Restaurant(String name){
        this();
        this.restaruantName = name;
    }

    public ArrayList<UserAccount> getAdmins() {
        return this.admins;
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
	public void setAdmins(ArrayList<UserAccount> admins) {
        this.admins = admins;
    }

    public Menu getMenu() {
        return this.menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    @Override
    public String toString() {
        return restaruantName;
    }

    
}
