package ProjectJavaBasics;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        /*
        Using Scanner create an array of integer values. After the array is created, calculate the sum of all stored elements in that array.
         */

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter 5 integer numbers");
        int number1= input.nextInt();
        int number2= input.nextInt();
        int number3= input.nextInt();
        int number4= input.nextInt();
        int number5= input.nextInt();

        int [] arr = {number1, number2, number3, number4, number5};

        int sum=0;

        for (int i=0; i < arr.length; i++) {
            sum=sum+arr[i];

        }
        System.out.println(sum);

    }
}
