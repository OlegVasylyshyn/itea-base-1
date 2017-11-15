package week9.multithreading;

public class ThreadGroupTest {

    public static void main(String[] args) throws InterruptedException {

        ThreadGroup threadGroup = Thread.currentThread().getThreadGroup();
        do {
            System.out.println(threadGroup);
            Thread[] threads = new Thread[10];
            threadGroup.enumerate(threads);
            for(Thread t : threads){
                System.out.println(t);

                if(t != null && "Signal Dispatcher".equals(t.getName())) {
                    t.stop();
                    System.out.println("Was killed signal thread");
                }

            }


            threadGroup = threadGroup.getParent();
        } while (threadGroup != null);

        Thread.sleep(40_000);

    }

}
