package class4;

public class IfElseIfConditionDemo4 {
    public static void main(String[] args) {
        int number1=10;
        int number2=20;
        /*
        if number1 is equal to number2 on console => numbers are equal
        if number1 > number2 => number1 is greater than number2
        if number2 > number1 => number2 is greater than number1
         */

        if(number1 == number2)
        {
            System.out.println("numbers are equal");
        } else if (number1>number2)
        {
            System.out.println("Number1 is greater than number2");
        }
        else
        {
            System.out.println("number2 is greater than number1");
        }


    }
}
