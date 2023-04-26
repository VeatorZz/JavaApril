package Thread;

public class demo11 {
    private static  Thread t1 =null;
    private static  Thread t2 =null;

    public static void main(String[] args) throws InterruptedException {
        t1= new Thread(()->{
            System.out.println("t1 begin");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("t1 end");
        });
        t1.start();

        t2= new Thread(()->{
            System.out.println("t2 begin");
            try {
                t1.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("t2 end");
        });
        t2.start();

        t2.join();
    }
}
