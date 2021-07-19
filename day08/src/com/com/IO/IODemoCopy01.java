package com.com.IO;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

//文件的拷贝
public class IODemoCopy01 {
    public static void main(String[] args) throws IOException {
        //拷贝文件
            RandomAccessFile copytarget = new RandomAccessFile("git练习.rar","r");
            RandomAccessFile secondName = new RandomAccessFile("git练习副本.rar","rw");
            int d=-1;//io里 -1 代表着读取完毕

            while (true){
                if((d=copytarget.read()) !=-1){
                    secondName.write(d);
                }

            }



    }
}
