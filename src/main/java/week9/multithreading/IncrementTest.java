package week9.multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class IncrementTest {

    private static int number = 0;
    private static AtomicInteger num = new AtomicInteger(0);


    public static void main(String[] args) throws InterruptedException {


        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {

                for (int i = 0; i < 1_000_000; i++) {
                    increment();
                }

            }
        });
        thread1.setName("Thread-1");

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {

                for (int i = 0; i < 1_000_000; i++) {
                    increment();
                }


            }
        });
        thread2.setName("Thread-2");

        long start = System.nanoTime();
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
        long end = System.nanoTime();

        System.out.println("Result - " + number);
        System.out.println("Time - " + (end -  start) / 1000_000_000.0);

    }

    private static void increment(){
        synchronized (IncrementTest.class) {
            number++;
        }
//        num.incrementAndGet();
    }

}
