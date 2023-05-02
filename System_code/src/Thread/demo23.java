package Thread;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.PriorityQueue;
import java.util.concurrent.PriorityBlockingQueue;

import static Thread.demo18.locker;

class MyTask implements Comparable<MyTask>{
    //command要执行的任务
    private Runnable command;
    //time任务什么时候干
    private long time;

    public MyTask(Runnable command,long after){
        this.command =command;
        this.time =System.currentTimeMillis()+after;
    }
    public void run(){
        command.run();
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }
// 这里用比较器比较一下,时间小的在前面时间大的在后边
    @Override
    public int compareTo(MyTask o) {
        return (int) (this.time-o.time);
    }
}
class MyTimer{
    //使用优先级队列来保存若干个任务
    private PriorityBlockingQueue<MyTask> queue=new PriorityBlockingQueue<>();

    //command 要执行的任务
    //after多长时间之后来执行这个任务
    public void schedule(Runnable command,long after){
        MyTask myTask =new MyTask(command, after);
        queue.put(myTask);
        synchronized (locker){
            locker.notify();
        }
    }
    public MyTimer(){
        //启动一个线程
        Thread t=new Thread(()->{
           while(true){
               //循环过程中,就不断尝试队列中获取到队首的元素
               //判定对手元素时间是否就绪
               try {
                   MyTask myTask=queue.take();
                   long curTime =System.currentTimeMillis();
                   if (myTask.getTime() > curTime ){
                   //时间没到
                       queue.put(myTask);//塞回到队列中
                       synchronized (locker){
                           locker.wait(myTask.getTime()-curTime);
                       }
                   }else{
                   //时间到了
                       myTask.run();
                   }
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
           }
        });
        t.start();
    }

}
public class demo23 {
    public static void main(String[] args) {
        MyTimer myTimer=new MyTimer();
        myTimer.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("1111");
            }
        },2000);

        myTimer.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("2222");
            }
        },4000);

        myTimer.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("3333");
            }
        },6000);

    }

}
