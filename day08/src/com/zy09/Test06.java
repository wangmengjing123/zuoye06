package com.zy09;

import java.io.File;
//获取并输出当前目录下所有文件的名字
public class Test06 {
    public static void main(String[] args) {
        File dir = new File("./");
        printDir(dir);

    }
    public static void printDir(File dir) {
        File[] files = dir.listFiles();//获取目录/子文件
        //循环
        for (File file : files) {
            //判断 如果是文件则输出文件路径
            System.out.println("文件名"+file.getAbsolutePath());
        }
    }
}

/*

    File file = new File("D:" + File.separator + "IDEA 2019.3.3");          //实例化文件类对象
    printFile(file);                                //调用递归方法，输出此文件对象内的所有文件
}

//定义递归方法，输出file对象内的所有文件
public static void printFile(File file) {
        if(file != null){                       //若file对象不为null
        if(!file.isDirectory()){                    //若此file对象不为目录
        System.out.println(file);               //直接输出此文件的完整目录
        }else {                             //若此file对象为目录
        File[] files = file.listFiles();        //获取此目录下的所有文件
        if(files != null){                          //避免有些系统目录不能列出，导致程序出现异常
        for(File file1: files){                 //循环遍历所有文件
        printFile(file1);                   //递归调用printFile()方法，继续输出所有文件
        }
        }
        }
        }

*/
