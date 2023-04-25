package Thread;

public class demo7 {
    public static void main(String[] args) {
        Thread thread =new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    System.out.println("hello");
                    try {
                        Thread.sleep(10000);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        },"我的线程");
        thread.start();
    }
}
