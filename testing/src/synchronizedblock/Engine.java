package synchronizedblock;

import java.util.Random;

class Engine implements Runnable {
    private String engineFilter;
    private String type;
    private static boolean isEngineStarted;

    private void engineState() {
        System.out.println("Engine State");
    }

    @Override
    public void run() {
        Random random = new Random();
        isEngineStarted = random.nextBoolean();

        System.out.println(isEngineStarted);
    }
}