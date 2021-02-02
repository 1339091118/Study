package cn.itcast.chapter00.game;

public class Item {
    String name;
    int price;

    public static void main(String[] args) {
        Item firstOne = new Item();
        firstOne.name = "血瓶";
        firstOne.price = 50;

        Item secondOne = new Item();
        secondOne.name = "草鞋";
        secondOne.price = 300;

        Item thirdOne = new Item();
        thirdOne.name = "长剑";
        thirdOne.price = 350;

        System.out.println(firstOne.name + " " + firstOne.price);
        System.out.println(secondOne.name + " " + secondOne.price);
        System.out.println(thirdOne.name + " " + thirdOne.price);
    }
}
