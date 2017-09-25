package week3;

import week2.StudentGroup;
import week3.animals.Animal;


public class Test {

    public static void main(String[] args) {


        Student dexter = new Student("Dexter", "Morgan", 30, 5.5);

        Student james = new Student();
        james.setFirstName("James");
        james.setLastName("Miller");
        james.setAge(35);
        james.setAverageMark(3.3);

        StudentGroup studentGroup = new StudentGroup();
        studentGroup.add(dexter);
        studentGroup.add(james);

        System.out.println(studentGroup.getString());

    }

}
