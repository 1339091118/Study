package cn.itcast.chapter01.chapter3.example11;

// Dog类实现了Animal接口
public class Dog implements Animal {
    // 实现breathe()方法
    public void breathe() {
        System.out.println(ANIMAL_BEHAVIOR + ":" + "狗在呼吸");
    }

    // 实现run()方法
    public void run() {
        System.out.println(ANIMAL_BEHAVIOR + ":" + "狗在奔跑");
    }
}
