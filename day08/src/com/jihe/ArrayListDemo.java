package com.jihe;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

//List 继承 Collection
//通过list讲 JDK8的快速去集合中的属性
public class ArrayListDemo {
    public static void main(String[] args) {
        Person diaochan = new Person();
        diaochan.setAge(18);
        diaochan.setHight(167);
        diaochan.setName("貂蝉");

        Person xiaoqiao = new Person();
        xiaoqiao.setAge(19);
        xiaoqiao.setHight(140);
        xiaoqiao.setName("小乔");

        Person sunshangxiang = new Person();
        sunshangxiang.setAge(22);
        sunshangxiang.setHight(170);
        sunshangxiang.setName("孙尚香");


        //有一个曹操 需要有一个string集合 集合的值是提取与上面3000个list中的值 存名字
        List<Person> list = new ArrayList();
        list.add(diaochan);
        list.add(xiaoqiao);
        list.add(sunshangxiang);
        System.out.println("list = " + list);
        //便利list集合 遍历后拿出对象的名字 赋值给新的集合中
        /*List<String> names = new ArrayList<>();
        for (Person s : list) {
            String name = s.getName();
            names.add(name);
        }
        System.out.println("names = " + names);*/

        //新的 JDB8 Stream()
        List<String> nameLists = list.stream().map(Person::getName).collect(Collectors.toList());
        System.out.println("nameLists = " + nameLists);





    }
}
