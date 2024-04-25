package Les_Oct17_Inheritance_01;

public class MyDate{
    private int year, month, day;
    public MyDate(){
        year = 0; month = 0; day = 0;
    }
    public MyDate(int y, int m, int d){
        year = y;
        month = m;
        day = d;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setDay(int day) {
        this.day = day;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public int getYear(){
        return year;
    }
    public int getMonth(){
        return month;
    }
    public int getDay(){
        return day;
    }
    public String toString(){
        return day + "-" + month + "-" + year;
    }
}
