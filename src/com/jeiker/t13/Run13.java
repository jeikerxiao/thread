package com.jeiker.t13;

/**
 * 异常法-停止线程
 */
public class Run13 {
    public static void main(String[] args) {
        try {
            Thread13 thread13 = new Thread13();
            thread13.start();
            Thread.sleep(2000);
            thread13.interrupt();
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end!");
    }
}
