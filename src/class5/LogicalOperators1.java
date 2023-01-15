package class5;

public class LogicalOperators1 {
    public static void main(String[] args) {

        boolean boughtCho = !true;
        boolean boughtFlowers = true;
        if(boughtCho || boughtFlowers)
        {
            System.out.println("I am Happy");
        }else{
            System.out.println("I am Sad");
        }

        boolean wifi = false;
        boolean fiveG = false;
        if(wifi || fiveG)
        {
            System.out.println("You are good for browsing the internet");
        }else {
            System.out.println("Either connect to wifi or 5G");
        }


    }
}
