package class4;

public class NestedIfDemo7 {
    public static void main(String[] args) {

        boolean StudyHard = true;
        int salary = 120000;

        if(StudyHard){
            System.out.println("We get the jobs");

            if(salary>100000){
                System.out.println("Let's buy Tesla");
            }
            else{
                System.out.println("Let's buy Toyota"); // if salary is less than 100000 this code will be executed
            }

        } else{
            System.out.println("It might take a little longer for us to get the jobs");
        }
    }
}
