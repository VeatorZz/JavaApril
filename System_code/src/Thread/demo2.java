package Thread;
class MyRunnable implements Runnable{

    @Override
    public void run() {
        while(true){
            System.out.println("hello world");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class demo2 {
    public static void main(String[] args) {
     Runnable runnable =new MyRunnable();
     Thread t=new Thread(runnable);
     t.start();


     while(true){
         System.out.println("hello main");
     try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    }
}
