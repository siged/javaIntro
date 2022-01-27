package executorService;

import java.util.concurrent.Callable;

public class CallableTest implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        return 25;
    }
}
