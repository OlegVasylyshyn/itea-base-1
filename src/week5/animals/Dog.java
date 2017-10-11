package week5.animals;

public class Dog implements DogBehavior{

    @Override
    public void bark() {
        System.out.println("Dog say \"Bark\"");
    }

}
