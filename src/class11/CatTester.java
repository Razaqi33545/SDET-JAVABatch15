package class11;

public class CatTester {
    public static void main(String[] args) {

        // Creating an object from the cat class.
        Cat cat1 = new Cat();
        cat1.name = "Lego";
        cat1.breed = "Van Cat";
        cat1.age = 2;
        cat1.color = "Black";
        cat1.attitude = false;
        cat1.eat();
        System.out.println(cat1.color);



        Cat cat2 = new Cat();
        cat2.name = "loki";
        cat2.breed = "Domestic";
        cat2.color = "White";
        cat2.speak();
        System.out.println(cat2.breed);
    }
}
