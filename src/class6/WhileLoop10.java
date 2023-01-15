package class6;

public class WhileLoop10 {
    public static void main(String[] args) {


        boolean condition=true;
        int number=1;
        while (condition){
            System.out.println(number);
            if(number>3){
                condition=false;
            }
            number++;
        }


    }
}
