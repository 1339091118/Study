package cn.itcast.chapter01.chapter2.example01;


public class Example01 {
    public static void main(String[] args) {
        Person p1 = new Person();   // 创建第一个Person对象
        Person p2 = new Person();   // 创建第二个Person对象
        p1.age = 18;                // 为age属性赋值
        p2.age = 20;                // 为age属性赋值
        p1.speak();                 // 调用对象的方法
        p2.speak();                 // 调用对象的方法
    }
}
