package com.jeiker.t15;

public class MyObject {
    private String username = "1";
    private String password = "11";

    public void setValue(String username, String password) {
        this.username = username;
        if (Thread.currentThread().getName().equals("a")) {
            System.out.println("停止a线程");
            Thread.currentThread().suspend();
        }
        this.password = password;
    }

    public void printUsernamePassword() {
        System.out.println(username + " " + password);
    }
}
