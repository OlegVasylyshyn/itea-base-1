package week6.io.serialisation;

import week3.student.Student;

import java.util.Arrays;

public class SerialisationTest {

    public static void main(String[] args) {

        Student dex = new Student();
        dex.setAge(40);
        dex.setAverageMark(4.4);
        dex.setLastName("DEX");
        dex.setFirstName("DEX");

        Student james = new Student();
        james.setAge(55);
        james.setAverageMark(3.4);
        james.setLastName("James");
        james.setFirstName("James");

        Student[] students = {dex, james};
        StudentSerializator.studentPersist(students);

//        Student[] savedStudents = StudentSerializator.getStudents();
//        for (Student s: savedStudents) {
//            System.out.println("Student - " + s);
//        }

    }
    
}
