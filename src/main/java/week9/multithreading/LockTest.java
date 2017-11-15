package week9.multithreading;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockTest {

    private final static Lock lock = new ReentrantLock(true);
    private static Condition condition;

    public static void main(String[] args) {

        condition = lock.newCondition();
        new Thread(LockTest::work).start();
        new Thread(LockTest::kill).start();

    }

    private static void kill(){

        System.out.println("Kill thread go to sleep");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ignore) { /*NOPE*/}


        lock.lock();
        try {
            System.out.println("Awake");
            condition.signal();
            System.out.println("After awake");

            Thread.sleep(5000);

        } catch (InterruptedException e) {
            // NOPE
        } finally {
            lock.unlock();
        }

    }

    private static void work(){
        System.out.println("Started working");

        lock.lock();
        System.out.println("I am going to wait");
        try {
            condition.await();
            System.out.println("I awoke");
        } catch (InterruptedException ignore) {
            // NOPE
        } finally {
            lock.unlock();
        }
    }
}



