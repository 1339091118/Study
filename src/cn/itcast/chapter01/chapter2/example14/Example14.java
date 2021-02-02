package cn.itcast.chapter01.chapter2.example14;

public class Example14 {
    // 静态代码块
    static {
        System.out.println("测试类的静态代码快执行了");
    }
    public static void main(String[] args) {
        // 下面的代码创建了两个 Person 对象
        Person p1 = new Person();
        Person p2 = new Person();
    }
}
