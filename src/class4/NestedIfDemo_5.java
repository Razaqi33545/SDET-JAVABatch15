package class4;

public class NestedIfDemo_5 {
    public static void main(String[] args) {
        int money = 100; // If we change the value to something above 700 it will print the value in second if condition block.
        String day = "Sunday";
        boolean mood = true;

        if(money>700){ // THis should be true to excute and give result on console. That code which comes inside that block will not be executed.
            if(mood){
                System.out.println("Let's go shopping");
            }
        }
    }
}
