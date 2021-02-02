package cn.itcast.chapter01.chapter2.example07;

public class Example07 {
    public static void main(String[] args) {
        // 分别创建两个对象p1和p2
        Person p1 = new Person("小樱",27);
        Person p2 = new Person("韩强");
        // 通过对象p1和p2调用speak()方法
        p1.speak();
        p2.speak();
    }
}
