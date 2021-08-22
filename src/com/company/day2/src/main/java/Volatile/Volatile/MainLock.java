package Volatile;

import java.util.ArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MainLock {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        Lock lock=new ReentrantLock();/////////////////////////////
        Thread thread1=new Thread(new Runnable() {

            @Override
            public void run() {
                lock.lock();
                for (int i = 0; i < 20; i++) {
                    list.add(i);

                }
                lock.unlock();
            }
        });

        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 21; i <40 ; i++) {
list.add(i);
                }
            }
        });
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(list);

    }
}
