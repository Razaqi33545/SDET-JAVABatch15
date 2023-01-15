package class6;

import java.util.Scanner;

public class LogicalOrDemo3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter the Day");
        String day = scan.next();

        if(day.equalsIgnoreCase("Monday") || day.equalsIgnoreCase("Friday")){
            System.out.println("No Class Today");
        } else if (day.equalsIgnoreCase("Saturday") || day.equalsIgnoreCase("Sunday")) {

            System.out.println("We have Java Class");
        }else if (day.equalsIgnoreCase("Tuesday") || day.equalsIgnoreCase("Wednesday")){
            System.out.println("Manual Testing Class");
        } else if (day.equalsIgnoreCase("Thursday")) {
            System.out.println("Review Class");
        }else System.out.println("Invalid Day Entered");

    }
}
