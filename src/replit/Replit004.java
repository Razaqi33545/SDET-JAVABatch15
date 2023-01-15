package replit;

public class Replit004 {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        int x = 2;
        for(int a = 1; a<=x; a++)
        {
            for(int b = x; b>=a; b--)
            {
                System.out.print("# ");
            }
            System.out.println();
        }

    }
}