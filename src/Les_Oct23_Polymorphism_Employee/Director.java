package Les_Oct23_Polymorphism_Employee;

public class Director extends Employee{
    private MyDate tgljadidirector;
    public Director(){
        super();
        tgljadidirector = new MyDate();
    }
    public Director(String code, String name, String city, MyDate sw,MyDate tgljadidirector){
        super(code,city,name,sw);
        this.tgljadidirector = tgljadidirector;
    }
    public MyDate getTgljadidirector() {
        return tgljadidirector;
    }
    public void setTgljadidirector(MyDate tgljadidirector) {
        this.tgljadidirector = tgljadidirector;
    }
    public String toString(){
        return super.toString() +
                "Tanggal jadi director : " + tgljadidirector + "\n";
    }
}
