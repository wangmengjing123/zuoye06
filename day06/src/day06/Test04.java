package day06;

import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入一个e-mail地址");
        String a=scanner.nextLine();
        String a1 = a.substring(0, (a.indexOf("@")));
        System.out.println("a1 = " + a1);
    }
}
