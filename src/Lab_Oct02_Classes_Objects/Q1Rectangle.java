package Lab_Oct02_Classes_Objects;


public class Q1Rectangle {
    public static void main(String[] args) {
        // using default constructor
        Rectangle r1 = new Rectangle();
        r1.setWidth(4);
        r1.setHeight(5);
        r1.setColor("Pink");

        System.out.println("Width\t: " + r1.getWidth());
        System.out.println("Height\t: " + r1.getHeight());
        System.out.println("Color\t: " + r1.getColor());

        double area = r1.findArea();
        System.out.println("Area\t: " + area);
        double perimeter = r1.findPerimeter();
        System.out.println("Perimeter : " + perimeter);
        System.out.println();

        // parameter constructor
        Rectangle r2 = new Rectangle(10,5,"Black");
        r2.display();
    }
}

class Rectangle {
    private double width;
    private double height;
    private String color;

    public Rectangle (){
        width = 0.0;
        height = 0.0;
        color = "";
    }
    public Rectangle (double width, double height, String color){
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public String getColor (){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public double findArea(){
        double area = height * width;
        return area;
    }
    public double findPerimeter(){
        double perimeter = (2*height) + (2*width);
        return perimeter;
    }
    public void display(){
        System.out.println("Width\t: " + width);
        System.out.println("Height\t: " + height);
        System.out.println("Color\t: " + color);
        System.out.println("Area\t: " + this.findArea());
        System.out.println("Perimeter\t: " + this.findPerimeter());
    }
}