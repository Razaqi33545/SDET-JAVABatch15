package class5;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /*
        Scanner ==> Name of the Class
        scan is just a variable like we create primitive variable
        system.in tells the computer we want to read the data from keyboard
         */
      /*
      System.out.println("Please Enter your age");
        int age= scan.nextInt();
        System.out.println("You are " +age+ " years old");

        System.out.println("Please enter your weight");
        double weight = scan.nextDouble();
        System.out.println("your weight is " +weight+ " KGs");

        System.out.println("Are you hungry");
        boolean hungry = scan.nextBoolean();
        System.out.println("Hungry "+hungry);

        System.out.println("Please enter your gender");
        char gender = scan.next().charAt(0);
        System.out.println("Your gender is " + gender);

       */

        System.out.println("Please enter your name");
        String name = scan.next(); // when we have to take only one word as input if it has space in between Tawheedullah Razaqi.
        System.out.println("Your name is " + name);

       scan.nextLine(); // With this method we can ignore the following comment and can print full name with other methods used above or below our code.

        System.out.println("Please enter your full name ");
        String fullName = scan.nextLine(); // When there is no other method before this one it gives full name otherwise does not give result.
        System.out.println("Your full name is " +fullName);

        scan.close(); // It is a good practice to close your methods at the end.



    }
}