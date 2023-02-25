package class12;

public class StringDemo4 {
    public static void main(String[] args) {
        String str = "     ";
        boolean isEmpty = str.isEmpty();
        System.out.println(isEmpty); // This return false because there are spaces in the string .
        System.out.println(str.isBlank()); // This return true because is blank there is no letter.
    }
}
