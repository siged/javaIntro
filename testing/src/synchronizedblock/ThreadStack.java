package synchronizedblock;

import java.util.Random;

public class ThreadStack {
    public static void main(String[] args) {
        Car mercedes = new Car();
        Thread thread = new Thread(mercedes);
        Thread thread1 = new Thread(mercedes);
        thread1.start();
        thread.start();

    }





    class CarPainter implements Runnable {
        private String carPaint;
        private boolean approvedPaint;

        public void startPaint(){
            System.out.println("Start painting");
        }
        @Override
        public void run() {
            Random random = new Random();
            approvedPaint = random.nextBoolean();

            System.out.println(approvedPaint);
        }
    }
}
