package cn.itcast.chapter10.task01;

public class Bank {
    private int sum;
    public void add(int num){
        synchronized (this){
            sum = sum + num;
            System.out.println("账户的余额为：" + sum);
        }
    }
}
