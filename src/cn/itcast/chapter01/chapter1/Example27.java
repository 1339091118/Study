package cn.itcast.chapter01.chapter1;

public class Example27 {
    public static void main(String[] args) {
        int[] arr = new int[4]; // 定义一个长度为4的数组
        //System.out.println("arr[0] = "+arr[4]); // 通过角标4访问数组元素,但会报错，索引超出范围
        System.out.println("arr[0] = "+arr[3]); //访问数组的元素
    }
}
