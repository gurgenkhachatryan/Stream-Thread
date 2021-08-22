package SingleDouble;

import com.github.javafaker.Faker;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ListFix {
    public static void main(String[] args) {
        Faker faker=new Faker();
        String path3="C:/Users/Toshiba/Desktop/ACA/ACA_TASK_WEEK10/src/com/company/day4/src/main/java/SingleDouble";
        File folder3=new File(path3+"/Directory3");
        folder3.mkdir();
        ExecutorService executorService= Executors.newFixedThreadPool(4);

        Callable<String> task1=(()->
        {
            long timestart1=System.nanoTime();
            for (int i = 0; i < 25; i++) {
                File file=new File(path3+"/Directory3/file"+ i+".txt")  ;
                try {
                    file.createNewFile();
                    OutputStream outputStream = new FileOutputStream(file);
                    for (int j = 0; j < 100; j++) {


                        outputStream.write(faker.name().name().getBytes(StandardCharsets.UTF_8));
                    }


                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            long time1end=System.nanoTime();
            long tim1=time1end-timestart1;
            System.out.println(tim1);
            return "task1";
        });
        Callable<String> task2=(()->
        {
            long timestart2=System.nanoTime();
            for (int i = 25; i < 50; i++) {
                File file=new File(path3+"/Directory3/file"+ i+".txt")  ;
                try {
                    file.createNewFile();
                    OutputStream outputStream = new FileOutputStream(file);
                    for (int j = 0; j < 100; j++) {


                        outputStream.write(faker.name().name().getBytes(StandardCharsets.UTF_8));
                    }


                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            long time2end=System.nanoTime();
            long tim2=time2end-timestart2;
            System.out.println(tim2);
            return "task2";
        });
        Callable<String> task3=(()->
        {
            long timestart3=System.nanoTime();
            for (int i = 50; i < 75; i++) {
                File file=new File(path3+"/Directory3/file"+ i+".txt")  ;
                try {
                    file.createNewFile();
                    OutputStream outputStream = new FileOutputStream(file);
                    for (int j = 0; j < 100; j++) {


                        outputStream.write(faker.name().name().getBytes(StandardCharsets.UTF_8));
                    }


                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            long time3end=System.nanoTime();
            long tim3=time3end-timestart3;
            System.out.println(tim3);
            return "task3";
        });
        Callable<String> task4=(()->
        {
            long timestart4=System.nanoTime();
            for (int i = 75; i < 100; i++) {
                File file=new File(path3+"/Directory3/file"+ i+".txt")  ;
                try {
                    file.createNewFile();
                    OutputStream outputStream = new FileOutputStream(file);
                    for (int j = 0; j < 100; j++) {


                        outputStream.write(faker.name().name().getBytes(StandardCharsets.UTF_8));
                    }


                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            long time4end=System.nanoTime();
            long tim4=time4end-timestart4;
            System.out.println(tim4);
            return "task4";
        });

        List<Callable<String>> list=new ArrayList<>();
        list.add(task1);
        list.add(task2);
        list.add(task3);
        list.add(task4);
        try {
            executorService.invokeAll(list);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        executorService.shutdown();

    }
    }

