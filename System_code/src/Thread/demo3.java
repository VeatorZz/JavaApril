package Thread;

public class demo3 {
    public static void main(String[] args) {
        Thread thread= new Thread();
        Thread t =new Thread(){
            @Override
            public void run() {
                while(true){
                    System.out.println("hello thread");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

        };
        t.start();
    }
}
