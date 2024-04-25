package Lab_Oct18_01_Inheritance;

public class Main {
    public static void main(String[] args) {
        Educational APU = new Educational("C01","asiapacific@mail.com","Asia Pacific University","Bukit Jalil",1);
        APU.addOrder(1200);
        APU.addOrder(2000);
        APU.addOrder(3000);
        APU.addOrder(4000);
        APU.addOrder(5000);
        APU.calculateDisc();

        // make educational object into Customer object type
        Customer C1 = new Educational("C2","xyz","UKM","Serdang",1);
        C1.addOrder(1000);
        C1.addOrder(2000);
        C1.calculateDisc();
        // parent got its own calculateDisc method which is overriden

    }
}
