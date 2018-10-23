package com.jeiker.t15;

public class Run15 {
    public static void main(String[] args) throws InterruptedException {
        final MyObject myObject = new MyObject();
        Thread thread1 = new Thread(() -> myObject.setValue("a", "aa"));
        thread1.setName("a");
        thread1.start();
        Thread.sleep(500);
        Thread thread2 = new Thread(() -> myObject.printUsernamePassword());
        thread2.start();
    }
}