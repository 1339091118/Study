package cn.itcast.chapter01.chapter3.example14;

// 定义测试类
public class Example14 {
    public static void main(String[] args) {
        Cat cat = new Cat(); // 创建Cat类的实例对象
        animalShout(cat);    // 调用animaShout()方法,将cat作为参数传入
    }

    // 定义静态方法animalShout(),接收一个Animal类型的参数
    public static void animalShout(Animal animal){
        animal.shout();         // 调用传入参数animal的shout()方法
        ((Cat) animal).sleep(); // 调用传入参数animal的sleep()方法,将animal对象强制转化为Cat类型
    }
}
