package com.company.day1.EnumNanoMili2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
      //  Timer timer;

       // Runnable runnable = new Runnable() {
         Thread thread=new Thread(new Runnable() {
             @Override
             public void run() {
                 int i = 0;
                if (Timer.SECONDS.equals(str)) {
//if(num==1)
                    while (i!=10000) {
                        try {
                            Thread.sleep(1000);
                            i++;
                            System.out.println(i);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                } else
                    if(Timer.MiLIS.equals(str))
         //    if(num==2){
                    {

                    //    int i = 0;
                        while (i!=10000) {
                            try {
                                Thread.sleep(1);
                                i++;
                                System.out.println(i);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                    else if(Timer.NANOS.equals(str))
                    { //int i = 0;
                        while (i!=10000) {
                            try {
                                Thread.sleep(0,1000);
                                i++;
                                System.out.println(i);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }

                    }
                    else
                        System.out.println("invalid number");

            }
        });

        thread.start();
    }
}