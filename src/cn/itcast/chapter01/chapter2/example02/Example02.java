package cn.itcast.chapter01.chapter2.example02;

public class Example02 {
    public static void main(String[] args) {
        Person p2 = new Person();   // 创建Person对象
        p2.say();                   // 调用say（）方法

        // 变量p2置为null，那么被p2所吸引用的Person对象就会失去引用，成为垃圾对象
        //p2 = null;                // 将Person对象置为null
        //p2.say();
    }
}
