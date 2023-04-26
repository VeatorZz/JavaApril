package Thread;
//创建两个线程,让这俩,线程同时并发的对一个变量,自增5w次,最终预期能自增100w次
class  Counter{
    //用来记数的
 public int count =0;
 void increase(){
     count++;
 }
}
public class demo14 {



    public static void main(String[] args) throws InterruptedException {
        final  Counter counter =new Counter();
        Thread t1 =new Thread(()->{
            for (int i = 0; i < 50_000; i++) {
                counter.increase();
            }
        });
        Thread t2=new Thread(()->{
            for (int i = 0; i < 50_000; i++) {
                counter.increase();
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(counter.count);
    }

}
