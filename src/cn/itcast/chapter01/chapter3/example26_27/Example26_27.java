package cn.itcast.chapter01.chapter3.example26_27;

public class Example26_27 {
    public static void main(String[] args) {
        // 调用divide()方法,传入一个负数作为被除数
        try {
            // 调用divide()方法.传入一个负数作为被除数
            int result = divide(4, -2);
            System.out.println(result);
        } catch (DivideByMinusException e) {    // 对捕获到的异常进行处理
            System.out.println(e.getMessage()); // 打印捕获的异常信息
        }
    }

    // 下面的方法实现了两个整数相除,并使用throws关键字声明跑出自定义异常
    public static int divide(int x, int y) throws DivideByMinusException {
        if (y < 0) {
            // 使用throw关键字声明异常对象
            throw new DivideByMinusException("除数是负数");
        }
        int result = x / y; // 定义一个变量result记录两个数相除的结果
        return result;      // 将结果返回
    }
}
