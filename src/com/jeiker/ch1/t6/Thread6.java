package com.jeiker.ch1.t6;

public class Thread6 extends Thread {

    public Thread6() {
        System.out.println("构造方法的打印：" + Thread.currentThread().getName());
    }

    @Override
    public void run() {
        System.out.println("run方法的打印：" + Thread.currentThread().getName());
    }
}
