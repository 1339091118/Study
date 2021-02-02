package cn.itcast.chapter01.chapter3.example09;

// 定义Student类
class Student {
    final String name = "韩强";   // 使用final关键字修饰name属性
    // 定义introduce()方法,打印学生信息
    public void introduce(){
        System.out.println("我叫" + name + ",是传智播客的学生");
    }
}
