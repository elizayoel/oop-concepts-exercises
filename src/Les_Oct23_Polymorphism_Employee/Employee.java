package Les_Oct23_Polymorphism_Employee;

public class Employee {
    protected String code;
    protected String name;
    protected String city;
    protected MyDate startwork;

    public Employee(){
        code = "";
        name = "";
        city = "";
        startwork = new MyDate();
    }
    public Employee(String code, String n, String city, MyDate sw){
        this.code = code;
        name = n;
        this.city = city;
        startwork = sw;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public MyDate getStartwork() {
        return startwork;
    }
    public void setStartwork(MyDate startwork) {
        this.startwork = startwork;
    }
    public String toString(){
        return "Code\t\t: " + code + "\n" +
                "Name\t\t: " + name + "\n" +
                "City\t\t: " + city + "\n" +
                "Start working date: " + startwork + "\n"; // akan membutuhkan toString nya MyDate
    }
}

