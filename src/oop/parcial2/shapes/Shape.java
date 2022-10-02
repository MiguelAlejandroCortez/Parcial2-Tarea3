package oop.parcial2.shapes;

public abstract class Shape {

    private String name;
    private int sidesCount;

    public Shape(String name, int sidesCount) {
        this.name = name;
        this.sidesCount = sidesCount;
    }

    public int getSidesCount(){
        return sidesCount;
    }

    public String getName(){
        return name;
    }

    public abstract double getArea();
    public abstract double getPerimeter();
}
