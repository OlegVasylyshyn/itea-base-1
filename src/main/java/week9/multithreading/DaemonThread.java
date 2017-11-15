package week9.multithreading;

public class DaemonThread {

    public static void main(String[] args) {

        Thread thread = new Thread(() -> {

            int i = 0;
            while (true) {
                System.out.println(i);

                try {
                    Thread.sleep(500);
                } catch (InterruptedException ignore) {/*NOPE*/}

            }


        });



        Thread thread2 = new Thread(() -> {

            int i = 0;
            while (true) {
                System.out.println(i);

                try {
                    Thread.sleep(500);
                } catch (InterruptedException ignore) {/*NOPE*/}

            }


        });

        thread.setDaemon(true);
        thread2.setDaemon(false);


        thread.start();
        thread2.start();

        System.out.println("Main was died");
    }

}
