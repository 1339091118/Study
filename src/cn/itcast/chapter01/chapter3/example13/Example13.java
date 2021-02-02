package cn.itcast.chapter01.chapter3.example13;

// 定义测试类
public class Example13 {
    public static void main(String[] args) {
        Animal an1 = new Cat(); // 创建Cat对象,使用Animal类型的变量an1引入
        Animal an2 = new Cat(); // 创建Cat对象,使用Animal类型的变量an2引入
        animalShout(an1);       // 调用animalShou()方法,将an1作为参数传入
        animalShout(an2);       // 调用animalShou()方法,将an2作为参数传入
    }

    // 定义静态的animalShout()方法,接受一个Animal类型的参数
    public static void animalShout(Animal an){
        an.shout(); // 调用实例参数的shout()方法
    }
}
