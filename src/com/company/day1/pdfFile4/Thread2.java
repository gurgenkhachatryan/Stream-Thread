package com.company.day1.pdfFile4;

import java.io.File;
import java.io.IOException;

public class Thread2 extends Thread {
    @Override
    public void run() {
        String pathFolder="C:/Users/Toshiba/Desktop/ACA/ACA_TASK_WEEK10/src/com/company/day1/pdfFile4";
        File file=new File(pathFolder+"/Directory");
        String pathFile=pathFolder+"/Directory";
        file.mkdir();
        long startTime=System.nanoTime();
        for (int i = 501; i <=1000 ; i++) {

            File file1=new File(pathFile+"/pdfFile"+i+".pdf");
            try {
                file1.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
