package com.jeiker.t18;

/**
 * 线程优先级的继承特性
 */
public class Run18 {
    public static void main(String[] args) {
        System.out.println("main线程的优先级是：" + Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(6);
        System.out.println("main线程结束，优先级是" + Thread.currentThread().getPriority());
        Thread18a thread18a = new Thread18a();
        thread18a.start();
    }
}
