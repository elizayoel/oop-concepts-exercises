package Les_Oct17_Inheritance_01;
public class Employee3 extends Person3{
    protected String office;
    protected double salary;
    protected MyDate date_hired;

    public Employee3(){
        super(); // ga perlu diisi lagi krn di orang tua sudah ada
        office = "";
        salary = 0.0;
        date_hired = null;
        // date_hired = new MyDate(); pakai default constructor MyDate
    }
    public Employee3(String name, String add, String phone, String email, String office, double salary, MyDate dh){
        super(name,add,phone,email);
        this.office = office;
        this.salary = salary;
        date_hired = dh;
    }

    public void setOffice(String office) {
        this.office = office;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void setDate_hired(MyDate date_hired) {
        this.date_hired = date_hired;
    }

    public String getOffice(){
        return office;
    }
    public double getSalary(){
        return salary;
    }
    public MyDate getDate_Hired(){
        return date_hired;
    }

    public String toString(){
        return super.toString() +
                "Office\t: " + office + "\n" +
                "Salary\t: " + salary + "\n" +
                "Hired Date : " + date_hired + "\n";
    }
}