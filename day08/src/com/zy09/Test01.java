package com.zy09;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/*通过File输出当前项目目录下的文件"myfile.txt"的名字，大
小，最后修改时间。
        * 最后修改时间格式如:2016-03-23 14:22:16*/
public class Test01 {
    public static void main(String[] args) {
        File file= new File("C:\\桌面\\myfile.txt");
        String  name = file.getName();//打印出文件名字
        System.out.println("项目目录下的文件名为"+name);

        long ll = file.length();//打印出文件大小
        System.out.println("项目目录下文件大小为 " + ll);
        //修改时间 格式 yyyy-MM-dd HH:mm:ss
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar calendar = Calendar.getInstance();
        long ll2 = file.lastModified();
        calendar.setTimeInMillis(ll2);
        System.out.println(simpleDateFormat.format(calendar.getTime()));



    }
}
