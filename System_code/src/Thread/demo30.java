package Thread;

import java.util.concurrent.Semaphore;

public class demo30 {
    public static void main(String[] args) throws InterruptedException {
        //构造方法传入的有效资源的个数
        Semaphore semaphore =new Semaphore(3);
        //p操作 申请资源
        semaphore.acquire();
        System.out.println("申请资源");
        semaphore.acquire();
        System.out.println("申请资源");
        semaphore.acquire();
        System.out.println("申请资源");
        semaphore.acquire();
        System.out.println("申请资源");
        //v操作,释放资源
        semaphore.release();
    }
}
