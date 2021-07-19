package com.com.IO;

import java.io.File;

//file其他
public class IODemo02 {
    public static void main(String[] args) {
        //创建文件夹 所有IO底层都不是 Java操作的，而是Java调用 所在系统的底层的操作
       /* File file = new File("io");//创建一个文件
        if(!file.exists()){
            file.mkdir();//不加s创建一层 加s创建多层
        }else{
            System.out.println("文件已存在");
        }*/
        //创建多级文件夹
        File file1 = new File("aa1/aa2/aa3/aa4");
        if(!file1.exists()){
            file1.mkdirs();//不加s创建一层 加s创建多层
        }else{
            System.out.println("文件已存在");
        }
        }
    }


