package com.xiancheng;
//线程
//以前代码都是自上而下，现在想要一个分支

//创建线程的第一种方式 缺点：直接extends Thread  浪费一次继承线程机会
public class ThreadDemo01 {
    public static void main(String[] args) {
        //创建一个线程
        Thread t1 = new HotWaterThread();
        Thread t2 = new XiCai();
        //线程的两个状态 就绪态 开始态
//        t1.start();; //就绪态 eg：开始
//        t2.run(); //开始态 eg:跑
        t1.start();
        t2.start();
        //像这样的 做一会儿菜 做一会儿烧水 叫做异步
        //如果是把烧水全部做完再洗菜 叫同步 同步有顺序

    }
}
//创建烧水
//如果只单单new Thread 他只是一个线程 线程中没有方法任务 没意义
//需要自己创建一个线程 继承他的任务方法
//线程中 最有意义的就是run方法！！！！
class HotWaterThread extends  Thread{
    //重要的线程的方法
    @Override
    public void run(){
        for (int i = 0; i < 1000; i++) {
            System.out.println("烧了"+i+"瓶水");
        }
    }

}
class XiCai extends  Thread{
    //重要的线程的方法
    @Override
    public void run(){
        for (int i = 0; i < 1000; i++) {
            System.out.println("洗了"+i+"颗菜");
        }
    }
}
