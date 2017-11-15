package week2;

public class ArraySearch {

    public static void main(String[] args) {

        int[] nums = new int[100_000_000];
        for (int i = 0; i < nums.length; i++) {
//            nums[i] = (int) (Math.random() * 100);
            nums[i] = i;
        }
        int search = 200_000_00;

        long startTime = 0, endTime = 0;
        int steps = 0;
        boolean isIn = false;

        // SORT BY ARRAYS TOOLS

//        Arrays.sort(nums);
//        System.out.println("Sorted");

        // BUBBLE SORT

//        for (int i = 0; i < nums.length - 1; i++) {
//            for (int j = 0; j < nums.length - (1 + i); j++) {
//                if(nums[j] > nums[j + 1]) {
//                    int temp = nums[j];
//                    nums[j] = nums[j + 1];
//                    nums[j + 1] = temp;
//                }
//                steps++;
//            }
//        }

        // SELECT SORT

//        for (int i = 0; i < nums.length; i++) {
//            int min = i;
//            for (int j = i; j < nums.length -1; j++) {
//                steps++;
//                if(nums[min] > nums[j + 1]){
//                    min = j + 1;
//                }
//            }
//            int temp = nums[i];
//            nums[i] = nums[min];
//            nums[min] = temp;
//        }


        // ITERABLE SEARCH

//        startTime = System.nanoTime();
//        for (int i = 0; i < nums.length; i++) {
//            if(nums[i] == search){
//                isIn = true;
//                break;
//            }
//            steps++;
//        }
//        endTime = System.nanoTime();


        // BINARY SEARCH

//        startTime = System.nanoTime();
//        int start = 0, end = nums.length - 1;
//        while (start <= end) {
//            int mid = (start + end) / 2;
//            if (nums[mid] == search){
//                isIn = true;
//                break;
//            } else if(nums[mid] > search) {
//                end = mid - 1;
//            } else {
//                start = mid + 1;
//            }
//            steps++;
//        }
//        endTime = System.nanoTime();

        // SHOW RESULTS

        System.out.println("Found - " + isIn);
        System.out.println("Steps - " + steps);
        System.out.println("Time - " + (endTime - startTime));
    }

}

