package com.jeiker.t6;

/**
 * 构造方法的打印：main
 * run方法的打印：Thread-0
 */
public class Run6 {
    public static void main(String[] args) {
        Thread6 thread6 = new Thread6();
        thread6.start();
//        thread6.run();
    }
}
