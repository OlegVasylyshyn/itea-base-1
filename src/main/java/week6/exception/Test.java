package week6.exception;

public class Test {

    public static void main(String[] args) {

        Test test = new Test();

        try {
            test.methodWhichThrowsUncheckedException();
        } catch (RuntimeException e) {
            System.out.println("Some exception. message - " + e.getMessage());
        }

        // try-catch-finally
        try {

            test.methodWhichThrowsCheckedException();

        } catch (Exception e) {
            System.out.println("Occurred exception. Message - " + e.getMessage());
//            e.printStackTrace();
        }

        System.out.println("Continue the work");

    }

    private void methodWhichThrowsUncheckedException() {
        throw new RuntimeException("I am UncheckedException");
    }

    private void methodWhichThrowsCheckedException() throws Exception {
        throw new Exception("I am CheckedException");
    }

}
