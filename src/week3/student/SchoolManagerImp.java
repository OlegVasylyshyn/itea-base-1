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
        // TODO: 9/27/17
        // 1) ask user enter all parameters from console
        // 2) init new student
        // 3) put student in group
        // 4) show message "student was successfully added"
    }

    @Override
    public void removeStudent() {
        //
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
        //
    }
}
