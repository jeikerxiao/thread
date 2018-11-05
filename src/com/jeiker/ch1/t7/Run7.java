package com.jeiker.ch1.t7;


/**
 * isAlive() 是判断当前线程是否处于活动状态。
 */
public class Run7 {
    public static void main(String[] args) throws InterruptedException {
        Thread7 thread7 = new Thread7();
        System.out.println("begin ==" + thread7.isAlive());
        thread7.start();
        Thread.sleep(1000);
        System.out.println("end ==" + thread7.isAlive());

        Thread runThread = Thread.currentThread();
        System.out.println(runThread.getName() + " " + runThread.getId());
        System.out.println("当前线程id: " + Thread.currentThread().getId());
    }
}
