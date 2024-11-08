package chapter_1_simple_threads;

public class T2ImplementRunnable {

    static class MyRunnable implements Runnable {

        int id;
        int count;

        @Override
        public void run() {
            for (int i = 1; i <= 10; i++) {
                System.out.println("MyRunnable-" + id + ": " + count++);
            }
        }

        public MyRunnable(int id){
            this.id = id;
        }
    }

    public static void main(String[] args) {

//        T1ExtendThreads outer = new T1ExtendThreads();

        MyRunnable r1 = new MyRunnable(1);
        MyRunnable r2 = new MyRunnable(2);

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);


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
