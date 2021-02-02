package cn.itcast.chapter01.chapter1;

public class Example24 {
    public static void main(String[] args) {
        int[] arr;                                          // 声明变量
        arr = new int[3];                                   // 创建数组对象
        System.out.println("arr[0] = " + arr[0]);           // 访问第一个元素
        System.out.println("arr[1] = " + arr[1]);           // 访问第二个元素
        System.out.println("arr[2] = " + arr[2]);           // 访问第三个元素
        System.out.println("数组的长度是：" + arr.length);     // 打印数组长度
    }
}
