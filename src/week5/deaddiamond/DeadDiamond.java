package week5.deaddiamond;

public class DeadDiamond {

    public static void main(String[] args) {

        new ChildC();
        System.out.println("OK");

    }

}

interface Parent {

}

interface ChildA extends Parent {
    default void methodA() {

    }
}

interface ChildB extends Parent {
    default void methodB() {

    }
}

class ChildC implements ChildB, ChildA {

}




//class A extends C {
//
//}
//
//class B extends A {
//
//}
//
//class C extends B {
//
//}