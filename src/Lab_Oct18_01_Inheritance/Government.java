package Lab_Oct18_01_Inheritance;

public class Government extends Customer {
    private String departmentName, officeAddress;

    public Government(String id, String lead, String dn, String oa){
        super(id,lead);
        departmentName = dn;
        officeAddress = oa;
    }
    public void calculateDisc(){
        calculateTotal();
        double totalDisc = totalOrderAmount * 0.05;
        System.out.println("Total discount is " + totalDisc);
    }
}
