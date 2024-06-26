package Les_Oct23_Polymorphism_Employee;

public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(){
        day = 0;
        month = 0;
        year = 0;
    }
    public MyDate(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        this.day = day;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public String toString(){
        return day + "/" + month + "/" + year;
    } // mydate harus punya tostring supaya bisa ke print
}
