package multitreding;

public class MultiThreadRunnable implements Runnable {
    public static int counter;
// is counter valid for all threads
    @Override
    public void run() {
        System.out.println("Test");
        System.out.println(Thread.currentThread().getId());
        System.out.println(Thread.currentThread().getPriority());
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 10; i++) {
            incrementNumber(counter+i);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public static void incrementNumber(int counter) {
        System.out.println(Thread.currentThread().getName());
         counter++;
        System.out.println("counter: " + counter);
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getId());
        System.out.println(Thread.currentThread().getPriority());
        Runnable runnable = new MultiThreadRunnable();
        Thread thread = new Thread(runnable);
        thread.setName("testThread");

        thread.start();
        for (int i = 0; i < 10; i++) {
            new Thread(new MultiThreadRunnable()).start();
        }
       /* MultiThread multiThread = new MultiThread();
        multiThread.setPriority(7);

        MultiThread multiThread2 = new MultiThread();
        multiThread2.setPriority(Thread.MAX_PRIORITY);

        MultiThread multiThread1 = new MultiThread();
        multiThread1.setPriority(7);

        multiThread.start();
        multiThread1.start();
        multiThread2.start();*/

    }
}
