package week3.animals;

public class AnimalTest {


    public static void main(String[] args) {

        // Inheritance

        Cat cat = new Cat();
        Cat secondCat = new Cat();
        cat.name = "Murzik";
        cat.color = "black";
        cat.type = "homeless";

        Dog dog = new Dog();
        dog.name = "Sharik";
        dog.type = "homeless";
        dog.color = "grey";

        cat.meow();
        dog.bark();

        // abstraction

        doFeedingByScheduler(cat);
        doFeedingByScheduler(dog);
        doFeedingByScheduler(new Raccoon());

        eating(cat);
        eating(dog);
        eating(new Raccoon());

        System.out.println(cat);
    }

    // polymorphism
    private static void doFeedingByScheduler(Animal animal){
        animal.feeding();
    }

    private static void eating(Behavior animal){
        animal.eat();
    }

}
