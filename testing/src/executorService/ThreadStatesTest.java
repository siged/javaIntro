package executorService;
// thread states NEW, RUNNABLE, WAITING, BLOCKED, TIME WAITING, TERMINATED
public class ThreadStatesTest implements Runnable{
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new ThreadStatesTest());
        System.out.println(thread.getState());
        thread.start();
        System.out.println(thread.getState());
        Thread thread2 = new Thread(new ThreadStatesTest());
        thread2.start();
        thread2.join();
        System.out.println(thread2.getState());
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getState());
        try {
            for (int i = 0; i < 2; i++) {

                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getState());
            }


        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
