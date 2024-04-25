package Lab_Oct18_01_Inheritance;

public class Educational extends Customer{
    private String institutionName;
    private String institutionAddress;
    private int institutionType; // 1-uni/college, 2-school

    // this superclass will refer to parentclass's constructor
    public Educational(String id, String lead, String name, String add, int type){
        // calling and refering to the parentclass constructor so u can pass your data to parentclass
        super(id,lead); //custID and custLead
        institutionName = name;
        institutionAddress = add;
        institutionType = type;
    }

    // calculate discount is better be put in this class because
    // we have to check the type of educational institution
    // 1-university, 2-school will get different discount amount
    public void calculateDisc(){
        // EDUCATIONAL class overrides the 'calculateDisc' method
        // inherited from CUSTOMER class.
        // this is the specific implementation of the method (this method is empty in parent class)
        double totalDisc = 0.0;
        calculateTotal();
        System.out.println("The total order amount : " + totalOrderAmount);
        if(institutionType == 1) {
            totalDisc = totalOrderAmount * 0.10;
        }else {
            totalDisc = totalOrderAmount * 0.20;
        }
        System.out.println("Total discount is " + totalDisc);
    }
}
