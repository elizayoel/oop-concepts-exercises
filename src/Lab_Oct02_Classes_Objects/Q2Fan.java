package Lab_Oct02_Classes_Objects;

import java.util.Scanner;

enum Speed {
    slow(1), medium(2),fast(3);
    private int value;
    private Speed(int nilai){
        this.value = nilai;
        // kalo enum harus pake private
    }
    public int getValue(){
        return value;
    }
}

public class Q2Fan{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Fan f1 = new Fan();
        f1.setOn(true);
        f1.setRadius(10.0);
        f1.setColor("Yellow");
        System.out.println("1.Slow\n2.Medium\n3.Fast\n");
        System.out.println(f1); //menjalankan toString

        int option = scan.nextInt();
        if(option == 1){
            f1.setSpeed(Speed.slow);
        }else if(option == 2){
            f1.setSpeed(Speed.medium);
        }else if(option == 3){
            f1.setSpeed(Speed.fast);
        }
        System.out.println(f1);
    }
}

class Fan {
    private Speed speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan(){
        this.speed = Speed.slow;
        this.on = false;
        this.radius = 0.0;
        this.color = "transparent";
    }
    public void setSpeed(Speed speed){
        this.speed = speed;
    }
    public void setOn(boolean on){
        this.on = on;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public void setColor(String col){
        color = col;
    }
    public boolean getOn(){
        return this.on;
    }
    public double getRadius(){
        return this.radius;
    }
    public String getColor(){
        return this.color;
    }
    public String toString(){
        String condition = "";
        if(this.on)condition = "On";
        else condition = "Off";

        return "Speed = " + this.speed + "\n" +
                "On = " + condition + "\n" +
                "Radius = " + this.radius + "\n" +
                "Color = " + this.color + "\n";
    }
}