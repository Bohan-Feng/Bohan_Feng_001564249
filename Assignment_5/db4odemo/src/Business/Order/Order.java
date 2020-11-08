
package Business.Order;

import Business.IDgenerator;
import Business.DB4OUtil.DB4OUtil;

import java.net.IDN;
import java.util.Date;

/**
 *
 * @author Bohan Feng
 */
public class Order {
    private static int orderCount = 0;
    
    private int ID;
    private int receiverID;
    private int senderID;
    private int restaurnatID;
    private String orderInfo;
    private String status;
    private String address;
    private String comment;
    private Date createDate;
    private Date resolveDate;


    // constuctoer
    public Order() {
        this.ID = IDgenerator.generateUniqueId();
        this.createDate = new Date();
        this.senderID = -1;
        this.receiverID = -1;
        this.restaurnatID = -1;
        status = "Pending";
    }

    // public method
    public void setOrderReleation(int sID, int rID){
        this.receiverID = rID;
        this.senderID = sID;
    }
    
    public void perpareOrder(){
        status = "Cooking in progress";
    }
    
    public void finishCooking(){
        status = "ready to pick up";
    }
    
    public void pickupDelivery(){
        status = "Delivering";
    }

    public void resolveOrder(){
        this.resolveDate = new Date();
        this.status = "Complete";
    }

    public String getComment() {
        return comment;
    }

    // Gatter and setter
    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getRestaurnatID() {
        return this.restaurnatID;
    }

    public void setRestaurnatID(int restaurnatID) {
        this.restaurnatID = restaurnatID;
    }

    public int getID() {
        return this.ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getReceiverID() {
        return this.receiverID;
    }

    public void setReceiverID(int receiverID) {
        this.receiverID = receiverID;
    }

    public int getSenderID() {
        return this.senderID;
    }

    public void setSenderID(int senderID) {
        this.senderID = senderID;
    }

    public String getOrderInfo() {
        return this.orderInfo;
    }

    public void setOrderInfo(String orderInfo) {
        this.orderInfo = orderInfo;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }
    
    @Override
    public String toString() {
        return ID + "";
    }
    
    
}
