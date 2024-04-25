package Lab_Oct18_02_MultilevelInheritance;

public class Result extends Test{
    private int total_marks;

    public Result(int rn, String name, int em, int sm){
        super(rn,name,em,sm);
        total_marks = em + sm;
    }
    public int calculateTotalMarks(){
        return ecology_mark + sociology_mark;
    }
    public String toString(){
        return super.toString() +
                "Total marks\t\t: " + total_marks;
    }
}
