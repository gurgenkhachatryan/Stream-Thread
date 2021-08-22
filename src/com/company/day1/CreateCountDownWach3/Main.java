package com.company.day1.CreateCountDownWach3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("input minut:");
        int minute= scanner.nextInt();
        System.out.print("input second");
        int second= scanner.nextInt();


        for(int i=minute;i>=0;i--)
        {
            for(int j=second;j>=0;j--)
            {
                System.out.println(i+":"+j);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            second=59;
        }


    }
}
