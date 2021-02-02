package cn.itcast.chapter01.chapter1;

public class Example03 {
    public static void main(String[] args) {
        byte b1 = 3;
        byte b2 = 4;
        byte b3 = (byte) (b1 + b2);  //两个byte类型变量相加，赋值给一个byte类型变量
        //b1+b2运算期间被自动提升为int型，运算结果也成了int型，这时需要强制转换，不然会报错
        System.out.println("b3=" + b3);
    }
}
