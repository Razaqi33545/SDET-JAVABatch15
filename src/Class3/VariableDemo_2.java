package Class3;

public class VariableDemo_2 {
    public static void main(String[] args) {

        /*
        to rename something right-click refactor->rename
         */
        int age=10;
        System.out.println(age);
        age=20;
        System.out.println(age);
        int number=10;
        age=number; //I am saying to java replace the value of age with the value of number variable
        System.out.println(age);
        age=number+10;
        System.out.println(age);
        age=age+20;  // gr
        System.out.println(age);

    }
}
