package junit;

import jdk.jfr.Description;
import multitreding.MultiThreadRunnable;

import static multitreding.MultiThreadRunnable.counter;
import static multitreding.MultiThreadRunnable.incrementNumber;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ThreadTesting {

    @Description("What will do the test")
    @org.junit.jupiter.api.Test
    public void isCounterValidForThreads (){
     MultiThreadRunnable runnable = new MultiThreadRunnable();
        int counter = 1;
        for (int i = 0; i < 10; i++) {
            new Thread(new MultiThreadRunnable()).start();

            incrementNumber(counter+i);
            long threadId = Thread.currentThread().getId();
            assertTrue(counter == (int)threadId);
        }
    }
}
