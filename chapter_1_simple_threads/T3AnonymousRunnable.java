package chapter_1_simple_threads;

public class T3AnonymousRunnable {

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println("MyRunnable-1" + ": " + i);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println("MyRunnable-2" + ": " + i);
            }
        });

        t1.start();  // Start the thread, which calls the run() method
        t2.start();  // Start the thread, which calls the run() method

        try{
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
