package com.xiancheng;
//线程创建的的三种
public class ThreadDemo03 {
    public static void main(String[] args) {
        new Thread(){
            @Override
            public void  run() {
                for (int i = 0; i < 10000; i++) {
                    System.out.println("洗菜 = " + i);
                }
            }
        }.start();
        new Thread(){
            @Override
            public void  run(){
                for (int i = 0; i < 10000; i++) {
                    System.out.println("烧水 = " + i);
                }
            }
        }.start();

    }
}
