package com.zy09;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/*获取并输出当前目录下的所有文件和目录的名字*/
public class Test04 {
    public static void main(String[] args) throws IOException {
        File file = new File("G:/1+X");
        File[] files = file.listFiles();
        for (File file1 : files) {
            System.out.println("所有的文件 = " + file1);
        }
        System.out.println("目录名字 = " + files);
    }
    }

