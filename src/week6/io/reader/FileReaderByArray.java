package week6.io.reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderByArray {

    public static void main(String[] args) {

        try (
                FileReader fr = new FileReader("bufferedWriterTest.txt");
                BufferedReader reader = new BufferedReader(fr)
        ) {

            int buffSize = 1024;
            char[] buff = new char[buffSize];
            StringBuilder sb = new StringBuilder();
            while (reader.read(buff, 0, buffSize) != -1){
                sb.append(buff);
            }

            System.out.println(sb.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
