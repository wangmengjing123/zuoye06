package com.jihe;
//泛型必须要加 因为要做对比
public class Person implements  Comparable<Person>{
    private  String name;
    private int hight;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHight() {
        return hight;
    }

    public void setHight(int hight) {
        this.hight = hight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", hight=" + hight +
                ", age=" + age +
                '}';
    }
//实现接口是 比较接口 一个一个比较
    @Override
    public int compareTo(Person o) {
        //目前按身高排序
        //如果return返回值大于0 自身大于就比较对象
        int x = this.getHight()-o.getHight();
        return x;
    }
}
