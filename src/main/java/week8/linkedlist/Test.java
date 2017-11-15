package week8.linkedlist;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        List<String> list = new LinkedList<>();
        list.add("Hello");
        list.add("some");
        list.add("some");

        for(String temp : list) {
            System.out.println();
        }

        LinkedList<String> ll = (LinkedList) list;
        ll.addLast("world");

        System.out.println("Our LinkedList " + ll);


        Deque<String> deque = new LinkedList<>();
        deque.add("1");
        deque.add("2");


        String first = deque.getFirst();
        String second = deque.getFirst();


    }

}
