package day06;

public class Test03 {
    public static void main(String[] args) {
        String a="上海自来水来自海上";
        StringBuilder sb=new StringBuilder(a);
        String a1=sb.reverse().toString();
        if (a.equals(a1)) {
            System.out.println("是回文");
        }else{
            System.out.println("不是回文");
        }
    }
}
