package cn.itcast.chapter00;

import java.util.Scanner;

public class practice04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个正整数：");
        int n = sc.nextInt();
        int k = 2;
        System.out.print(n + "=");
        while (k <= n) {
            if (k == 0) {
                System.out.println(n);
                break;
            } else if (n % k == 0) {
                System.out.print(k + "*");
                n = n / k;
            } else {
                k++;
            }
        }
    }
}
