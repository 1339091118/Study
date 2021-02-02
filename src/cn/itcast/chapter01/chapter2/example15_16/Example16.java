package cn.itcast.chapter01.chapter2.example15_16;

public class Example16 {
    public static void main(String[] args) {
        Outer.Inner inner = new Outer().new Inner();    // 创建内部类对象
        inner.show();   // 调用 test() 方法
    }
}
