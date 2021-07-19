package com.zy10;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.List;

//遍历 你D盘 的 其中一个文件夹 , 并查找出 文件中带有 java 的 文件.
public class Test01 {
    public static void main(String[] args) {
        File file = new File("D:\\ww");
        getFile(file);

    }
    private static void  getFile(File dir){
        File[] files = dir.listFiles();//创建文件的数组
        if (files!=null){//数组不为空
            for (File file : files) {
                if (file.isDirectory()){//如果文件是目录
                    getFile(file);//递归 继续遍历文件
                }else{
                    //判断是否是.class文件结尾
                    if (file.getName().endsWith(".java")){
                        System.out.println(file.getAbsolutePath());//获取文件绝对路径
                    }
                }
            }
        }

    }
}


