package com.xiancheng;

public class TestHowManyTheak {
    public static int i=0;
    public static void main(String[] args) {

        while (true){

            new Thread(){
                @Override
                public void  run(){
                    for (int i = 0; i < 10000; i++) {
                       // System.out.println("洗菜 = " + i);
                    }
                    System.out.println("线程数量是++ = " + i++);
                }
            }.start();

        }
    }
}
