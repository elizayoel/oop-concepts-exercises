package Lab_Oct18_03_Composition;

public class Car {
    private String model;
    private String driveType;
    public Carburator c = new Carburator();

    public Car(String mod, String drive, Carburator c){
        model = mod;
        driveType = drive;
        this.c = c;
    }
    public void setData(String mdl, String dt){
        model = mdl;
        driveType = dt;
    }

}
