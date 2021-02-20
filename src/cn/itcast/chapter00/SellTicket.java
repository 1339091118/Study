package cn.itcast.chapter00;

import java.util.Scanner;

// 车票购买系统
public class SellTicket {
    public static void main(String[] args) {
        // 定义票价价钱常量
        final int TICKET_PRICE = 10;

        // 打印车票信息
        System.out.println("****************");
        System.out.println("*JAVA城际铁路专线*");
        System.out.println("*  无指定座位票  *");
        System.out.println("*  票价：10元   *");
        System.out.println("****************");

        // 读取输入的数值
        Scanner sc = new Scanner(System.in);
        System.out.print("请投入零钱：");
        int amount = sc.nextInt();
        System.out.print("请输入要购买多少张票：");
        int frequency = sc.nextInt();
        int statistics = 0;

        // 计算价钱和票数
        for (int i = 0; i < frequency; i++) {
            if (amount >= TICKET_PRICE) {
                amount -= TICKET_PRICE;
                statistics++;
            }
        }

        // 打印信息
        System.out.println("您购买了" + statistics + "张票");
        System.out.println("还剩" + amount + "钱");
    }
}

