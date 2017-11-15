package week9.multithreading;

public class WaitNotifyTest {

    private final static Object monitor = new Object();

    public static void main(String[] args) {

        new Thread(WaitNotifyTest::work).start();
        new Thread(WaitNotifyTest::kill).start();

    }

    private static void kill(){

        System.out.println("Kill thread go to sleep");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ignore) { /*NOPE*/}

        System.out.println("Awake");

        synchronized (monitor) {
            System.out.println("Sent notify");
            monitor.notify();
            System.out.println("After notify");
            try {
                Thread.sleep(10_000);
            } catch (InterruptedException ignore) {/*NOPE*/}
        }
    }

    private static void work(){
        System.out.println("Started working");
        synchronized (monitor) {
            try {
                System.out.println("I am going to wait");
                monitor.wait();
                System.out.println("I awoke");
            } catch (InterruptedException ignore) {/*NOPE*/}
        }
    }



}
