package Thread;

import java.util.concurrent.CountDownLatch;

public class demo32 {
    public static void main(String[] args) throws InterruptedException {
        //模拟跑步比赛
        //构造方法中设定有几个选手参赛
        CountDownLatch latch =new CountDownLatch(10);
        for (int i = 0; i < 10; i++) {
            Thread thread =new Thread(()->{
               try{
                   Thread.sleep(3000);
                   System.out.println("到达终点");
                   //countdown 相当于"撞线"
                   latch.countDown();
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
            });
         thread.start();
        }
        //await等待所有的线程"撞线"
        //调用countDown次数达到初始化的时候设定的值
        //await就返回否则await就阻塞等待
        latch.await();
        System.out.println("比赛结束");
    }
}
