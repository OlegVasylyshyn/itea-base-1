package week6.io.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Copy {

    public static void main(String[] args) {


        File file = new File("pic.png");

        System.out.println(file.exists());
        System.out.println("bytes " + file.length());

        try (FileInputStream fis= new FileInputStream(file);
             FileOutputStream fos = new FileOutputStream("pic2.png")
        ) {

            int size = 1024;
            byte[] buff = new byte[size];
            while (fis.read(buff, 0, size) != -1) {
                System.out.println(Arrays.toString(buff));
                fos.write(buff);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
