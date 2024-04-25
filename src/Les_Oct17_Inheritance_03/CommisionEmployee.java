package Les_Oct17_Inheritance_03;

public class CommisionEmployee extends Employee{
    protected double grossSales, commissionRate;

    public CommisionEmployee(){
        super();
        grossSales = 0.0;
        commissionRate = 0.0;
    }
    public CommisionEmployee(String fname, String lname, String snum, double grossSales, double commissionRate){
        super(fname, lname, snum);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }
    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }
    public double getGrossSales(){
        return grossSales;
    }
    public double getCommissionRate(){
        return commissionRate;
    }
    public String toString(){
        return  super.toString() +
                "Gross sales : " + grossSales + "\n" +
                "Commission rate : " + commissionRate + "\n";
    }
}
