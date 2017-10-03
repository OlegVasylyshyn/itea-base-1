package week3.student;

public class SchoolManagerImp implements SchoolManager{

    private StudentGroup group = new StudentGroup();
    private MyScanner scanner = new IO();

    @Override
    public void showMenu() {
        // TODO: 9/27/17
        scanner.write("Menu");
        // 1) add student
        // 2) remove student
        // ..
    }

    @Override
    public void addStudent() {
        String firstName = scanner.readString("Enter first name");
        String secondName = scanner.readString("Enter second name");
        int age = scanner.readInt("Enter age");
        double averageMark = scanner.readDouble("Enter average mark");
        Student student = new Student(firstName, secondName, age, averageMark);
        group.add(student);
    }

    @Override
    public void removeStudent() {

    }

    @Override
    public void searchStudent() {
        //
    }

    @Override
    public void sortByName() {
        // Stufrnt[] students = group.sort();
        // group.toString();
    }

    @Override
    public void showAllStudents() {

//        Iterator<Student> iterator = group.iterator();
//        while (iterator.hasNext()){
//            scanner.write(iterator.next());
//        }


//        scanner.write(group.getString());

        for (Student student : group) {
            scanner.write(student);
        }

//        for (int i = 0; i < group.size(); i++) {
//            scanner.write(group.get(i));
//        }

    }
}
