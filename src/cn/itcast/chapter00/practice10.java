package cn.itcast.chapter00;

public class practice10 {
    public static void main(String[] args) {
        double h = 100, s = 0;
        for (int i = 1; i <= 10; i++) {
            s = s + 2 * h;
            h /= 2;
        }
        s -= 100;
        System.out.println("经过路程" + s);
        System.out.println("最后高度" + h);
    }
}
