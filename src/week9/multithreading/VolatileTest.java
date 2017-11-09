package week9.multithreading;

public class VolatileTest {

    private static volatile boolean isInterrupt;

    public static void main(String[] args) {

        new Thread(VolatileTest::work).start();
        new Thread(VolatileTest::kill).start();

    }

    private static void kill(){

        System.out.println("Kill thread go to sleep");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ignore) { /*NOPE*/}

        System.out.println("Awake");
        isInterrupt = true;
        System.out.println("Sent stop");

    }

    private static void work(){

        while (!Thread.currentThread().isInterrupted() && !isInterrupt){

            try {
                Thread.sleep(500);
            } catch (InterruptedException ignore) {
                System.out.println("Was interrupted");
                break;
            }

            System.out.println("Work...");

        }

        System.out.println("Was correctly ended work");

    }




}
