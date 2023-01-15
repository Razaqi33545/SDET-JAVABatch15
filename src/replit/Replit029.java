package replit;

import java.util.Scanner;

public class Replit029 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the firstNumber ");
        int x = input.nextInt();

        Scanner input1 = new Scanner(System.in);
        System.out.print("Please enter the secondNumber ");
        int y = input.nextInt();

        if(x*y > 0)
        {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
