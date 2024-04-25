package Les_Oct13_Association_03_Order;
public class Order {
    private static int nextOrderID = 1; // nanti di assign ke orderID pertama
    // should use static so that it will be shared among all "Order" objects
    // each time a new order is created, it will correctly increment the orderID to provide a unique value for each other
    private int orderID;


    public Order(){
        // constructor that create order object
        // assign unique order ID using the nextOrderID static variable
        this.orderID = nextOrderID;
        nextOrderID++;
    }
    public int getOrderID(){
        return orderID;
    }
    public String toString(){
        return "Order ID : " + orderID + "\n";
    }
}