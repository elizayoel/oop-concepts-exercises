package Lab_Oct18_02_MultilevelInheritance;

public class Test extends Candidate{
    protected int ecology_mark;
    protected int sociology_mark;

    public Test(int rn, String name, int em, int sm){
        super(rn,name);
        ecology_mark = em;
        sociology_mark = sm;
    }
    public String toString(){
        return super.toString() +
                "Ecology mark\t: " + ecology_mark + "\n" +
                "Sociology mark\t: " + sociology_mark + "\n";
    }
}
