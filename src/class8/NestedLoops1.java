package class8;

public class NestedLoops1 {
    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) { // Outer for Loop
            for (int j = 0; j <3; j++) { // Inner for Loop
                System.out.println("i = " + i + " j = " + j);
            }
            System.out.println("****************");
        }
    }
}