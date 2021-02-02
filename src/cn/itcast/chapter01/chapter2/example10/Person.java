package cn.itcast.chapter01.chapter2.example10;

public class Person {
    public Person() {
        System.out.println("无参的构造方法被调用了...");
    }

    public Person(String name) {
        this(); // 调用无参的构造方法
        System.out.println("有参的构造方法被调用了...");
    }
}
