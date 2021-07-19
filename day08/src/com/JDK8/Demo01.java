package com.JDK8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Demo01 {
    public static void main(String[] args) {
      List<Integer> numbers = new ArrayList<>();
      numbers.forEach((Integer integer) -> {
          System.out.println(integer);
      });
    }
}
