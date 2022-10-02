package oop.parcial2.shapes;

public class Rectangle extends Shape {
    private int base;
    private int height;

    public Rectangle(int base, int height) {
        super("Rectangle", 4);
        this.base = base;
        this.height = height;
    }

    public double getArea(){
        return base * height;
    }

    public double getPerimeter(){
        return ((base*2)+(height*2));
    }

    public String toString(){
        return "█";
    }
}
