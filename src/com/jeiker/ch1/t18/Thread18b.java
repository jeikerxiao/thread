package com.jeiker.ch1.t18;

public class Thread18b extends Thread {
    @Override
    public void run() {
        System.out.println("线程B的优先级：" + this.getPriority());
    }
}
