package multitreding;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceTestClass {
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

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3000);
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                int counter = 0;
                counter++;
                long start = System.currentTimeMillis() / 1000;
                for (int i = 0; i < 10000; i++) {
                    counter++;
                    generatePassword(i+100);
                   /* try {
                        Thread.sleep(5);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }*/
                }
                for (int i = 0; i < 10000; i++) {
                    counter++;
                    generatePassword(i+100);
                   /* try {
                        Thread.sleep(5);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }*/
                }
                for (int i = 0; i < 10000; i++) {
                    counter++;
                    generatePassword(i+100);
                   /* try {
                        Thread.sleep(5);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }*/
                }
                for (int i = 0; i < 100000 * 10000; i++) {
                    counter++;

                }
                for (int i = 0; i < 100000 * 10000; i++) {
                    counter++;

                }
                long end = System.currentTimeMillis() / 1000;
                System.out.println(Thread.currentThread().getName());
                System.out.println(counter);
                System.out.println("time " + (end - start));
                System.out.println(Thread.currentThread().getPriority());
            }
        });
        executorService.shutdown();

    }
}
