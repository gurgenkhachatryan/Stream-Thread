package com.company.day1.pdfFile4;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

public class Main {
    public static void main(String[] args) {
        long startTime=System.nanoTime();
        String pathFolder="C:/Users/Toshiba/Desktop/ACA/ACA_TASK_WEEK10/src/com/company/day1/pdfFile4";
        File file=new File(pathFolder+"/Directory");
        String pathFile=pathFolder+"/Directory";
        file.mkdir();

        for (int i = 1; i <=1000 ; i++) {

            File file1=new File(pathFile+"/pdfFile"+i+".pdf");
            try {
                file1.createNewFile();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        long endTime=System.nanoTime();
        System.out.println("ThreadTime1="+(endTime-startTime));

    }
}
