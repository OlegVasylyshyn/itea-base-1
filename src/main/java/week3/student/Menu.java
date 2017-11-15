package week3.student;

public enum Menu {

    ADD_STUDENT,
    REMOVE_STUDENT,
    SEARCH_STUDENT,
    SORT_STUDENTS_BY_NAME,
    SHOW_STUDENTS,
    EXIT;


    public static Menu getMenu(int number){
        Menu[] values = Menu.values();
        for (int i = 0; i < values.length; i++) {
            if(values[i].ordinal() == number - 1){
                return values[i];
            }
        }
        return EXIT;
    }

}
