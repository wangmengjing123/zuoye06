package com.zy08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//        创建一个List集合，并添加元素0-9
//        * 将集合转换为一个Integer数组并输出数组每一个元素
public class Test05 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println("list = " + list);
        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(5);
        intList.add(6);
        intList.add(7);
        intList.add(8);
        intList.add(9);
        Integer[] b = new Integer[intList.size()];
        b=(Integer[]) intList.toArray(b);
        System.out.println(Arrays.toString(b));
        Integer[] c = (Integer[])intList.toArray();
        System.out.println(Arrays.toString(c));

        System.out.println(c.getClass());
        System.out.println(b.getClass());

    }
}
