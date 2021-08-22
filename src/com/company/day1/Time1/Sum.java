package com.company.day1.Time1;

public class Sum {
    public static void main(String[] args) {
        long sum=0;
        long firstTime=System.nanoTime();
        for (int i = 0; i < 1_000_000_000; i++) {
            sum+=i;
        }
        long endTime=System.nanoTime();
        System.out.println("first=" + firstTime);
        System.out.println("end=" + endTime);
        System.out.println("end-first=" + (endTime-firstTime));
    }
}
