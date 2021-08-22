package com.company.day1.Time1;

public class Main {

    public static void main(String[] args) {
    	MyThreadSum myThreadSum=new MyThreadSum();
    	MyThreadSum2 myThreadSum2=new MyThreadSum2();
	Thread thread1=new Thread(myThreadSum);
	Thread thread2=new Thread(myThreadSum2);
	long startTime=System.nanoTime();
	thread1.start();
	thread2.start();
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		long endTime=System.nanoTime();
		long time= endTime-startTime;
		System.out.println("threadTime=" + time);
	   long gum=myThreadSum.getYndSum1()+ myThreadSum2.getSum2();
		System.out.println("gum=" + gum);




    }
}
