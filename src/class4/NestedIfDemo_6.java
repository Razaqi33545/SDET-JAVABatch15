package class4;

public class NestedIfDemo_6 {
    public static void main(String[] args) {
        int money = 1000; // if this is less than 700 and mood is ture the else block is executed.
        String day = "Sunday";
        boolean mood = true; // if this is false even if the money is more than 700 we will get no result and else will also be not executed.

        if(money>700){ // if this condition is true java will not go to else block even if the second condition is false.
            if(mood){ // if the above condition is true but this condition is false we will get no result.
                System.out.println("Let's go shopping");
            }
        } else{
            System.out.println("Let's save some money first");
        }
    }
}
