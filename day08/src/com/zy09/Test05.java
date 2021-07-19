package com.zy09;

import java.io.File;
import java.util.Scanner;

/**
 * 要求用户输入一个文件或目录名，并删除当前目录下的该文件或目录。
 * 可自行手动先在当前项目目录中创建一个要删除的文件或目录，若是目录，还可以
 * 在该目录中继续创建若干级目录和文件。
 *
 */
public class Test05 {
    public static void main(String[] args) {
        //要求用户输入一个文件或目录名
        System.out.println("输入一个文件或目录名:");
        //可自行手动先在当前项目目录中创建一个要删除的文件或目录，
        // 若是目录，还可以在该目录中继续创建若干级目录和文件
        String ss = new Scanner(System.in).nextLine();
        File file = new File(ss);
        boolean boo = file.delete();
        if (boo){
            System.out.println("恭喜，删除成功");
        }else{
            System.out.println("很遗憾，删除失败");
        }
    }
}
