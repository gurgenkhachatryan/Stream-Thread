package SingleDouble;

import com.github.javafaker.Faker;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleExecute {
    public static void main(String[] args) {
        String path1="C:/Users/Toshiba/Desktop/ACA/ACA_TASK_WEEK10/src/com/company/day4/src/main/java/SingleDouble";
        File folder1=new File(path1+"/Directory1");
        folder1.mkdir();

        ExecutorService executorService= Executors.newSingleThreadExecutor();
        Faker faker=new Faker();

        Runnable task1=(()->
        {
            long start=System.nanoTime();
            for (int i = 0; i < 1000; i++) {
                File file=new File(path1+"/Directory1/file"+i+".txt");
                try {
                    file.createNewFile();
                    OutputStream outputStream=new FileOutputStream(file);
                    for (int j = 0; j < 1000; j++) {
                    outputStream.write(faker.name().name().getBytes(StandardCharsets.UTF_8));}
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            long end=System.nanoTime();
            long timeSingle=end-start;
            System.out.println("timeSingle=" + timeSingle);
        });
        executorService.execute(task1);
        executorService.shutdown();

    }
}
