package com.xiancheng;
//第二种线程继承方式
public class ThreadDemo02 {
    public static void main(String[] args) {
        Runnable xicai = new XiCai();
        Runnable shaoshui = new ShaoShui();

        Thread xicaiTread = new Thread(xicai);
        Thread shaoshuiTread = new Thread(shaoshui);

        xicaiTread.start();
        shaoshuiTread.start();
    }
}
class xicai implements Runnable{
    @Override
    public void run(){
        for (int i = 0; i < 10000; i++) {
            System.out.println("洗菜 = " + i);
        }
    }
}
class ShaoShui implements  Runnable{
    @Override
    public void run(){
        for (int i = 0; i < 10000; i++) {
            System.out.println("烧水 = " + i);
        }
    }
}


