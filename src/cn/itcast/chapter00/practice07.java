package cn.itcast.chapter00;

import java.util.*;

public class practice07 {
    public static void main(String[] args) {
        int abcCount = 0;
        int spaceCount = 0;
        int numCount = 0;
        int otherCount = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("输入一组字符：");
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++){
            if (Character.isLetter(ch[i])){
                abcCount++;
            }else if (Character.isDigit(ch[i])){
                numCount++;
            }else if (Character.isSpaceChar(ch[i])){
                spaceCount++;
            }else{
                otherCount++;
            }
        }
        System.out.println("字母个数" + abcCount);
        System.out.println("数字个数" + numCount);
        System.out.println("空格个数" + spaceCount);
        System.out.println("其他字符个数" + otherCount);
    }
}
