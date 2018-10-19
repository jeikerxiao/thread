package com.jeiker.run;

import com.jeiker.thread.Thread1;

/**
 * 结果：
 * 运行结束！
 * Thread1
 * 说明代码运行结果与代码执行顺序或调用顺序是无关的。
 */
public class Test1 {

    public static void main(String[] args) {
        Thread1 thread = new Thread1();
        thread.start();
        System.out.println("运行结束！");


    }
}
