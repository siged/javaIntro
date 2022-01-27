package junit;

import executorService.WordFromRandomNumbersES;
import jdk.jfr.Description;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

// test random numbers until form word long 10 characters
public class ExecutorServiceTest {

    @Description("Test executor")
    @org.junit.jupiter.api.Test
    public void testExecutor(){
        WordFromRandomNumbersES test = new WordFromRandomNumbersES();

    }
}
