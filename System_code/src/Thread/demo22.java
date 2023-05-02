package Thread;

import java.util.Timer;
import java.util.TimerTask;

public class demo22 {
    public static void main(String[] args) {
        Timer timer =new Timer();
        //schedule 这个方法的效果是"安排一个任务"
        //不是立刻执行,而是3000ms之后再执行
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("这是一个要执行的任务");
            }
        },3000);
    }
}
