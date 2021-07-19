package com.com.IO;

import java.io.File;

//io创建文件  也能创文件夹 还能查看文件
public class IOselectFileDemo01 {
    private  static long size = 0;
    public static void main(String[] args) {
        //查询当前目录的所有文件
        File file = new File(".");
        File[] files = file.listFiles();

        /*for (File file1 : files) {
            System.out.println("file1 = " + file1);
            if (file1.isDirectory()){
               File[] files1 =  file.listFiles();
            }
        }*/
        //有什么方法可以全部查看这一个方法呢
        findAll(file);
        long sizi = findAll(file);
        System.out.println("sizi = " + sizi);
        }
        public static long findAll(File file){
        File[] files  = file.listFiles();
            for (File file1 : files) {
                if(file1.isDirectory()){
                    findAll(file1);//递归
                }else{
                    System.out.println("file1 = " + file1.length());
                    size+= file1.length();
                }
            }
            return size;
        }
    }

