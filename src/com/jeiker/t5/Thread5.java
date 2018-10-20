package com.jeiker.t5;

public class Thread5 extends Thread {

    private int count = 5;

    /*
    @Override
    public void run() {
        super.run();
        count--;
        System.out.println("由" + this.currentThread().getName() + "计算，count=" + count);
    }
    */

    /**
     * 在run方法前加入synchronized关键字，使多个线程在执行run方法时，以排队的方式进行处理。
     * 当一个线程调用run方法时，会先判断run方法有没有被上锁，
     * 如果上锁，说明有其他线程正在调用run方法。
     */
    @Override
    synchronized public void run() {
        super.run();
        count--;
        System.out.println("由" + this.currentThread().getName() + "计算，count=" + count);
    }
}

