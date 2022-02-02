package synchronizedblock;

import java.util.Random;
// try synchronized work with file
class RaceCondition implements Runnable {
    private static int counter = 0;
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Thread thread1 = new Thread(new RaceCondition());
        Thread thread2 = new Thread(new RaceCondition());
        Thread thread3 = new Thread(new RaceCondition());
        thread1.start();
        thread2.start();
        thread3.start();

        System.out.println(sb);
    }

    @Override
    public void run() {
       // synchronized (this) {
           // add();
        //}
       // RaceCondition raceCondition = new RaceCondition();
        try {
            synchronized (this) {
                randomWordGenerator();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       // System.out.println(Thread.currentThread().getName());
    }
// in this case synchronized will synchronize add() method
    private synchronized void add() {
        //synchronized (this) {
            counter++;
            System.out.println(Thread.currentThread().getName());
            System.out.println(counter);
       //}
    }
    public  String  randomWordGenerator() throws InterruptedException {
        synchronized (this) {

            System.out.println(counter++);
            Random random = new Random();
            char letter = 0;
            String word = "";

            while (word.length() < 10) {
                letter = (char) random.nextInt(122);
                if (letter >= 'A' && letter <= 'Z' || letter >= 'a' && letter <= 'z') {
                    word += letter;
                }
            }
            //Thread.sleep(5000);

            sb.append(word);
            sb.append(Thread.currentThread().getName());
            Thread.sleep(1000);
            System.out.println(word);
            return word;
        }
        }
    }
