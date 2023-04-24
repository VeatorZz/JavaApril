package Thread;
class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("hello");
    }
}

public class demo1 {
    public static void main(String[] args) {
        //创建一个线程
        //java中创建线程,离不开一个关键的类,Thread
        //一种比较朴素的创建线程的方式,是写一个子类,继承Thread,重写其中的run方法
      Thread t =new MyThread();//向上转型
      t.start();
        System.out.println("hello main!");
    }
}
