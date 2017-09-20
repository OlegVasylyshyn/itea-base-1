package week2;

public class Methods {

    public static void main(String[] args) {

        int[] array = initArray(20);
        int[] array1 = initArray(50);

        show(array);
        show(array1, 25, 35);

        greeting("Oleg", "Taras", "Rostislav");

    }

    private static int[] initArray(int size){
        int[] newArray = new int[size];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = i;
        }
        return newArray;
    }

    public static void show (int[] nums){
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + ", ");
        }
        System.out.println();
    }

    public static void show (int[] nums, int start, int end){
        for (int i = 0; i < nums.length; i++) {
            if(i > start && i < end) {
                System.out.print(nums[i] + ", ");
            }
        }
        System.out.println();
    }

//    private static void greeting(String[] names){
//        for (int i = 0; i < names.length; i++) {
//            System.out.println("Hello " + names[i]);
//        }
//    }

    private static void greeting(String... names){
        for (int i = 0; i < names.length; i++) {
            System.out.println("Hello " + names[i]);
        }
    }

    private static void greeting(String name){
        System.out.println("Hello " + name);
    }

}

