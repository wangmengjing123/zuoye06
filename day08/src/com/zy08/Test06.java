package com.zy08;

import java.util.*;

/*创建一个字符串数组:{"one","two","three"}
        * 然后将该数组转换为一个List集合*/
public class Test06 {
    public static void main(String[] args) {
        String[] a = {"one", "two", "three"};
        List<String> list = Arrays.asList(a);
        System.out.println(list);
        List<String> list2 = new ArrayList<String>(list);
        System.out.println("list2 = " + list2);


    }
}
