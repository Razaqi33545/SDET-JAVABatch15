package replit;

import java.util.Scanner;

public class Replit032 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.println("Please enter your gender: M or F");
        char gender;
        gender=input.next().charAt(0);

        System.out.println("Please enter your age");
        int age;
        age=input.nextInt();

        String out;
        if(age>25){
            if(gender=='F'){
                out="Woman";
            }else {
                out="Man";
            }
        }else{
            if(gender=='F'){
                out="Girl";
            }else {
                out="Boy";
            }
        }
        System.out.println(out);
    }
}

