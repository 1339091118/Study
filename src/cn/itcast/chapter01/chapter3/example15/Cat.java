package cn.itcast.chapter01.chapter3.example15;

// 定义Cat类实现Animal接口
public class Cat implements Animal{
    // 实现shout()方法
    public void shout(){
        System.out.println("喵喵喵。。。");
    }
    // 实现sleep()方法
    void sleep(){
        System.out.println("猫睡觉");
    }

}
