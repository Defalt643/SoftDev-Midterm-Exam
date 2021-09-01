package com.defalt.midtermexamination;

import java.util.*;

public class GoodsService {

    private static ArrayList<Goods> goodsList = new ArrayList<>();

    static {
        goodsList.add(new Goods("1", "Rice", "easy", 15.0, 1));
        goodsList.add(new Goods("2", "Sausage", "Ceepee", 35.0, 1));
        goodsList.add(new Goods("3", "Snack", "ArhanYodkhum", 10.5, 2));
    }

    public static void addGoods(Goods goods) {
        goodsList.add(goods);
    }

    public static void delGoods(Goods goods) {
        goodsList.remove(goods);
    }

    public static void delGoods(int index) {
        goodsList.remove(index);
    }

    public static Goods getGoods(int index) {
        return goodsList.get(index);
    }

    public static void updateGoods(int index, Goods goods) {
        goodsList.set(index, goods);
    }public static ArrayList<Goods> getGoodsList(){
        return goodsList;
    }
}
