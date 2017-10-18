package week6.io.reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest {

    public static void main(String[] args) {


        try(BufferedReader br = new BufferedReader(new FileReader("bufferedWriterTest.txt"))) {

            int i = 1;
            while (br.ready()) {
                System.out.println(i++ + ") " + br.readLine());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
