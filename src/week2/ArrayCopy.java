package week2;

import java.util.Arrays;

public class ArrayCopy {

    public static void main(String[] args) {

        int[] nums = new int[20];
        nums[0] = 5;

        for (int i = 0; i < nums.length; i++) {
            nums[i] = i;
        }

        // SHOW ARRAY

        System.out.println(Arrays.toString(nums));


        // simple copy

//        int[] nums2 = new int[nums.length];
//        for (int i = 0; i < nums.length; i++) {
//            nums2[i] = nums[i];
//        }


        // COMPARE TWO ARRAYS (use Arrays.equals();)

//        boolean isEquals = true;
//        for (int i = 0; i < nums.length; i++) {
//            if(nums2[i] != nums[i]) {
//                isEquals = false;
//            }
//        }


        // clone

//        int[] clone = nums.clone();
//        clone[0] = 999;
//
//        for (int i = 0; i < nums.length; i++) {
//            System.out.print(nums[i] + " ");
//        }
//        System.out.println();
//        for (int i = 0; i < clone.length; i++) {
//            System.out.print(clone[i] + " ");
//        }


        // System.arraycopy

//        int[] systemCopy = new int[nums.length];
//        System.arraycopy(nums, 5, systemCopy, 10, 2);
//        for (int i = 0; i < systemCopy.length; i++) {
//            System.out.print(systemCopy[i] + " ");
//        }


        // ARRAYS UTILS

//        int[] copied = Arrays.copyOf(nums, nums.length);
//        System.out.println(Arrays.toString(copied));

    }

}
