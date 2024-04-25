package Lab_Oct18_02_MultilevelInheritance;

public class Candidate {
    protected int roll_no;
    protected String name;
    public Candidate(int rn, String name){
        roll_no = rn;
        this.name = name;
    }
    public String toString(){
        return "Name\t\t\t: " + name + "\n" +
                "Roll number : " + roll_no +"\n";
    }
}
