package cn.itcast.chapter01.chapter1;

public class Example21 {
    public static void main(String[] args) {
        int area = getArea(3, 5);   // 调用getArea()方法
        System.out.println("The area is " + area);
    }

    // 下面定义了一个求矩形面积的方法，接收两个参数，其中x为高，y为宽
    public static int getArea(int x, int y) {
        return x * y;   // 将x*y的值返回
    }
}
