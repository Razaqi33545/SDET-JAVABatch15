package class8;

public class NestedLoops {
    public static void main(String[] args) {
      /*
public static void main(String[] args) {

        for (int j = 0; j < 5; j++) {  // inner for loop
            System.out.println(j);
        }
        System.out.println("**************");

        for (int j = 0; j < 5; j++) {  // inner for loop
            System.out.println(j);
        }
        System.out.println("**************");

        for (int j = 0; j < 5; j++) {  // inner for loop
            System.out.println(j);
        }
        System.out.println("**************");

        for (int j = 0; j < 5; j++) {  // inner for loop
            System.out.println(j);
        }
        System.out.println("**************");
        for (int j = 0; j < 5; j++) {  // inner for loop
            System.out.println(j);
        }
        System.out.println("**************");

       */

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <3; j++) {
                System.out.println(j);
            }
            System.out.println("****************");
        }
    }
}