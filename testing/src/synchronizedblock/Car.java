package synchronizedblock;

import java.util.Random;

public class Car implements Runnable {
    private String tires;
    private String windows;
    private Engine engine;
    private ThreadStack.CarPainter carPainter;
    public static volatile String value = "test";
    public static String value1 = "lawjf";

    public void printCarProperties() {
        System.out.println(tires);
        System.out.println(windows);
        System.out.println(engine);
        System.out.println(carPainter);
    }

    public void startEngine() {
        System.out.println("Engine start");
    }

    private void shiftGear() {
        System.out.println("Shift gear");
    }

    @Override
    public void run() {
       // System.out.println(Thread.currentThread().getName());
        tires = Thread.currentThread().getState().toString();
       // System.out.println(tires.getBytes());
        System.out.println(value.hashCode());
        System.out.println(value1.hashCode());
        windows = "open";
        Engine engine1 = new Engine();
        engine = engine1;
       // engine.run();
        //carPainter.run();

    }
}