package week6.io.reader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NewMethodTest {

    public static void main(String[] args) {

        try {

            String reduce = Files.lines(Paths.get("t.txt"))
                    .reduce("", (l1, l2) -> l1 + "\n" + l2);

            System.out.println(reduce);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
