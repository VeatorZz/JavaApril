package Thread;
//控制main先运行t1,t1执行完再执行t2
public class demo12 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 =new Thread(()->{
            System.out.println("t1 begin");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("t1 end");
        });
        t1.start();
        t1.join();
        
        Thread t2 =new Thread(()->{
            System.out.println("t2 begin");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("t2 end");
        });

        t2.start();
        t2.join();
        System.out.println("main end");
    }


}
