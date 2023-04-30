package Thread;


import java.util.Scanner;

//创建两个线程,一个线程调用wait,一个线程调用notify
public class demo18 {
    public  static  Object locker =new Object();
    public static void main(String[] args) {
        //用来去等待

        Thread waitTask =new Thread(()->{
            synchronized (locker){
                System.out.println("wait 开始");
                try {
                    locker.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("wait 结束");
            }
        });
        waitTask.start();

        //创造一个用来通知/唤醒的线程
        Thread notifyTask =new Thread(()->{
            //让用户来控制用户输入个内容后,在执行通知
            Scanner scanner =new Scanner(System.in);
            System.out.println("输入任意内容,开始通知");
            //next会堵塞,知道用户输入内容过后
            scanner.next();
            synchronized (locker){
                System.out.println("notify 开始");
                locker.notify();
                System.out.println("notify 结束");
            }
        });
        notifyTask.start();
    }

}
