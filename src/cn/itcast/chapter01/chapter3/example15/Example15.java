package cn.itcast.chapter01.chapter3.example15;

// 定义测试类
public class Example15 {
    public static void main(String[] args) {
        Dog dog = new Dog(); // 创建Dog类型的实例对象
        animalShout(dog);    // 调用animalShout()方法,将dog作为参数传入
    }

    // 定义静态方法animalShout,接受一个Animal类型的参数
    public static void animalShout(Animal animal) {
        if (animal instanceof Cat) { // 判断animal是否是Cat类的实例对象
            Cat cat = (Cat) animal;  // 将animal强制为Cat类型
            cat.sleep();            // 调用cat的sleep()方法
            cat.shout();            // 调用cat的shout()方法
        }else{
            System.out.println("this animal is not a cat");
        }
    }
}
