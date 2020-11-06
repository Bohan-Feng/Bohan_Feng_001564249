package Business;

import Business.Customer.CustomerDirectory;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.Employee.Employee;
import Business.Restaurant.RestaurantDirectory;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
import Business.DB4OUtil.DB4OUtil;

/**
 *
 * @author rrheg
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        //system.setCustomerDirectory(new CustomerDirectory());
        //system.setDeliveryManDirectory(new DeliveryManDirectory());
        //system.setRestaurantDirectory(new RestaurantDirectory());
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        Employee employee = system.getEmployeeDirectory().createEmployee("RRH");
        
        //UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        
        return system;
    }
    
}
