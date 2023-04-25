package Thread;

public class demo6 {
    //1.单个线程,串行的,完成20亿自增
    //2.单个线程,并行的,完成20亿自增
    private static  final  long COUNT = 20_0000_0000;
 private static void serial(){
     long beg =System.currentTimeMillis();
     int a= 0;
     for (long i = 0; i <COUNT ; i++) {
         a++;
     }
     a = 0;
     for (long i = 0; i <COUNT ; i++) {
         a++;
     }
     long end=System.currentTimeMillis();
     System.out.println(end-beg);
 }
 private static  void  concurrency(){
     long beg =System.currentTimeMillis();
     Thread t1 =new Thread(()->{
        int a =0;
         for (int i = 0; i < COUNT; i++) {
            a++;
         }
     });
     Thread t2 =new Thread(()->{
         int a =0;
         for (int i = 0; i < COUNT; i++) {
             a++;
         }
     });

     t1.start();
     t2.start();
     try{
         t1.join();
         t2.join();
     } catch (InterruptedException e) {
         e.printStackTrace();
     }
     long end=System.currentTimeMillis();
     System.out.println(end - beg);
 }

    public static void main(String[] args) {
        serial();
        concurrency();
    }
}
