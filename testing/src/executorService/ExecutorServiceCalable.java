package executorService;

import java.util.concurrent.*;

public class ExecutorServiceCalable {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Future future = executorService.submit(new Callable<Integer>() {

            @Override
            public Integer call() throws Exception {
                return 15;
            }
        });
        System.out.println(future.get());
    }
}
