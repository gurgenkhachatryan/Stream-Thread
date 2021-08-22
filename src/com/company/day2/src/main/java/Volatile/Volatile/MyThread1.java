package Volatile;

public class MyThread1 implements Runnable{
    @Override
    public void run() {

        MainSinchron myArrayList=new MainSinchron();
        for (int i = 0; i < 20; i++) {
         //   myArrayList.list.add(i);
         //   System.out.println("MyThread1");
          //  System.out.println(myArrayList.list);
            System.out.print(i + " ");
        }


    }
}
