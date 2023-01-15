package class7;

import java.util.Scanner;

public class WhileDemo {
    public static void main(String[] args) {

/*
 When you know exactly how many times you want to loop through a block of code, use the for loop instead of while loop and when
 we don't know how many times we need to repeat a block of code we should be going with while loop most of the time it happens when the
 user input is involved.
 */
        boolean condition=true;
        Scanner scanner=new Scanner(System.in);
        int number=15;
        while (condition){
            System.out.println("Please Enter a Number between 10 to 20");
            int userInput=scanner.nextInt();
            if(userInput>number){
                System.out.println("Your entered number is greater");
            }else if(userInput<number){

                System.out.println(" You entered a smaller number");
            }else {
                System.out.println("You won!!!!");
                condition=false;
            }
        }





    }
}
