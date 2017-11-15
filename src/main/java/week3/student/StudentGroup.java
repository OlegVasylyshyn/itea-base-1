package week3.student;

import java.util.Iterator;

public class StudentGroup implements Iterable<Student> {

    private  Student[] students = new Student[10];
    private  int size = 0;

    public void add(Student value) {
        if(students.length <= size){
            copyArray();
        }
        students[size++] = value;
    }

    private void copyArray() {
        Student[] newArray = new Student[students.length * 2];
        System.arraycopy(students, 0, newArray, 0, students.length);
        students = newArray;
    }

    public  Student get(int index) {
        return students[index];
    }

    public  Student[] sort() {
        // TODO: 9/19/17
        // copy students to the new array
        // sort new array
        // return new array
        return null;
    }

    public  Student[] search(String firstName) {
        // TODO: 9/19/17
        return null;
    }

    public  void add(int index, Student value) {
        // TODO: 9/19/17
    }

    public  Student replace(int index, Student value) {
        // TODO: 9/21/17
        return null;
    }

    public  Student remove(int index) {
        // TODO: 9/19/17
        return null;
    }

    public  int removeValue(String firstName, String lastName) {
        // TODO: 9/19/17
        return -1;
    }

    public  void invert() {
        // TODO: 9/19/17
    }

    public  Student[] subArray(int from, int to) {
        // TODO: 9/19/17
        return null;
    }

    public  String getString(){
        StringBuilder sb = new StringBuilder();
        for (Student student : students){
            if(student != null) {
                sb.append(student).append("\n");
            }
        }
        return sb.toString();
    }

    public Student[] getStudents(){
        return students.clone();
    }

    public int size(){
        return size;
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentIterator();
    }

    // INNER CLASS
    private class StudentIterator implements Iterator<Student> {

        private int current = 0;

        @Override
        public boolean hasNext() {
            return current < size;
        }

        @Override
        public Student next() {
            return students[current++];
        }

    }

}
