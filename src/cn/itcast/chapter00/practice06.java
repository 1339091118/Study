package cn.itcast.chapter00;

import java.util.*;

public class practice06 {
    public static void main(String[] args) {
        int a, b, m;
        Scanner sc = new Scanner(System.in);
        System.out.print("输入一个整数：");
        a = sc.nextInt();
        System.out.print("输入一个整数：");
        b = sc.nextInt();
        deff cd = new deff();
        m = cd.deff(a,b);
        int n = a * b / m;
        System.out.println("最大公约数：" + m);
        System.out.println("最小公约数：" + n);
    }

static class deff {
        public int deff(int x, int y){
            int t;
            if (x < y){
                t = x;
                x = y;
                y = t;
            }
            while (y != 0){
                if (x == y){
                    return x;
                }else{
                    int k = x % y;
                    x = y;
                    y = k;
                }
            }
            return x;
        }
    }
}
