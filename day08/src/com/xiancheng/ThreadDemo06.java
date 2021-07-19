package com.xiancheng;
//线程的打断
//
public class ThreadDemo06 {
    public static void main(String[] args) {
        Thread chaoyang = new Thread(new Runnable() {
            @Override

            public void run() {
                int i = 0;
                while(true){
                    try {
                        System.out.println("吃肘子"+i);
                        i++;
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            if (e.getMessage().equals("sleep interrupted")){
                                System.out.println("阻止吃");
                                break;
                            }
                            e.printStackTrace();
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        chaoyang.start();

        //打断
        Thread yuanhuiThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                    chaoyang.interrupt();//打断超阳
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        yuanhuiThread.start();

    }
}
