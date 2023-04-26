package Thread;

public class demo13 {
    public static void main(String[] args) throws InterruptedException {
        Thread t =new Thread(()->{
               System.out.println("hello");
               try{
                   Thread.sleep(1000);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }

        });
        //在start之前获取,获取到的是线程还未创建的状态
        System.out.println(t.getState());
        t.start();
        Thread.sleep(500  );
        System.out.println(t.getState());
        t.join();
        //在join之后获取,获取到的线程已经结束后的状态
        System.out.println(t.getState());
    }
}
