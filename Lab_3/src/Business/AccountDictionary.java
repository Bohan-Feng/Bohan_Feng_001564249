package Business;

import java.util.ArrayList;

/**
 *
 * @author Bohan Feng
 */
public class AccountDictionary extends ArrayList<Account> {


    public Account addAccount(){
        Account newAccount = new Account();
        this.add(newAccount);
        return newAccount;
    }

    public void updateAccout(Account newAccount){
        // not implemented
    }

    public void deleteAccount(Account deleteAccount){
        this.remove(deleteAccount);
    }

    public Account searchAccount(String accoutnNum){
        try{
            return (Account) this.stream()
            .filter(a -> a.getAccountNumber().equals(accoutnNum))
            .toArray()[0];
        }catch(java.lang.ArrayIndexOutOfBoundsException e){}

        return null;
    }
    
}
