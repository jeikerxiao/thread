package com.jeiker.ch1.t3;

/**
 * 实现Runnable接口
 */
public class Test3 {
    public static void main(String[] args) {
        Runnable runnable = new Runnable1();
        Thread thread = new Thread(runnable);
        thread.start();
        System.out.println("运行结束！");
    }
}
