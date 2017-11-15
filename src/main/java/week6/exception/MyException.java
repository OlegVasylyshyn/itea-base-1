package week6.exception;

public class MyException extends RuntimeException {

    public MyException(String message) {
        super(message);
    }

    public static void main(String[] args) {
        throw new MyException("This is my exception");
    }

}
