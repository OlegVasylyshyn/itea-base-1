package week8.linkedlist;

public class OurLinkedList<T> {

    private Node<T> head;
    private Node<T> tail;

    private int size;


    public void add(T value){
        size++;
        if(head == null && tail == null){
            head = tail = new Node<>(null, null, value);
            return;
        }

        Node<T> newNode = new Node<>(null, tail, value);
        tail.next = newNode;
        tail = newNode;
    }

    public T get(int index) {
        if(index < 0 || index >= size) return null;

        int i = 0;
        for (Node<T> temp = head; ; temp = temp.next) {
            if(i++ == index)
            return temp.value;
        }
    }

    public boolean contains(T value) {
        return getNode(head, value) != null;
    }

    private Node<T> getNode(Node<T> head, T value) {
        if(head == null) return null;
        if(head.value.equals(value)) return head;
        return getNode(head.next, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");

        if(head == null) {
            sb.append("null");
        } else {

            Node<T> temp = head;
            while (true) {
                sb.append(temp.value);
                if((temp = temp.next) == null) break;
                sb.append(",");
            }

        }

        sb.append("]");

        return sb.toString();
    }

    private static class Node <T> {

        private Node<T> next;
        private Node<T> previous;
        private T value;

        private Node(Node<T> next, Node<T> previous, T value) {
            this.next = next;
            this.previous = previous;
            this.value = value;
        }

    }

}
