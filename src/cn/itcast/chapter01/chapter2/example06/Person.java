package cn.itcast.chapter01.chapter2.example06;

class Person {
    int age;

    // 定义有参的构造方法
    public Person(int a) {
        age = a;    // 为age属性赋值
    }

    public void speak() {
        System.out.println("今年我已经" + age + "岁了!");
    }
}
