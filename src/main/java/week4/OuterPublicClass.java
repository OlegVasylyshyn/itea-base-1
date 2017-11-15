package week4;

public class OuterPublicClass {

    public static void main(String[] args) {
        Outer outer = new Outer();
        OuterPublicClass nestedClasses = new OuterPublicClass();
    }

}

class Outer {

}
