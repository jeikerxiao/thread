package com.jeiker.ch1.t11;

/**
 * 调用interrupt方法并没有停止线程。
 */
public class Run11 {
    public static void main(String[] args) {
        try {
            Thread11 thread11 = new Thread11();
            thread11.start();
            Thread.sleep(2000);
            thread11.interrupt();
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
    }
}
