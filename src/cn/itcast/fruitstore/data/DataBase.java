package cn.itcast.fruitstore.data;

import cn.itcast.fruitstore.domain.FruitItem;

import java.util.ArrayList;

/*
 * 存储数据
 * */
public class DataBase {
    public static ArrayList<FruitItem> data = new ArrayList<FruitItem>();

    // 初始数据
    static {
        data.add(new FruitItem("1", "苹果", 5.0, "kg"));
        data.add(new FruitItem("2", "葡萄", 3.2, "斤"));
        data.add(new FruitItem("3", "雪梨", 3.8, "斤"));
        data.add(new FruitItem("4", "泰国大榴莲", 120, "个"));
    }
}
