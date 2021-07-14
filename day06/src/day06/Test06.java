package day06;

import java.util.Scanner;

public class Test06 {
    public float add(float a,float b){
        return a+b;
    }
    //设计一个方法 减法运算
    public float subtract(float a,float b) {
        return a - b;
    }
    //设计一个方法 乘法运算
    public float multiply(float a,float b){
        return a*b;
    }
    //设计一个方法 除法运算
    public float divide(float a,float b){
        return a/b;
    }
    //设计一个方法 控制计算器的流程
    public void calculate(){
        final Scanner input = new Scanner(System.in);
        System.out.print("请输入第一个数字：");
        String one=input.nextLine();
        float a=Float.parseFloat(one);//转换one的值为float
        //需要一个死循环
        while (true) {
            System.out.print("请输入符号：");
            String symbol=input.nextLine();
            if(symbol.equals("=")){  //退出循环
                System.out.println("运行完毕！");
                break;
            }
            if(!(symbol.equals("+")||symbol.equals("-")||symbol.equals("*")||symbol.equals("/"))){
                System.out.println("输入的符号有误！");
                continue;
            }
            System.out.print("请输入第二个数字：");
            String two=input.nextLine();
            float b=Float.parseFloat(two);
            switch (symbol){
                case "+":
                    a=this.add(a,b) ;
                    break;
                case "-":
                    a=this.subtract(a,b) ;
                    break;
                case "*":
                    a=this.multiply(a,b) ;
                    break;
                case "/":
                    a=this.divide(a,b) ;
                    break;
            }
            System.out.println(a);
        }
    }
    //主方法
    public static void main(String[] args) {
        Test06 c=new Test06();
        c.calculate();//调用这个方法
    }
}
