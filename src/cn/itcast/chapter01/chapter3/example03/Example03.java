package cn.itcast.chapter01.chapter3.example03;

public class Example03 {
    public static void main(String[] args) {
        Dog dog = new Dog();    // 创建一个Dog对象
        dog.shout();            // 调用dog对象重写的shout（）方法
        dog.printName();        // 调用dog对象的printName（）方法
    }
}
