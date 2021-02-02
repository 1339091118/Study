package cn.itcast.chapter01.chapter3.example12;

public class Example12 {
    public static void main(String[] args) {
        Dog dog = new Dog();    // 创建Dog类的实例对象
        // 使用对象名.常量名的方式输出接口的常量
        // System.out.println(dog.ANIMAL_BEHAVIOR);
        // 使用接口名,常量名的方式输出接口中的常量
        // System.out.println(Animal.ANIMAL_BEHAVIOR);
        dog.breathe();    // 调用Dog类的breath()方法
        dog.run();        // 调用Dog类的run()方法
        dog.liveOnLand(); // 调用Dog类的liveOnLand()方法
    }
}
