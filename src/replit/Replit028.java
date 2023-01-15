package replit;

import java.util.Scanner;

public class Replit028 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the length ");
        int length = input.nextInt();

        Scanner input1 = new Scanner(System.in);
        System.out.print("Please enter the width ");
        int width = input.nextInt();

        if(width!=length)
        {
            System.out.println("The shape of your object is rectangle");
        }
        else if(width==length) {
            System.out.println("The shape of your object is square");
        }
    }
}
