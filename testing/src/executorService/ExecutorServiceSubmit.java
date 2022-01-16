package executorService;

import java.util.Random;
import java.util.concurrent.*;

public class ExecutorServiceSubmit {
    private static char[] generatePassword(int length) {
        String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String specialCharacters = "!@#$";
        String numbers = "1234567890";
        String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
        Random random = new Random();
        char[] password = new char[length];
        password[0] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
        password[1] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
        password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
        password[3] = numbers.charAt(random.nextInt(numbers.length()));
        for (int i = 4; i < length; i++) {
            password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
        }
        return password;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(10);

        Future future = executorService.submit(new Runnable() {

            @Override
            public void run() {
                Future future1 = executorService.submit(new Runnable() {
                    @Override
                    public void run() {
                        System.out.printf("waiting");
                    }
                });
                try {
                    future1.wait(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                int counter = 0;
                for (int i = 0; i < 10000; i++) {
                    counter++;
                    generatePassword(i + 100);
                   /* try {
                        Thread.sleep(5);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }*/
                }
            }


        });

        System.out.println(future.get());
        // if future.get() is null then executorService.submit() has finished correctly
        System.out.println(future.isDone());

    }
}
