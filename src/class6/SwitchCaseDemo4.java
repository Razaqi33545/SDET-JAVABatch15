package class6;

import java.util.Locale;

public class SwitchCaseDemo4 {
    public static void main(String[] args) {

       String country = "USA";

       switch (country.toLowerCase()){

           case "usa":
               System.out.println("burgers");
               break;

           case "Italy":
               System.out.println("Pasta");
               break;

           case "Afghanistan":
               System.out.println("Kebab");
               break;

           default:
               System.out.println("Wrong Country");
       }









    }
}
