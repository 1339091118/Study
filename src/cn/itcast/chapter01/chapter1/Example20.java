package cn.itcast.chapter01.chapter1;

public class Example20 {
    public static void main(String[] args) {
        // 调用printRectangle()方法打印出矩形
        printRectangle(3, 5);
        printRectangle(2, 4);
        printRectangle(6, 10);
    }

    // 下面定义了一个打印矩形的方法，接受两个参数，其中height为高，width为宽
    public static void printRectangle(int height, int width) {
        // 下面使用嵌套for循环打印出*
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.println();
    }
}
