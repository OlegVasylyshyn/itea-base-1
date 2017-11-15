package week3.animals;

public class Dog extends Animal implements Behavior{

    private String newField = "new field";

    public Dog() {
        System.out.println("Dog constructor");
    }

    public void bark(){
        System.out.println("Bark");
    }

    public void feeding(){
        super.feeding();
        System.out.println("Dog feeding");
    }

    public void eat(){
        System.out.println("Dog eat");
    }

    @Override
    public void work() {

    }
}
