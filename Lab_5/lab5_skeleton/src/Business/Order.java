


package Business;

import java.util.*;

/**
 *
 * @author Bohan Feng
 */
public class Order extends ArrayList<OrderItem> {
    private int orderNumber;
    private static int count = 0;

    public Order() {
        count ++;
        orderNumber = count;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Order.count = count;
    }
    
    public OrderItem addOrderItem(Product p, int q, double price){
        OrderItem toadd = new OrderItem();
        toadd.setProduct(p);
        toadd.setQuanity(q);
        toadd.setSealsPrice(price);
        this.add(toadd);
        return toadd;
    }
    
    public void removeOrderItem(OrderItem o){
        this.remove(o);
    }
    
}
