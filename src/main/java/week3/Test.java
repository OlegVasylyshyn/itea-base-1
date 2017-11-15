package week3;

import week3.student.StudentGroup;
import week3.student.Student;
import week4.OuterPublicClass;


public class Test {

    public static void main(String[] args) {

        Student dexter = new Student("Dexter", "Morgan", 30, 5.5);

        Student james = new Student();
        james.setFirstName("James");
        james.setLastName("Miller");
        james.setAge(35);
        james.setAverageMark(3.3);

        System.out.println();

        StudentGroup studentGroup = new StudentGroup();
        studentGroup.add(dexter);
        studentGroup.add(james);

        System.out.println(studentGroup.getString());

    }

}
