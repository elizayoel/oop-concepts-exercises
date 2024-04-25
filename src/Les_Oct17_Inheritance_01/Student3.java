package Les_Oct17_Inheritance_01;
public class Student3 extends Person3{
    enum Status {
        freshman, sophomore, junior, senior
    } // ini boleh juga ditaruh diluar kelas
    private Status status; //attribute student

    // default
    public Student3(){
        super("","","","");
        status = Status.freshman; // defaultnya
    }
    public Student3 (String name, String add, String phone, String email, String newStat){
        super(name,add,phone,email);
        if(newStat.equalsIgnoreCase("freshman")){
            status = Status.freshman;
        }else if(newStat.equalsIgnoreCase("sophomore")){
            status = Status.sophomore;
        }else if(newStat.equalsIgnoreCase("junior")){
            status = Status.junior;
        }else if(newStat.equalsIgnoreCase("senior")){
            status = Status.senior;
        }
    }
    public Status getStatus(){
        return this.status;
    }
    public void setStatus(Status changeStat){
        this.status = changeStat;
    }
    public String toString(){
        return super.toString() +
                "Status\t\t\t: " + status + " \n";
    }
}

