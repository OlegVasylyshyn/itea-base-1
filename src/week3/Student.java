package week3;

/**
 * POJO
 * JAVA BEANS
 */
public class Student {

    public static String SCHOOL_NAME = "SOME SCHOOL NAME";

    private String firstName;
    private String lastName;
    private int age;
    private double averageMark;


    public Student(String firstName, String lastName, int age, double averageMark){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.averageMark = averageMark;
    }

    public Student(){
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age) {
        if(age < 0) return;

        this.age = age;
    }

    public double getAverageMark(){
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

}
