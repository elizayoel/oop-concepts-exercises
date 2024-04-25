package Les_Oct27_02_Interface_Guru;

public abstract class Student implements InterStud{
    protected String name;
    protected String address;
    protected int age;
    public Student(){
        name = "";
        address = "";
        age = 0;
    }
    public Student(String n, String add, int a){
        name = n;
        address = add;
        age = a;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}
