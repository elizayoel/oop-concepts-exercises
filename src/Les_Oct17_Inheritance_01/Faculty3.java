package Les_Oct17_Inheritance_01;
public class Faculty3 extends Employee3{
    private String office_hours;
    private String rank;

    public Faculty3(){
        super();
        office_hours = "";
        rank = "";
    }
    // langsung copy parameter dari orang tua
    // MyDate dibuat dari main, jd disini hanya perlu memasukkan object nya
    public Faculty3(String name, String add, String phone, String email, String office, double salary, MyDate dh, String oh, String rank){
        super(name,add,phone,email,office,salary,dh);
        office_hours = oh;
        this.rank = rank;
    }

    public void setOffice_hours(String office_hours) {
        this.office_hours = office_hours;
    }
    public void setRank(String rank) {
        this.rank = rank;
    }
    public String getOffice_hours(){
        return office_hours;
    }
    public String getRank(){
        return rank;
    }

    public String toString(){
        return super.toString() +
                "Office hours :" + office_hours + "\n" +
                "Rank\t\t: " + rank + "\n";
    }
}
