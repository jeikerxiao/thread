package com.jeiker.t17;

/**
 * yield() 方法的作用是放弃当前CPU资源，让它给其他的任务云占用CPU的执行时间。
 * 但放弃的时间不确定，有可能刚刚放弃，马上又获得CPU的时间片。
 */
public class Thread17 extends Thread {
    @Override
    public void run() {

        long beginTime = System.currentTimeMillis();
        int count = 0;
        for (int i = 0; i < 50000000; i++) {
            Thread.yield();
            count = count + (i + 1);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("用时：" + (endTime - beginTime) + "毫秒！");
    }
}
