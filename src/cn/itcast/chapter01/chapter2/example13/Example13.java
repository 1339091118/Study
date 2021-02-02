package cn.itcast.chapter01.chapter2.example13;

public class Example13 {
    public static void main(String[] args) {
        // 1.类名.方法的方式调用静态方法
        Person.sayHello();
        // 2.实例化对象的方式来调用静态方法
        Person p = new Person();
        p.sayHello();
    }
}
