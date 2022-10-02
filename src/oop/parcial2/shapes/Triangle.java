package oop.parcial2.shapes;

public class Triangle extends Shape{
    private int base;
    private int height;

    public Triangle(int base, int height) {
        super("Triangle", 3);
        this.base = base;
        this.height = height;
    }

    public double getArea(){
        return ((base*height)/2.0);
    }

    public double getPerimeter(){
        return (2*height)+base;
    }

    public String toString(){
        return "▲";
    }
}
