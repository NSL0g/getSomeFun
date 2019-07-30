package com.thread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class threadTest {
    public static void main(String[] args) {

        ExecutorService executor = Executors.newSingleThreadExecutor();
        MyRunAble mr = new MyRunAble();
        executor.execute(mr);
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(10);
        for (int i = 0;i<20;i++){
            MyRunAble mrs = new MyRunAble();
            fixedThreadPool.execute(mrs);
        }
        fixedThreadPool.shutdown();
    }
}

class MyRunAble implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
