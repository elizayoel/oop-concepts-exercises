package Lab_Oct18_03_Composition;

public class Carburator {
    private String type;
    private int cost;
    private String manufacturer;

    public Carburator(){
        type = "";
        cost = 0;
        manufacturer = "";
    }
    public Carburator(String type, int cost, String manu){
        this.type = type;
        this.cost = cost;
        manufacturer = manu;
    }
    public void setData(String type, int cost, String manu){
        this.type = type;
        this.cost = cost;
        manufacturer = manu;
    }
}
