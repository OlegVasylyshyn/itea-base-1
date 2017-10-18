package week6.io.serialisation;

import week3.student.Student;

import java.io.*;

public class StudentSerializator {


    // Serialisation
    public static void studentPersist(Student[] students) {

        try (
                FileOutputStream fos = new FileOutputStream("students.data");
                ObjectOutputStream oos = new ObjectOutputStream(fos)
            ) {

            oos.writeObject(students);
            System.out.println("Student was successfully saved");


        } catch(IOException e) {
            System.out.println("Some exception : " + e.getMessage());
        }

    }

    // Deserialisation
    public static Student[] getStudents(){

        try (
                FileInputStream fis = new FileInputStream("students.data");
                ObjectInputStream ois = new ObjectInputStream(fis)
             ) {

            Student[] students = (Student[]) ois.readObject();

            return students;

        } catch (Exception e) {
            System.out.println("Some exception : " + e.getMessage());
        }

        return null;
    }
}
