package cn.itcast.chapter01.chapter1;

public class Example16 {
    public static void main(String[] args) {
        int x = 1;  // 定义变量x，初始值为1，用于循环
        while (x <= 4){     // 循环条件
            System.out.println("x = " + x);     // 条件成立，打印x的值
            if (x == 3){    // 判断条件
                break;      // 跳出循环
            }
            x++;            // 变量x进行自增
        }
    }
}
