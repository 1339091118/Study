package cn.itcast.chapter01.chapter3.example05;

// 定义Animal类
public class Animal {
    // 定义Animal无参的构造方法
    public Animal(){
        System.out.println("我是一只动物");
    }

    // 定义Animal有参的构造方法
    public Animal(String name){
        System.out.println("我是一只" + name);
    }
}
