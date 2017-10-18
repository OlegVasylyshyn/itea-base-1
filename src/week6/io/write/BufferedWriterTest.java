package week6.io.write;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest {

    public static void main(String[] args) {

        try(BufferedWriter br = new BufferedWriter(new FileWriter("bufferedWriterTest.txt"))) {

            br.write("I wrote some\ntext using\nBufferedWriter");

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Success");

    }


}
