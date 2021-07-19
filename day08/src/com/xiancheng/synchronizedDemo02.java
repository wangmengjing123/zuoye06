package com.xiancheng;
//synchronized锁
//synchronized锁 尽量锁在 范围小的位置
//越小 效率越高
//eg:优衣库：
//synchronized锁 在方法上 如果方法中有可以多个线程共同使用的 会造成 锁的浪费
//降低效率怎么办？ 锁应该锁在关键位置
public class synchronizedDemo02 {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Thread t1 = new Thread(){
            @Override
            public void  run(){
                try {
                    shop.buy();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread t2 = new Thread(){
            @Override
            public void  run(){
                try {
                    shop.buy();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        t1.start();
        t2.start();
    }
}
class Shop{//方法
    //如果不加上synchronized锁 完了 火了
    public void buy() throws InterruptedException {
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName()+"正在选衣服");
        Thread.sleep(5000);//5秒
        synchronized(this){
            //使用 synchronized锁  锁在关键位置
            System.out.println(thread.getName()+"进入试衣间试衣服");
            Thread.sleep(5000);
            System.out.println(thread.getName()+"试完衣服出来了");
        }

    }
}
