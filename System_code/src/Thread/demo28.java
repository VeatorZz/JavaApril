package Thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class demo28 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //指定具体的任务
        Callable<Integer> callable =new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                int sum =0;
                for (int i = 0; i < 1000; i++) {
                    sum+=1;
                }
                return sum;
            }
        };
        //套上一层的目的是为了获取到后续的结果
        FutureTask<Integer> task =new FutureTask<>(callable);
        Thread t =new Thread(task);
        t.start();
        //线程t执行之前一直会阻塞等待,直到执行完了,结果算好了
        //get才能返回
        System.out.println(task.get());

    }
}
