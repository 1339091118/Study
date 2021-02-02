package cn.itcast.chapter01.chapter3.example19;

// 定义测试类
public class Example19 {
    public static void main(String[] args) {
        // 定义匿名内部类作为参数传递给animalShout()方法
        animalShout(new Animal() {
            // 实现shout()方法
            public void shout() {
                System.out.println("喵喵。。。");
            }
        });
    }

    // 定义静态方法animalShout()
    public static void animalShout(Animal an){
        an.shout(); // 调用传入对象an的shout()方法
    }
}
