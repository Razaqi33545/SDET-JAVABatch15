package class4;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter firstName");
        String firstName = input.nextLine();
        System.out.println("My name is " + firstName);

        Scanner input1 = new Scanner(System.in);
        System.out.println("Please enter firstName");
        String lastName = input.nextLine();
        System.out.println("My last name is " + lastName);




    }
}
