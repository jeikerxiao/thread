package com.jeiker.ch1.t5;

public class Run5 {
    public static void main(String[] args) {
        Thread5 thread5 = new Thread5();
        Thread a = new Thread(thread5, "A");
        Thread b = new Thread(thread5, "B");
        Thread c = new Thread(thread5, "C");
        Thread d = new Thread(thread5, "D");
        Thread e = new Thread(thread5, "E");

        a.start();
        b.start();
        c.start();
        d.start();
        e.start();
    }
}
