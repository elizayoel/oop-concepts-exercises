package Les_Oct13_Association_03_Order;
public class Main {
    public static void main(String[] args) {
        Order o1 = new Order();
        Order o2 = new Order();

        Customer c1 = new Customer("Eliza",2);
        c1.placeOrder(o1); c1.placeOrder(o2);
        c1.displayOrder();
    }
}