package ProjectJavaBasics;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the names of the countries");
        String country1=scanner.nextLine();
        String country2=scanner.nextLine();
        String country3=scanner.nextLine();

        String [] country={"Afghanistan", "Pakistan", "India"};
        String [] capital = { "Kabul", "IslamAbad", "New Delhi"};

        for (int i=0; i<country.length; i++) {
            if (country1.equals(country[i])) {
                System.out.println("The capital of "+country[i]+" is "+capital[i]);
            }
            if (country2.equals(country[i])) {
                System.out.println("The capital of "+country[i]+" is "+capital[i]);
            }
            if (country3.equals(country[i])) {
                System.out.println("The capital of "+country[i]+" is "+capital[i]);
            }

        }

    }
}
