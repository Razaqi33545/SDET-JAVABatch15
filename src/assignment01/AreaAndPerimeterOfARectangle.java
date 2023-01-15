package assignment01;

public class AreaAndPerimeterOfARectangle {
    public static void main(String[] args) {
        double width = 5.0;
        double heigth = 8.0;

        double area;
        area = width * heigth;

        double perimeter;
        perimeter = 2*(width+heigth);
        System.out.println("The perimeter of a rectangle with width " + width + " and heigth " + heigth + " is equal to " + perimeter + " and the area is " + area);

    }
}
