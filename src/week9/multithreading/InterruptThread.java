package week9.multithreading;

public class InterruptThread {

    private static Thread work;

    public static void main(String[] args) {

        work = new Thread(InterruptThread::work);
        work.start();
        new Thread(InterruptThread::kill).start();

    }

    private static void kill(){

        System.out.println("Kill thread go to sleep");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ignore) { /*NOPE*/}

        System.out.println("Awake");
        work.interrupt();
        System.out.println("Sent stop");

    }

    private static void work(){

        while (!Thread.currentThread().isInterrupted()){

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
