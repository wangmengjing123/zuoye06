package com.com.IO;

import java.io.File;
import java.io.IOException;

//File文件
//File文件你真行 可读可写可执行
public class IODemo01 {
    public static void main(String[] args) throws IOException {
        //配置路径
        File file = new File("./io10.txt");//配置路径
        System.out.println("file = " + file);
        //输出文件名称
        String name = file.getName();
        System.out.println("name = " + name);
        //输出文件长度
        long length = file.length();
        System.out.println("length = " + length);
        /*try {
            //创建新文件
            boolean newfile = file.createNewFile();//创建一个新文件
            System.out.println("newfile = " + newfile);
        } catch (IOException e) {
            System.out.println("不能创建新文件");
            e.printStackTrace();
        }*/
        //查看文件是否存在  一定要有这个代码，不然文件会覆盖
        boolean exists = file.exists();

        if(exists){
            System.out.println("文件已存在 boolean值= " + exists);
        }else{
            System.out.println("文件不存在 boolean值= " + exists);
            boolean chuangjian = file.createNewFile();//创建文件
            System.out.println("文件创建成功 = " + chuangjian);
        }
        boolean isFuile = file.isFile();
        System.out.println("是否是文件 = " + isFuile);
        boolean  isdirectoryfile = file.isDirectory();
        System.out.println("是否是目录 = " + isdirectoryfile);
        boolean hidden = file.isHidden();
        System.out.println("是否是隐藏文件 = " + hidden);
        //文件的删除
        if(exists){
            System.out.println("文件存在，删除");
            file.delete();
        }


    }
}
