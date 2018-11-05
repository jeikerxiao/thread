package com.jeiker.ch1.t13;

public class Thread13 extends Thread {
    @Override
    public void run() {
        super.run();
        try {
            for (int i = 0; i < 500000; i++) {
                if (this.isInterrupted()) {
                    System.out.println("已经是停止状态了！我要退出了！ ");

                    throw new InterruptedException();

//                break;
                }
                System.out.println("i=" + (i + 1));
            }
            System.out.println("我被输出，如果此代码是for又继续运行，线程并未停止！");
        } catch (InterruptedException e) {
            System.out.println("进入Thread.java 类run方法中的catch了！");
            e.printStackTrace();
        }
    }
}
