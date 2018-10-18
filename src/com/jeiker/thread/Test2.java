package com.jeiker.thread;

/**
 * 线程执行具有随机性，CPU执行哪个线程具有不确定性。
 */
public class Test2 {

    public static void main(String[] args) {
        try {
            Thread2 thread = new Thread2();
            thread.setName("thread1");
            thread.start();
            for (int i = 0; i < 10; i++) {
                int time = (int) (Math.random() * 1000);
                Thread.sleep(time);
                System.out.println("main=" + Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
