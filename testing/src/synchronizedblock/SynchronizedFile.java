package synchronizedblock;

import executorService.Tasks;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SynchronizedFile implements Runnable {

    public static void main(String[] args) {
        Thread thread1 = new Thread(new SynchronizedFile());
        Thread thread2 = new Thread(new SynchronizedFile());
        synchronized (SynchronizedFile.class){
            Thread thread3 = new Thread(new SynchronizedFile());
            thread3.start();
        }
        thread1.start();
        thread2.start();
    }

    public synchronized static void removeCharFromTextFile() {
        Thread thread1 = new Thread(new SynchronizedFile());
        Thread thread2 = new Thread(new SynchronizedFile());
        Thread thread3 = new Thread(new SynchronizedFile());

        thread1.start();
        thread2.start();
        thread3.start();
    }

    @Override
    public void run() {
        File file = new File("/home/siged/Desktop/javaintro/javaIntro/testing/src/executorService/textfilefdir/text.txt");
        String buffer = "";
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (scanner.hasNext()) {
            buffer += scanner.nextLine().replaceAll("[Aa]", " ") + "\n";
        }
        System.out.println(buffer);
        System.out.println(Thread.currentThread().getName());
    }
}
