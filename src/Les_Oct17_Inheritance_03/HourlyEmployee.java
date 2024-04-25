package Les_Oct17_Inheritance_03;

public class HourlyEmployee extends Employee {
    private double wage, hours;

    public HourlyEmployee(){
        super();
        wage = 0.0;
        hours = 0.0;
    }
    public HourlyEmployee(String fname, String lname, String snum, double wage, double hours){
        super(fname,lname,snum);
        this.wage = wage;
        this.hours = hours;
    }
    public void setHours(double hours) {
        this.hours = hours;
    }
    public void setWage(double wage) {
        this.wage = wage;
    }
    public double getHours() {
        return hours;
    }
    public double getWage() {
        return wage;
    }
    public String toString(){
        return  super.toString() +
                "Wage : " + wage + "\n" +
                "Hours : " + hours + "\n";
    }
}
