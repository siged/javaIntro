package executorService;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class WordFromRandomNumbersES {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        executorService.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println(randomWordGenerator());
            }
        });
        executorService.shutdown();
    }

    public static String randomWordGenerator() {
        Random random = new Random();
        char letter = 0;
        String word = "";

        while (word.length() < 10) {
                letter = (char) random.nextInt(122);
                if (letter >= 'A' && letter <= 'Z' || letter >= 'a' && letter <= 'z') {
                    word += letter;
                }
        }
        return word;
    }
}
