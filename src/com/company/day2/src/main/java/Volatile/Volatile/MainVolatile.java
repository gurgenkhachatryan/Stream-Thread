package Volatile;

import java.util.ArrayList;

public class MainVolatile {

   // volatile       boolean  flag=true;
    volatile int tiv=5;
    public static void main(String[] args) {
        ArrayList arrayList=new ArrayList();
      MainVolatile main2=new MainVolatile();
        Thread thread1=new Thread(()->{
          //  int i=0;
            while(true) {
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(main2.tiv* main2.tiv);
              //  i++;
                }

        });
        Thread thread2=new Thread(()->
        {
            try { Thread.sleep(5000);
                //main2.flag=false;
                main2.tiv=2;
            } catch (InterruptedException e) {
                e.printStackTrace();
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
        System.out.println(arrayList);

    }
}
