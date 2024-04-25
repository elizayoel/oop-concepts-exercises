package Les_Oct17_Inheritance_01;
public class Staff3 extends Employee3{
    protected String staff_title; // karena ada FullTime dan PartTime

    public Staff3(){
        super();
        staff_title = "";
    }
    public Staff3(String name, String add, String phone, String email, String office, double salary, MyDate dh, String title){
        super(name,add,phone,email,office,salary,dh);
        staff_title = title;
    }
    public void setStaff_title(String staff_title) {
        this.staff_title = staff_title;
    }
    public String getStaff_title(){
        return staff_title;
    }
    public String toString(){
        return super.toString() +
                "Staff Title : " + staff_title + "\n";
    }
}

class FullTime3 extends Staff3{
    public FullTime3(){
        super();
    }
    public FullTime3(String name, String add, String phone, String email,
                     String office, double salary, MyDate dh,
                     String title){
        super(name,add,phone,email,office,salary,dh,title);
    }
}
class PartTime3 extends Staff3{
    private double hourly_rate;
    private int working_hours;

    public PartTime3(){
        super();
        hourly_rate = 0.0;
        working_hours = 0;
    }
    public PartTime3(String name, String add, String phone, String email, String office, double salary, MyDate dh, String title, double rate, int hours){
        super(name,add,phone,email,office,salary,dh,title);
        hourly_rate = rate;
        working_hours = hours;
        salary = hourly_rate * working_hours; //untuk mengisi salary di orang tua
    }
    public double calculateEarnings(){
        return hourly_rate * working_hours;
    } // untuk update gaji
}