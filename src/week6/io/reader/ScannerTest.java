package week6.io.reader;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ScannerTest {

    public static void main(String[] args) {

        try(Scanner scanner = new Scanner(new FileInputStream("t.txt"))){

            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }

        } catch (IOException e){
            e.printStackTrace();
        }


    }

}
