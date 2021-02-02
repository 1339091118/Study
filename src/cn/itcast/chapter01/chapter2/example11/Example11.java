package cn.itcast.chapter01.chapter2.example11;

public class Example11 {
    public static void main(String[] args) {
        // 下面是创建两个 Person 对象
        Person p1 = new Person();
        Person p2 = new Person();
        // 下面是变量置为null,让对象成为垃圾
        p1 = null;
        p2 = null;
        System.gc();
        for (int i = 0; i < 1000000; i++){
            // 为了延长程序运行的时间
        }
    }
}
