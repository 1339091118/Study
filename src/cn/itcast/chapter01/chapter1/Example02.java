package cn.itcast.chapter01.chapter1;

public class Example02 {
    public static void main(String[] args) {
        byte a;         //定义byte类型的变量a
        int b = 298;    //定义int类型的变量b
        a = (byte) b;   //将int强制转为byte
        System.out.println("b=" + b);   //int
        System.out.println("a=" + a);   //byte，强制转换会导致数据精准度丢失
    }
}
