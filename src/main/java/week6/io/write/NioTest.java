package week6.io.write;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class NioTest {

    public static void main(String[] args) {


        List<String> list = new ArrayList<String>(){{ add("Some"); add("Lines"); add("Here"); }};
        Path path = Paths.get("nioWriterTest");

        try {
            Files.write(path, list, Charset.defaultCharset());
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Success");

    }

}
