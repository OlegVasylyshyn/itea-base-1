package week6.exception;


public class FinallyTest {

    public static void main(String[] args) {

        Resources resources = new Resources();
        try {
            System.out.println("try");
            throw new Exception();
        } catch (Exception e) {
            System.out.println("catch");
        } finally {
            try {
                resources.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("finally");
        }

        System.out.println();
        System.out.println();

        try (Resources resources2 = new Resources()) {
            System.out.println("try");
//            throw new Exception();
        } catch (Exception e) {
            System.out.println("catch");
        } finally {
            System.out.println("finally");
        }


    }

}

class Resources implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("Closed");
    }

}
