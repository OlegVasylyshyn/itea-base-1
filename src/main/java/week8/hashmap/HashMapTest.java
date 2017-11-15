package week8.hashmap;

import java.util.*;
import java.util.function.BiConsumer;

public class HashMapTest {

    public static void main(String[] args) {


        Map<String, Integer> map = new HashMap<>();
        map.put("Key", 50);
        map.put("Dex", 100);

        System.out.println("Was persist");

        int value = map.get("Key");
        System.out.println("Was retrieved value : " + value);

        ///////////////////////////////

        Point point = new Point(1, 2);
        Map<Point, String> points = new HashMap<>();

        long startPut = System.nanoTime();
        for (int i = 0; i < 1_000; i++) {
            points.put(new Point(1, i), "PIXEL" + i);
        }
        long endPut = System.nanoTime();

        System.out.println("Points size - " + points.size());

        long startGet = System.nanoTime();
        String pixel = points.get(new Point(1, 1_000 - 1));
        long endGet = System.nanoTime();


        System.out.println("Our pixel : " + pixel);
        System.out.println("Time put - " + (endPut - startPut));
        System.out.println("Time get - " + (endGet - startGet));

        ////////////////////////////////

        points.clear();


        Point parent = new Point(3, 3);
        points.put(new Point(2, 2), "ONE");
        points.put(parent, "SECOND");

        ColorPoint childFirst = new ColorPoint(3, 3, Color.BLUE);
        ColorPoint childSecond = new ColorPoint(3, 3, Color.GREEN);

        System.out.println("Size - " + points.size());
        System.out.println("Value - " + points.get(childFirst));


        System.out.println("Parent and first child are - " + parent.equals(childFirst));
        System.out.println("Parent and second child are - " + parent.equals(childSecond));

        System.out.println("First child and second child are - " + childFirst.equals(childSecond));


        ////////////////////////////////////////

        Map<Integer, Integer> nums = new Hashtable<>();
        nums.put(1, 1);
        nums.put(2, 2);
        nums.put(3, 3);
        nums.put(4, 4);
        nums.put(5, 5);
        nums.put(6, 6);
        nums.put(7, 7);

        System.out.println();

        Set<Integer> integers = nums.keySet();
        for(Integer i : integers) {
            System.out.println(i);
        }

        System.out.println();

        Set<Map.Entry<Integer, Integer>> entries = nums.entrySet();
        for(Map.Entry<Integer, Integer> i : entries) {
            System.out.println("Key - " + i.getKey());
            System.out.println("Value - " + i.getValue());
        }

        System.out.println();

        nums.forEach((k, v) -> {
            System.out.println("Key - " + k);
            System.out.println("Value - " + v);
        });

        System.out.println();

        nums.forEach(new BiConsumer<Integer, Integer>() {
            @Override
            public void accept(Integer k, Integer v) {
                System.out.println("Key - " + k);
                System.out.println("Value - " + v);
            }
        });

        System.out.println();

        int result = nums.getOrDefault(10, -1);
        System.out.println("Was found" + result);

        System.out.println();

        System.out.println("Was found key - " + nums.containsKey(5));

        if(nums.containsKey(10)) {
            // it won't work
            nums.get(5);
        }

        System.out.println();

        System.out.println("Was found key - " + nums.containsValue(5));

        System.out.println();

    }

}

class Point {

    int x;
    int y;

    public Point(){
        this(0);
    }

    public Point(int x) {
        this(x, 0);
    }

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

    private final Color color;

    public ColorPoint(int x, int y, Color color) {
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

enum Color {

    RED,
    BLUE,
    GREEN

}

class ColorPointCorrect {

    private Point point;
    private Color color;

    public ColorPointCorrect(int x, int y, Color color) {
        this.point = new Point(x, y);
        this.color = color;
    }

}