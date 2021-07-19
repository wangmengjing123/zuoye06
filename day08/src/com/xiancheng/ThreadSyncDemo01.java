package com.xiancheng;
//多个线程同时操作一个资源诞生的 安全问题
//eg:多个账户抢票.
//锁的机制 可以解决 多线程安全问题
//解决手段 将原本的多个线程 各干各的变成按顺序执行
//未加锁之前 线程是异步的 给方法加上 synchronized就变成同步
//将 有序的同步进行 就会 解决安全问题 但是缺点因为有序需要等待 方法内的程序走完
//才进行下一个线程 所以效率上会慢点

//synchronized锁  锁在不同位置起到不同效果

public class ThreadSyncDemo01 {
    public static void main(String[] args) {
        Tickets tickets = new Tickets();
        Thread t1 = new Thread(){
            @Override
            public void run(){
                //模拟 红牛1 取票
                while (true){
                    int ticket = tickets.getTicket();
                    //Thread.yield();//线程让一让
                    System.out.println(getName()+"线程拿去了"+ticket);
                }
            }
        };
        Thread t2 = new Thread(){
            @Override
            public void run(){
                //模拟 红牛2取票
                while (true){
                    int ticket = tickets.getTicket();
                    //Thread.yield();//线程让一让
                    System.out.println(getName()+"线程拿去了"+ticket);
                }
            }
        };
        t1.start();t2.start();
    }
}
class Tickets{
    private  int ticket=20;
    public int getTicket(){
        if (ticket<=0){
            System.out.println("没票了");
            throw  new RuntimeException("票没了，亲");
        }
        Thread.yield();//线程的让一让
        return ticket--;
    }
}
