package com.jeiker.t18;

public class Thread18a extends Thread {
    @Override
    public void run() {

        System.out.println("线程A的优先级：" + this.getPriority());
        Thread18a thread18 = new Thread18a();
        thread18.start();
    }
}
