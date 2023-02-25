package ProjectJavaBasics;

public class Task6 {
    public static void main(String[] args) {

        /*
        Write a program to swap 2 numbers without a temporary variable?
         */

      int a = 10, b = 20;

      a = a+b;
      b = a -b;
      a = a-b;

        System.out.println("After swap a = " +a+ " and b = " +b);

    }
}
