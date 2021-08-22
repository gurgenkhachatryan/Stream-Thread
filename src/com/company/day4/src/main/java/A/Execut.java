package A;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Execut {
    public static void main(String[] args) {
        ExecutorService executorService= Executors.newFixedThreadPool(4);
        System.out.println("main barev");
Runnable task1=(()->{
    System.out.println("task barev");
});
Runnable task2=(()->{
    System.out.println("task2");
});
executorService.execute(task2);
executorService.execute(task1);
Thread thread=new Thread(task1);

        System.out.println("main hajox");
        executorService.shutdown();
    }
}
