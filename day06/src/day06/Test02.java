package day06;

public class Test02 {
    public static void main(String[] args) {
        String str = "大家好！";
        StringBuilder a1 = new StringBuilder(str);
        a1.replace(4,10,"我是程序员！");
        System.out.println("a1 = " + a1);

        a1.replace(6,6,"优秀的");
        System.out.println("a1 = " + a1);

        a1.replace(6,8,"牛牛");
        System.out.println("a1 = " + a1);

        a1.replace(0,4,"");
        System.out.println("a1 = " + a1);

    }
}
