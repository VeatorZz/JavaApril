package Thread;
//自己模拟实现一个阻塞队列
//基于数组的方式来实现队列
//提供两个核心方法
//1.put入队列
//2.take队列
class MyBlockingQueue{

    //假设我们最大是一千个元素
    private int[] items =new int[1000];
    //队首的位置
    private  int head =0;
    //队尾的位置
    private  int tail =0;
    //队列的元素个数
    volatile private int size =0;
    //入队列
    public void put(int value) throws InterruptedException {
        synchronized (this){
            if(size==items.length){
                //队列已满,无法插入
                this.wait();
                return;
            }
            items[tail] = value;
            //如果tail达到数组末尾,就需要从头开始
            if(tail== items.length){
                tail =0;
            }
            tail++;
            size++;
            this.notify();
        }


    }
    public Integer take() throws InterruptedException {
        int ret =0;
        synchronized (this){
            if (size == 0) {
                //队列为空,无法出队列
                this.wait();
                return null;
            }
            ret =items[head];
            head++;
            if(head == items.length){
                head =0;
            }
            size--;
            this.notify();

        }
        return ret;
    }
}
public class demo21 {
    public static void main(String[] args) {
        MyBlockingQueue queue =new MyBlockingQueue();
        Thread customer =new Thread(()->{
           while(true){
               try {
                   int value =queue.take();
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
           }
        });
        customer.start();
        Thread producer =new Thread(()->{
           int value = 0;
           while(true){
               try {
                   queue.put(value);
                   System.out.println("生产"+value);
                   value++;
                   Thread.sleep(500);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }

           }
        });
        producer.start();
    }

}
