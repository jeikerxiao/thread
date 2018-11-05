package com.jeiker.ch1.t7;

public class Thread7 extends Thread {
    @Override
    public void run() {
        System.out.println("run= " + this.isAlive());
    }
}
