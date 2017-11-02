package week8.hashmap;

public class OurHashMap<K, V> {

    private static final int INITIAL_CAPACITY = 16;
    private static final float LOAD_FACTOR = 0.75f;

    private int size;

    private Node<K, V>[] table;


    @SuppressWarnings("unchecked")
    public OurHashMap(){
        table = (Node<K, V>[]) new Node[INITIAL_CAPACITY];
    }

    public V put(K key, V value){

        if(table.length * LOAD_FACTOR < size) {
            // TODO: 11/2/17 rehashing
        }

        int i = key.hashCode() & table.length;
        V toReturn = null;


        if(table[i] == null) {

            table[i] = new Node<>(key, value, null);
            toReturn = value;
            size++;

        } else {

            Node<K, V> current = table[i];
            Node<K, V> previous = table[i];
            do {

                if(current.key.equals(key)) {
                    toReturn = previous.value;
                    previous.next = new Node<>(key, value, null);
                    break;
                }

                if(current.next == null) {
                    current.next = new Node<>(key, value, null);
                    toReturn = value;
                    size++;
                    break;
                }

                previous = current;
                current = current.next;

            } while (true);

        }

        return toReturn;
    }

    public int size(){
        return size;
    }

    private static class Node<K, V> {

        private K key;
        private V value;
        private Node<K, V> next;

        public Node(K key, V value, Node<K, V> next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }

}
