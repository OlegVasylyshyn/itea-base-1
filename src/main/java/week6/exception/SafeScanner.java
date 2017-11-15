package week6.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SafeScanner {

    private static Scanner scanner = new Scanner(System.in);


    public static int getInt(String message) {
        int result = -1;
        boolean notSet = true;
        while (notSet) {
            try {
                System.out.print(message);
                result = scanner.nextInt();
                notSet = false;
            } catch (InputMismatchException e) {
                scanner.nextLine();
                System.out.println("Wrong input. Try again");
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int age = getInt("Please enter you age - ");
        System.out.println("Age - " + age);
    }

}
