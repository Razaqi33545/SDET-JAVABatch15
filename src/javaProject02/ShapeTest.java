package javaProject02;

public class ShapeTest {
    public static void main(String[] args) {

        Circle circle = new Circle(16);
        circle.calculateArea();
        circle.calculatePerimiter();

        Square square = new Square (12);
        square.calculateArea();
        square.calculatePerimiter();

    }
}
