package com.company.day1.Time1;

public class MyThreadSum implements Runnable {

    private long yndSum1;

    @Override
    public void run() {

        for (int i = 0; i < 500_000_000; i++) {
            yndSum1 += i;
        }
    }

    public long getYndSum1() {
        return yndSum1;
    }

}
