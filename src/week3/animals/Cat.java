package week3.animals;

public class Cat extends Animal implements Behavior {

    public Cat() {
        System.out.println("Cat constructor");
    }

    public void meow(){
        System.out.println("Meow");
    }

    public void feeding(){
        System.out.println("Cat feeding");
    }

    public String toString(){
        return String.format("Cat. name : %s, type %s, color : %s", name, type, color);
    }

    public void eat(){
        System.out.println("Cat eat");
    }

    @Override
    public void work() {

    }
}
