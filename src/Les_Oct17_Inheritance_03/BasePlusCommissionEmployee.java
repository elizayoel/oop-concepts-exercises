package Les_Oct17_Inheritance_03;

public class BasePlusCommissionEmployee extends CommisionEmployee {
    private double baseSalary;

    public BasePlusCommissionEmployee(){
        super();
        baseSalary = 0.0;
    }
    public BasePlusCommissionEmployee(String fname, String lname, String snum, double grossSales, double commissionRate, double baseSalary){
        super(fname,lname,snum,grossSales,commissionRate);
        this.baseSalary = baseSalary;
    }
    public double getBaseSalary() {
        return baseSalary;
    }
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    public String toString(){
        return  super.toString() +
                "Base salary : " + baseSalary + "\n";
    }
}
