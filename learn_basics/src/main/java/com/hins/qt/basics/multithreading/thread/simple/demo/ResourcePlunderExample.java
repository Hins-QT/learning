package com.hins.qt.basics.multithreading.thread.simple.demo;

/**
 * @author PanHao
 * @date 2022/7/19 11:00
 * 手动创建单线程方式 资源抢夺例子
 *
 */
public class ResourcePlunderExample {


    static int i = 0;
    public static void main(String[] args) {


       while (true){
           new Thread(new Runnable() {
               @Override
               public void run() {
                   i = 10;
                   System.out.println(i);
               }
           }).start();

           new Thread(new Runnable() {
               @Override
               public void run() {
                   int j = i;
                   System.out.println(j);
               }

           }).start();
           System.out.println("--------------------------");
           if (i==0){
               break;
           }
           i=0;
       }


    }
}
