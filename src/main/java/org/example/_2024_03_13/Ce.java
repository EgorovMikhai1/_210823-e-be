package main.java.org.example._2024_03_13;

import java.util.concurrent.*;

public class Ce {
    static int result = 0;

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Factorial factorial = new Factorial(15);

        Future<Integer> future = executorService.submit(factorial);

        System.out.println(future.get()
        );

        result = future.get();
        System.out.println(result);
        executorService.shutdown();
    }
}


class Factorial implements Callable<Integer> {
    int fa = 0;

    public Factorial(int fa) {
        this.fa = fa;
    }

    @Override
    public Integer call() {
        int result = 1;

        for (int i = 1; i <= fa; i++) {
            result *=i;
        }

        return result;
    }
}