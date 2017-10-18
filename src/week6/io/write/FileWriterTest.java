package week6.io.write;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

    public static void main(String[] args) {

        try(FileWriter writer = new FileWriter("fileWriterText.txt")) {

            writer.write("Persisted using FileWriter");

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Success");

    }

}
