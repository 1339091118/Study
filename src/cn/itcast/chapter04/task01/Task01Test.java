package cn.itcast.chapter04.task01;

// 定义测试类
public class Task01Test {
    public static void main(String[] args) {
        // 实例化计算机对象
        Computer c = new Computer();
        // 向计算机中添加鼠标、麦克风和键盘设备
        c.add(new Mouse());
        c.add(new Mic());
        c.add(new KeyBoard());
        c.powerOn(); // 启动计算机
        System.out.println();
        c.powerOff(); // 关闭计算机
    }
}
