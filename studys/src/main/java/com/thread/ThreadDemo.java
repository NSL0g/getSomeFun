package com.thread;

public class ThreadDemo {
    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName()+"main");

        MyThread myThread  = new MyThread("fuck");
        myThread.start();

    }
}
