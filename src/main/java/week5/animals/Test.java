package week5.animals;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        Dog spark = new Dog();
        spark.bark();


        DogBehavior bobik = () -> {
            System.out.println("bark");
        };

        DogBehavior sharick = new DogBehavior() {
            @Override
            public void bark() {
                System.out.println("bark");
            }

            @Override
            public void somethingElse() {

            }
        };

        CatBehavior cat = System.out::println;

        CatBehavior vasiliy = new CatBehavior() {
            @Override
            public void meaw(String word) {
                System.out.println(word);
            }
        };

        cat.meaw("Meow");
        vasiliy.meaw("Vasiliy sad meow");



//        String[] strings = new String[1];
//        Object[] objects = new String[1];
//
//
//        objects[0] = 10;
//        String str = strings[0];


        HashMap<Point, String> map = new HashMap<>();
        map.put(new Point(1, 1), "PUT");
        String fromMap = map.get(new ColorPoint(1, 1, "RED"));
        System.out.println("From map " + fromMap);
    }

}

class Point {

    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !(o instanceof Point)) return false;

        Point point = (Point) o;

        if (x != point.x) return false;
        return y == point.y;
    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }
}

class ColorPoint extends Point {

    String color;

    public ColorPoint(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
