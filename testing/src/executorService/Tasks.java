package executorService;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Tasks implements Runnable {
    /* 1 open text file and remove 'a' and replace with whitespace char from text in it atleast 1mb file with threads
    2 test with junit
    * */

    public static void main(String[] args) {
        removeCharFromTextFile();
    }

    public static void removeCharFromTextFile() {
        Thread thread = new Thread(new Tasks());
        thread.start();
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
    }
}
