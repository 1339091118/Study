package cn.itcast.chapter01.chapter4;

public class Example02 {
    public static void main(String[] args) {
        String s = "ababcdedcba";   // 声明字符串
        System.out.println("字符串的长度为：" + s.length());    // 获取字符串长度,既字符个数
        System.out.println("字符串中第一个字符：" + s.charAt(0));
        System.out.println("字符c第一个出现的位置" + s.indexOf('c'));
        System.out.println("字符c最后一个出现的位置" + s.lastIndexOf('c'));
        System.out.println("子字符串第一个出现的位置" + s.indexOf("ab"));
        System.out.println("子字符串最后一个出现的位置" + s.lastIndexOf("ab"));

    }
}
