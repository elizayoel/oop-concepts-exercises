package Lab_Oct18_01_Inheritance;

public class Customer {
    protected String custID;
    protected String custLead;
    // when you have common attributes, can put it in the parrent class
    // customer bisa order 12 kali, sekali order bisa bebas amount
    protected int [] OrderAmount = new int[12];
    private int currentOrder = 0;

    // kalau mau order, maks nya 12, sekali order masukin brp amount order di parameter
    protected void addOrder(int orderAmount){
        OrderAmount[currentOrder] = orderAmount;
        currentOrder++;
    }

    // hitung total semua angka yg udah diorder dari 12 order
    protected int totalOrderAmount = 0;
    protected void calculateTotal(){
        for (int i = 0; i < currentOrder; i++) {
            totalOrderAmount = totalOrderAmount + OrderAmount[i];
        }
    }
    public Customer(String id, String lead){
        custID = id;
        custLead = lead;
    }

    // method overriding is a feature where a subclass provides a specific implementation
    // of a method that is already defined in its superclass
    public void calculateDisc(){
        // define method with empty implementation, this will be overriden in Customer's subclass
    }
}
