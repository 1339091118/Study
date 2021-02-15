package cn.itcast.chapter00;

import java.util.Scanner;

public class practice05 {
    public static void main(String[] args) {
        int x;
        char grade;
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个成绩：");
        x = sc.nextInt();
        grade = x >= 90 ? 'A' : x >= 60 ? 'B' : 'C';
        System.out.println("等级为：" + grade);
    }
}
