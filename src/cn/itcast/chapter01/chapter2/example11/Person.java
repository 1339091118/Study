package cn.itcast.chapter01.chapter2.example11;

public class Person {
    // 下面定义的 finalize 方法会在垃圾回收前调用
    public void finalize(){
        System.out.println("对象将作为垃圾回收...");
    }
}
