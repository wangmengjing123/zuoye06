package com.xiancheng;

public class TestHowManyTheak02 {
    public static int i=0;
    public static void main(String[] args) {
        while (true){
            Thread t = new XiCaiThread1();
            t.start();
            System.out.println(i++);
        }
    }
}
class XiCaiThread1 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <10000000 ; i++) {
            try {
                Thread.sleep(9000000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
