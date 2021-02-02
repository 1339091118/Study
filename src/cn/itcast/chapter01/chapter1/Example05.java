package cn.itcast.chapter01.chapter1;

public class Example05 {
    public static void main(String[] args) {
        short s = 3;
        int i = 5;
        s += i; //赋值运算符中强制类型转换
        System.out.println("s=" + s);
    }
}
