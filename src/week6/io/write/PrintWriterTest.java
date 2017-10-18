package week6.io.write;

import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterTest {

    public static void main(String[] args) {


        try(PrintWriter printWriter = new PrintWriter("text.txt")){

            printWriter.write("I wrote some text\nHere");

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Text file was successfully created");

    }


}
