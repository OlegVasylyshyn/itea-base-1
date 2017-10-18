package week6.io.reader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class InputStreamReadTest {


    public static void main(String[] args) {


        try (
                InputStream in = Files.newInputStream(Paths.get("bufferedWriterTest.txt"));
                BufferedReader reader = new BufferedReader(new InputStreamReader(in))
        ) {

            int i = 1;
            String line = null;
            StringBuilder sb = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                sb.append(i++).append(") ").append(line).append("\n");
            }

            System.out.println(sb.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
