package Les_Oct13_Association_03_Order;
public class Customer {
    private String name;
    private Order [] orders; // list order yang dibuat oleh customer
    private int countOrder; // untuk menghitung array ke nol sampai max
    private int maxOrder;

    public Customer(){
        name = "";
        orders = new Order[5];
        countOrder = 0;
    }
    public Customer(String name, int maxOrders){
        this.name = name;
        this.maxOrder = maxOrders;
        this.orders = new Order[maxOrders];
        countOrder = 0;
    }
    public void placeOrder(Order order){
        // customer can place an order
        // check if maximum order limit has been reached
        // add order to array if there is room
        if(countOrder < maxOrder){
            orders[countOrder] = order;
            countOrder++;
        }else{
            System.out.println("Maximum order limit reached for Order ID: " + orders[countOrder].getOrderID());
        }
    }
    public void displayOrder(){
        System.out.println("Customer : " + name);
        System.out.println("Orders\t: ");
        for (int i = 0; i < countOrder; i++) {
            System.out.println("Order ID : " + orders[i].getOrderID());

        }
    }
}
