package cn.itcast.chapter01.chapter3.example12;

// Dog类实现了LandAnimal接口
class Dog implements LandAnimal {
    // 实现了breathe()方法
    public void breathe() {
        System.out.println(ANIMAL_BEHAVIOR + ":" + "狗在呼吸");
    }
    // 实现了run()方法
    public void run() {
        System.out.println(ANIMAL_BEHAVIOR + ":" + "狗在奔跑");
    }

    // 实现了liveOnLand()方法
    public void liveOnLand() {
        System.out.println("狗是陆地上的动物。。。");
    }
}
