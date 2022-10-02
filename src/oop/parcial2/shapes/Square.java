package oop.parcial2.shapes;

public class Square extends Shape{
    private int side;

    public Square(int side){
        super("Square", 4);
        this.side = side;
    }

    public double getPerimeter(){
        return side*4;
    }

    public double getArea(){
        return side*side;
    }
    public String toString(){
        return "■";
    }
}
