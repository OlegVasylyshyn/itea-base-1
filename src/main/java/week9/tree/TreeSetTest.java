package week9.tree;

import java.util.*;

public class TreeSetTest {

    public static void main(String[] args) {

        Set<User> tree = new TreeSet<>(Comparator.comparing(o -> o.name));
        tree.add(new User("Dex", 30)); // O(log2n)
        tree.add(new User("James", 34));
        tree.add(new User("Jason", 34));
        tree.add(new User("Alex", 34));
        tree.add(new User("Dan", 34));
        tree.add(new User("Bob", 34));
        tree.add(new User("Greg", 34));
        tree.add(new User("Greg", 34));

        tree.forEach(System.out::println);
        System.out.println();

        Map<String, User> treeMap = new TreeMap<>();
        treeMap.put("Dex", new User("Dex", 35));
        System.out.println(treeMap.get("Dex"));

        System.out.println(tree.isEmpty());
        System.out.println(tree.contains(new User("James", 34)));
        System.out.println(tree.remove(new User("James", 34)));

        tree.forEach(System.out::print);
        tree.forEach(TreeSetTest::forEach);
        System.out.println();
        System.out.println();

    }

    private static void forEach(User user) {
        System.out.println("User name - " + user.name);
    }

}

class User implements Comparable<User> {

    public String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }

    public int compareTo(User o) {
        return name.compareTo(o.name);
    }
}