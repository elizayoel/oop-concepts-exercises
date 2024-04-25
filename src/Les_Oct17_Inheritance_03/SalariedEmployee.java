package Les_Oct17_Inheritance_03;

public class SalariedEmployee extends Employee{
    private double weeklySalary;

    public SalariedEmployee(){
        super();
        weeklySalary = 0.0;
    }
    public SalariedEmployee(String fname, String lname, String snum,double weeklySalary){
        super(fname,lname,snum);
        this.weeklySalary = weeklySalary;
    }
    public double getWeeklySalary() {
        return weeklySalary;
    }
    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }
    public String toString(){
        return  super.toString() +
                "Weekly salary : " + weeklySalary + "\n";
    }
}
