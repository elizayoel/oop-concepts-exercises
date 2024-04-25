package Les_Oct23_Polymorphism_Employee;

public class Manager extends Employee{
    private String keahlian;
    private MyDate tgljadimanager;

    public Manager(){
        super();
        keahlian = "";
        tgljadimanager = new MyDate();
    }
    public Manager(String code, String name, String city, MyDate sw, String ahli, MyDate tgljadimanager){
        super(code,name,city,sw);
        keahlian = ahli;
        this.tgljadimanager = tgljadimanager;
    }
    public String getKeahlian() {
        return keahlian;
    }
    public void setKeahlian(String keahlian) {
        this.keahlian = keahlian;
    }
    public MyDate getTgljadimanager() {
        return tgljadimanager;
    }
    public void setTgljadimanager(MyDate tgljadimanager) {
        this.tgljadimanager = tgljadimanager;
    }
    public String toString(){
        return super.toString() + "" +
                "Keahlian\t" + keahlian + "\n" +
                "Tanggal jadi manager : " + tgljadimanager + "\n";
    }
}
