package executorService;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.*;

public class ExecutorServiceInvoke {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Set<Callable<Integer>> callables = new HashSet<Callable<Integer>>();
        callables.add(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 5 * 5;
            }
        });
        callables.add(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 5 + 5;
            }
        });
        callables.add(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 5 / 5;
            }
        });
        int result = executorService.invokeAny(callables);
        System.out.println(result);
        List<Future<Integer>> futureList = executorService.invokeAll(callables);
        for (int i = 0; i < futureList.size(); i++) {
            System.out.println(futureList.get(i).get());
        }
        executorService.shutdown();
    }
}
