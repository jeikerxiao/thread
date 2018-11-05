package com.jeiker.ch1.t12;

public class Run12 {
    public static void main(String[] args) {
        try {
            Thread12 thread12 = new Thread12();
            thread12.start();
            Thread.sleep(1000);
            thread12.interrupt();
//            Thread.currentThread().interrupt();
            System.out.println("是否停止1？ =" + thread12.isInterrupted());
            System.out.println("是否停止2？ =" + thread12.isInterrupted());
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end!");
    }
}
