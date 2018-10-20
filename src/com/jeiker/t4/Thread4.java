package com.jeiker.t4;

public class Thread4 extends Thread {

    private int count = 5;

    public Thread4(String name) {
        super();
        // 设置线程名称
        this.setName(name);

    }

    @Override
    public void run() {
        super.run();
        while (count > 0) {
            count--;
            System.out.println("由" + this.currentThread().getName() + "计算， count = " + count);
        }
    }
}
