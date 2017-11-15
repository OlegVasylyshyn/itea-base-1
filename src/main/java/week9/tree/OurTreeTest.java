package week9.tree;

public class OurTreeTest {

    public static void main(String[] args) {

        OurTree<Integer, Integer> tree = new OurTree<>();
        for (int i = 0; i < 10_000; i++) {
            tree.put(i, i);
        }

        System.out.println(tree);


    }

}
