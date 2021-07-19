package com.xiancheng;
//线程的打断
//讲解拆炸弹的Demo
import java.util.Random;
public class ThreadDemo05 {
    public  static  int time=4;//炸弹的倒计时
    public  static  int password = new Random().nextInt(1000);

    public  static  boolean boom = true;
    public static void main(String[] args) {
        System.out.println("炸弹的密码是:"+password);
        //1.炸弹的倒计时 如果完成倒计时就蹦蹦
            Thread boomThread = new Thread(new Runnable() {
                @Override
                public void run() {
                    //炸弹的倒计时
                    System.out.println("定时炸弹已安装炸弹");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    while (time>=0){
                        try {
                            if (time==0){

                                System.out.println("炸弹蹦蹦 匪徒胜利");
                                boom=false;
                                break;
                            }
                            time--;
                            System.out.println(time);
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            if(e.getMessage().equals("sleep interrupted")){
                                System.out.println("success ");
                                break;
                            }
                            e.printStackTrace();
                        }

                    }
                }
            });

        //2.打断线程的倒计时 如果打断就不蹦蹦
            Thread policeThread = new Thread(new Runnable() {
                @Override
                public void run() {
                    //jc负责拆炸弹 因为模拟 用打断的方式 打断boomThread就可以了
                    System.out.println("警察开始破解炸弹的密码！！！");
                    while (boom){
                        if (password == new Random().nextInt(100)){
                            boomThread.interrupt();//线程的打断
                            break;
                        }
                    }
                }
            });
        boomThread.start();
        try {
            Thread.sleep(800);
            policeThread.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
