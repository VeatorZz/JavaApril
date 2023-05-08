package Thread;

import java.util.concurrent.atomic.AtomicInteger;

public class demo27 {
    //public static  int count =0;
    public static AtomicInteger count =new AtomicInteger(0);

    public static void main(String[] args) throws InterruptedException {
        Thread t1=new Thread(()->{
            for (int i = 0; i < 50000; i++) {
                count.getAndIncrement();//相当于count++

            }
        });
        Thread t2 =new Thread(()->{
            for (int i = 0; i < 50000; i++) {
                count.incrementAndGet();//相当于++count
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("count="+count);
    }
}
