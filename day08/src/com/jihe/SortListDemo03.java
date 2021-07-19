package com.jihe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//SortList排序集合 对集合进行自然排序（从小到大）
//只能对List排序 不能随set排序 因为set是无序的
public class SortListDemo03 {
    public static void main(String[] args) {
        //创建list集合 进行从小到大排序
        List<Integer> list = new ArrayList<>();
        list.add(50);
        list.add(30);
        list.add(60);
        list.add(20);
        list.add(40);
        System.out.println("list = " + list);
        Collections.sort(list);///排序
        System.out.println("list = " + list);
        //纯字符串排序
        List<String> list1 = new ArrayList<>();
        list1.add("张三");
        list1.add("李四");
        list1.add("王五");
        list1.add("赵六");
        list1.add("貂蝉");
        System.out.println("list1 = " + list1);
        Collections.sort(list1);//根据字符编码排序
        System.out.println("list1 = " + list1);
        //对象的排序（应用广）
        Person p1 = new Person();
        p1.setName("貂蝉");
        p1.setHight(160);
        p1.setAge(16);
        Person p2 = new Person();
        p2.setAge(19);
        p2.setHight(140);
        p2.setName("小乔");
        Person p3 = new Person();
        p3.setAge(30);
        p3.setHight(180);
        p3.setName("曹操");
        Person p4 = new Person();
        p4.setAge(19);
        p4.setHight(150);
        p4.setName("大乔");
        Person p5 = new Person();
        p5.setAge(19);
        p5.setHight(170);
        p5.setName("甄姬");

        List<Person> personList = new ArrayList<Person>();//创建集合
        personList.add(p1);
        personList.add(p2);
        personList.add(p3);
        personList.add(p4);
        personList.add(p5);
        System.out.println("personList = " + personList);
        //按身高排序
        Collections.sort(personList);//排序
        System.out.println("personList = " + personList);
        //按年龄从大到小排序
        Collections.reverse(personList);//反转
        System.out.println("personList = " + personList);

     }


}
