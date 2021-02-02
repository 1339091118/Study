package cn.itcast.chapter01.chapter1;

public class Example06 {
    public static void main(String[] args) {
        int x, y, z;    //定义int变量x、y、z
        x = y = z = 0;  //给变量赋值
        boolean a, b;   //定义boolean变量a和b
        a = x > 0 & y++ > 1;    //逻辑运算符（&）对表达式进行运算
        System.out.println(a);
        System.out.println("y=" + y);
        b = x > 0 && z++ > 1;   //逻辑运算符（&&）对表达式进行运算
        System.out.println(b);
        System.out.println("z=" + z);
    }
}
