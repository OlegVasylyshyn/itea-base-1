package week3.animals;

public class Raccoon extends Animal implements Behavior{

    public void feeding() {
        System.out.println("Raccoon feeding");
    }

    public void eat(){
        System.out.println("Raccoon eat");
    }

    @Override
    public void work() {

    }
}
