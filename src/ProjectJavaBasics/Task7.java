package ProjectJavaBasics;

public class Task7 {
    public static void main(String[] args) {

        /*
        Write a java program to check whether a given number is prime or not?
         */
    int number =8;
    int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0){
               count++;
            }
        }
        if (count==2){
            System.out.println("Prime");
        }else{
            System.out.println("Not Prime");
        }
    }

}
