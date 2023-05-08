package Thread;

import java.util.concurrent.locks.ReentrantLock;

public class demo29 {
    public static void main(String[] args) {
        ReentrantLock locker =new ReentrantLock();
        try{
            //加锁
            locker.lock();
            //代码逻辑    如果中间抛出异常了,就可能执行不到unlock
        }finally{
            locker.unlock();
        }
    }
}
