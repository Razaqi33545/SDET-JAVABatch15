package javaProject02;

public class CarTester {
    public static void main(String[] args) {

        Sedan sedan = new Sedan (58500, "Red", 17);
        System.out.println(sedan.calculateSalePrice());

        Truck truck = new Truck (89500,"Black", 2150);
        System.out.println(truck.calculateSalePrice());

    }
}
