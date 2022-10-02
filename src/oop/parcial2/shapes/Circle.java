package oop.parcial2.shapes;

public class Circle extends Shape{
    private int radio;

    public Circle(int radio) {
        super("Circle", 0);
        this.radio = radio;
    }

    public double getArea(){
        return (Math.PI* Math.pow(radio,2));
    }

    public double getPerimeter() {
        return (2 * Math.PI * radio);
    }

    public String toString(){
        return "○";
    }
}
