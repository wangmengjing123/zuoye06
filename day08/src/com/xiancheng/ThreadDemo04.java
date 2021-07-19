package com.xiancheng;
//互斥锁
//
public class ThreadDemo04 {
    public static void main(String[] args) {
        Shop2 shop = new Shop2();
        Thread t1 = new Thread(){
            @Override
            public void  run(){
                try {
                    shop.buy();//买衣服
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread t2 = new Thread(){
            @Override
            public void  run() {
                try {
                    shop.buy2();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        t1.start();t2.start();
    }
}

class Shop2 {//方法

    //如果不加上synchronized锁 完了 火了
    public void buy() throws InterruptedException {
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName() + "正在选衣服");
        Thread.sleep(5000);//5秒
        synchronized (this) {
            //使用 synchronized锁  锁在关键位置
            System.out.println(thread.getName() + "进入试衣间试衣服");
            Thread.sleep(5000);
            System.out.println(thread.getName() + "试完衣服出来了");
        }

    }

    //买冰激凌 优衣库对面
    public synchronized  void buy2() throws InterruptedException {
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName() + "买冰激凌");

    }
}