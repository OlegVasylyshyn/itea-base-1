package week7.generic;

import week3.student.Student;

import java.util.*;

public class TestGenerics {
    public static void main(String[] args) {

        String some = getSome("Hello");
        System.out.println(some);

        Integer num = getSome(10);
        System.out.println(num);

        Student hello = getSome(new Student());
        System.out.println(hello);

        Student student = parseJson("{ 'name' : 'DEX' }", Student.class);

        // Covariance
        List<?> list = new ArrayList<String>();


        List<? extends Person> person = getPerson("person");
        System.out.println("Persons - " + person);


        List<? extends Person> employees = getPerson("sdfsdfsd");
        System.out.println("Employees - " + employees);

        // <? implements Comparable>
        checkGreatestNumber(new Student(), new Student());

        Map<Object, String> map = new HashMap<>();
        TreeMap<String, String> tree = new TreeMap<>();

    }

    // right
    private static <T> T getSome(T some){
        return some;
    }

    // wrong
    private static Object getSomeObj(Object some){
        return some;
    }

    private static <T> T parseJson(String json, Class<T> clazz){
        // transform string json to the Object
        try {
            return clazz.newInstance();
        } catch (Throwable e) {
            e.printStackTrace();
        }
        return null;
    }

    // wildcard <?>
    private static List<? extends Person> getPerson(String... objects) {

        if(objects[0].equals("person")){
            ArrayList<Person> persons = new ArrayList<>();
            persons.add(new Person("PERSON"));
            return persons;
        }

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("EMPLOYEE"));
        return employees;
    }

    private static<T> void checkGreatestNumber(Comparable<T> a, T b){
        if(a.compareTo(b) > 0){
            System.out.println("First grater");
        } else if(a.compareTo(b) < 0) {
            System.out.println("Second grater");
        } else {
            System.out.println("They are equal");
        }
    }

}

class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

class Employee extends Person{

    public Employee(String name) {
        super(name);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employee{");
        sb.append("name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

class Cat {

}
