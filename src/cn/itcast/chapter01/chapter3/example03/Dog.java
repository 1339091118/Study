package cn.itcast.chapter01.chapter3.example03;

public class Dog extends Animal{
    String name = "犬类";
    // 重写父类的shout（）方法
    void shout(){
        super.shout();  // 访问父类的成员方法
    }
    // 定义打印name的方法
    void printName(){
        System.out.println("name = " + super.name); // 访问父类的成员变量
    }
}
