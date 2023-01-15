package class8;

public class ContinueKeyworkDemo1 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {

            if (i % 3 == 0|| i == 8 || i == 4) {
                continue;
            }
            System.out.println(i); // this line is skipped when i =3,6,9

        }
    }
}

