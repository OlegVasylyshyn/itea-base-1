package week3.animals;

public class Dog extends Animal implements Behavior{


    public void bark(){
        System.out.println("Bark");
    }

    public void feeding(){
        System.out.println("Dog feeding");
    }

    public void eat(){
        System.out.println("Dog eat");
    }
}
