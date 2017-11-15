package week2;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class TestString {

    public static void main(String[] args) throws UnsupportedEncodingException {
        String str = "Hello Dexter";

        System.out.println(str.length());

        char[] chars = str.toCharArray();
        System.out.println(Arrays.toString(chars));

        System.out.println(str.endsWith("ter"));
        System.out.println(str.startsWith("ter"));

        String dexter = str.substring(6);
        System.out.println(dexter);
        System.out.println(str);

        String hello = str.substring(0, 5);
        System.out.println(hello);
        System.out.println(str);

        String[] words = str.split(" ");
        System.out.println(Arrays.toString(words));

        // remove useless whitespace at the end and begin
        String trim = str.trim();
        System.out.println(trim);
        System.out.println(str);

        System.out.println(str.equals("Hello Dexter"));
        String s = "Hello Dexter";
        System.out.println(s == str);

        char symbol = str.charAt(6);
        System.out.println(symbol);

        String lowerCase = str.toLowerCase();
        System.out.println(lowerCase);

        System.out.println(str.toUpperCase());

        String concat = str.concat(", how are you?");
        System.out.println(concat);
        System.out.println(str);

        concat = str + ", how are you?";
        System.out.println(concat);
        System.out.println(str);

        int comparedInt = str.compareTo("Oleg");
        System.out.println(comparedInt);

        byte[] bytes = str.getBytes();
        System.out.println(Arrays.toString(bytes));

        String string = new String(bytes);
        System.out.println(string);

        String wer = "wer";
        str += wer;
        System.out.println(str);


        String message = String.format("Hello mr %s, you wll receive %.2f dollars " +
                "if you send message to this number +%d", dexter, 35.1234, 4563456);

        System.out.println("Message : ");
        System.out.println(message);
        // or the same
        System.out.printf("Hello mr %s, you wll receive %.2f dollars " +
                "if you send message to this number +%s", dexter, 35.1234, true);
    }

}
