package week3.student;

public class Main {
    public static void main(String[] args) {
        
        School school = new School();
        school.getScanner().write("Hello this is School program");

        while (true) {

            school.getSchoolManager().showMenu();

            Menu menu = Menu.getMenu(school.getScanner().readInt("Choose your act"));
            switch (menu) {
                case ADD_STUDENT: {
                    school.getSchoolManager().addStudent();
                    break;
                }
                case REMOVE_STUDENT: {
                    school.getSchoolManager().removeStudent();
                    break;
                }
                case SEARCH_STUDENT: {
                    school.getSchoolManager().searchStudent();
                    break;
                }
                case SORT_STUDENTS_BY_NAME: {
                    school.getSchoolManager().sortByName();
                }
                case SHOW_STUDENTS: {
                    school.getSchoolManager().showAllStudents();
                    break;
                }
                case EXIT: {
                    school.getScanner().write("Bye");
                    return;
                }
            }

        }
    }
}
