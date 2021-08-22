package Volatile;

public class MyThread2 implements Runnable{
    @Override
    public void run() {
        MainSinchron myArrayList=new MainSinchron();
        for (int i = 20; i < 40; i++) {
         //   myArrayList.list.add(i);
        /*    System.out.println("MyThread2");
            System.out.println(myArrayList.list);*/
            System.out.print(i + " ");
        }
    }
}
