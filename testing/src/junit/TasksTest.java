package junit;

import executorService.Tasks;
import jdk.jfr.Description;

import java.lang.reflect.Executable;

import static executorService.Tasks.removeCharFromTextFile;
import static org.junit.jupiter.api.Assertions.*;

public class TasksTest {
// test correct answear and performance time
public static void main(String[] args) {

}

    @Description("how long it take")
    @org.junit.jupiter.api.Test
    public void executionTime(){
        Tasks tasks = new Tasks();

        assertAll();


    }
}
