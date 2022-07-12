package com.hins.qt.basics.multithreading.thread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author PanHao
 * @date 2022/6/14 14:46
 */
public class TestThread01 {
    public static void main(String[] args) {
        final int threadSize = 1000;
        ThreadUnsafeExample example = new ThreadUnsafeExample();
        CountDownLatch latch = new CountDownLatch(threadSize);
//        ExecutorService executorService = Executors.newCachedThreadPool();

    }
}
