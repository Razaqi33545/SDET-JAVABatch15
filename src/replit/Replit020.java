package replit;

import java.util.Scanner;

public class Replit020 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter first name ");
        String firstName = input.nextLine();


        Scanner input1 = new Scanner(System.in);
        System.out.println("Please enter last name");
        String lastName = input.nextLine();

        System.out.println(firstName+ " " +lastName);
    }
}
