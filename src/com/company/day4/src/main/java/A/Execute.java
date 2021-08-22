package A;

import com.itextpdf.text.Document;
import com.itextpdf.text.PageSize;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Execute {
    public static void main(String[] args) {
        String path="C:/Users/Toshiba/Desktop/ACA/ACA_TASK_WEEK10/src/com/company/day4/src/main/java/Directory";
        File folder=new File(path);
        folder.mkdir();
        ExecutorService executorService= Executors.newSingleThreadExecutor();
        Runnable task1=(()->{
            for (int i = 0; i < 10; i++) {
                String str="/pdfFile"+i+".pdf";
                File file=new File(path+str);
                try {
                    file.createNewFile();

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        Runnable task2=(()->
        {
            for (int i = 10; i < 20; i++) {
                String str2="/pdfFile2" +i+".pdf";
                File file2=new File(path+str2);
                try {
                    file2.createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        executorService.execute(task2);

        executorService.execute(task1);

        executorService.shutdown();


    }
}
