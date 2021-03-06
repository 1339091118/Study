package cn.itcast.chapter01.chapter3.example12;

// 定义了Animal接口
interface Animal {
    // 定义了全局常量,其默认修饰为public static final
    String ANIMAL_BEHAVIOR = "动物的行为";
    // 定义了抽象方法breathe(),其默认修饰为public abstract
    void breathe();
    // 定义抽象方法run()
    void run();
}
