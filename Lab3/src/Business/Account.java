
package Business;

import java.util.Date;

/**
 *
 * @author Bohan Feng
 */
public class Account {
    private String routingNumber, accountNumber, bankName;
    private int balance;
    private Date createOn;

    public Account(String routingNumber, String accountNumber, String bankName, int balance, Date createOn) {
        this.routingNumber = routingNumber;
        this.accountNumber = accountNumber;
        this.bankName = bankName;
        this.balance = balance;
        this.createOn = createOn;
    }

    public Account() {
    }

    public String getRoutingNumber() {
        return this.routingNumber;
    }

    public void setRoutingNumber(String routingNumber) {
        this.routingNumber = routingNumber;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getBankName() {
        return this.bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public int getBalance() {
        return this.balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Date getCreateOn() {
        return this.createOn;
    }

    public void setCreateOn(Date createOn) {
        this.createOn = createOn;
    }

    @Override
    public String toString() {
        return bankName;
    }
    
    

}
