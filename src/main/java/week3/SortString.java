package week3;

import java.util.Arrays;

public class SortString {

    public static void main(String[] args) {
        String[] strings = new String[]{"Dex", "Oleg", "Anton", "Jason", "James"};

        for (int i = 0; i < strings.length - 1; i++) {
            for (int j = 0; j < strings.length - 1 - i; j++) {
                if(strings[j].compareTo(strings[j + 1]) > 1){
                    // if(students[j].getFirstName().compareTo(students[j + 1].getFirstName()))
                    // Student temp = students[j];
                    // students[j] = students[j + 1];
                    String temp = strings[j];
                    strings[j] = strings[j + 1];
                    strings[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(strings));

    }

}
