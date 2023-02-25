package ProjectJavaBasics;

public class Task11 {
    public static void main(String[] args) {

        /*
        Write a program to print out duplicate elements from an Array of Strings?
         */

        String [] Languages = {"C++", "Java", "C#", "Python", "Java", "Ruby"};

        for (int i = 0; i < Languages.length ; i++) {
            for (int j = i+1; j <Languages.length ; j++) {
                if (Languages[i]==Languages[j]){
                    System.out.println("The Duplicate element is: " + Languages[i]);
                }
            }

        }
    }
}
