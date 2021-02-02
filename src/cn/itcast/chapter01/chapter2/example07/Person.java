package cn.itcast.chapter01.chapter2.example07;

class Person {
    String name;
    int age;

    // 定义两个参数的构造方法
    public Person(String con_name, int con_age) {
        name = con_name;
        age = con_age;
    }

    // 定义一个参数的构造方法
    public Person(String con_name) {
        name = con_name;
    }

    public void speak() {
        // 打印name和age的值
        System.out.println("大家好，我叫" + name + "，我今年" + age + "岁！");
    }
}
