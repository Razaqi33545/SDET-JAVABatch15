package javaProject02;

public class MarksTester {
    public static void main(String[] args) {

        StudentA studentA=new StudentA(90, 91, 95);
        System.out.println(studentA.getPercentage());

        StudentB studentB=new StudentB(86, 83, 93, 99);
        System.out.println(studentB.getPercentage());

    }
}
