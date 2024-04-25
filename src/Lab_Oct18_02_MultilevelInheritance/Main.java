package Lab_Oct18_02_MultilevelInheritance;

// MULTILEVEL INHERITANCE
// a class extend to another class that is already extended from another class
// class A extends B, B extends C
// subclass became the base class for a new class

public class Main {
    public static void main(String[] args) {
        Result [] candidate = new Result[10];

        candidate[1] = new Result(1,"Eliza",100,100);
        System.out.println(candidate[1]);
        candidate[2] = new Result(2,"Sasa",80,79);
        candidate[3] = new Result(3,"Kayla",92,38);
        candidate[4] = new Result(4,"Eliana",29,10);
    }
}
