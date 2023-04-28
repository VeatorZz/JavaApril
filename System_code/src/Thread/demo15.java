package Thread;

public class demo15 {
    public static Object Locker1 =new Object();
    public static Object Locker2 =new Object();

    public static void main(String[] args) {
        Thread t1 =new Thread(()->{
         synchronized (demo15.class) {
             System.out.println("t1 start");
             try {
                 Thread.sleep(1000);
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
             System.out.println("t1 finish");
         }
        });
        t1.start();

        Thread t2 =new Thread(() -> {
           synchronized (demo15.class ){
               System.out.println("t2 start");
               try{
                   Thread.sleep(500);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
               System.out.println("t2 finish");
           }
        });
        t2.start();
    }
}
