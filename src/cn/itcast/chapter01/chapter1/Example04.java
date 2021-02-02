package cn.itcast.chapter01.chapter1;

public class Example04 {
    public static void main(String[] args) {
        int x = 12; //定义变量x
        {
            int y = 96; //定义变量y
            System.out.println("x is" + x); //访问变量x
            System.out.println("y is" + y); //访问变量y
        }
        //y = x; //由于（y）超出了他的作用域，所以给 （y）赋值时会报错。
        System.out.println("x is" + x); //访问变量x
    }
}
