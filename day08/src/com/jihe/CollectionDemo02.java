package com.jihe;

import java.util.ArrayList;
import java.util.Collection;

//集合存的是对象的什么：存的是对象的引用 当对象通过外力改变了，那么 集合中的内容也会变

public class CollectionDemo02 {
    public static void main(String[] args) {
        Person fansisi = new Person();
        fansisi.setName("范思思");
        fansisi.setAge(16);
        fansisi.setHight(156);
        ArrayList c = new ArrayList();
            c.add(fansisi);
       for(Object o : c){
           System.out.println("o = " + o);
       }
        fansisi.setHight(400);
       fansisi.setAge(30);
       fansisi.setName("贾玲");
       for (Object o : c){
           System.out.println("o = " + o);
       }
    }
}
