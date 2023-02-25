package class12;

public class StringDemo7 {
    public static void main(String[] args) {

        String str = "I love java";

        boolean startsWith = str.startsWith("i");
        System.out.println(startsWith);


        boolean endsWith = str.endsWith("a");
        System.out.println(endsWith);


        System.out.println(str.toLowerCase().startsWith("i")); // True because I have first converted it to lowercase and then used starts-with.

        System.out.println(str.contains("love"));
    }
}
