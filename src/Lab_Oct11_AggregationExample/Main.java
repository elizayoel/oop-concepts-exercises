package Lab_Oct11_AggregationExample;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mr. Smith");
        Student s1 = new Student("Alice",t1);
        Student s2 = new Student("Bob",t1);

        s1.attendClass();
        s2.attendClass();
    }
}

/*
AGGREGATION
teacher can exist without student
if student is removed, teacher will still be available

COMPOSITION
the teacher object is created in student class, therefore if student is removed
teacher class will also be deleted
 */

class Teacher {
    private String name;
    public Teacher(String name){
        this.name = name;
    }
    public void teach(){
        System.out.println(name + " is teaching.");
    }
}

class Student {
    private String name;
    private Teacher teacher;

    public Student(String name, Teacher teacher){
        this.name = name;
        this.teacher = teacher;
    }
    public void attendClass(){
        System.out.println(name + " is attending class.");
        teacher.teach();
    }
}
