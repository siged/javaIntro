package multitreding;

public class Concatinating implements Runnable {
    // concatinate strings from 5 threads
    private String[] words;

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            new Thread(new Concatinating()).setName(String.valueOf(i));
            Thread.currentThread().start();
        }
    }

    public String[] words(String str1, String str2, String str3, String str4, String str5) {
        String[] inputWords = {str1, str2, str3, str4, str5};
        for (int i = 0; i < 5; i++) {
            this.words = new String[5];
            this.words[i] = inputWords[i];
        }
        return this.words;
    }


    @Override
    public void run() {
        this.words = new String[5];
        System.out.print(this.words[Integer.parseInt(Thread.currentThread().getName())]);
    }
}
