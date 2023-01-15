package class8;

public class NestedLoops6 {
    public static void main(String[] args) {

         /* 1 2 3 4 5
            1 2 3 4 5
            1 2 3 4 5
         */

        for (int i = 0; i <= 2; i++) { // If we print the outer loop the column values will be different but the row values will be the same.
            for (int k = 1; k <= 5; k++) { // If we print inner loop row values will be different and column values will be the same.
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}



