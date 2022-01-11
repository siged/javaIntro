package multitreding;

public class MultiThread extends Thread{
@Override
public void run() {
    System.out.println("Test");
    System.out.println(Thread.currentThread().getId());
    System.out.println(Thread.currentThread().getPriority());
}
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getId());
        System.out.println(Thread.currentThread().getPriority());
        MultiThread multiThread = new MultiThread();
        multiThread.setPriority(7);

        MultiThread multiThread2 = new MultiThread();
        multiThread2.setPriority(Thread.MAX_PRIORITY);

        MultiThread multiThread1 = new MultiThread();
        multiThread1.setPriority(7);

        multiThread.start();
        multiThread1.start();
        multiThread2.start();

    }
}
