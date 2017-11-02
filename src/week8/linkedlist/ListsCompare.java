package week8.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListsCompare {

    public static void main(String[] args) {

        List<Integer> al = new ArrayList<>();
        List<Integer> ll = new LinkedList<>();

        for (int i = 0; i < 10_000_000; i++) {
            al.add(i);
        }
        for (int i = 0; i < 10_000_000; i++) {
            ll.add(i);
        }


        long alStart = System.nanoTime();
        al.add(5_000_000, 4);
        long alEnd = System.nanoTime();

        long llStart = System.nanoTime();
        ll.add(5_000_000, 4);
        long llEnd = System.nanoTime();

        System.out.println("AL time - " + ((alEnd - alStart) ));
        System.out.println("LL time - " + ((llEnd - llStart) ));

    }

}
