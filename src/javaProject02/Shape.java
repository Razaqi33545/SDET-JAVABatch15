package javaProject02;

public abstract class Shape {
    abstract void calculateArea();

    abstract void calculatePerimiter();

}

class Circle extends Shape {

    double radius;

    Circle (double radius) {
        this.radius=radius;
    }

    @Override
    public void calculateArea() {
        System.out.println(3.143*radius*radius);
    }

    @Override
    public void calculatePerimiter() {

        System.out.println(2*3.143*radius);

    }
}

class Square extends Shape {

    int side;

    Square (int side) {
        this.side=side;
    }

    @Override
    public void calculateArea() {
        System.out.println(side*side);
    }

    @Override
    public void calculatePerimiter() {

        System.out.println(4*side);

    }
}
