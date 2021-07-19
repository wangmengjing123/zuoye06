package com.jihe;

//集合 重点 集合有一个接口 collection
//接口可以继承接口
//size() 尺寸 放很多东西eg:list.add(persion) list.add(678)  l
// ength() 长度 指的是没有泛型的类
//contains 是否包含
//object[] toArray() 集合转数组


import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection c1 = new ArrayList();
        //ArrayList c1 = new ArrayList();
        //add  添加
        c1.add("唐僧");
        c1.add("孙悟空");
        c1.add("猪八戒");
        c1.add("沙和尚");
        c1.add("白龙马");
        System.out.println("c1 = " + c1);
        //尺寸
        int size = c1.size();
        System.out.println("size = " + size);
        //是否为空
        boolean empty = c1.isEmpty();
        System.out.println("empty = " + empty);
        //清空
        //c1.clear();
        System.out.println("c1 = " + c1);
        boolean empty1 = c1.isEmpty();
        System.out.println("empty1 = " + empty1);

        //集合的遍历 3种
        //第1
        for (int i = 0; i <c1.size() ; i++) {
            System.out.println("c1 = " + ((ArrayList) c1).get(i));
        }
        //为什么collection 不能使用for循环呢
        //set集合 无序的 不能重复 没有索引 应用场景：身份账号 电话号 车牌号
        //list 有序 能重复 应用场景 很多
        //map k v 永远唯一
        //for循环根据索引来取 因为set集合没有索引下标
        for(Object o : c1){
            System.out.println("o = " + o);
        }
        //迭代器 和 for循环 区别
        //迭代器工作 有游标 问下一个 有没有下一个元素 如果有就拿出 没有则退出
        //for循环 把集合从0 -- N 排序，从0开取，拿下标，解释了为什么学for循环 再学迭代器
        //第2
        //第3

        

    }
}
