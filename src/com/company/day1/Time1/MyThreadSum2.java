package com.company.day1.Time1;

public class MyThreadSum2 implements Runnable {

    private long sum2;

    @Override
    public void run() {

        long threadFirstTime = System.nanoTime();
        for (int i = 500_000_000; i < 1_000_000_000; i++) {
            sum2 += i;
        }
    }



    public long getSum2() {
        return sum2;
    }
}
