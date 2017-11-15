package week5.animals;

@FunctionalInterface
public interface DogBehavior {

    int i = 0;

    void bark();

    default void somethingElse(){

    }

}
