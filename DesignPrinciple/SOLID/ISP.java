package DesignPrinciple.SOLID;

public class ISP {
    public static void main(String[] args) {
        Shape2d rectangle = new Rectangle(5, 5);
        Shape3d cube = new Cube(4);
        rectangle.area();
        cube.area();
        cube.volume();
    }
}

abstract class Shape2d {
    abstract public void area();
}

abstract class Shape3d {
    abstract public void area();

    abstract public void volume();
}

class Rectangle extends Shape2d {
    private double length;
    private double breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public void area() {
        double area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }
}

class Cube extends Shape3d {
    private double edge;

    Cube(double edge) {
        this.edge = edge;
    }

    @Override
    public void area() {
        double area = 6 * edge * edge;
        System.out.println("Area of Cube: " + area);
    }

    @Override
    public void volume() {
        double volume = edge * edge * edge;
        System.out.println("Volume of Cube: " + volume);

    }
}
