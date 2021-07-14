package day06;

public class Test01 {
    public static void main(String[] args) {
        String str = "HelloWorld";
        String str1 = "  Hello  ";
        test1(str);
        test2(str);
        test3(str);
        test4(str);
        test5(str);
        test6(str1);
        test7(str);
        test8(str);
        test9(str);

    }
    public static void test1(String str){
        int a1 = str.length();
        System.out.println(a1);
    }
    public  static  void test2(String str){
        int a2 = str.indexOf("o");
        System.out.println("a2 = " + a2);
    }
    public  static  void test3(String str){
        int a3 = str.indexOf("o",5);
        System.out.println("a3 = " + a3);
    }
    public  static  void test4(String str){
        String a4 = str.substring(0,5);
        System.out.println("a4 = " + a4);
    }public  static  void test5(String str){
        String a5 = str.substring(5,10);
        System.out.println("a5 = " + a5);
    }public  static  void test6(String str1){
        String a6 = str1.trim();
        System.out.println("a6 = " + a6);
    }public  static  void test7(String str){
        char a7 = str.charAt(5);
        System.out.println("a7 = " + a7);
    }public  static  void test8(String str){
         boolean a80 = str.startsWith("H");
         System.out.println("a8 = " + a80);
         boolean a81 = str.endsWith("ld");
         System.out.println("a80 = " + a81);
    }public  static  void test9(String str){
        String a8 = str.toUpperCase();
        System.out.println("a8 = " + a8);
        String a9 = str.toLowerCase();
        System.out.println("a9 = " + a9);
    }






    /*





   */
}
