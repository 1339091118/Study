package cn.itcast.chapter01.chapter1;

public class Example08 {
    public static void main(String[] args) {
        int num = 19;
        if (num % 2 == 0){
            // 判断条件胜利，num被2整除
            System.out.println("num是一个偶数");
        }else{
            System.out.println("num是一个奇数");
        }
    }
}
