package cn.itcast.chapter01.chapter1;

public class Example15 {
    public static void main(String[] args) {
        int i, j;   // 定义变量i，j
        for (i = 1; i <= 9; i++) {  // 外层循环
            for (j = 1; j <= i; j++) {  // 内层循环
                System.out.print("*");    // 内层循环打印*
            }
            System.out.print("\n");    // 外层循环执行换行
        }
    }
}
