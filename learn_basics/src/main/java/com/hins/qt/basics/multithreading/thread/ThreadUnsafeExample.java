package com.hins.qt.basics.multithreading.thread;

/**
 * @author PanHao
 * @date 2022/6/14 14:47
 */
public class ThreadUnsafeExample {

    private int cnt = 0;

    public void add() {
        cnt++;
    }

    public int get() {
        return cnt;
    }
}
