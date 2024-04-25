package Les_Oct23_Polymorphism_Employee;

public class Kasir extends Employee {
    private double uanglaciawal;
    private double uangpendapatan;

    public Kasir(){
        super();
        uanglaciawal = 0.0;
        uangpendapatan = 0.0;
    }
    public Kasir(String code, String name, String city, MyDate sw, double ul, double up){
        super(code,name,city,sw);
        uanglaciawal = ul;
        uangpendapatan = up;
    }
    public double getUanglaciawal() {
        return uanglaciawal;
    }
    public void setUanglaciawal(double uanglaciawal) {
        this.uanglaciawal = uanglaciawal;
    }
    public double getUangpendapatan() {
        return uangpendapatan;
    }
    public void setUangpendapatan(double uangpendapatan) {
        this.uangpendapatan = uangpendapatan;
    }
    public String toString(){
        return super.toString() +
                "Uang laci awal\t: " + uanglaciawal + "\n" +
                "Uang pendapatan\t: " + uangpendapatan + "\n";
    }
}
