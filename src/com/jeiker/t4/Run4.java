package com.jeiker.t4;

/**
 * 变量是不共享的，都是独立的变量
 */
public class Run4 {
    public static void main(String[] args) {
        Thread4 a = new Thread4("A");
        Thread4 b = new Thread4("B");
        Thread4 c = new Thread4("C");
        Thread4 d = new Thread4("D");

        a.start();
        b.start();
        c.start();
        d.start();
    }
}
