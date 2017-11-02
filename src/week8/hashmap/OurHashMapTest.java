package week8.hashmap;

public class OurHashMapTest {

    public static void main(String[] args) {

        OurHashMap<Integer, Integer> map = new OurHashMap<>();
        map.put(1, 1);
        map.put(2, 1);
        map.put(3, 1);
        map.put(4, 1);
        map.put(5, 1);
        map.put(6, 1);
        map.put(1, 6);


        System.out.println("Size - " + map.size());


    }

}
