package cn.itcast.chapter00;

import java.util.Scanner;

public class practice08 {
    public static void main(String[] args) {
        long a, b = 0, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("输入数字a的值：");
        a = sc.nextInt();
        System.out.print("输入相加的数字：");
        int n = sc.nextInt();
        int i = 0;
        while (i < n){
            b += a;
            sum += b;
            a *= 10;
            ++i;
        }
        System.out.println(sum);
    }
}
