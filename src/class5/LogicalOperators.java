package class5;

public class LogicalOperators {
    public static void main(String[] args) {

        System.out.println(!true);
        System.out.println(!false);
        boolean rich = true;
        System.out.println(!rich);

        int number = 9;
        if(number!=1){
            System.out.println("Hello Java");
        }else{
            System.out.println("Hello World");
        }

        String country = "Gandistan";
        if(!country.equals("BadCountry"))
        {
            System.out.println("You are welcome");
        }

        String name = "Adam";
        int age = 31;
        if(name.equals("Adam") && age == 30){
            System.out.println("You are addam from class 15");
        }else {
            System.out.println("I do not know you");
        }

        boolean isTure = false;
        if(!isTure){
            System.out.println("You got it");
        }else {
            System.out.println("Need more Practice");
        }





    }
}
