package com.xiancheng;
//线程中的阻塞
//河南电信---------3000张电话卡 ---------中国电信
public class ThreadSleep {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 30; i++) {
            Thread.sleep(2);//线程的阻塞
            System.out.println("访问中国电信" + i +"次");
        }
        //main方法就是一个线程 是一个主线程
        Thread thread = Thread.currentThread();//拿到当前线程
        String name = thread.getName();//线程名字
        System.out.println("name = " + name);
        long id = thread.getId();//现成的唯一Id
        System.out.println("id = " + id);
        boolean daemon = thread.isDaemon();//是否是守护线程
        System.out.println("daemon = " + daemon);
        int priority = thread.getPriority();//线程的优先级
        System.out.println("priority = " + priority);
        boolean alive = thread.isAlive();//线程死了没
        System.out.println("alive = " + alive);

    }
}
