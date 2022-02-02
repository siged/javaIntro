package executorService;

import java.util.Random;
import java.util.concurrent.*;

public class WordFromRandomNumberCall {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Future future = executorService.submit(new Callable<Object>() {
            @Override
            public Object call() throws Exception {
                return randomWordGenerator();
            }
        });
        try {
            System.out.println(future.get());
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
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
