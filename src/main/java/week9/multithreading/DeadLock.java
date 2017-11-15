package week9.multithreading;


public class DeadLock {

    private final static Object monitor = new Object();

    private static Thread t1;
    private static Thread t2;

    public static void main(String[] args) {

        t1 = new Thread(DeadLock::sleep);
        t2 = new Thread(DeadLock::wake);
        Thread killer = new Thread(DeadLock::kill);

        t1.start();
        t2.start();
        killer.start();
    }

    private static void sleep(){

        while (true) {

            synchronized (monitor){
                try {
                    System.out.println("Sleep Thread. Go wait");
                    monitor.wait();
                    Thread.sleep(1000);
                    System.out.println("Sleep Thread. Notify");
                    monitor.notify();
                } catch (InterruptedException e) {
                    System.out.println("Somebody sent interrupt");
                    break;
                }
            }

        }

    }

    private static void wake(){

        while (true) {

            synchronized (monitor){
                try {
                    System.out.println("Wake Thread. Go wait");
                    monitor.wait();
                    Thread.sleep(1000);
                    System.out.println("Wake Thread. Notify");
                    monitor.notify();
                } catch (InterruptedException e) {
                    System.out.println("Somebody sent interrupt");
                    break;
                }
            }

        }
    }


    private static void kill(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ignore) {/*NOPE*/}

        t1.interrupt();
        t2.interrupt();

    }


}
