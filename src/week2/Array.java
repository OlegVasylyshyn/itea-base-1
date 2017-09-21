package week2;

/**
 * Home work for ITEA BASE week 2
 */
public class Array {

    private static int[] nums = new int[10];
    private static int size = 0;

    public static void main(String[] args) {

        add(10);
        add(5);
        add(7);
        add(2);
        add(15);
        add(5);
        add(0);
        add(2);
        add(10);
        add(5);
        add(2);
        add(2);
        add(13);
        add(1);
        add(7);
        add(9);

        get(4);

        sort();

        search(5);

        add(2, 10);

        remove(0);

        removeValue(10);

        invert();

        subArray(3, 8);

        System.out.println(getString());
    }

    /**
     * Add int value to the end of array.
     * if array outs index of bounds copy all values
     * to new bigger array.
     *
     * @param value - new value for nums field.
     */
    private static void add(int value) {
        if(nums.length <= size){
            copyArray();
        }
        nums[size++] = value;
    }

    private static void copyArray() {
        int[] newArray = new int[nums.length * 2];
        System.arraycopy(nums, 0, newArray, 0, nums.length);
        nums = newArray;
    }

    /**
     * @return value from this index.
     * @param index in nums.
     * @throws ArrayIndexOutOfBoundsException if no such
     *         index in nums.
     */
    private static int get(int index) {
        return nums[index];
    }

    /**
     * Ascending sorts nums
     */
    private static void sort() {
        // TODO: 9/19/17
    }

    /**
     * @return first founded index
     *      which associated with this value,
     *      or -1 if was not found such value.
     * @param value - searched value in nums
     */
    private static int search(int value) {
        // TODO: 9/19/17
        return -1;
    }

    /**
     * Add new value or replace old value
     * @return return old value or -1.
     * @param index of nums
     * @param value for insert.
     *
     * @throws ArrayIndexOutOfBoundsException if no such
     *         index in nums.
     */
    private static int add(int index, int value) {
        // TODO: 9/19/17
        return -1;
    }

    /**
     * @return removed value.
     * @param index removed value.
     * @throws ArrayIndexOutOfBoundsException if no such
     *          index in nums.
     */
    private static int remove(int index) {
        // TODO: 9/19/17
        return -1;
    }

    /**
     * @return removed value or -1 if was not found
     * @param value removed value.
     */
    private static int removeValue(int value) {
        // TODO: 9/19/17
        return -1;
    }

    /**
     * Inverts nums
     */
    private static void invert() {
        // TODO: 9/19/17
    }

    /**
     * Makes copy of nums from first index to last index which
     * was received from params.
     *
     * @param from first index of subArray
     * @param to last index of subArray
     * @return subArray of the nums
     * @throws ArrayIndexOutOfBoundsException if no such
     *         indexes in nums.
     */
    private static int[] subArray(int from, int to) {
        // TODO: 9/19/17
        return null;
    }

    /**
     * Convert nums into string.
     * @return nums in string format.
     */
    private static String getString(){
        // TODO: 9/19/17
        return "";
    }

}
