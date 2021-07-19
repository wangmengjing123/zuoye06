package com.zy09;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/*要求用户输入一个目录名并使用File在当前目录下创建出来。
        * 若该目录已经存在，则提示用户该目录已经存在。并创建副本，原则与第二题一致。*/
public class Test03 {
    public static void main(String[] args) throws IOException {
        //用户输入1个文件名
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入文件名:");
        String input = scan.nextLine().trim();
        //创建一个File文件
        File file = new File("test.txt");
        boolean flag = file.exists();
        if (!flag) {//若不存在 则创建
            file.createNewFile();
        } else {//若存在，则提示用户目录已存在
            System.out.println("用户该目录已经存在");
            int index = 0;
            while (flag) {
                index++;
                file = new File("test_副本" + index + ".txt");
                flag = file.exists();
            }
            file.createNewFile();
        }
        System.out.println("文件名:" + file.getName());
    }
    }

