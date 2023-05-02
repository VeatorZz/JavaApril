package Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class demo24 {
    public static void main(String[] args) {
         ExecutorService threadpool=Executors.newFixedThreadPool(10);
        // Executors.newFixedThreadPool();//线程动态增加的线程池
        for (int i = 0; i < 100; i++) {
            threadpool.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("hello");
                }
            });
        }

    }
}
