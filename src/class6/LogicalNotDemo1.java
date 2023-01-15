package class6;

public class LogicalNotDemo1 {
    public static void main(String[] args) {

        System.out.println(false);
        System.out.println(!false);

        boolean condition = !true;
        System.out.println(condition);

        System.out.println("=======================");

        String password = "Password123";
        System.out.println(password.equals("Password"));
        if (!password.equals("Password")) {
            System.out.println("Wrong Password");
        }


        boolean isRaining = true;
            if (!isRaining) {
                System.out.println("lets go for a walk");
            } else {
                System.out.println("let take the umbrella");
            }





    }
}