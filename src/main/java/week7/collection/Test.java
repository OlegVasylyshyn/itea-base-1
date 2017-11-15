package week7.collection;

import week3.student.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        list.addAll(list2);

        list.add("Hello");
        list.add("World");
        list.add(0, "First");

        System.out.println(list);
        list.set(0, "AnotherFirst");
        System.out.println(list);

        System.out.println(list.size());

        System.out.println(list.get(0));
        System.out.println(list.get(list.size() - 1));

        list.remove(0);
        System.out.println(list);
        list.remove("World");
        System.out.println(list);

        List<String> anotherList = new LinkedList<>();
        anotherList.add("Hello");

        System.out.println(list.equals(anotherList));

        String[] strings = (String[]) method();
        System.out.println(Arrays.toString(strings));


        // Covariance коваріантність
        Object[] objects = new String[]{"Hello"};

        // Invariance інваріантність
        List<Object> inverance = new ArrayList<Object>();

        ArrayList angels = new ArrayList();
        angels.add(new Demon());
        heaven(angels);


        ArrayList<Student> studentGroup = new ArrayList<>();

    }

    private static Object[] method(){
        return new String[]{"Hello"};
    }

    private static void heaven(List<Angel> list) {
        System.out.println("Why demons in heaven - " + list);
    }


}

class Angel {
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Angel{");
        sb.append('}');
        return sb.toString();
    }
}

class Demon {
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Demon{");
        sb.append('}');
        return sb.toString();
    }
}
