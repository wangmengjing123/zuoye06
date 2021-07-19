package com.JDK8;

import java.util.ArrayList;
import java.util.List;

public class Demo02 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("jack");
        stringList.add("tom");
        stringList.add("peter");
        stringList.add("linda");
        stringList.forEach(s -> {
            System.out.println(s);
        });
    }
}
