package cn.itcast.chapter01.chapter3.example14;

// 定义Cat类实现Animal接口
class Cat implements Animal{
    // 实现抽象方法shout()
    public void shout(){
        System.out.println("喵喵。。。");
    }
    // 定义sleep()方法
    void sleep(){
        System.out.println("猫睡觉");
    }
}
