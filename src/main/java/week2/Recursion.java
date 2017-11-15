package week2;

public class Recursion {

    public static void main(String[] args) {

        System.out.println(f(4));

    }

    // Fn = (Fn - 1) * n
    private static int f(int n){
        return n < 1 ? 1 : f(n -1) * n;
    }

}
