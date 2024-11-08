package chapter_1_simple_threads;

public class T1ExtendThreads {

    static class MyThread extends Thread {

        int id;
        int count;

        @Override
        public void run() {
            for (int i = 1; i <= 10; i++) {
                System.out.println("MyThread-" + id + ": " + count++);
            }
        }

        public MyThread(int id){
            this.id = id;
        }
    }

    public static void main(String[] args) {

//        T1ExtendThreads outer = new T1ExtendThreads();

        MyThread thread1 = new MyThread(1);
        MyThread thread2 = new MyThread(2);

        thread1.start();  // Start the thread, which calls the run() method
        thread2.start();  // Start the thread, which calls the run() method
    }
}
