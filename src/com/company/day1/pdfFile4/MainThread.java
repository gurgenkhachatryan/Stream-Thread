package com.company.day1.pdfFile4;

public class MainThread {
    public static void main(String[] args) {
        Thread1 thread1=new Thread1();
        Thread2 thread2=new Thread2();
        long threadStartTime=System.nanoTime();
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long threadEndTime=System.nanoTime();
        System.out.println("ThreadTime2=" + (threadEndTime-threadStartTime));
    }
}
