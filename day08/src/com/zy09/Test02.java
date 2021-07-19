package com.zy09;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/*要求用户输入一个文件名并使用File在当前目录下创建出来。
        * 若该文件已经存在，则提示用户该文件已经存在。并创建该文件副本：
        * 例如:用户输入"test.txt".若该文件已存在，提示用户存在后，创建名为：test_副本1.txt 的文件
public*/
class Test02 {
    public static void main(String[] args) throws IOException {
        //输入一个文件名
        System.out.println("输入一个文件名：");
        String scanner =  new Scanner(System.in).nextLine();
        //使用File在当前目录下创建出来。
        File file = new File(scanner);
        String path = file.getPath();
        if (path.equals("test.txt")){
            //使用File在当前目录下创建出来,并创建该文件副本。
            System.out.println("文件已存在");
            boolean path1 =  file.createNewFile();
            while (path1 == true){
                file.renameTo(new File("test副本1"));
                System.out.println("创建副本1成功");
                break;
            }
        }else if(path.equals("test副本1.txt")){
            System.out.println("你输入的副本已存在");
            boolean path2 = file.createNewFile();
            while(path2 == true){
                file.renameTo(new File("test副本2"));
                System.out.println("创建副本2成功");
                break;
            }

        }

    }
}
