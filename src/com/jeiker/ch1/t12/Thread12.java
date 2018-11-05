package com.jeiker.ch1.t12;

public class Thread12 extends Thread {

    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 500000; i++) {
            System.out.println("i= " + (i + 1));
        }
    }
}
