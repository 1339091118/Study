package cn.itcast.chapter01.chapter2.example03;


public class Example03 {
    public static void main(String[] args) {
        Student stu  = new Student();   // 创建学生对象
        stu.name = "韩强";              // 为对象name属性赋值
        stu.age = 30;                   // 为对象的age属性赋值
        stu.introduce();                // 调用对象的方法
    }
}
