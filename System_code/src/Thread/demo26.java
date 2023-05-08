package Thread;

public class demo26 {
    private  synchronized static  void  func(){
        //进行一些多线程操作
        //第一次加锁
        synchronized (demo26.class){
            //第二次加锁
            synchronized (demo26.class){

            }
        }

    }

    public static void main(String[] args) {
        func();
    }
}
