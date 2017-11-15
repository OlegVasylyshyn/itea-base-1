package week8.linkedlist;

public class TestOurLinkedList {

    public static void main(String[] args) {

        OurLinkedList<Integer> list = new OurLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println(list);


        System.out.println(list.get(6));

        System.out.println(list.contains(6));

    }

}
