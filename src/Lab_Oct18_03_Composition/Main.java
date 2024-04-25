package Lab_Oct18_03_Composition;

public class Main {
    public static void main(String[] args) {
        Car [] mycar = new Car[100];
        // sets the value for carburator object inside mycar
        Carburator c1 = new Carburator("B",7500,"Yamaha");
        mycar[0] = new Car("MOD1","4wd",c1);

        mycar[0].c.setData("A",8500,"Mico");
    }
}
