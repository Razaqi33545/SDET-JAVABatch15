package replit;

import java.util.Scanner;

public class Replit022 {
    public static void main(String[] args) {

            Scanner user = new Scanner(System.in);

            System.out.println("Enter your name");
            String name = user.nextLine();

            System.out.println("Enter your mobile number");
            String number = user.nextLine();

            System.out.println("Enter your age");
        int age = user.nextInt();


            System.out.println("Your name is " + name + ", your age is " + age + " and your mobile number is " + number);
        }
    }


